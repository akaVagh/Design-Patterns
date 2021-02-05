/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.strategy;

/**
 *
 * @author harsh vaghani
 */
public class Arranger {

    private SortingStrategy sortStrategy;

    public Arranger(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void arrange(int[] numbers) {
        sortStrategy.sort(numbers);
    }
}
