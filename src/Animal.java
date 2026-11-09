
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String duenio;

    public Animal(String nombre, int edad, String duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.duenio = duenio;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {
        System.out.println("--- FICHA DE CLÍNICA VETCARE ---");
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + duenio);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
        System.out.println("--------------------------------");
    }
}