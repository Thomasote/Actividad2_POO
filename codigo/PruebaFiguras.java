public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado=new Cuadrado(5);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);

        System.out.println("Circulo");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Rectangulo");
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Cuadrado");
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println("Triangulo rectangulo");
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo: " + triangulo.determinarTipo());
    }
}
