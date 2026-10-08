public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        if (base<=0 || altura<=0) {
            throw new IllegalArgumentException("Medidas positivas requeridas");
        }
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea() {
        return (double) base*altura/2;
    }

    public double calcularPerimetro() {
        return base+altura+calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.hypot(base, altura);
    }

    public String determinarTipo() {
        if (base==altura) {
            return "Isosceles";
        }
        return "Escaleno";
    }
}
