package PACOTE;

import java.util.Scanner;

public class menu {
    
    public static void menu(){
    	System.out.println("Menu ATM");
  	  System.out.println("-----------------");
  	  System.out.println("1. Extrato");
  	  System.out.println("2. Sacar");
  	  System.out.println("3. Depositar");
  	  System.out.println("0. Sair");
  	  System.out.println("-----------------");
  	  System.out.println("escolha sua opção");
    }

    public static void extrato(){
    	   System.out.println("-----------------");
    	   System.out.println("Seu extrato é: ");
    	   System.out.println("-----------------");
    }
    
    public static void sacar(){
    	  System.out.println("-----------------");
   	   System.out.println("quanto você deseja sacar?");
   	   System.out.println("-----------------");
   		  
    }
    
    public static void depositar(){
    	System.out.println("-----------------");
		  System.out.println("Quanto você deseja depositar?");
		  System.out.println("-----------------");
    }
    
    
    public static void main(String[] args) {
        int opcao;
        
        int extrato;
        double saldo = 300;
        double saldo_final;
        double saque = 0;
        double deposito = 0;
       
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            menu();
            opcao = scanner.nextInt();
            
            switch(opcao){
            case 1:
                extrato();
                System.out.println("saldo: " + saldo + " deposito: " + deposito + " saque: " + saque);
                saldo_final = (saldo + deposito - saque);
                System.out.println("Saldo final: " + saldo_final);
                break;
                
            case 2:
                sacar();
                
                saque = scanner.nextInt();
                System.out.println("vc sacou: " + saque);
                break;
                
            case 3:
                depositar();
                
                deposito = scanner.nextInt();
                System.out.println("vc depositou: " + deposito);
                break;
                
            }
        } while(opcao != 0);
    }
}