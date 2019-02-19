package com.yyaccp.trade.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016092400587142";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCYEokJuWj/UV86qzv+BOs0z6neJG4kc3DvK61+hypjSlVy336PmINahp2v4CvaIqOgPS2YAvYyo//fPsevTYadfiTjGrH2ubEeG3Wr5ypFYete4ftSB1b9pbslC+r0pwGuZIza7LAvbPwDbi5u16iJwzt0FPZBeUmCm/uioo5feTv4Ms9TqQWemDk8DziYOdnC+jxRlIt1qmYB+en51Naf5iVXAl3S6au419ZCBlj1VJ+ZjTMMt3YwS1xOe6MoPHaZ3nxDXwkBg8cAxpcRanhIkwkKXSH1r8LjTsjK3xVjOBeE7cY/0aQ9HnehtZDNqc6OTtkl6umInsU+9ctVDsWpAgMBAAECggEAC1NuE2RUtpdH4WW5bRzOq7s/qoTKEzrp0VZOcJr+hDCYFpsgoO858TcPbXbjrTZhO2DzEVw/G9xtBSJ22s6KVRZ9BtEJKhgAYf6nj+sCkfJOBl4MSrqzNubt/j9Z+2iozmU8vF1ebdnPFy5QlP7I1aHNvsKE6LFw0SJu5lj3A5M1iGtQnwZjhNPeHy3CR/iSKx94Hom9bJ3gXd2wx5Vf4yAEqE5sP3TN0N9p/49GsoKGvk89GFehd9AodIXrmpYW5Y8y1TgYhgs2E8FR9YJkmp9nolF7eAypZMMYl4xXE28eFVdar75BpY7xNeGSwvwGvpRdY4ASXFygx/CBo+pAkQKBgQDIT0iJU6r79aN6y+vDnqjvI0qjV3rd86xH3olT9bPQWSm6I7xPksK9j3XnC9WPnj+7F+m3HiSLtsBb3KzjTeZdBz5O+8khPGrJfHCAe3VmlHH2W+1NZit6Kvl42xQaq1VI/GzOGQOuu1J1tjsPBKBopyEnIHgGOha5XsGaUZN9nQKBgQDCWgp5fIEGZZeZMoSelJxlNiBmrb41v+sUcvLH/CYWWgq8RK6pMGo1CUWr7AOq4QJCm3Gwgc+A7PLjP2KYLOfu5fYDnSHnPPSwk7w4Uaa0m2zzwF44Bu9BWuWvC0eC4sdL9yWM8TSUb1tO7FQ9DH8NwheC7ghfbdf4VdSMQGEwfQKBgHlw/+QqMq7BNRT8zvpxlbAuMFEpd1dbJWcJNy8M9rBpbk/o3IFN0/1DHdMvLJH++lp+2/ZmMvf1m1fWSYchsnlSK+eM5VreG0v+wuJSd1Hyy8j14MAdIlzV8xvfjqfAmls+luS466+i6BJvogyv3GS2dvYWzE3SJ/bIyQ27SXVNAoGAOxpauRstuZ5HfeUpA3i6HuVY8SDBCWN1v+A9CKgbhQyY2ywf2X/JrJtHPsMlUl/e6haPelffnJtyOb1a5GAzoCj6qZqtZr7YwqIKyS27fo0NkwrbHDqvo7ZaxuKtOpZweR+NodDwZnt+zv97lp0oPizaLYzpquuik/i2DHi/lZkCgYEAl+BjeQWqYteb0eaOnFRSU2f3zBcQMbjReObHBEnpELKqgHioR2ccs3FFoy05ObZZ9u3KW59iVP+CET0qW+j1H38bqZjF8Ff6G9NmgKmtz+BS4s8uAw2ndYjY/1oH0qNbq28qnXLZM8M0hka2zrLbgMLsWJEsS6TP7PkxkGrD5ow=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://xeu4y7.natappfree.cc/trade/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://xeu4y7.natappfree.cc/trade/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsBWhN7kcjkZapxnynUz2L1WBWuyUxr9x+HDwTF5XVJUrQk5Y9eekROuQ6MTAHNIFTmbA1NYMb6xdxVpIMBevF21j6ABmTSnrU9Q4i75NBtxgHOzoxKOAp+PfVC8RUYpRxHYYv42Q8+5LMGqcbDDSJh28x5aGatYg9JO+4LQrH1Sy+dfTZjH6/7z6xJNnl66jZ+fUlqTGLdP4G60dC6kEKla7t66El/LKVJrUk8fN3UpVp+A23NSCwAS9yNfDUdQvBXhzWLEhcOI/Yu20WObT5yLG7DraYK9KWSzQVRtSD7ZaHPAUR8Rwk1YbPpZlKIpdJC32Xygu2nN0FSjCkIwFjQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
