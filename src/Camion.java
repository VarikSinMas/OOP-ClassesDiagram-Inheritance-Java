public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String matricula, String marca, String modelo, int capacidadCarga) {
        super(matricula, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }
}