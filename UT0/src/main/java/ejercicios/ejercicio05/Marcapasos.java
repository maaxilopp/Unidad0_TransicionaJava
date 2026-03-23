package ejercicios.ejercicio05;

import java.util.Objects;

public class Marcapasos {
    private int idDispositivo;
    private String codigoFabricante;
    private int latidosPorMinuto;
    private byte nivelBateria;

    /*byte	1 byte
    short	2 bytes
    char	2 bytes
    int	    4 bytes*/

    private static int contadorInstancias = 0; //controla can de instancias creadas


    //CONSTRUCTOR
    public Marcapasos(int id,String cod){
        this.idDispositivo = id  ;
        this.codigoFabricante=cod + "cte"; //se agrega el cte de fabrica a cada instancia
        this.latidosPorMinuto= 60; // valor por defecto
        this.nivelBateria=100;
        contadorInstancias++; //cada vez que se crea una instancia se sube el valor del contador
    }

    //Tanto el id como el codigo son atributos que una vez que son definidos no tiene sentido que sean reemplzables
    //por lo contrario los latidos pueden verse modificados dependiendo de la situacion del paciente
    //por ultimo, el nivel de bateria disminuye gradualemente y dependiendo como es implementado si se puede acceder o no al setter.

    //GETTERS
    public int getId(){
        return idDispositivo;
    }
    public String getCodigoFab(){
        return codigoFabricante;
    }
    public int getLatidos(){
        return latidosPorMinuto;
    }
    public int getBateria(){
        return nivelBateria;
    }

    //SETTERS
    public void setLatidosPorMinuto(short latidos) {
        this.latidosPorMinuto = latidos;
    }

    public void setNivelBateria(byte nivel) {
        this.nivelBateria = nivel;
    }

    //METODOS
    @Override
    public String toString() {
        return "ID: " + idDispositivo + "\n" +
                "Codigo: " + codigoFabricante + "\n" +
                "Latidos: " + latidosPorMinuto + "\n" +
                "Nivel de bateria: " + nivelBateria + "\n";
    }
    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marcapasos)) return false;
        Marcapasos that = (Marcapasos) o;
        return idDispositivo == that.idDispositivo &&
                Objects.equals(codigoFabricante, that.codigoFabricante);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(idDispositivo, codigoFabricante);
    }
}

