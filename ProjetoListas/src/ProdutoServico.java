package util;

import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class ProdutoServico {
	
	public String menu() {
		return "\n*********************************\n"
		          + "*        SISTEMA DE PRODUTOS     *\n"
		          + "*********************************\n"
		          + "* [1] Adicionar produto          *\n"
		          + "* [2] Excluir produto            *\n"
		          + "* [3] Atualizar produto          *\n"
		          + "* [4] Pesquisar produto          *\n"
		          + "* [5] Desconto produto           *\n"
		          + "* [6] Sair                       *\n"
		          + "*********************************";
	}
	
	public void cadastrarProduto(List<Produto> listaDeProdutos, Scanner sc, int N) {
		
		for(int i = 0; i < N; i++) {
			System.out.print("\nPRODUTO #" + (i+1));
			System.out.print("\nNOME: ");
			String nome = sc.nextLine();
			System.out.print("CóDIGO: ");
			Integer codigo = sc.nextInt();
			System.out.print("PREÇO: R$");
			Double preco = sc.nextDouble();
			
			sc.nextLine();
			
			while(codigoExistente(listaDeProdutos, codigo)) {
				System.out.println("Esse código já existe! Digite outro código: ");
				codigo = sc.nextInt();
				sc.nextLine();
			}
			listaDeProdutos.add(new Produto(codigo, nome, preco));
		}
	}
	
	public void deletarProduto(List<Produto> listaDeProdutos, Scanner sc, int codigo) {
		boolean encontrado = false;
		for (int i = 0; i < listaDeProdutos.size(); i++){
			if(listaDeProdutos.get(i).getCodigo() == codigo) {
				listaDeProdutos.remove(i);
				encontrado = true;
			}
		}
		 if (!encontrado) {
		        System.out.print("Produto não encontrado. Digite outro código:");
		        codigo = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < listaDeProdutos.size(); i++){
					if(listaDeProdutos.get(i).getCodigo() == codigo) {
						listaDeProdutos.remove(i);
						encontrado = true;
					}
				}
		    }
	}
	
	public void atualizarProduto(List<Produto> listaDeProdutos, Scanner sc, int codigo) {
		for (Produto produto : listaDeProdutos){
			if (produto.getCodigo() == codigo) {
	            System.out.print("NOVO NOME: ");
	            sc.nextLine(); // limpa buffer
	            String nome = sc.nextLine();

	            System.out.print("NOVO PREÇO: ");
	            double preco = sc.nextDouble();

	            produto.setNome(nome);
	            produto.setPreco(preco);
	            break;
			}
		}
	}
	
	public void pesquisarProduto(List<Produto> listaDeProdutos, int codigo) {
	    boolean encontrado = false;

	    for (Produto produto : listaDeProdutos) {
	        if (produto.getCodigo() == codigo) {
	            System.out.println("=== PRODUTO ENCONTRADO ===");
	            System.out.println(produto);
	            encontrado = true;
	            break;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Produto não encontrado.");
	    }
	}
	
	public boolean descontoProduto(List<Produto> listaDeProdutos, int codigo, double porcentagem) {

	    for (Produto produto : listaDeProdutos) {
	        if (produto.getCodigo() == codigo) {
	            produto.desconto(porcentagem);
	            System.out.println(produto);
	            return true;
	        }
	    }

	    return false;
	}
	
	public boolean codigoExistente(List<Produto> listaReferencia, int codigo) {
		for(Produto codigoVerificado : listaReferencia) {
			if(codigoVerificado.getCodigo() == codigo) {
				return true;
				}
			}
			return false;
		}	
	
	public void listaDeProdutos(List<Produto> listaDeProdutos) {
		    if (listaDeProdutos.isEmpty()) {
		        System.out.println("Nenhum produto cadastrado.");
		        return;
		    }

		    System.out.println("\n==== LISTA DE PRODUTOS ====");
		    for (Produto produto : listaDeProdutos) {
		        System.out.println(produto);
		    }
		    System.out.print("===========================\n");
	}
}
