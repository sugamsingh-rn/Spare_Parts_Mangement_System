package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import util.SqlUtil;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String username,passward;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <h1>Login Here</h1>\n");
      out.write("        \n");
      out.write("\n");
      out.write("            <label for=\"username\">Username</label>\n");
      out.write("            <input type=\"text\" name=\"uname\" placeholder=\"Enter username\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("             <label for=\"password\">Passward</label>\n");
      out.write("            <input type=\"text\" name=\"upass\" placeholder=\"Enter passward\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\"name=\"btn\" value=\"Login\">\n");
      out.write("            <button type=\"submit\"name=\"cancel\" onclick=\"cancel()\">cancel</button>\n");
      out.write("        </form>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
            
         if(request.getParameter("btn")!=null){
             username=request.getParameter("uname");
             passward=request.getParameter("upass");
             System.out.println("username");
             
             String query="select * from admin where uname='"+username+"' and upass='"+passward+"'";
             

              try{         
             SqlUtil.connectDB();

           ResultSet rs=SqlUtil.read(query);
             
             if(rs.next())
             {
                 session=request.getSession();
                 session.setAttribute("username",username);
                 session.setMaxInactiveInterval(1000);
                 response.sendRedirect("home.jsp");
             }
             else
             {
                 
      out.write("\n");
      out.write("                 \n");
      out.write("                 <script>alert('Invalid username/password');</script>\n");
      out.write("                 \n");
      out.write("            ");
 }
            }catch(Exception ex)
            {  
              System.out.println("Problem in login : "+ex);

                }
                       }


      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
