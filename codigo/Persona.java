public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, String documento,
                   int anioNacimiento) {
        this.nombre=nombre;
        this.apellido = apellido;
        this.documento=documento;
        this.anioNacimiento = anioNacimiento;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Anio de nacimiento: " + anioNacimiento);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Thomas", "Ramirez", "000001", 2007);
        Persona persona2=new Persona("Daniel", "Lopez", "000002", 2005);
        persona1.imprimir();
        System.out.println();
        persona2.imprimir();
    }
}
