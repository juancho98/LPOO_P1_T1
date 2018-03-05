package lpoo_p1_01.cap3;

import java.util.Scanner;

public class TestBankAccount {

   
    public static void main(String[] args) {
		BankAccount cuenta1 = new BankAccount();
		BankAccount cuenta2 = new BankAccount();
		BankAccount cuenta3 = new BankAccount();
		BankAccount cuenta4 = new BankAccount();
		getData(cuenta1);
		getData(cuenta2);
		getData(cuenta3);
		showValues(cuenta1);
		showValues(cuenta2);
		showValues(cuenta3);
		showValues(cuenta4);
	}
	
	public static BankAccount getData(BankAccount cuenta) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de cuenta: ");
		cuenta.setNumC(sc.nextInt());
		System.out.print("Nombre: ");
		cuenta.setName(sc.next());
		System.out.print("Saldo: ");
		cuenta.setSaldo(sc.nextInt());
		
		System.out.println();
		return cuenta;
	}
	
	public static BankAccount showValues(BankAccount cuenta) {
		System.out.println();
		System.out.println("Numero de cuenta: " + cuenta.getNumC());
		System.out.println("Nombre: " + cuenta.getName());
		System.out.println("Saldo: $" + cuenta.getSaldo());
		
		cuenta.setSaldo(cuenta.deductMonthlyFee());
		System.out.println("---Nuevo saldo: $" + cuenta.getSaldo());
		System.out.println();
		return cuenta;
	}
}