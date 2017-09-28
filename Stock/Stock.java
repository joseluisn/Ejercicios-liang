/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Stock;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Stock {

    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name) {
        this.name = name;
        this.symbol = symbol;
    }

    public double previousClosingPrice() {
        return previousClosingPrice;
    }

    public double currentPrice() {
        return currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

  
    public void setCurrentPrice(double currentPrice) {
         this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }
}
