package com.javaprogramesDay6;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SystemIPAddress {
	

	public static void main(String args[]) throws Exception
	   {
	      
	      InetAddress myIP=InetAddress.getLocalHost();
	 
	      /* public String getHostAddress(): Returns the IP 
	       * address string in textual presentation.
	       */
	      System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());
	  }
	}