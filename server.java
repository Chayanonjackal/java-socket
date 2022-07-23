import java.net.*;
import java.io.*;

public class server{
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
		System.out.println("client connected");
		
		//Input value from client
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str = bf.readLine();
		System.out.println("client : "+str);
		
		//send value to client
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("yes");
		pr.flush();
		
	}
}