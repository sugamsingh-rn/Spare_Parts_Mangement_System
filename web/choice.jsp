<%-- 
    Document   : choice
    Created on : 7 Jul, 2019, 12:25:21 PM
    Author     : swapnil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html style="
    border-radius: 6%;
    
    margin-left: 439px;
    margin-right: 511px;
    margin-top: 171px;
 background-color: darkviolet;
    ">
     <head style="margin: 0;
    padding: 0;
    font-size: large;
    box-sizing: border-box;">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcome</title>
    </head>
    <body style="background-color: rgb(121, 156, 208);
    color: white;
    font-family: calibri;">
        
        <div style="width: 330px;
    height: 250px;
    padding: 25px 25px;
    background-color: darkorchid;
    margin-left: 50%;
    margin-top: 10%;
    margin-bottom: 2%;
    transform: translate(-50%, 0%);
    border-radius: 10px;
    box-shadow: 5px 5px 30px black;">
            <h3 style="font-size: 200%;
    text-align: center;
    margin-bottom: 20px;">WELCOME</h3>
         
    
    <form>
            
            <input type="submit" class="btn" value="Login" name="admin" style="height: 40px;
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
            
            <input type="submit" class="btn" value="Register" name="employee" style="height: 40px;
    width: 280px;
    border: 10px;
    font-weight: 600;
    font-size: 120%;
    cursor: pointer;
    padding: 10px;
    color: darkorchid;
    background-color: white;
    border-radius: 10px;
    margin: 15px 22px;
    ">
           
            </form>
        </div>
        
         <% if(request.getParameter("admin")!=null){

       response.sendRedirect("adminlogin.jsp");}
       
       if(request.getParameter("reg")!=null){
       
       response.sendRedirect("Register.jsp");}
       
       %>
    </body>
</html>
