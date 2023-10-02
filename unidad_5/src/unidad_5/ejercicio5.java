package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio5 {
	public static void main(String[] args) {
		String num_user = JOptionPane.showInputDialog("Introduce un numero.");
		int num_user_int = Integer.parseInt(num_user);
		if(num_user_int%2 == 0) {
			JOptionPane.showMessageDialog(null,"Es divisible entre 0");
		}else {
			JOptionPane.showMessageDialog(null,"No es divisible entre 0");
		}
		
		

	}
}
