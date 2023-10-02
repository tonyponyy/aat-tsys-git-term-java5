package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio10 {
	public static void main(String[] args) {
		String num_user = JOptionPane.showInputDialog("Cuantas ventas ?");
		int num_user_int = Integer.parseInt(num_user);
		int sumatorio = 0;
		
		for (int i=0; i<num_user_int; i++) {
			String number_input_st = JOptionPane.showInputDialog("Venta "+(i+1)+" :");
			int number_input_int  = Integer.parseInt(number_input_st);
			sumatorio += number_input_int;
		}
		
		JOptionPane.showMessageDialog(null,"El total es: "+sumatorio);
	}
}
