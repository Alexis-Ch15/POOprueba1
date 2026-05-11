abstract public class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo != "") {
            this.codigo = codigo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != "") {
            this.modelo = modelo;
        }
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        if(distanciaKm > 0) {
            this.distanciaKm = distanciaKm;
        }
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(double pesoPaquete) {
        if(pesoPaquete > 0) {
            this.pesoPaquete = pesoPaquete;
        }
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0) {
            this.horasVuelo = horasVuelo;
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        if(costoBase > 0){
            this.costoBase = costoBase;
        }
    }
    public Dron(){

    }
    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase) {
        setCodigo(codigo);
        setModelo(modelo);
        setDistanciaKm(distanciaKm);
        setPesoPaquete(pesoPaquete);
        setHorasVuelo(horasVuelo);
        setCostoBase(costoBase);
    }
    abstract double calcularCostoEntrega();
    abstract boolean validarDatos();

    public void mostrarInformacion(){
        System.out.println("======Sistema de Drones=======");
        System.out.println("Codigo: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia Km: " + distanciaKm);
        System.out.println("Peso del Paquete: " + pesoPaquete);
        System.out.println("Horas Vuelo: " + horasVuelo);
        System.out.println("Costo Base: "+ costoBase);
        System.out.println("=================");
    }
}
