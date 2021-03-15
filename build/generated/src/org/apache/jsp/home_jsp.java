package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.sound.midi.SysexMessage;
import java.sql.ResultSet;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\" integrity=\"sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form>       \n");
      out.write("        <div class=\"row \">\n");
      out.write(" \n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                   <input type=\"submit\" class=\"btn btn-primary btn-lg \" value=\"show spare parts\" name=\"stbtn\">\n");
      out.write("            \n");
      out.write("                   <input type=\"submit\"  class=\"btn btn-primary btn-lg block\" value=\"add spare parts\" name=\"addbtn\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("                   <input type=\"submit\"  class=\"btn btn-primary btn-lg block\" value=\"update spare parts\" name=\"upbtn\">\n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("            ");

     try{
         
           util.SqlUtil.connectDB();
       if(request.getParameter("stbtn")!=null)
       {
          ResultSet s=util.SqlUtil.read("select * from auto_parts");
          
      out.write("   <table class=\"table table-striped\">\n");
      out.write("               <tr>\n");
      out.write("                  <td>\n");
      out.write("                   SERIAL NO\n");
      out.write("                  </td>\n");
      out.write("                <td>\n");
      out.write("                PART NAME\n");
      out.write("                  </td>\n");
      out.write("                <td>\n");
      out.write("                 MODEL \n");
      out.write("                  </td>                <td>\n");
      out.write("                    COMPANY\n");
      out.write("                  </td>                <td>\n");
      out.write("                  QUANTITY\n");
      out.write("                  </td>                <td>\n");
      out.write("                   MRP\n");
      out.write("                  </td>                <td>\n");
      out.write("                    NET RATE\n");
      out.write("                  </td>\n");
      out.write("               \n");
      out.write("                  <td>\n");
      out.write("                    STOCK QUANTITY LEFT\n");
      out.write("                  </td>\n");
      out.write("                  </tr>\n");
      out.write(" \n");
      out.write("           \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              ");

          while(s.next()){
          
      out.write("\n");
      out.write("       \n");
      out.write("          <tr>\n");
      out.write("                  <td>\n");
      out.write("                    ");
      out.print(s.getInt("s_no"));
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(s.getString("part_name"));
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(s.getString("model"));
      out.write("\n");
      out.write("                  </td>                <td>\n");
      out.write("                    ");
      out.print(s.getString("company"));
      out.write("\n");
      out.write("                  </td>                <td>\n");
      out.write("                    ");
      out.print(s.getString("quantity"));
      out.write("\n");
      out.write("                  </td>                <td>\n");
      out.write("                    ");
      out.print(s.getString("mrp"));
      out.write("\n");
      out.write("                  </td>                <td>\n");
      out.write("                    ");
      out.print(s.getString("net_rate"));
      out.write("\n");
      out.write("                  </td>\n");
      out.write("               \n");
      out.write("                  <td>\n");
      out.write("                    ");
      out.print(s.getString("stock_quantity_left"));
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("        ");

          }
            
      out.write("   </table>");

       
       }
       }catch(Exception ex)
       {
           
       }
       
      out.write("\n");
      out.write("       \n");
      out.write("       ");

       if(request.getParameter("addbtn")!=null)
       {
       
      out.write("\n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("       \n");
      out.write("       <form> \n");
      out.write("           <div class=\"col-lg-12 col-md-12 \">\n");
      out.write("        <div class=\"form-group\">   \n");
      out.write("           PART NAME \n");
      out.write("           <input type=\"text\"  class=\"form-control\" placeholder=\"enter part name\" name=\"PARTNAME\" required>      \n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("        MODEL\n");
      out.write("        <input type=\"text\"  class=\"form-control\" placeholder=\"enter model name\" name=\"MODEL\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        COMPANY\t\n");
      out.write("        \n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"enter company name\" name=\"COMPANY\"  required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        CURRENT QUANTITY\n");
      out.write("        <input type=\"text\"class=\"form-control\"  placeholder=\"enter total quantity\" name=\"QUANTITY\" required> <br>\n");
      out.write("           <br>\n");
      out.write("        MRP<input type=\"text\"  class=\"form-control\" placeholder=\"enter  maximum retail price\" name=\"MRP\"> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("      \n");
      out.write("        NET RATE<input type=\"text\" class=\"form-control\"  placeholder=\"enter net rate\" name=\"NETRATE\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        STOCK QUANTITY LEFT<input type=\"text\"  class=\"form-control\" placeholder=\"enter opening stock\" name=\"OPSTOCK\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" name=\"submitbtn\" class=\"btn btn-outline-primary\" value=\"submit\">\n");
      out.write("        </div>\n");
      out.write("           </div>\n");
      out.write("           </form>\n");
      out.write("       \n");
      out.write("        ");

       
       
       }
       
      out.write("\n");
      out.write("       ");

       if(request.getParameter("submitbtn")!=null)
       {
          ResultSet rs=util.SqlUtil.read("select max(s_no) from auto_parts");
           int s_no=0;
           if(rs.next())
           {
               s_no=rs.getInt("max(s_no)");
               s_no++;
           }
           util.SqlUtil.create("insert into auto_parts values("
                   +s_no+",'"+request.getParameter("PARTNAME")+"','"
              +request.getParameter("MODEL")+"','"    
              +request.getParameter("COMPANY")+"','"
                    +request.getParameter("QUANTITY")+"'," 
              +request.getParameter("MRP")+","
               +request.getParameter("NETRATE")+","
                +request.getParameter("OPSTOCK")    
               
                   + ")");
       }
       
       
      out.write("\n");
      out.write("       ");

       if(request.getParameter("upbtn")!=null)
       {
       
      out.write("\n");
      out.write("       <br><br>\n");
      out.write("           <form> \n");
      out.write("           <div class=\"col-lg-12 col-md-12 \">\n");
      out.write("        <div class=\"form-group\">   \n");
      out.write("        ENTER SERIAL NUMBER TO CHANGE SPECIFICATIONS\n");
      out.write("           <input type=\"text\"  class=\"form-control\" placeholder=\"enter the serial number\" name=\"sno\" required>      \n");
      out.write("           <br>\n");
      out.write("         <input type=\"submit\" name=\"serialno\" class=\"btn btn-outline-primary\" value=\"submit\">\n");
      out.write("        </div></div></form>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

       
       }
       
       
      out.write("\n");
      out.write("       ");

         if(request.getParameter("serialno")!=null)
       {
     ResultSet rf= util.SqlUtil.read("select * from auto_parts where s_no='"+request.getParameter("sno")+"'");
      if(rf.next()){
       
      out.write("\n");
      out.write("           <br>\n");
      out.write("       <br>\n");
      out.write("       \n");
      out.write("       <form> \n");
      out.write("           <div class=\"col-lg-12 col-md-12 \">\n");
      out.write("        <div class=\"form-group\">   \n");
      out.write("           PART NAME \n");
      out.write("           <input type=\"text\"  class=\"form-control\" placeholder=\"");
      out.print(rf.getString("part_name"));
      out.write("\" value=\"");
      out.print(rf.getString("part_name"));
      out.write("\" name=\"PARTNAME\" required>      \n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("        MODEL\n");
      out.write("        <input type=\"text\"  class=\"form-control\" placeholder=\"");
      out.print(rf.getString("model"));
      out.write("\" value=\"");
      out.print(rf.getString("model"));
      out.write("\" name=\"MODEL\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        COMPANY\t\n");
      out.write("        \n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"");
      out.print(rf.getString("company"));
      out.write("\" value=\"");
      out.print(rf.getString("company"));
      out.write("\" name=\"COMPANY\"  required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        CURRENT QUANTITY\n");
      out.write("        <input type=\"text\"class=\"form-control\"  placeholder=\"");
      out.print(rf.getString("QUANTITY"));
      out.write("\"  Value=\"");
      out.print(rf.getString("QUANTITY"));
      out.write("\"name=\"QUANTITY\" required> <br>\n");
      out.write("           <br>\n");
      out.write("        MRP<input type=\"text\"  class=\"form-control\" placeholder=\"");
      out.print(rf.getString("MRP"));
      out.write("\"   Value=\"");
      out.print(rf.getString("MRP"));
      out.write("\" name=\"MRP\"> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("      \n");
      out.write("        NET RATE<input type=\"text\" class=\"form-control\"  placeholder=\"");
      out.print(rf.getString("net_rate"));
      out.write("\"  Value=\"");
      out.print(rf.getString("QUANTITY"));
      out.write("\" name=\"NETRATE\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("        STOCK QUANTITY LEFT<input type=\"text\"  class=\"form-control\" placeholder=\"");
      out.print(rf.getString("stock_quantity_left"));
      out.write("\"   Value=\"");
      out.print(rf.getString("stock_quantity_left"));
      out.write("\"name=\"OPSTOCK\" required> \n");
      out.write("        <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" name=\"submitbtn\" class=\"btn btn-outline-primary\" value=\"submit\">\n");
      out.write("        </div>\n");
      out.write("           </div>\n");
      out.write("           </form>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");

      }
       }
       
      out.write("\n");
      out.write("       \n");
      out.write("   \n");
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
