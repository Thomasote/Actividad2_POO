public class Automovil {
    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }
    public enum TipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible combustible;
    private TipoAutomovil tipo;
    private int puertas;
    private int asientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;

    public Automovil(String marca, int modelo, double motor,
                     TipoCombustible combustible, TipoAutomovil tipo,
                     int puertas, int asientos, int velocidadMaxima,
                     Color color, int velocidadActual) {
        if (velocidadMaxima<0 || velocidadActual<0
                || velocidadActual>velocidadMaxima) {
            throw new IllegalArgumentException("Velocidades invalidas");
        }
        this.marca=marca;
        this.modelo = modelo;
        this.motor=motor;
        this.combustible = combustible;
        this.tipo=tipo;
        this.puertas = puertas;
        this.asientos=asientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color=color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo=modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor=motor;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible=combustible;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo=tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas=puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos=asientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima<0 || velocidadMaxima<velocidadActual) {
            System.out.println("Velocidad no permitida");
            return;
        }
        this.velocidadMaxima=velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color=color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual<0 || velocidadActual>velocidadMaxima) {
            System.out.println("Velocidad no permitida");
            return;
        }
        this.velocidadActual=velocidadActual;
    }

    public void acelerar(int aumento) {
        if (aumento<0) {
            System.out.println("El aumento no puede ser negativo");
        } else if (aumento>velocidadMaxima-velocidadActual) {
            System.out.println("No se puede superar la velocidad maxima");
        } else {
            velocidadActual = velocidadActual+aumento;
        }
    }

    public void desacelerar(int disminucion) {
        if (disminucion<0) {
            System.out.println("La disminucion no puede ser negativa");
        } else if (disminucion>velocidadActual) {
            System.out.println("La velocidad no puede quedar negativa");
        } else {
            velocidadActual=velocidadActual-disminucion;
        }
    }

    public void frenar() {
        velocidadActual=0;
    }

    public double calcularTiempoLlegada(double distancia) {
        if (!Double.isFinite(distancia) || distancia<0) {
            throw new IllegalArgumentException("Distancia invalida");
        }
        if (distancia==0) {
            return 0;
        }
        if (velocidadActual==0) {
            throw new IllegalStateException("El automovil esta detenido");
        }
        return distancia/velocidadActual;
    }

    public void imprimir() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("motor: " + motor);
        System.out.println("combustible: " + combustible);
        System.out.println("tipo: " + tipo);
        System.out.println("puertas: " + puertas);
        System.out.println("asientos: " + asientos);
        System.out.println("velocidadMaxima: " + velocidadMaxima);
        System.out.println("color: " + color);
        System.out.println("velocidadActual: " + velocidadActual);
    }

    public static void main(String[] args) {
        Automovil carro = new Automovil("Renault", 2020, 1.6,
                TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO,
                4, 5, 180, Color.AZUL, 0);
        carro.imprimir();
        carro.setVelocidadActual(100);
        System.out.println("Velocidad: " + carro.getVelocidadActual());
        carro.acelerar(20);
        System.out.println("Velocidad: " + carro.getVelocidadActual());
        carro.desacelerar(50);
        System.out.println("Velocidad: " + carro.getVelocidadActual());
        System.out.println("Tiempo para 140 km (horas): "
                + carro.calcularTiempoLlegada(140));
        carro.frenar();
        System.out.println("Velocidad: " + carro.getVelocidadActual());
    }
}
