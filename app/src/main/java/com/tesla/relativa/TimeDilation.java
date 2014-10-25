package com.tesla.relativa;

/**
 * Created by Vaastav on 2014-10-25.
 */
public class TimeDilation extends Transformation
{
    private double time;
    private double dilatedTime;
    public TimeDilation(double velocity, double time)
    {
        super(velocity);
        this.time = time;
        calculateTransformation();
    }

    @Override
    public double calculateTransformation()
    {
        dilatedTime = gamma*time;
        return dilatedTime;
    }

    public double getDilatedTime()
    {
        return dilatedTime;
    }
}
