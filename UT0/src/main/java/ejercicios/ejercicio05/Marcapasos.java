package ejercicios.ejercicio05;

public class Marcapasos {
    private int idDispositivo;
    private String codigoFabricante;
    private int latidosPorMinuto;
    private int nivelBateria;

    /*byte	1 byte
    short	2 bytes
    char	2 bytes
    int	    4 bytes*/

    public static int contadorInstancias = 0; //controla can de instancias creadas


    //CONSTRUCTOR
    public Marcapasos(int id,String cod,int lats){
        this.idDispositivo = id  ;
        this.codigoFabricante=cod + "cte"; //se agrega el cte de fabrica a cada instancia
        this.latidosPorMinuto=lats;
        this.nivelBateria=100;
        contadorInstancias++; //cada vez que se crea una instancia se sube el valor del contador
    }

    //Tanto el id como el codigo son atributos que una vez que son definidos no tiene sentido que sean reemplzables
    //por lo contrario los latidos pueden verse modificados dependiendo de la situacion del paciente
    //por ultimo, el nivel de bateria disminuye gradualemente y dependiendo como es implementado si se puede acceder o no al setter.

    //GETTERS
    public int GetId(){
        return idDispositivo;
    }
    public String GetCodigoFab(){
        return codigoFabricante;
    }
    public int GetLatidos(){
        return latidosPorMinuto;
    }
    public int GetBateria(){
        return nivelBateria;
    }

    //SETTERS
    public void SetId(int unId){
        this.idDispositivo = unId;
    }
    public void SetCodigo(String unCodigo){
        this.codigoFabricante = unCodigo;
    }

    //METODOS
    public void toString(Marcapasos unMarca){
        System.out.println("ID: " + unMarca.idDispositivo +"\n" +
                        "Codigo: "+ unMarca.codigoFabricante + "\n" +
        "Latidos: " + unMarca.latidosPorMinuto + "\n"
        + "nivel de bateria: "+ unMarca.nivelBateria + "\n");
    }
}
