package aula02.geo;

public class Circulo implements AreaGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }
}
