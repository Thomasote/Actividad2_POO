public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        if (base<=0 || altura<=0) {
            throw new IllegalArgumentException("Medidas positivas requeridas");
        }
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea() {
        return (double) base*altura;
    }

    public double calcularPerimetro() {
        return 2.0*(base+altura);
    }
}
