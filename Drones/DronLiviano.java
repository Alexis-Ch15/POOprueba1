public class DronLiviano extends Dron{
    private double costoBase = 3.00;
    private double limiteHoras = 2;

    public DronLiviano() {
        super("DL-000", "ModeloBase", 5.0, 2.0, 1.0, 3.0);
        setLimiteHoras(limiteHoras);

    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    @Override
    double calcularCostoEntrega() {
        if(validarDatos()){
            return costoBase + (getDistanciaKm() * 0.50);
        }else{
            System.out.println("Los calculos no se pueden realizar.");
            return 0;
        }
    }
    @Override
    boolean validarDatos(){
        if(getHorasVuelo() > 2){
            System.out.println("El limite de horas es de 2 horas");
            return false;
        }else if(getPesoPaquete() > 5){
            System.out.println("El peso limite es de 5kg.");
            return false;
        }else{
            return true;
        }
    }
    public void mostrarInformacion(){
        System.out.println("======Dron Liviano=======");
        super.mostrarInformacion();
        System.out.println("Limite de horas: " + limiteHoras);
        System.out.println("======================");
        System.out.println("Analizando.....");
        if(validarDatos()){
            System.out.println("Costo de entrega: " + calcularCostoEntrega());
        }else{
            System.out.println("No puede cotizar el viaje.");
        }
        System.out.println("=============================");

    }
}
