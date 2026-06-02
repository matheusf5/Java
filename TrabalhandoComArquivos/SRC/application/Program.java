package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o caminho do arquivo: ");
		String strFilePath = sc.nextLine();
		File srcFile = new File(strFilePath); 
		String strFolderPath = srcFile.getParent();
		
		boolean success = new File (strFolderPath + "\\Out").mkdir();
		System.out.println("Pasta de saída gerada com sucesso! " + success);
		File summary = new File (strFolderPath + "\\Out\\Summary.csv");
		
		List <Product> produtos = new ArrayList<>();; 
		
		try(BufferedReader br = new BufferedReader (new FileReader(srcFile))){		
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2].trim());
				
				produtos.add(new Product(name, price, quantity));
				
				line = br.readLine(); 
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		try(BufferedWriter bw = new BufferedWriter (new FileWriter(summary))){
			for(Product produto : produtos) {
				bw.write(produto.getName() + ", " + String.format("%.2f", produto.total()));
				bw.newLine();
			}
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
				
		sc.close();		
	}

}
