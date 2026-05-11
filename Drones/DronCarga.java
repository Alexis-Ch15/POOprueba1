public class DronCarga extends Dron{
    private double costoPorKg = 1.2;

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }
    public DronCarga() {
        super("DC-000", "CargaBase", 5.0, 2.0, 1.0, 6.0);
        setCostoPorKg(costoPorKg);
    }

    @Override
    double calcularCostoEntrega() {
        if(validarDatos()){
           return costoBase + ( getDistanciaKm()*0.70)+ (getPesoPaquete() * costoPorKg);
        }else{
            System.out.println("El calculo no se puede realizar.");
            return 0;
        }
    }

    @Override
    boolean validarDatos() {
        if(getPesoPaquete() > 30) {
            System.out.println("El peso del paquete es mayor a 30.");
            return false;
        }else if(getHorasVuelo()> 5){
            System.out.println("Las horas de vuelo exceden lo permitido.");
            return false;
        }else{
            return true;
        }
    }
    public void mostrarInformacion(){
        System.out.println("=====Dron Carga=====");
        super.mostrarInformacion();
        System.out.println("Costo por Kg: " + costoPorKg);
        System.out.println("Analizando..");
        if(validarDatos()){
            System.out.println("Costo por entrega: " + calcularCostoEntrega());
        }
    }
}
