package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio6 {
	public static void main(String[] args) {
		int IVA = 21;
		String precio_string = JOptionPane.showInputDialog("Introduce un precio sin IVA");
		double precio_number = Double.parseDouble(precio_string);
		double resultado = precio_number+((precio_number/100)*IVA);
		JOptionPane.showMessageDialog(null,"Este es el resultado con iva "+resultado);

	}

}
