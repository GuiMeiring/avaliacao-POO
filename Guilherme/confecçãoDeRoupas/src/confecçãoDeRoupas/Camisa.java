package confecçãoDeRoupas;

public class Camisa {
     private int codigo;
     private static int quantidade;
     private String cor,tipo;
     private double custo;
     private boolean estampa;
     public Camisa (String cor,String tipo,double custo, boolean estampa) {
    	this.cor = cor;
    	this.tipo=tipo;
    	this.custo=custo;
    	this.estampa=estampa;
    	quantidade ++;
    	this.codigo=quantidade;
     }
     
     
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public boolean isEstampa() {
		return estampa;
	}
	public void setEstampa(boolean estampa) {
		this.estampa = estampa;
	}
public String getInformacoes() {
	return "\nCódigo: "+this.codigo
			+"\nCor: "+this.cor
			+"\nTipo: "+this.tipo
			+"\nCusto:R$ "+this.custo
			+"\nEstampa: "+this.estampa;
}
	
	
}
