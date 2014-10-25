package com.tesla.relativa;

/**
 * Created by Vaastav on 2014-10-25.
 */
public class LengthContraction extends Transformation
{
    private double length;
    private double contractedLength;
    public LengthContraction(double velocity,double length)
    {
        super(velocity);
        this.length = length;
        calculateTransformation();
    }

    @Override
    public double calculateTransformation()
    {
        contractedLength = length/gamma;
        return contractedLength;
    }

    public double getContractedLength()
    {
        return contractedLength;
    }
}
