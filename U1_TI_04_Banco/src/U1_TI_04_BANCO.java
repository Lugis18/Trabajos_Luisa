import Model.App;
import javax.swing.JOptionPane;
public class U1_TI_04_BANCO{
    public String titular;
    public static void main(String[] args)throws Exception{
        JOptionPane.showMessageDialog(null, "Bienvenidos al banco :D");
        App cuenta = new App("Luisa");

        cuenta.depositar(1000);
        cuenta.retirar(200);
        cuenta.retirar(10000);
    }
    
}
