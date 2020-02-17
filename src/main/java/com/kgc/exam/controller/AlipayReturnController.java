package com.kgc.exam.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.kgc.exam.entity.AlipayAttr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class AlipayReturnController {
    /*
    * 阿里支付模块返回；
    * */
    @RequestMapping("alipayReturn")
    public void AlipayReturn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter
                .hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]: valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        boolean signVerified = false;
        try {// 调用SDK验证签名
            signVerified = AlipaySignature.rsaCheckV1(params, AlipayAttr.alipay_public_key, AlipayAttr.charset,AlipayAttr.sign_type);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        // 请在这里编写您的程序（以下代码仅作参考）
        if (signVerified) {//验签成功后执行的自定义业务代码
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
            // 付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
            String msg = "支付宝交易号:" + trade_no + "<br/>商户订单号"+ out_trade_no + "<br/>付款金额:" + total_amount;
            System.out.println(msg);
            request.setAttribute("msg", msg);
            try {
                request.getRequestDispatcher("success.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        } else {
            response.getWriter().println("验签/支付失败");
            response.getWriter().flush();
            response.getWriter().close();
        }
    }
}
