package com.stevelinz.sales.impl;

import com.stevelinz.sales.iface.ISale;
import com.stevelinz.sales.iface.IShippingPolicy;

public class IfOverFreeShipping implements IShippingPolicy {
    @Override
    public double getShippingCost(ISale sale) {
        return 0;
    }
}
