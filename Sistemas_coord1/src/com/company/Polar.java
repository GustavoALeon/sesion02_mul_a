package com.company;

public class Polar {
    private float radio;
    private float angulo; //radianes

    public Polar (float radio,float angulo)
    {
        this.radio=radio;
        this.angulo=angulo;
    }

    public Polar()
    {

    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}
