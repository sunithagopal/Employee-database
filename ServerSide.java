package socketpro;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) throws Exception{  
		   
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=" ",str2=" " ;
		while(!str.equals("stop")) {
			str=din.readUTF();
	
		
	 
		
		System.out.println("Client Says: "+str);
		str2=br.readLine();
		//str2=din.readLine();
		dout.writeUTF(str2);
	dout.flush();
		  
		} 
		din.close();
		s.close();
		ss.close();
		}  
		}  

