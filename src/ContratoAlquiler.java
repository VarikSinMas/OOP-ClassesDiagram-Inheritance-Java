import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContratoAlquiler {
    private Date fechaInicio;
    private Date fechaFin;
    private double precioDia;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public ContratoAlquiler(Date fechaInicio, Date fechaFin, double precioDia, Vehiculo vehiculo, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public int nDias() {
        long diff = fechaFin.getTime() - fechaInicio.getTime();
        long diasAlquiler = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return (int) diasAlquiler;
    }

    public double costeTotal() {
        int diasAlquiler = nDias();
        return diasAlquiler * precioDia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        double precioTotal = costeTotal();
        return "Datos del contrato:\n" +
                "Fecha inicio: " + fechaInicio + "\n" +
                "Fecha fin: " + fechaFin + "\n" +
                "Precio dia: " + precioDia + "\n" +
                "Precio total: " + precioTotal + "\n" +
                "Datos del vehiculo: " + vehiculo.toString() + "\n" +
                "Datos del cliente: " + cliente.toString();
    }
}
