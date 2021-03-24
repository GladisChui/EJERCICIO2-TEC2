

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
@WebServlet( name="RespJSON",urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

   
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
                response.setContentType("text/html;charset=UTF-8");
                response.setHeader("Content-Disposition","attachment;filename=empleados.json");
                PrintWriter out = response.getWriter();
                try{
    
        
            /* TODO output your page here. You may use following sample code. */
            out.println("{'empleados':[");
            out.println("{'nombre':'Bruno','apellidos':'Diaz' },");
            out.println("{'nombre':'Juan Jose','apellidos':'Paredes' },");
            out.println("{'nombre':'Dolores','apellidos':'Fuentes' },");            
            out.println("]}");
            
        }finally{
                out.close();
            }
    }
}
