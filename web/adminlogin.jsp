<%-- 
    Document   : adminlogin
    Created on : 7 Jul, 2019, 12:32:39 PM
    Author     : swapnil
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="util.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head style="margin: 0;
    padding: 0;
    font-size: large;
    box-sizing: border-box;
">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        
        <script>
        function cancel()
           {
               document.location.href="choice.jsp";
           }
           </script>
         
    </head>
     <body style="background-color: rgb(126, 156, 208);
    color: white;
    font-family: calibri;">
         
        <div style="width: 350px;
    height: 400px;
    padding: 25px 25px;
    background-color: darkviolet;
    margin-left: 50%;
    margin-top: 10%;
    margin-bottom: 2%;
    transform: translate(-50%, 0%);
    border-radius: 10px;
    box-shadow: 5px 5px 30px black;">
            <h3 style="font-size: 200%;
    text-align: center;
    margin-bottom: 20px;">LOGIN FORM</h3>
        
        <form>
           
            <input type="text" name="uname" placeholder="Enter username"
                   style="height: 40px;
    width: 280px;
    border: 10px;
    font-weight: 600;
    font-size: 120%;
    cursor: pointer;
    padding: 10px;
    color: darkviolet;
    background-color: white;
    border-radius: 10px;
    margin: 15px 22px;">
            <br>
            <br>
            
            <input type="password" name="upass" placeholder="Enter password"
                   style="height: 40px;
    width: 280px;
    border: 10px;
    font-weight: 600;
    font-size: 120%;
    cursor: pointer;
    padding: 10px;
    color: darkorchid;
    background-color: white;
    border-radius: 10px;
    margin: 15px 22px;">
            <br>
            <br>
            <input type="submit" name="btn" value="Login" style="
    margin-right: 160px;
    height: 25px;
    width: 79px;
    padding: 0px;
">
            <button type="button" name="cancel" onclick="cancel()" style="
    margin: left;
    margin: -127px;
    width: 79px;
    height: 25px;
">cancel</button>
        </form>
        
        
        <%!String username,passward;%>
        
       
        
        <% 
            
         if(request.getParameter("btn")!=null)
         {
             username=request.getParameter("uname");
             passward=request.getParameter("upass");
             System.out.println(username);
             
             String query="select * from admin where username='"+username+"' and password='"+passward+"'";
             

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
                 %>
                 
                 <script>alert('Invalid username/password');</script>
                 
            <% }
            }catch(Exception ex)
            {  
              System.out.println("Problem in login : "+ex);

                }
                       }

%>
    </body>

</html>