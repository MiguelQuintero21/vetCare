
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. FICHAS CON REFERENCIA POLIMÓRFICA ===");
        Animal[] animales = {
                new Perro("Firulais", 4, "Carlos", "Labrador"),
                new Gato("Michi", 2, "Ana", true),
                new Ave("Piolín", 1, "Luisa", 45.5)
        };

        for (Animal a : animales) {
            a.imprimirFicha();
        }

        System.out.println("\n=== 2. VACUNAR LOS QUE APLICAN ===");
        Perro miPerro = new Perro("Max", 3, "Sofia", "Pastor Alemán");
        Gato miGato = new Gato("Luna", 5, "Pedro", false);

        miPerro.registrarVacuna("Rabia");
        miPerro.registrarVacuna("Parvovirus");

        miGato.registrarVacuna("Triple Felina");

        System.out.println("Vacunas de " + miPerro.nombre + ": " + miPerro.getVacunasAplicadas());
        System.out.println("Vacunas de " + miGato.nombre + ": " + miGato.getVacunasAplicadas());

        System.out.println("\n=== 3. CALCULAR LAS PÓLIZAS ===");
        Clinica vetCare = new Clinica("VetCare Central", "Calle 100 # 15-20");

        // El perro y el gato implementan Asegurable, al igual que Clinica
        Asegurable[] asegurables = {
                miPerro,
                miGato,
                vetCare
        };

        for (Asegurable aseg : asegurables) {
            System.out.println("Póliza: " + aseg.obtenerNumeroPoliza() + " | Prima Anual: $" + aseg.calcularPrimaSeguro());
        }

        System.out.println("\n=== 4. VERIFICACIÓN FINAL CON CONEJO ===");

        Animal[] clinicaAnimales = {
                new Perro("Bobby", 2, "Mateo", "Poodle"),
                new Gato("Pelusa", 3, "Lucía", true),
                new Conejo("Bugs", 1, "David")
        };

        for (Animal a : clinicaAnimales) {
            a.imprimirFicha();
        }
    }
}