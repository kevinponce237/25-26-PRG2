public class Fraccion {
    public Fraccion();

    public Fraccion(int numerador, int denominador);

    public Fraccion(int numerador);

    public Fraccion(Fraccion otra);


    public String toString();

    public double toDecimal();

    public int calcularMCD(int a, int b);

    public Fraccion clonar();

    public boolean esIgual(Fraccion fraccion);


    public Fraccion sumar(Fraccion fraccion);

    public Fraccion restar(Fraccion fraccion);

    public Fraccion multiplicar(Fraccion fraccion);

    public Fraccion dividir(Fraccion fraccion);


    public double inversa();

    public Fraccion opuesta();

    public boolean esPropia();
}