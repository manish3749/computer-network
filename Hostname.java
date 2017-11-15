//Q4) list host names from command line
import java.io.*;
import java.net.*;
public class Hostname{
	public static void main(String a[]) throws Exception{

		InetAddress addr = InetAddress.getLocalHost();
		String host = addr.getHostName();
		String haddr = addr.getHostAddress();

		System.out.println("Host Name :"+host);
		System.out.println("Host Name :"+haddr);
		
		for(int i = 100; i < 1024; i++){
			Socket s = null;
			try{
				s = new Socket(host, i);
				System.out.println("Port = "+i+" active");
				}
			catch(Exception e){
				System.out.println("Error");
				}
			}
		}
	}
