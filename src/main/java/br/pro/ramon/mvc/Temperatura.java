package br.pro.ramon.mvc;

public class Temperatura {

    private double t = 10;

    public void aumentar() {
        if (t < 100) {
            t++;
        }
    }

    public void diminuir() {
        if (t > 0) {
            t--;
        }
    }

    public double getT() {
        return t;
    }

}
