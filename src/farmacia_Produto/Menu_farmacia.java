package farmacia_Produto;

import java.util.Scanner;
import farmacia.model.Medicamento;
import farmacia.controller.ProdutoController;
import farmacia.model.Cosmetico;
import farmacia.util.Cores_farmacia.Cores;

public class Menu_farmacia {

		private static final Scanner leia = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			
			ProdutoController produtos = new ProdutoController();

			
			// Produtos iniciais
			
				Medicamento p1 = new Medicamento(1, "Dipirona", 1, 29.90f, "Sem tarja");
		        Cosmetico p2 = new Cosmetico(2, "Seda Ceramidas", 2, 5.90f, "Shampoo");
		        Medicamento p3 = new Medicamento(3, "Rivotril", 1, 85.90f, "Tarja preta");
		        Cosmetico p4 = new Cosmetico (4, "Dove", 2, 6.99f, "Sabonete");
		        Medicamento p5 = new Medicamento(5, "Yasmin", 1, 80.90f, "Sem tarja");

		        produtos.criarProduto(p1);
		        produtos.criarProduto(p2);
		        produtos.criarProduto(p3);
		        produtos.criarProduto(p4);
		        produtos.criarProduto(p5);

		        int opcao;
		        
			while (true) {

				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + Cores. ANSI_CYAN_BACKGROUND
						+ "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("          Anubi's Pharm                              ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Criar Produto                        ");
				System.out.println("            2 - Listar todas as Produtos             ");
				System.out.println("            3 - Buscar Produto por ID                ");
				System.out.println("            4 - Atualizar Dados da Produto           ");
				System.out.println("            5 - Apagar Produto                       ");
				System.out.println("            0 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     " + Cores.TEXT_RESET);

		
				opcao = leia.nextInt();
				leia.nextLine();
		

				if (opcao == 0) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nAnubi's Pharm - Medicamento Barato você encontra aqui!");
					sobre();
					leia.close();
					System.exit(0);
				}

				switch (opcao) {
                case 1 -> {
                    System.out.println(Cores.TEXT_WHITE + "Criar Produto\n");

                    System.out.print("Informe o tipo (1-Medicamento, 2-Cosmético): ");
                    int tipo = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Nome: ");
                    String nome = leia.nextLine();

                    System.out.print("Preço: ");
                    float preco = leia.nextFloat();
                    leia.nextLine();

                    if (tipo == 1) {
                        System.out.print("Tarja: ");
                        String tarja = leia.nextLine();
                        produtos.criarProduto(new Medicamento(produtos.getProximoId(), nome, tipo, preco, tarja));
                    } else {
                        System.out.print("Categoria: ");
                        String categoria = leia.nextLine();
                        produtos.criarProduto(new Cosmetico(produtos.getProximoId(), nome, tipo, preco, categoria));
                    }
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE + "Listando todos os Produtos\n");
                    produtos.listarTodos();
                }
                case 3 -> {
                    System.out.print("Informe o ID do produto: ");
                    int id = leia.nextInt();
                    produtos.consultarPorId(id);
                }
                case 4 -> {
                    System.out.print("Informe o ID do produto a atualizar: ");
                    int id = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Novo nome: ");
                    String nome = leia.nextLine();

                    System.out.print("Novo preço: ");
                    float preco = leia.nextFloat();
                    leia.nextLine();

                    System.out.print("Tipo (1-Medicamento, 2-Cosmético): ");
                    int tipo = leia.nextInt();
                    leia.nextLine();

                    if (tipo == 1) {
                        System.out.print("Tarja: ");
                        String tarja = leia.nextLine();
                        produtos.atualizarProduto(new Medicamento(id, nome, tipo, preco, tarja));
                    } else {
                        System.out.print("Categoria: ");
                        String categoria = leia.nextLine();
                        produtos.atualizarProduto(new Cosmetico(id, nome, tipo, preco, categoria));
                    }
                }
                case 5 -> {
                    System.out.print("Informe o ID do produto a deletar: ");
                    int id = leia.nextInt();
                    produtos.deletarProduto(id);
                }
                default -> {
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                }
            }
        }
    }

		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Thalita Lima");
			System.out.println("Contato: thalitalima23@gmail.com");
			System.out.println("Github: https://github.com/Thalima23");
			System.out.println("*********************************************************");
		}
		}
