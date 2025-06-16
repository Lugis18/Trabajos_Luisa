//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Clases;
import Model.Estudiantes;
public class Main {
    public static void main(String[] args)throws Exception {

        Clases clase=new Clases("IA2","Italiano",3);

        Estudiantes e1= new Estudiantes("Luisa","luisilla@gmail.com",9.3);
        Estudiantes e2= new Estudiantes("David","mapache@gmail.com",10);
        Estudiantes e3= new Estudiantes("Panfilo","maromero@gmail.com",9.1);

        clase.inscribir(e1);
        clase.inscribir(e2);
        clase.inscribir(e3);

        System.out.println("El promedio del grupo es "+clase.calcularPromedioGrupo());
    }
}