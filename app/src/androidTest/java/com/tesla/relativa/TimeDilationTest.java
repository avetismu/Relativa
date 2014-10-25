package com.tesla.relativa;

import org.junit.Before;
import org.junit.Test;

public class TimeDilationTest
{
    private static final double DELTA = 0.0000001;

    @Before
    public void setUp()
    {
        Transformation t = new TimeDilation(150000000.0,1);
    }

    @Test
    public void testGetDilatedTime()  {

    }

    @Test
    public void testCalculateGamma()  {

    }

    @Test
    public void testGetGamma() {

    }

    @Test
    public void testCalculateTransformation() {

    }
}