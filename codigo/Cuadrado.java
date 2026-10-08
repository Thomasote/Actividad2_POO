public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        if (lado<=0) {
            throw new IllegalArgumentException("Medidas positivas requeridas");
        }
        this.lado=lado;
    }

    public double calcularArea() {
        return (double) lado*lado;
    }

    public double calcularPerimetro() {
        return 4.0*lado;
    }
}
