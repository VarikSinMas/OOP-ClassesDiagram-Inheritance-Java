public class Coche extends Vehiculo {
    private final int numPuertas;
    private final int numPlazas;

    public Coche(String matricula, String marca, String modelo, int numPuertas, int numPlazas) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", numPuertas=" + numPuertas +
                ", numPlazas=" + numPlazas +
                '}';
    }
}
