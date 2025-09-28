package farmacia.model;

public class Medicamento extends Produto {
	
	private String tarja;
	
	public Medicamento(int id, String nome, int tipo, float preco, String tarja) {
		super(id, nome, tipo, preco);
		this.tarja = tarja;
	}
	
	
	// Vou usar String porque a tarja do medicamento é um elemento textual
	
	
	//Getter
	
	public String getTarja() {
		return tarja;
}
	//Setter
	
	public void setTarja (String tarja) {
		this.tarja = tarja;
		}
	
	
	@Override
	public void visualizar () {
		super.visualizar(); // mostrar dados comuns da Conta
		System.out.println("Tarja: " + this.tarja);
}
}