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
		speed += acelerar;
		fuel -= 0.5;
	}
	
	public void setAbastecer(double abastecer) {
		fuel += abastecer;
	}
	
	public void setFrear(int frear) {
		speed -= frear;
	}
	
	public String getMarca(){
		return marca;
		
	}
	public String getModelo(){
		return modelo;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void getInfo(){
		System.out.println("Marca: "+ marca +
				"\nModelo: "+ modelo+
				"\nAno: "+ ano +
				"\nVelocidade: "+ speed+
				"\nCombustivel: "+ fuel);		
	}
}
