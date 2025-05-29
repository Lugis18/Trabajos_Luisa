package Model;
import javax.swing.JOptionPane;  
public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            this.nombreUsuario = nombreUsuario;
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password.length()>7){
            JOptionPane.showMessageDialog(null, "La contraseña debe de tener 8 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        for (char c:password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } 
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        if(!hasUpper){
            JOptionPane.showMessageDialog(null, "La contraseña debe de tener al menos una mayuscula", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(!hasLower){
            JOptionPane.showMessageDialog(null, "La contraseña debe de tener al menos una minuscula", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(!hasDigit){
            JOptionPane.showMessageDialog(null, "La contraseña debe de tener al menos un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        this.password = password;
    }
    public boolean Autenticar(String nombreUsuario, String password) {
      if(nombreUsuario.equals(nombreUsuario) && password.equals(password)){
        JOptionPane.showMessageDialog(null, "Benvenido", "Chido", JOptionPane.OK_OPTION);
        return true;
    }else{
        JOptionPane.showMessageDialog(null, "El nombre o la contrasña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    }
}