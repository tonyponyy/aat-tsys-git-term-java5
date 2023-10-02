package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio12 {
	public static void main(String[] args) {
		String password = "nolaadivinas";
		boolean verified = false;
		
		for (int i=3; i>0 && !verified; i--) {
			String input_user = JOptionPane.showInputDialog("Adivina la contraseña (quedan "+i+"intentos :");
			if (input_user.equals(password)) {
				JOptionPane.showMessageDialog(null,"Has acertado");
				verified = true;
			}
		}
		if (!verified) {
			JOptionPane.showMessageDialog(null,"Acceso bloqueado");
		}
		
	}
}
