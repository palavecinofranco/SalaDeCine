package tp1;

import java.util.Scanner;

public class TestSalaDeCine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SalaDeCine sala = new SalaDeCine(15, 15);
		int fila =0;
		int butaca=0;
		System.out.println("La sala está vacía? " + sala.estaVacia());
		
		sala.ocuparButaca(15, 10);
		sala.ocuparButaca(15, 15);
		System.out.println(sala.estaOcupada(15, 15));
		System.out.println(sala.estaOcupada(15, 10));
		
		System.out.println(sala.getCantidadDeButacasOcupadas());
		
		System.out.println(sala.hayEspacioPara(10));
	}

}
