package farmacia_Produto;

public class Produto {


		private String nome;
		private int preco;
		private String classificacao;
		
		public Produto(int preco, String nome, String classificacao) {
			this.preco = preco;
			this.nome = nome;
			this.classificacao = classificacao;
		}
		
		// Getters e Setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getPreco() {
			return preco;
		}

		public void setPreco(int preco) {
			this.preco = preco;
		}

		public String getClassificacao() {
			return classificacao;
		}

		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}
	}
		

