package ghk;

import java.util.Scanner;

public class teste2 {
   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  
	  
	  System.out.println("opção 1");
	  System.out.println("opção 2");
	  System.out.println("opção 3");
	  System.out.println("opção 4");
	  System.out.println("-----------------");
	  System.out.println("escolha sua opção");
	  
	  int opção = scanner.nextInt();
	  int ação = scanner.nextInt();
	  
	  
	  switch (opção) {
	  case 1:
		  System.out.println("-----------------");
		  System.out.println("realizar ação 1");
		  System.out.println("realizar ação 2");
		  System.out.println("-----------------");
		  System.out.println("escolha sua ação");
		  
		  break;
	  case 2: 
		  System.out.println("escolher configuração 1");
		  System.out.println("escolher configuração 2");
		  System.out.println("-----------------");
		  System.out.println("escolha sua configuração");
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

