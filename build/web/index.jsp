<%-- 
    Document   : index
    Created on : Jan 22, 2019, 10:21:55 AM
    Author     : Sarthak Jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                float: right;
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
		</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bootcamp India | Home</title>
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
					<a href="signup.jsp"><button> Sign Up </button></a>
					<a href="login.jsp"><button> Login </button></a>
				</div>
		</header>
        <div id="body" style="background-color: orange;padding: 20px;margin: 0px -10px 0px -10px;">
    <center><iframe src="marquee-home.html" style="border: 10px solid grey;border-radius: 10px;" width="90%" height="400px" scrolling="no">
        </iframe></center>
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
