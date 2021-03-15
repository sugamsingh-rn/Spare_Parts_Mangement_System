<%-- 
    Document   : home.jsp
    Created on : 6 Jul, 2019, 12:52:32 PM
    Author     : swapnil
--%>

<%@page import="javax.sound.midi.SysexMessage"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
    <body>
        
        <form>       
        <div class="row ">
 
            <div class="col-lg-6">
              <div class="btn-group" role="group" aria-label="Basic example">
          <input type="submit" style="-webkit-appearance: media-slider;" class="btn btn-outline-primary btn-lg " value="show spare parts" name="stbtn">
            
                   <input type="submit"  style="-webkit-appearance: media-slider;" class="btn btn-outline-primary btn-lg" value="add spare parts" name="addbtn">
           
            
                   <input type="submit" style="-webkit-appearance: media-slider;" class="btn btn-outline-primary btn-lg " value="update spare parts" name="upbtn">
                   
                   <input type="submit" style="-webkit-appearance: media-slider;" class="btn btn-outline-primary btn-lg" value="delete spare parts" name="delbtn">
                   
                     
                   <input type="submit" style="-webkit-appearance: media-slider;" class="btn btn-outline-primary btn-lg" value="daily data change" name="dailybtn">
     
</div>
            </div>
           

        </div>
        </form>
        <%
        
        
        
        
        if(request.getParameter("delbtn")!=null)
        {
            %>
          <br><br>
           <form> 
           <div class="col-lg-12 col-md-12 ">
        <div class="form-group">   
        ENTER SERIAL NUMBER TO DELETE AN ENTRY
           <input type="text"  class="form-control" placeholder="enter the serial number" name="dsno" required>      
           <br>
         <input type="submit" name="deletesno" class="btn btn-outline-primary" value="submit">
        </div></div></form>
       
        
        
        <%
        }
        
        %>
        <%
        
        if(request.getParameter("deletesno")!=null)
        {
         try{  
         int n=0,dsno=Integer.parseInt(request.getParameter("dsno"));
            util.SqlUtil.updateData("delete from auto_parts where s_no="+dsno+"");
             ResultSet relaz=util.SqlUtil.read("select * from auto_parts where s_no >"+dsno+";");
            while(relaz.next())
            {
                n++;
            }
           
            for(int i=0;i<n;i++)
            {
                 dsno++;
                System.out .println(dsno);
                int k=dsno-1;
                util.SqlUtil.updateData("update auto_parts set s_no="+k+" where s_no="+dsno+"");
           
            }
            
        }
        catch(Exception ex) 
         {
             System.out .println(ex);
         }
       }
        %>
              
        
        
        
            <%
     try{
         
           util.SqlUtil.connectDB();
       if(request.getParameter("stbtn")!=null)
       {
          ResultSet s=util.SqlUtil.read("select * from auto_parts");
          %>   <table class="table table-striped">
               <tr>
                  <td>
                   SERIAL NO
                  </td>
                <td>
                PART NAME
                  </td>
                <td>
                 MODEL 
                  </td>                <td>
                    COMPANY
                  </td>                <td>
                  QUANTITY
                  </td>                <td>
                   MRP
                  </td>                <td>
                    NET RATE
                  </td>
               
                  <td>
                    STOCK QUANTITY LEFT
                  </td>
                  </tr>
 
           
              
              
              
              
              <%
          while(s.next()){
          %>
       
          <tr>
                  <td>
                    <%=s.getInt("s_no")%>
                  </td>
                <td>
                    <%=s.getString("part_name")%>
                  </td>
                <td>
                    <%=s.getString("model")%>
                  </td>                <td>
                    <%=s.getString("company")%>
                  </td>                <td>
                    <%=s.getString("quantity")%>
                  </td>                <td>
                    <%=s.getString("mrp")%>
                  </td>                <td>
                    <%=s.getString("net_rate")%>
                  </td>
               
                  <td>
                    <%=s.getString("stock_quantity_left")%>
                  </td>
                  </tr>

                
        <%
          }
            %>   </table><%
       
       }
       }catch(Exception ex)
       {
           
       }
       %>
       
       <%
       if(request.getParameter("addbtn")!=null)
       {
       %>
       <br>
       <br>
       
       <form> 
           <div class="col-lg-12 col-md-12 ">
        <div class="form-group">   
           PART NAME 
           <input type="text"  class="form-control" placeholder="enter part name" name="PARTNAME" required>      
           <br>
           <br>
        MODEL
        <input type="text"  class="form-control" placeholder="enter model name" name="MODEL" required> 
        <br>
           <br>
        COMPANY	
        
        <input type="text" class="form-control" placeholder="enter company name" name="COMPANY"  required> 
        <br>
           <br>
        CURRENT QUANTITY
        <input type="text"class="form-control"  placeholder="enter total quantity" name="QUANTITY" required> <br>
           <br>
        MRP<input type="text"  class="form-control" placeholder="enter  maximum retail price" name="MRP"> 
        <br>
           <br>
      
        NET RATE<input type="text" class="form-control"  placeholder="enter net rate" name="NETRATE" required> 
        <br>
           <br>
        STOCK QUANTITY LEFT<input type="text"  class="form-control" placeholder="enter opening stock" name="OPSTOCK" required> 
        <br>
           <br>
           <input type="submit" name="submitbtn" class="btn btn-outline-primary" value="submit">
        </div>
           </div>
           </form>
       
        <%
       
       
       }
       %>
       <%
       if(request.getParameter("submitbtn")!=null)
       {
          ResultSet rs=util.SqlUtil.read("select max(s_no) from auto_parts");
           int s_no=0;
           if(rs.next())
           {
               s_no=rs.getInt("max(s_no)");
               s_no++;
           }
           int q=Integer.parseInt(request.getParameter("QUANTITY"));
           util.SqlUtil.create("insert into auto_parts values("
                   +s_no+",'"+request.getParameter("PARTNAME")+"','"
              +request.getParameter("MODEL")+"','"    
              +request.getParameter("COMPANY")+"','"
                    +q +"',"
              +request.getParameter("MRP")+","
               +request.getParameter("NETRATE")+","
                +request.getParameter("OPSTOCK")    
               
                   + ")");
       }
       
       %>
       <%
       if(request.getParameter("upbtn")!=null)
       {
       %>
       <br><br>
           <form> 
           <div class="col-lg-12 col-md-12 ">
        <div class="form-group">   
        ENTER SERIAL NUMBER TO CHANGE SPECIFICATIONS
           <input type="text"  class="form-control" placeholder="enter the serial number" name="sno" required>      
           <br>
         <input type="submit" name="serialno" class="btn btn-outline-primary" value="submit">
        </div></div></form>
       
       
       <%
       
       }
       
       %>
       <%! int serial_no;%>
       <%
         if(request.getParameter("serialno")!=null){
        serial_no=Integer.parseInt( request.getParameter("sno") );
     ResultSet rf= util.SqlUtil.read("select * from auto_parts where s_no='"+serial_no+"'");
      if(rf.next()){
       %>
           <br>
       <br>
       
       <form> 
           <div class="col-lg-12 col-md-12 ">
        <div class="form-group">   
           PART NAME 
           <input type="text"  class="form-control" placeholder="<%=rf.getString("part_name")%>" value="<%=rf.getString("part_name")%>" name="PARTNAME" required>      
           <br>
           <br>
        MODEL
        <input type="text"  class="form-control" placeholder="<%=rf.getString("model")%>" value="<%=rf.getString("model")%>" name="MODEL" required> 
        <br>
           <br>
        COMPANY	
        
        <input type="text" class="form-control" placeholder="<%=rf.getString("company")%>" value="<%=rf.getString("company")%>" name="COMPANY"  required> 
        <br>
           <br>
        CURRENT QUANTITY
        <input type="text"class="form-control"  placeholder="<%=rf.getString("QUANTITY")%>"  Value="<%=rf.getString("QUANTITY")%>"name="QUANTITY" required> <br>
           <br>
        MRP<input type="text"  class="form-control" placeholder="<%=rf.getString("MRP")%>"   Value="<%=rf.getString("MRP")%>" name="MRP"> 
        <br>
           <br>
      
        NET RATE<input type="text" class="form-control"  placeholder="<%=rf.getString("net_rate")%>"  Value="<%=rf.getString("QUANTITY")%>" name="NETRATE" required> 
        <br>
           <br>
        STOCK QUANTITY LEFT<input type="text"  class="form-control" placeholder="<%=rf.getString("stock_quantity_left")%>"   Value="<%=rf.getString("stock_quantity_left")%>"name="OPSTOCK" required> 
        <br>
           <br>
           <input type="submit" name="submitbtn2" class="btn btn-outline-primary" value="submit">
        </div>
           </div>
           </form>
       
       
       
       
       
       <%
      }
       }
       %>
 <%      if(request.getParameter("submitbtn2")!=null)
       {
         
           int q=Integer.parseInt(request.getParameter("QUANTITY"));
           util.SqlUtil.create("update auto_parts set part_name='"
                  +request.getParameter("PARTNAME")+"',model='"
              +request.getParameter("MODEL")+"',company='"    
              +request.getParameter("COMPANY")+"',quantity='"
                    +q +"',MRP="
              +request.getParameter("MRP")+",NET_RATE="
               +request.getParameter("NETRATE")+",stock_quantity_left="
                +request.getParameter("OPSTOCK")    
               
                   + " where s_no='"+serial_no+"'");
       }
 %>      
   
 <%
    if(request.getParameter("dailybtn")!=null){
        %>
 <form> 
           <div class="col-lg-12 col-md-12 ">
        <div class="form-group">   
        ENTER SERIAL NUMBER TO CHANGE SPECIFICATIONS
           <input type="text"  class="form-control" placeholder="enter the serial number" name="nameOfColumn" required>      
           <br>
         <input type="submit" name="date" class="btn btn-outline-primary" value="submit">
        </div></div></form>
       
       <%
        if(request.getParameter("date")!=null){
        util.SqlUtil.updateData("alter table auto_parts add column "+request.getParameter("nameOfColumn")+" varchar(20)");
        }
    }
 
 
 
 
 
 
 
 %>
 
 
    </body>
</html>
