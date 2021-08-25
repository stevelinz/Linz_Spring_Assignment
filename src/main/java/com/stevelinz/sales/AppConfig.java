package com.stevelinz.sales;

import com.stevelinz.sales.iface.ISalesInput;
import com.stevelinz.sales.iface.ISalesReport;
import com.stevelinz.sales.iface.IShippingPolicy;
import com.stevelinz.sales.impl.DetailedReport;
import com.stevelinz.sales.impl.FileInput;
import com.stevelinz.sales.impl.FlatRateShipping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stevelinz.sales")
public class AppConfig {

@Bean
    public ISalesInput iSalesInput(){
        return new FileInput();
}

@Bean
    public ISalesReport iSalesReport(){
        return new DetailedReport();
}

@Bean
    public IShippingPolicy iShippingPolicy(){
        return new FlatRateShipping();
}
}
