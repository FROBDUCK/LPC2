package ghk;

import java.util.Scanner;

public class teste2 {
   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  
	  
	  System.out.println("op��o 1");
	  System.out.println("op��o 2");
	  System.out.println("op��o 3");
	  System.out.println("op��o 4");
	  System.out.println("-----------------");
	  System.out.println("escolha sua op��o");
	  
	  int op��o = scanner.nextInt();
	  int a��o = scanner.nextInt();
	  
	  
	  switch (op��o) {
	  case 1:
		  System.out.println("-----------------");
		  System.out.println("realizar a��o 1");
		  System.out.println("realizar a��o 2");
		  System.out.println("-----------------");
		  System.out.println("escolha sua a��o");
		  
		  break;
	  case 2: 
		  System.out.println("escolher configura��o 1");
		  System.out.println("escolher configura��o 2");
		  System.out.println("-----------------");
		  System.out.println("escolha sua configura��o");
		  break;
	  case 3:
		  System.out.println("usar objeto 1");
		  System.out.println("usar objeto 2");
		  System.out.println("-----------------");
		  System.out.println("escolha seu objeto");
		  break;
	  }
	   }
   }

