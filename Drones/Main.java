import java.util.Scanner;
public class Main{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dron dron1 = new DronLiviano();
        Dron dron2 = new DronCarga();
        Dron dron3 = new DronEmergencia();
        dron1.mostrarInformacion();
        System.out.println("Actualizacion de datos del dron liviano");
        System.out.println("Ingrese el codigo: ");
        String cod = sc.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese La distancia en Km");
        double distanciaKm = sc.nextDouble();
        System.out.println("Ingrese el peso del paquete");
        double peso = sc.nextDouble();
        System.out.println("Ingrese las horas de vuelo");
        double horasVuelo = sc.nextDouble();
        dron1.setModelo(modelo);
        dron1.setCodigo(cod);
        dron1.setDistanciaKm(distanciaKm);
        dron1.setPesoPaquete(peso);
        dron1.setHorasVuelo(horasVuelo);
        dron1.mostrarInformacion();
    }
}