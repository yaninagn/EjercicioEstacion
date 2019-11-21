package EjercicioCombust;

import java.util.Scanner;

public class EstacionServicio {

	public static void main(String[] args) {

		String []tipoNafta = {"Nafta Súper", "Nafta Gasoil", "Nafta Premiun"};
		String []tipoEst = {"Estación A", "Estación B", "Estación C"};
		
		
		float[][] matriz = new float[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0;
			}
		}
		int totalPorTipoNafta[] = new int[3];
		float totalPorEstacion[] = new float[3];

		System.out.println("SURTIDORES");
		System.out.println("==========");
		System.out.println("Ingrese cantidad de litros: (0= salir) ");
		Scanner scan = new Scanner(System.in);
		float litros = scan.nextFloat();

		while (litros != 0) {
			System.out.println("Ingrese tipo de nafta: ");
			System.out.println("0) Nafta Súper");
			System.out.println("1) Nafta Gasoil");
			System.out.println("2) Nafta Premium");
			int nafta = scan.nextInt();
			float costoTotal = 0;
			switch (nafta) {
			case 0:
				costoTotal = litros * 20;
				break;
			case 1:
				costoTotal = litros * 10;
				break;
			case 2:
				costoTotal = litros * 40;
				break;
			}

			System.out.println("Ingrese Estación de Servicio: ");
			System.out.println("0) Estación A");
			System.out.println("1) Estación B");
			System.out.println("2) Estación C");
			int estacion = scan.nextInt();

			matriz[nafta][estacion] += costoTotal;
			totalPorTipoNafta[nafta] += costoTotal;
			totalPorEstacion[estacion] += costoTotal;

			System.out.println("SURTIDORES");
			System.out.println("==========");
			System.out.println("Ingrese cantidad de litros: ");
			litros = scan.nextFloat();
		}

		System.out.println("Total Ganancias por Estación de Servicio");
		System.out.println("========================================");

		for (int i = 0; i < totalPorEstacion.length; i++) {
			System.out.println( tipoEst[i] + ": " + totalPorEstacion[i]);

		}

		System.out.println("Total ganancias por tipo de nafta");
		System.out.println("=================================");

		for (int i = 0; i < totalPorTipoNafta.length; i++) {

			System.out.println( tipoNafta[i] + ": " + totalPorTipoNafta[i]);

		}
		System.out.println("Tipo de nafta más vendido");
		System.out.println("=========================");
		int masVendido = 0;
		int indiceMasVendido = 0;
		
		for (int i=0; i < totalPorTipoNafta.length; i++) {
			if(totalPorTipoNafta[i]> masVendido) {
			masVendido = totalPorTipoNafta[i];
			indiceMasVendido = i;
		}
		}
			System.out.println( tipoNafta[indiceMasVendido] + ": " + masVendido);

}

}