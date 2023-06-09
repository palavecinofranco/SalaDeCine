package tp1;

public class SalaDeCine {
	private Integer cantidadDeButacas;
	private Integer filas;
	private boolean butacas[][];
	
	public SalaDeCine(Integer cantidadDeButacas, Integer filas) {
		this.cantidadDeButacas = cantidadDeButacas;
		this.filas = filas;
		this.butacas = new boolean[filas][cantidadDeButacas];
	}
	
	public boolean estaVacia() {
		for(int i =0; i<this.filas; i++) {
			for(int j =0; j<this.butacas[i].length; j++) {
				if(butacas[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Boolean estaOcupada(Integer fila, Integer butaca) {
		return butacas[fila-1][butaca-1];

	}
	
	public Boolean ocuparButaca(Integer fila, Integer butaca) {
		if(!butacas[fila-1][butaca-1]) {
			butacas[fila-1][butaca-1] = true;
			return true;
		} else {
			return false;
		}
	}
	
	public Integer getCantidadDeButacasOcupadas() {
		Integer contador = 0;
		for(int i =0; i<this.butacas.length; i++) {
			for(int j= 0; j<this.butacas.length; j++) {
				if(butacas[i][j]) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public boolean hayEspacioPara(Integer cantidadDePersonas) {
        Integer cantidadAsientosContiguos = 0;
        for(int i = 0; i<this.butacas.length; i++) {
            for(int j = 0; j < butacas.length; j++) {
                if (butacas[i][j]) {
                    cantidadAsientosContiguos = 0;
                } else {
                    cantidadAsientosContiguos++;
                    if (cantidadAsientosContiguos == cantidadDePersonas) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	
}
