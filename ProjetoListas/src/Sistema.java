package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;
import util.ProdutoServico;

public class Sistema {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Produto> listaDeProdutos = new ArrayList<>();
        ProdutoServico operacoes = new ProdutoServico();
        
        int opcao;

        do {
            // Mostra o menu no início do loop
            System.out.println(operacoes.menu());
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("==== ADICIONAR PRODUTO ====");
                    System.out.print("DIGITE A QUANTIDADE DE PRODUTOS QUE VÃO SER CADASTRADOS: ");
                    int N = sc.nextInt();
                    sc.nextLine(); // limpar buffer
                    operacoes.cadastrarProduto(listaDeProdutos, sc, N);
                    operacoes.listaDeProdutos(listaDeProdutos);
                    break;
                    
                case 2:
                    System.out.println("==== EXCLUIR PRODUTO ====");
                    System.out.print("CÓDIGO: ");
                    int codigo = sc.nextInt();
                    operacoes.deletarProduto(listaDeProdutos, sc, codigo);
                    operacoes.listaDeProdutos(listaDeProdutos);
                    break;
                    
                case 3:
                    System.out.println("==== ATUALIZAR PRODUTO ====");
                    System.out.print("CÓDIGO: ");
                    codigo = sc.nextInt();
                    operacoes.atualizarProduto(listaDeProdutos, sc, codigo);
                    operacoes.listaDeProdutos(listaDeProdutos);
                    break;
                    
                case 4:
                    System.out.println("==== PESQUISAR PRODUTO ====");
                    System.out.print("CÓDIGO: ");
                    codigo = sc.nextInt();
                    operacoes.pesquisarProduto(listaDeProdutos, codigo);
                    break;
                    
                case 5:
                    System.out.print("Código do produto: ");
                    codigo = sc.nextInt();
                    System.out.print("Porcentagem de desconto: ");
                    double porcentagem = sc.nextDouble();
                    
                    boolean sucesso = operacoes.descontoProduto(listaDeProdutos, codigo, porcentagem);
                    if (sucesso) {
                        System.out.println("Desconto aplicado com sucesso!");
                    } else {
                        System.out.println("Código não encontrado!");
                    }
                    break;
                    
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 6); // loop encerra quando a opção é 6
        
        sc.close();
    }
}
