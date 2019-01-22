
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="sources\.png">
		<style>
		
        @font-face
		{
			font-family: DS Digi;
			src: url('sources/DS-DIGI.TTF')
		}
            @font-face
		{
			font-family: orange;
			src: url('sources/orange juice 2.0.ttf')
		}
        *
		{
			font-family: Segoe UI;
		} 
            button
            {
                border: 1px solid white;
                padding: 10px 10px 10px 10px;
				border-radius: 5px;
				background-color: black;
                color: white;
                font-size: 20px;
				font-family: Impact;
				margin: 0px 5px 5px 0px;
                
        }
            
        button:hover {
                background-color: white;
                color: black;
        }
        a:visited
        {
            color: white;
        }
        #timebox
        {
			border: 2px solid white;
			color: white;
			font-family: DS Digi;
			font-size: 20px;
			text-align: right;
			padding: 12px;
			border-radius: 10px;
        }
        a:visited
			{
				color: white;
			}
			
		.form
		{
			background-color: orange;color: white;
		}
		.form:hover
		{
			border: 2px solid orange;
		}
		</style>
		<script type = "text/javascript">
			function updateTime()
			{
				var d = new Date();
				var tt = "AM"
				var hh = d.getHours();
				var mm = d.getMinutes();
				var ss = d.getSeconds();

				if(parseInt(hh/10) == 0)
					hh = "0"+hh;

				if(hh > 12)
				{
					hh = hh - 12;
					tt = "PM";
				}

				if(parseInt(mm/10) == 0)
					mm = "0"+mm;

				if(parseInt(ss/10) == 0)
					ss = "0"+ss;

				document.getElementById("timebox").innerHTML = "#Time: " + hh+":"+mm+":"+ss+" "+tt+" #Date: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getFullYear();
			}
			function load()
			{
				var uid = document.getElementById("uid").value;
				var pwd = document.getElementById("pwd").value;
				var user = document.getElementById("user").value;
				if(uid != "" && pwd != "" && user != "")
					document.getElementById("loading").style.visibility = "visible";
			}
		</script>
    </head>
    <body background = "sources\carbon2.jpg" style = "background-attachment: fixed;">
		<script>
		setInterval(updateTime, 1000);
		</script>
		
		<header style="background-color: black;width: 99%;margin: 0px;padding: 10px;">
			<div id = "timebox"> Time will load up here shortly... </div>
			<br>
				<div style="width:100%;height:100px;color:white;font-family: Segoe UI;">
					<a href="index.html"><span style="font-family: orange;font-size: 60px;float: left;padding: 0px 15px 15px 40px">BOOTCAMP INDIA</span></a>
					<a href="signup.jsp"><button style="float: right;"> Sign Up </button></a>
				</div>
		</header>
		
        <div style = "border: 10px solid grey;border-radius: 10px;background-image: url('sources/grey-chevron-stripes-1920.png');margin: 50px 200px 50px 200px;padding: 0px 20px 20px 20px;">
			<form id = "login-form" action = "Login" method="POST">
				<fieldset>
					<legend align="center">
						<h1>LOGIN</h1>
					</legend>
					<center>
					
					
						
					<h3>
						Email ID : <input type="email" placeholder="ID" id = "email" name = "email" autofocus required><br><br>
						Password : <input type="password" placeholder="password" id = "pwd" name = "pwd" required><br><br>
						User : <select id = "user" name = "user" required>
									<option value=""> Select User Type </option>
									<option value="Innovator"> Innovator </option>
									<option value="Corporation"> Corporation </option>
								</select>
						<br><br>
						<button type="submit" class="form" onclick = "load()"> Login </button>
						<br>
					</h3>
						<span id = "loading" style = "visibility: hidden;"><video src = "sources\loading.mp4" style = "height: 150px;" autoplay loop></video><br>loading...</span>
					
					</center>
				</fieldset>
			</form>
		</div>
		
		<footer>
			<center>
			<br>
				<div style = "padding: 20px;color: white;width: 30%;border-radius: 20px;font-family: Segoe UI Light;">
					
					All rights reserved | Bootcamp India © 2019
				</div>
			<center>
		</footer>
    </body>
</html>
