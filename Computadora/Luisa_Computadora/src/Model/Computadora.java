package Model;
class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false; 
    }


    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendiendo...");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }


    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagando...");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}