<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chat</title>
<script type="text/javascript">
	function sendMsg() {
		if ("WebSocket" in window) {
			alert("WebSocket is supported by your Browser!");
			var websocket = new WebSocket(
					"ws://localhost:8080/TestSocket2/chat");
			websocket.onopen = function() {
				websocket.send("hi");
			}
			websocket.onerror = function() {
				console.log("error");
			}
			websocket.onclose = function() {
				console.log("close");
			}
			websocket.onmessage = function(evt) {
				console.log("message received : " + evt.data);
			}
		}else{
			alert("NOT SUPPORTED!");
		}
	}
</script>
</head>
<body>
	<input type="button" value="发送消息" onclick="sendMsg()">
</body>
</html>