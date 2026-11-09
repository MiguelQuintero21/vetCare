import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private List<String> vacunas;

    public Gato(String nombre, int edad, String duenio, boolean esEsterilizado) {
        super(nombre, edad, duenio);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        // $38.000 fijo, sin importar la edad
        return 38000.0;
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
        // Regla: $120.000 fijo si está esterilizado, $200.000 si no
        return esEsterilizado ? 120000.0 : 200000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }
}