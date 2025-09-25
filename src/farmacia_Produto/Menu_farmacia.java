package farmacia_Produto;

import java.util.Scanner;

import farmacia.model.Produto;
import farmacia.util.Cores_farmacia.Cores;


public class Menu_farmacia {

		private static final Scanner leia = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int opcao;
			
			// Produto
			
			Produto p1 = new Produto(1, "Dipirona", 1, 29.90f);
			Produto p2 = new Produto(2, "Shampoo Seda", 2, 5.90f);
			
			p1.visualizar();
			p2.visualizar();

			while (true) {

				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + Cores. ANSI_CYAN_BACKGROUND
						+ "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("          Anubi's Pharm                  ");
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
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nFarmácia Bem-Estar - Medicamento Barato é aqui!");
					sobre();
					leia.close();
					System.exit(0);
				}

				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Produtos\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Produto - por id\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Produto\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Produto\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					
					break;
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
