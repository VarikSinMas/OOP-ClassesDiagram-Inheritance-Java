public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Moto{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
