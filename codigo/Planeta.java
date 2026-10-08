public class Planeta {
    public enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

    private String nombre = null;
    private int satelites=0;
    private double masa = 0;
    private double volumen=0;
    private int diametro = 0;
    private int distanciaSol=0;
    private TipoPlaneta tipo;
    private boolean visible = false;

    public Planeta(String nombre, int satelites, double masa,
                   double volumen, int diametro, int distanciaSol,
                   TipoPlaneta tipo, boolean visible) {
        this.nombre=nombre;
        this.satelites = satelites;
        this.masa=masa;
        this.volumen = volumen;
        this.diametro=diametro;
        this.distanciaSol = distanciaSol;
        this.tipo=tipo;
        this.visible = visible;
    }

    public double calcularDensidad() {
        return masa/volumen;
    }

    public boolean esExterior() {
        double distanciaUA = distanciaSol*1000000.0/149597870;
        return distanciaUA>3.4;
    }

    public void imprimir() {
        System.out.println("Planeta: " + nombre);
        System.out.println("Satelites: " + satelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km3): " + volumen);
        System.out.println("Diametro (km): " + diametro);
        System.out.println("Distancia al Sol (millones de km): " + distanciaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Visible a simple vista: " + visible);
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24,
                1.08321E12, 12742, 150, TipoPlaneta.TERRESTRE, true);
        Planeta jupiter=new Planeta("Jupiter", 79, 1.899E27,
                1.4313E15, 139820, 778, TipoPlaneta.GASEOSO, true);

        tierra.imprimir();
        System.out.println("Densidad (kg/km3): " + tierra.calcularDensidad());
        System.out.println("Es exterior: " + tierra.esExterior());
        System.out.println();
        jupiter.imprimir();
        System.out.println("Densidad (kg/km3): " + jupiter.calcularDensidad());
        System.out.println("Es exterior: " + jupiter.esExterior());
    }
}
