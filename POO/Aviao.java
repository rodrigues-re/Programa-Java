package Turma28;

public class Aviao {
    
	private String Empresa;
	private String cor;
	private int fabrica��o;
	
	//m�todo de constru��o do Avi�o
	public Aviao(String Empresa,String cor,int fabrica��o) {
	
		this.Empresa = Empresa;
		this.cor = cor;
		this.fabrica��o = fabrica��o;
	
	}
	 
	public String getEmpresa() {
		return Empresa;
	}
	
	public void imprimirInfo() 
	 {
		System.out.println("\nAvi�o da empresa:" +Empresa+ "\nNa cor: " +cor+ "\nData de Fabrica��o: " +fabrica��o);
	 }
	
	public void setEmpresa(String empresa) 
	{
		Empresa = empresa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getFabrica��o() {
		return fabrica��o;
	}
	public void setFabrica��o(int fabrica��o) {
		this.fabrica��o = fabrica��o;
	}
	
	 
}
