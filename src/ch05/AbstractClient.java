package ch05;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 2단계 - 상속 활용 리팩토링 단계
public abstract class AbstractClient {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader readerStream;
	private PrintWriter writerStream;
	private BufferedReader keyboardReader;

	// get,set 메서드
	protected void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	protected void setSocket(Socket socket) {
		this.socket = socket;
	}

	protected ServerSocket getServerSocket() {
		return serverSocket;
	}
	
	public final void run() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
 		}
	}
}
