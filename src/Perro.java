import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private List<String> vacunas;

    public Perro(String nombre, int edad, String duenio, String raza) {
        super(nombre, edad, duenio);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        // Regla: $45.000 base + $3.000 por cada año de edad
        return 45000.0 + (3000.0 * edad);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunas.add(nombreVacuna);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        // Regla: $80.000 anuales por cada año de edad
        return 80000.0 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre.toUpperCase();
    }
}