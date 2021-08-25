package com.stevelinz.sales.iface;

import java.util.List;

public interface ISalesReport {
    void generateReport(List<ISale> salesList);
}
