package cliente;

import java.util.Scanner;

public class ProgramaCliente {
	public static void main(String[] args){
		
		Temperatura temperatura = new ConversorService().getConversorPort();
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor em Graus C: ");
        float temp = leia.nextFloat();
        
        System.out.println("Fahrenheit:........" + temperatura.celparaFah(temp));
        
        System.out.println("----------------------------");
        
        System.out.println("Digite o valor em Graus F: ");
        float tempc = leia.nextFloat();
        
        System.out.println("Celsius:........" + temperatura.fahparaCel(tempc));
               
	}

}
