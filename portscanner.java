import  java.io.*;
import java.net.InetAddress;
import java.net.Socket;
public class portscanner{
public static void main(String args[])throws Exception{

	String hosts="localhost";
	InetAddress intAddress= InetAddress.getByName(hosts);
	String hostName=intAddress.getHostName();
	for(int port=0;port<=65535;port++){
		try{
			Socket socket=new Socket(hostName,port);
			String text=hostName+"is listening port"+port;
			System.out.println(text);
			socket.close();
			}
		catch(Exception e){
		String host = hostName+"is not listening a port" + port;
		System.out.println(host);
		}
	}
}
}