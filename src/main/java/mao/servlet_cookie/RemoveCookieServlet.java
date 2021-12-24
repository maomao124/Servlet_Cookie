package mao.servlet_cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project name(项目名称)：Servlet_Cookie
 * Package(包名): mao.servlet_cookie
 * Class(类名): RemoveCookieServlet
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/24
 * Time(创建时间)： 14:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RemoveCookieServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // 获取cookie
        Cookie cookie = new Cookie("lastTime", "");
        // 设置有效时间为0，删除cookie
        cookie.setMaxAge(0);
        // 设置有效路径，必须与要删除的Cookie的路径一致
        cookie.setPath("/Servlet_Cookie_war_exploded");
        // 回写
        response.addCookie(cookie);
        // 重定向商品列表页面
        response.sendRedirect("/Servlet_Cookie_war_exploded/LoginTimeServlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }
}
