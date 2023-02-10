package calculadora.br.com.jjs2.com.calc.visao.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);

}
