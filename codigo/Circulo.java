public class Circulo {
    private int radio;

    public Circulo(int radio) {
        if (radio<=0) {
            throw new IllegalArgumentException("Medidas positivas requeridas");
        }
        this.radio=radio;
    }

    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
