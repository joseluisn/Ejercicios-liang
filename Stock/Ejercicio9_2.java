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
public class Ejercicio9_2 {

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock.getName() + " Symbol: " + stock.getSymbol());
        System.out.println("previous price: " + stock.previousClosingPrice());
        System.out.println("current price: " + stock.currentPrice());
        System.out.println("Percent changed: " + stock.getChangePercent());
    }

}
