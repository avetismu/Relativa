package com.tesla.relativa;

/**
 * Created by Vaastav on 2014-10-25.
 */
public abstract class Transformation
{
    protected double velocity;
    protected static final double c = 300000000.0;
    protected double gamma;

    public Transformation(double velocity)
    {
        this.velocity = velocity;
        calculateGamma();

    }

    public void calculateGamma()
    {
        gamma = Math.sqrt(1 - Math.pow((velocity/c),2));
    }

    public double getGamma()
    {
        return gamma;
    }

    public abstract double calculateTransformation();
}
