package jdbc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.usuario;
import views.MenuUsuario;
import views.Login;

public class usuariosControlador implements ActionListener {

	private Login vista;
	
	public usuariosControlador(Login vista) {
		this.vista = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre =vista.getNombre();
		String contrasenia = vista.getContrasenia();
		
		if(usuario.validarUsuario(nombre, contrasenia)) {
			MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);
			vista.dispose();
		}else {
			
			JOptionPane.showMessageDialog(vista, "usuario o contraseña invalidos");
		}
	}
}
