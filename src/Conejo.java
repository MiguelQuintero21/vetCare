public class Conejo extends Animal {

    public Conejo(String nombre, int edad, String duenio) {
        super(nombre, edad, duenio);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000.0;
    }
}