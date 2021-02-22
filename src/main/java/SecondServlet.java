import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie ck[] = request.getCookies();

            out.print("Hello " +ck[0].getValue());

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
