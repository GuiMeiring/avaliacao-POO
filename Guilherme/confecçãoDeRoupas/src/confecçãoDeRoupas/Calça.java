package confec��oDeRoupas;

public class Cal�a {
   private int codigo;
   private static int  quantidade;
   private String tecido,tipo,  genero;
   public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
private double custo;
   
public Cal�a(String tecido, String tipo,String genero, double custo) {
	this.tecido= tecido;
	this.tipo=tipo;
	this.custo=custo;
	this.genero=genero;
	quantidade ++;
	this.codigo=quantidade;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public void setTecido(String tecido) {
	this.tecido = tecido;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public void setCusto(double custo) {
	this.custo = custo;
}
public String getInformacoes() {
	return "\nC�digo: "+this.codigo
			+"\nTecido: "+this.tecido
			+"\nTipo: "+this.tipo
			+"\nCusto:R$ "+this.custo
			+"\nG�nero: "+this.genero;
}
	
	
	 
}
