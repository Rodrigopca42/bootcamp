package entidade;


public class Carro {
	
	private String cor;
	private String modelo;
	private float capacidadeDoTanque;
	
	
	public Carro() {
    }

	public Carro(String cor, String modelo, float capacidadeDoTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	public Carro( String modelo, float capacidadeDoTanque) {
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}


	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public float getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}



	public void setCapacidadeDoTanque(float capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	public float abastecimento(float valorDoCombustivel) {
		return capacidadeDoTanque * valorDoCombustivel;
	}
	
	
	
	public String toString() {
		return ""
	}
	
	
	
	
	
	

}
