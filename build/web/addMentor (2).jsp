<%-- 
    Document   : addmentor
    Created on : 22 Jan, 2019, 11:28:18 AM
    Author     : NIKHIL-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr size="10" color="black">
         <div class="topnav">
             
             <!--<a href="UserPage.jsp">Home</a>-->
             <a href="addmentor.jsp">Add Mentor</a> 
             <!--<a href="feedback.jsp">FeedBack</a>-->
             <a href="upload.jsp">Assign Mentor</a>
             <a href="about.jsp">Add Problem</a>
             <a class="active" href="RequestServlet">Status</a>
             
             <a style="float:right;" href="SignOut.jsp" >Sign Out</a>
             
         </div> 
        <br>
        <br>
        <form class='form_data' action="addmentors" method="post" >
		<div class="main">
            <fieldset>
				<span class="title">Add Mentor</span>
                <p>Firstname:</p>
                <p><input type="text" required name="fn" placeholder="Firstname"></p>
                
                <p>Lastname:</p>
                <p><input type="text" required name="ln" placeholder="Lastname"></p>
                
                
                <p>Email:</p>
                <p><input type="text" required name="email" placeholder="abc@xyz.com"></p>
                
                <p>Linkedin Profile:</p>
                <p><input type="text" required name="lpro"></p>

                <p>Mobile no:</p>
                <p><input type="text" id="number" required name="mno" placeholder="XXXXXXXXXX"></p>
                
                <p><button type="submit">Add</button></p>
                <p><button type="reset">Reset</button></p>
                <br>
            </fieldset>
		</div>
	</form>
    </body>
</html>
