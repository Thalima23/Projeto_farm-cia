package farmacia.model;

public class Cosmetico extends Produto {
	
	private String categoria;
	
	public Cosmetico(int id, String nome, int tipo, float preco, String categoria) {
		super(id, nome, tipo, preco);
		this.categoria = categoria;
	}
		
		// Getter
				public String getCategoria() {
					return categoria;
				}
				
		// Setter
				public void setCategoria (String categoria) {
					this.categoria = categoria;
				}
				
				@Override
				public void visualizar () {
					super.visualizar(); // mostrar dados comuns da Conta
					System.out.println("Categoria: " + this.categoria);
}
}