

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrea
 */
@WebServlet( name="RespXLS",urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-Dispocition","attachment;filename=archivo.csv");
         PrintWriter out = response.getWriter();
        try {
        
            /* TODO output your page here. You may use following sample code. */
            out.println("Respuesta Generada desde Excel");
            out.println("100");
            out.println("200");
            out.println("La suma es:\t");
            out.println("=suma (a2:a3)");
    }finally{
      out.close();
        }
    }

}
