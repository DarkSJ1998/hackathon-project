<html>
    <head>
        <style>
            
        </style>
    </head>
    <body bgcolor="white">
	<%@page import="java.util.*,Modal.*;"%>
	<%
		Corp s = (Corp)session.getAttribute("corp");
	
	%>
        <table border = "1px solid grey" style = "width: 85%;border-collapse: collapse;margin: 0px 20px 20px 20px;">
			<tr>
				<th> Name : </th>
				<td> <%=s.getName()%></td>
			</tr>
			<tr>
				<th> Email ID : </th>
				<td> <%=s.getEmail()%></td>
			</tr>
			<tr>
				<th> Contact No : </th>
				<td> <%=s.getMobile()%></td>
			</tr>
			<tr>
				<th> Address : </th>
				<td> <%=s.getAddress()%></td>
			</tr>
		<table>
    </body>
</html>