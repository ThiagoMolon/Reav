package src;

public class Car {
	private String modelo,marca;
	private int ano, speed;
	private double fuel;
	
	public Car(String modelo,String marca, int ano, int speed, double fuel) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.speed = speed = 0;
		this.fuel = fuel = 0;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAcelerar(int acelerar) {
		if(acelerar <=0) {
			System.out.println("essa função é acelerar não frear, e nem na frar é pra por negativo");
		}else {
		speed += acelerar;
		fuel -= 0.5;
		}
	}
	
	public void setAbastecer(double abastecer) {
		if (abastecer >= 100) {
			System.out.println("vc está enchendo de mais o tanque vai transbordar seu imbecil");
		}else if(abastecer <= 0) {
			System.out.println("abastece com valor negatifo é foda tambem");
		}else {
		fuel += abastecer;
		}
	}
	
	public void setFrear(int frear) {
		if (frear <= 0) {
			System.out.println("não se preucupe coloque o valor em modulo para frar");
		}else {
		speed -= frear;
		}
	}
}
