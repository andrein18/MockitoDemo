package org.example;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Portfolio {
    private StockService stockService;
    private List<Stock> stocks;

    public double getMarketValue(){
        double marketValue = 0.0;

        for(Stock stock:stocks){
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }
}
