package Model;
public class App {
    private String titular;
    private Double saldo;
        
   
    public App(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }
     public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
            return true;
        } else {
            System.out.println("Retiro fallido. Saldo insuficiente o monto inválido.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
}


