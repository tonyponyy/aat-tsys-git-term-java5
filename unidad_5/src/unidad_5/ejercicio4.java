package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio4 {
	public static void main(String[] args) {
		String radio_string = JOptionPane.showInputDialog("Introduce el radio para calcular el area de un circulo.");
		double radio_number = Double.parseDouble(radio_string);
		double resultado = Math.PI* (radio_number*radio_number);
		JOptionPane.showMessageDialog(null,"Este es el resultado "+resultado);

	}

}
