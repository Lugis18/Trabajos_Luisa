import Model.Empleado;
import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;
public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleado = new EmpleadoTiempoCompleto("001", "Luisa Giovanna", 1200.0, "Para cosas muy innecesarias"); 

        System.out.println("ID " + empleado.getId() +
            "\nNombre " + empleado.getNombre() +
            "\nSalario " + empleado.calcularSalario(empleado.getSalarioBase())+
            "") ;

        EmpleadoPorHoras empleadoh = new EmpleadoPorHoras("002", "Andres David", 20000.0, 12); 
        System.out.println("ID " + empleadoh.getId() +
            "\nNombre " + empleadoh.getNombre() +
            "\nSalario " + empleadoh.calcularSalario(empleadoh.getSalarioBase()) +
            "\nHoras Trabajadas " + empleadoh.getHorasTrabajadas());
    }
}
