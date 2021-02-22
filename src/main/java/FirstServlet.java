import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.println("Welcome " + n);

            Cookie ck = new Cookie("uname",n);
            response.addCookie(ck);

            out.print("<form action='servlet2'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
