public class DronEmergencia extends Dron {
    private double recargoUrgencia = 10;
    private int nivelPrioridad = 1;

    public DronEmergencia() {
        super("DE-000", "EmergenciaBase", 5.0, 2.0, 1.0, 9.0);
    }
    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
    }

    @Override
    double calcularCostoEntrega() {
        if(validarDatos()){
            return costoBase + (getDistanciaKm()* 1.00 + recargoUrgencia);
        }else{
            System.out.println("No se puede realizar el calculo.");
            return 0;
        }
    }

    @Override
    boolean validarDatos() {
        if(getPesoPaquete() > 10){
            System.out.println("El peso de paquete exdece de 10kg.");
            return false;
        }else if(getHorasVuelo() > 3){
            System.out.println("Las horas de vuelo excede de las 3 horas.");
            return false;
        }else{
            return true;
        }
    }
    public void mostrarInformacion(){
        System.out.println("====Dron Emergencia====");
        super.mostrarInformacion();
        System.out.println("Nivel de prioridad: " + nivelPrioridad);
        System.out.println("Recargo por Urgencia: " + recargoUrgencia);
        if(validarDatos()){
            System.out.println("Costo de entrega: " + calcularCostoEntrega());
        }
    }
}
