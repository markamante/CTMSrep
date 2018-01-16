<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
@import
	url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400);

@import
	url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400);

section {
	text-align: center;
}

.footer #button {
	width: 50px;
	height: 50px;
	border: #727172 12px solid;
	border-radius: 35px;
	margin: 0 auto;
	position: relative;
	-webkit-transition: all 1s ease;
	-moz-transition: all 1s ease;
	-o-transition: all 1s ease;
	-ms-transition: all 1s ease;
	transition: all 1s ease;
}

.footer #button:hover {
	width: 35px;
	height: 35px;
	border: #3A3A3A 12px solid;
	-webkit-transition: all 1s ease;
	-moz-transition: all 1s ease;
	-o-transition: all 1s ease;
	-ms-transition: all 1s ease;
	transition: all 1s ease;
	position: relative;
}

.footer {
	bottom: 0;
	left: 0;
	position: fixed;
	width: 100%;
	overflow: hidden;
	margin: 0 auto;
	z-index: 999;
	height: 3em;
}

.header {
	top: 0;
	left: 0;
	position: fixed;
	width: 100%;
	overflow: hidden;
	margin: 0 auto;
	z-index: 999;
	background-color: #8bbf36;
    border-bottom: 20px solid #649525;
	
}
.footer #container {
	margin-top: 5px;
	width: 100%;
	height: 100%;
	position: relative;
	top: 0;
	left: 0;
	background-color: #333333;
}

.footer #cont {
	position: relative;
	top: -45px;
	right: 190px;
	width: 150px;
	height: auto;
	margin: 0 auto;
}

.footer_center {
	width: 500px;
	float: left;
	text-align: center;
}

.footer p {
	font-family: 'Helvetica';
	font-size: 15px;
	font-weight: 100;
	margin-top: 70px;
	margin-left: 40px;
}


.header_center {
	width: 500px;
	float: left;
	text-align: center;
}

.space{
	top:10px;
}
nav {
position: fixed;
	width: 100%;
	height: 30px;
	background-color: #649525;
	font-size: 0;
}
nav a {
	line-height: 35px;
	height: 100%;
	font-size: 12px;
	display: inline-block;
	position: relative;
	z-index: 1;
	text-decoration: none;
	text-transform: uppercase;
	text-align: center;
	color: white;
	cursor: pointer;
    font-family : Century Gothic;
}
nav .animation {
	position: absolute;
	height: 100%;
	top: 0;
	z-index: 0;
	transition: all .5s ease 0s;
}
a:nth-child(1) {
	width: 100px;
}
a:nth-child(2) {
	width: 110px;
}
a:nth-child(3) {
	width: 100px;
}
a:nth-child(4) {
	width: 160px;
}
a:nth-child(5) {
	width: 120px;
}
nav .start-home, a:nth-child(1):hover~.animation {
	width: 100px;
	left: 0;
	background-color: #2c3e50;
}
nav .start-about, a:nth-child(2):hover~.animation {
	width: 110px;
	left: 100px;
	background-color: #2c3e50;
}
nav .start-blog, a:nth-child(3):hover~.animation {
	width: 100px;
	left: 210px;
	background-color: #2c3e50;
}
nav .start-portefolio, a:nth-child(4):hover~.animation {
	width: 160px;
	left: 310px;
	background-color: #2c3e50;
}
nav .start-contact, a:nth-child(5):hover~.animation {
	width: 120px;
	left: 470px;
	background-color: #2c3e50;
}


</style>
</head>
<body>

<div class="header">
		<div class="header_center">
			<div class="space"></div>
			<br /> <img src="https://preview.ibb.co/cRPWu6/Untitled_1.png"
				width="300px" height="59px" />
	    </div>
        
</body>
</html>