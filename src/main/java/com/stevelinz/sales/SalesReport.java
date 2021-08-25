package com.stevelinz.sales;

import com.stevelinz.sales.iface.ISalesInput;
import com.stevelinz.sales.iface.ISalesReport;
import com.stevelinz.sales.iface.IShippingPolicy;
import com.stevelinz.sales.impl.FileInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SalesReport {
    private ISalesInput input;
    private ISalesReport report;
    private IShippingPolicy policy;

    public ISalesInput getInput() {
        return input;
    }

    public void setInput(ISalesInput input) {
        this.input = input;
    }

    public ISalesReport getReport() {
        return report;
    }

    public void setReport(ISalesReport report) {
        this.report = report;

    }

    public IShippingPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(IShippingPolicy policy) {
        this.policy = policy;
    }

    @Autowired
public SalesReport(ISalesInput input, ISalesReport report, IShippingPolicy policy) throws IOException {
        FileInput fileInput = new FileInput();
        fileInput.fileDisplay();


}
}
