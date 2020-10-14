package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.Paypal;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data.");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date cdate = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		
		Contract contract = new Contract(number, cdate, value);
		
		System.out.print("Enter the number of installments: ");
		int numberInstallments = sc.nextInt();
		
		ContractService cs = new ContractService(new Paypal());
		
		cs.processContract(contract, numberInstallments);
		
		System.out.println("Installments:");
		for(Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
