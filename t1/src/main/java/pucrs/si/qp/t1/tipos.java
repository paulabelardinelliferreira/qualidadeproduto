package pucrs.si.qp.t1;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public enum tipos {
	EQUILATERO(1), ESCALENO(2), ISOSCELES(3), ENTRADA_INVALIDA(4), NAO_TRIANGULO(5) ;
	private final int value;

	tipos(int v) {
		this.value = v;
	}

	public int value() {
		return value;
	}
}