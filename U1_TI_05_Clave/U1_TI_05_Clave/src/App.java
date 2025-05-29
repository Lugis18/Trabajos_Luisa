import Model.UsuarioSeguro;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de autenticación", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
        UsuarioSeguro usuario = new UsuarioSeguro();
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        usuario.setNombreUsuario(nombreUsuario);
        String password = JOptionPane.showInputDialog("Ingrese su contraseña(debe tener 8 caracteres, mayuscula y minuscla):");
        usuario.setPassword(password);
        JOptionPane.showMessageDialog(null, "Autenticando...", "Autenticación", JOptionPane.INFORMATION_MESSAGE);
        boolean autenticado = usuario.Autenticar(nombreUsuario, password);
        if (autenticado) {
            JOptionPane.showMessageDialog(null, "Autenticación exitosa", "Éxito", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Autenticación fallida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
