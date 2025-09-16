package src;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Car c1 = new Car("Spark", "Chevrolet", 5, 0, 0);
		Car c2 = new Car("SUV", "Volkswagen", 2, 0, 0);
		Car c3 = new Car("Corolla", "Toyota", 10, 0, 0);
		int i, i2, speed;
		double fuel;
		
		do {
			System.out.println("escolha:\n"
					+ "1. Abastecer (lembrando que todos os 3 carros estão sem combustivel)\n"
					+ "2. Acelerar\n"
					+ "3. Frear\n"
					+ "4. Mostrar informações\n"
					+ "5. Sair");
			i = leia.nextInt();
			switch (i){
			case 1:
				System.out.println("qual deles:"
						+ "\n1."+c1.getMarca()+","+c1.getModelo()
						+ "\n2."+c2.getMarca()+","+c2.getModelo()
						+ "\n3."+c3.getMarca()+","+c3.getModelo());
				i2 = leia.nextInt();
				System.out.println("quantos litros?");
				fuel = leia.nextDouble();
					switch (i2) {
					case 1:
						do {
							if (fuel > 100) {
								System.out.println("vc está enchendo de mais o tanque vai transbordar seu imbecil");
							}else if(fuel <= 0) {
								System.out.println("abastece com valor negativo é foda tambem");
							}else {
								c1.setAbastecer(fuel);
							}
						}while(fuel>100);					
					break;
					case 2:
						do {
							if (fuel > 100) {
								System.out.println("vc está enchendo de mais o tanque vai transbordar seu imbecil");
							}else if(fuel <= 0) {
								System.out.println("abastece com valor negativo é foda tambem");
							}else {
								c2.setAbastecer(fuel);
							}
						}while(fuel>100);					
					break;
					case 3:
						do {
							if (fuel > 100) {
								System.out.println("vc está enchendo de mais o tanque vai transbordar seu imbecil");
							}else if(fuel <= 0) {
								System.out.println("abastece com valor negativo é foda tambem");
							}else {
								c3.setAbastecer(fuel);
							}
						}while(fuel>100);					
					break;
					default:
						System.out.println("não possuimos 4 carros somente 3");
					break;	
					}
					System.out.println("abastecido");
			break;
			case 2:
				System.out.println("qual deles:"
						+ "\n1."+c1.getMarca()+","+c1.getModelo()
						+ "\n2."+c2.getMarca()+","+c2.getModelo()
						+ "\n3."+c3.getMarca()+","+c3.getModelo());
				i2 = leia.nextInt();
				System.out.println("quantos km/h?");
				speed = leia.nextInt();
				switch (i2) {
				case 1:
					do {
						if (speed <= 0) {
							System.out.println("essa função é acelerar não frear, e nem na frar é pra por negativo, tente de novo");
							speed = leia.nextInt();
							}else if(c1.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c1.setAcelerar(speed);
						}
					}while(speed<=0);					
				break;
				case 2:
					do {
						if (speed <= 0) {
							System.out.println("essa função é acelerar não frear, e nem na frar é pra por negativo, tente de novo");
							speed = leia.nextInt();
							}else if(c2.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c2.setAcelerar(speed);
						}
					}while(speed<=0);						
				break;
				case 3:
					do {
						if (speed <= 0) {
							System.out.println("essa função é acelerar não frear, e nem na frar é pra por negativo, tente de novo");
							speed = leia.nextInt();
							}else if(c3.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c3.setAcelerar(speed);
						}
					}while(speed<=0);					
				break;
				default:
					System.out.println("não possuimos 4 carros somente 3");
				break;	
				}
			break;
			case 3:
				System.out.println("qual deles:"
						+ "\n1."+c1.getMarca()+","+c1.getModelo()
						+ "\n2."+c2.getMarca()+","+c2.getModelo()
						+ "\n3."+c3.getMarca()+","+c3.getModelo());
				i2 = leia.nextInt();
				System.out.println("quantos km/h?");
				speed = leia.nextInt();
				switch (i2) {
				case 1:
					do {
						if (speed <= 0) {
							System.out.println("não se preucupe coloque o valor em modulo para frar, tente de novo");
							speed = leia.nextInt();
							}else if(c1.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c1.setFrear(speed);
						}
					}while(speed<=0);					
				break;
				case 2:
					do {
						if (speed <= 0) {
							System.out.println("não se preucupe coloque o valor em modulo para frar, tente de novo");
							speed = leia.nextInt();
							}else if(c2.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c2.setFrear(speed);
						}
					}while(speed<=0);						
				break;
				case 3:
					do {
						if (speed <= 0) {
							System.out.println("não se preucupe coloque o valor em modulo para frar, tente de novo");
							speed = leia.nextInt();
							}else if(c3.getFuel() == 0) {
							System.out.println("você precissa abastecer primeiro");
						}else {
							c3.setFrear(speed);
						}
					}while(speed<=0);					
				break;
				default:
					System.out.println("não possuimos 4 carros somente 3");
				break;	
				}
			break;
			case 4:
				System.out.println("qual deles:"
						+ "\n1."+c1.getMarca()+","+c1.getModelo()
						+ "\n2."+c2.getMarca()+","+c2.getModelo()
						+ "\n3."+c3.getMarca()+","+c3.getModelo());
				i2 = leia.nextInt();
				switch(i2) {
				case 1:
					c1.getInfo();
				break;
				case 2:
					c2.getInfo();
				break;
				case 3:
					c3.getInfo();
				break;
				default:
					System.out.println("não possuimos 4 carros somente 3");
				break;
				}
			break;
			case 5:
				System.out.println("obrigado pela preferencia");
			break;
			}
		}while(i!=5);
	}

}
