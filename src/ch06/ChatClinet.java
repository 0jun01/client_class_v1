package ch06;

import java.io.IOException;
import java.net.Socket;

public class ChatClinet extends AbstractClient {

	public ChatClinet(String name) {
		super(name);
	}

	@Override
	protected void connectToServer() throws IOException {
		// AbstractClinet --> 부모 클래스 --> 서버측과 연결된 소켓을 주입해 주어야 한다.
		super.setSocket(new Socket("192.168.0.48", 5000));
	}

	public static void main(String[] args) {
		ChatClinet chatClient = new ChatClinet("ㅁ");
		chatClient.run();
	}
}
