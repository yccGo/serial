import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class ChatServer {
	@OnMessage
	public String receiveMessage(String message){
		return "服务器端接收到" + message;
	}
	
}
