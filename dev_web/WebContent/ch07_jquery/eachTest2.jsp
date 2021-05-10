<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOM조작[img] 실습 - 2-6</title>
	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<style type="text/css">
		.high-light {
			background-color: yellow;
		}
		.high-light1-0 { background-color: yellow; }
		.high-light1-1 { background-color: orange; }
		.high-light1-2 { background-color: blue; }
		.high-light1-3 { background-color: green; }
		.high-light1-4 { background-color: red; }
	</style>
</head>
<body>
<script>
	'use strict'
	$(document).ready(function() {
		$('h1').each(function(index, item){
			$(this).addClass('high-light1-'+index);
		});
	});
</script>
<h1>item - 0</h1>
<h1>item - 1</h1>
<h1>item - 2</h1>
<h1>item - 3</h1>
<h1>item - 4</h1>
</body>
</html>