package Model;
public class Estudiantes extends Persona{
    private double promedio;

    public Estudiantes(String nombre, String email, double promedio) {
        super(nombre, email);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
