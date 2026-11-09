public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, String duenio, double pesoGramos) {
        super(nombre, edad, duenio);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        // 28.000 base + 100 por cada gramo de peso
        return 28000.0 + (100.0 * pesoGramos);
    }
}