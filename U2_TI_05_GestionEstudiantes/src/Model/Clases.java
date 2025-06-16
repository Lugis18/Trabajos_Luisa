package Model;

public class Clases {
    private String codigo;
    private String nombre;
    private int capacidad;
    private Estudiantes[] inscritos;

    public Clases(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre =nombre;
        this.capacidad = capacidad;
        this.inscritos = new Estudiantes[capacidad];
    }

    public Estudiantes[] getInscritos() {
        return inscritos;
    }
    public void setInscritos(Estudiantes[] inscritos) {
        this.inscritos = inscritos;
    }

    public boolean inscribir(Estudiantes e){
        for(int i=0; i <inscritos.length;i++){
            if(inscritos[i]==null){
                inscritos[i]=e;
                return true;
            }
        }
        return false;
    }

    public double calcularPromedioGrupo(){
        double suma=0;
        int contador=0;
        int i=0;
        while(i <inscritos.length){
            if(inscritos[i]!=null){
                suma+=inscritos[i].getPromedio();
                contador++;
            }
            i++;
        }
        if(contador>0){
            return suma/contador;
        }else{
            return 0;
        }
    }
}
