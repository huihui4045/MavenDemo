package servlet;

import bean.GetBookTarget;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by gavin on 2017/9/28.
 */
@WebServlet(urlPatterns = "/async",asyncSupported = true)
public class AsyncServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        resp.setContentType("text/html;charset=GBK");

        PrintWriter out=resp.getWriter();

        out.println("<title>异步调用实例</title>");
        out.println("进入Servlet的时间："+new Date()+".<br/>");

        AsyncContext asyncContext = req.startAsync();

        asyncContext.setTimeout(60*1000);



        asyncContext.start(new GetBookTarget(asyncContext));

        out.println("结束Servlet"+new Date()+".<br/>");

        out.flush();


    }
}
