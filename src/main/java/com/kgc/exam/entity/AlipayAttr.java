package com.kgc.exam.entity;

public class AlipayAttr {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091700535499";

    // 商户应用私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCDpRpOiNkVRP2KLprtfQ37NvaI36fMtuOvqMJxE/9byFINxHkDDIh4zh2fbftVUoXDFjScK7B4sShcM6pjJqz5twcOQSrt8K+NL0+Do8fS8teJcZqcZou4PtTK+uftx3hsTsrdzofz03h+UgCz+drewtTJ5xUCZZZ1Z5Dxaa55ADml+aWZweyGWgXK1V3JL5gkD8CrKikCoRGbv1QgWkmg9b3o2/9zGR0We+SAbFyoGVF+taltJVWb8HquV8n5QDHfR7t1wBMX2UxhebH/m4tP5CExVDaBhbpWSvjz6m0zqGvg7fLKKzTX/GJhxrGQ5HcORXSkLloWxX0SorXGLvv1AgMBAAECggEAFaG+peME0OLqSpeH67hd4MbSUgF2YEQ5O7ceZFhl4J4VJaAARoj7r+Ympfj7kLSjuD/g2zyundZ2jFgNCofjapExvpzkwf6HykpY5Ye3ISm4UyRwxHxxPxBMBSKfk8nwNtPnr/TtEBrStOciqHBJD8uyDY9EO4WX6Kjg/1pfShCLfsvVp5o7PimDCJxotXpfOZRWkShbf/lveJHjAut97tUghH5sel3LD3w6FFZRoCfftTNMh6BxuMEh4R8oe0OzRXFvkAFavfvMLW5mi7X5zjSwQws3fIHgKb5rQPyCXskKWBSqobceaUpDxJxY0zaLWJ87KKGRbXSZkRdsmcPKbQKBgQDS4njn8WgwVVaQ0LYWwOUqsS6H6YaaV/biFPxOYe5soycL1ZxfNwilnN6kgcoPQxEMaHi5NcY2yvuXz77bQnj14VBD0ESOV4kFGF7mvoo2ZHZjAKrRUAu+i5/O64Atyc/h0NLGqJCiVud+APJ3mo2iqyThIARBeleUyL5LjAGkbwKBgQCfzufUOwat/YFrdyDWvIcTqc2nZyopgllfzp2ptBekjJSKhxcwxeM38ydBpTHKZmYyL7itfX/YltZxbH2/Lw9Yfb9v0KFqwq2OQ1ykjQGzhxNZ1NG/V8/hIOxSuIXu/Gny/UdMyOqoLKzXSGmZUmxCNaldfGXDJn7/thoxw7A/2wKBgDFypxUD1wFWUUj9l2S4cEPVbeqyiDxSmfIjJ5IdhnF0xCgTO2pcFiv3H4GFaWKwwCOfr4cGI+cfK2VKch8pdAF7hn2QLTMPNXK7Zy1FylS8s8G9G1CfK1HPnXZAZDrYUmVJuNKaHefi5r716+S9ma5l4Ozku/q6fCTH+U7vkkcDAoGAdkgTSP9DS2Z18w+ia63woHou8Deoej6zXfk0stXMJguzKfEhFgVxzwiWxry5ZKB0BbNSkn5wMOQ75omxbN8tEYdJOT6HKtja0pBDMrv3RWS1yuh9Mo2RHIVcxUE0SJXk6WfT7R5MqJsgdttu5X+fB0Zmi/4158JHf4bOToUTn78CgYEAp04OcMC4Y7OUPRTbUuGMB86/zzyeUDS31Jf6PzYxqTSGDnmfSqS5AV/LSabr18XIpDcToBu1592booLvczvRk2TfVwqMnxTsAhf/P/UEEascOzno8NVSaOzPO0ItF/staOV1aIE7rQ9pbFWREKIGn7dh+xTfOOitihTsW7nJI9s=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAw9BZowTY8zanLI4Qn+SwTh34SdC/qD6epUxp36P4ceB5hW5B17NmfsniuM4NCLUEdjjzCE3e+FxEOEG9q7i15xY49TKK1vKcnZFEA+Z+jf6bXKeodAqFc/0nEb9BRM6OsYEvmLQFLnm30A9WH3FpOmf84Uq+ViWdKPRejtPxDioWXmNJL9QUiqzPRYmWdHbsQVwBpxfPKtJBxTtCCx0Ax4tfkYXytxorBnCwxFBFVWjya2dIfxYfN16DVDvwuWvd0uRuwxyCpnVGTCr5e3vG6JtTwViscfvB3On++p9rkGipuxsxpwebRIi4UPgrdVHpTm5ei9t7J1m0IVp01sECsQIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/Aiviy/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/Aiviy/alipayReturn";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
