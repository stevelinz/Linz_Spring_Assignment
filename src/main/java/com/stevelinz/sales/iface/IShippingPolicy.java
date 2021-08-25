package com.stevelinz.sales.iface;

public interface IShippingPolicy {
    double getShippingCost(ISale ISale);
}
