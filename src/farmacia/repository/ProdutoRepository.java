package farmacia.repository;

import farmacia.model.Produto;

public interface ProdutoRepository {
	
	// CRUD DA FARMÁCIA
	
		public void criarProduto(Produto produto);        // C = Create
	    public void listarTodos();                        // R = Read (listar todos)
	    public void consultarPorId(int id);               // R = Read (consultar específico)
	    public void atualizarProduto(Produto produto);    // U = Update
	    public void deletarProduto(int id);   

	
}
