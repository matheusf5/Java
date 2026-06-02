package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> produtos = new  ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("\nProduct #" + i + " data: ");
			System.out.print("\nCommon, used, or imported (c/u/i)? ");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(resposta == 'i') {
				System.out.print("Customs free: ");
				double customs  = sc.nextDouble();
				
				Product prod = new ImportedProduct(name, price, customs);
				produtos.add(prod);
			}
			else if (resposta == 'c') {
				Product prod = new Product (name, price);
				produtos.add(prod);
			}
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateStr = sc.next();
				Date date = sdf.parse(dateStr);
				Product prod = new UsedProduct(name, price, date);
				produtos.add(prod);
			}
		}
			for (Product prod : produtos) {
				System.out.println("- " + prod.priceTag());
			}
		
			sc.close();
	}
		
}



