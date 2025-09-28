package farmacia.controller;

import java.util.ArrayList;
import java.util.List;
import farmacia.model.Produto;
import farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	 private List<Produto> listaProdutos = new ArrayList<Produto>();
	    private int id = 0; // contador de IDs

	    @Override
	    public void criarProduto(Produto produto) {
	       
	        listaProdutos.add(produto);
	        System.out.println("\nProduto cadastrado com sucesso! ID: " + produto.getId());
	    }

	    @Override
	    public void listarTodos() {
	        for (var produto : listaProdutos) {
	            produto.visualizar();
	        }
	    }

	    @Override
	    public void consultarPorId(int id) {
	        var produto = buscarNaCollection(id);

	        if (produto != null) {
	            produto.visualizar();
	        } else {
	            System.out.printf("\nO produto ID: %d não foi encontrado.%n", id);
	        }
	    }

	    @Override
	    public void atualizarProduto(Produto produto) {
	        var buscarProduto = buscarNaCollection(produto.getId());

	        if (buscarProduto != null) {
	            listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
	            System.out.printf("\nO produto ID: %d foi atualizado com sucesso!%n", produto.getId());
	        } else {
	            System.out.printf("\nO produto ID: %d não foi encontrado.%n", produto.getId());
	        }
	    }

	    @Override
	    public void deletarProduto(int id) {
	        var produto = buscarNaCollection(id);

	        if (produto != null) {
	            if (listaProdutos.remove(produto)) {
	                System.out.printf("\nO produto ID: %d foi deletado com sucesso!%n", id);
	            }
	        } else {
	            System.out.printf("\nO produto ID: %d não foi encontrado.%n", id);
	        }
	    }

	    // Métodos Auxiliares
	    
	    public int getProximoId() {
	        return ++ id;
	    }

	    private Produto buscarNaCollection(int id) {
	        for (var produto : listaProdutos) {
	            if (produto.getId() == id) {
	                return produto;
	            }
	        }
	        return null;
	    }
	}