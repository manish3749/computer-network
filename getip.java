import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class getip{

    public static void main(String[] args) throws Exception{
        
	System.out.println(InetAddress.getByName("www.bitmesra.ac.in"));
	
	InetAddress[] ina = InetAddress.getAllByName("www.facebook.com");
	for(InetAddress ip : ina){
		System.out.println(ip);
	}
    }
}
