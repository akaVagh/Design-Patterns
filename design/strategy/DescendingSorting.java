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
public class DescendingSorting implements SortingStrategy {

    @Override
    public void sort(int[] numbers) {
        int numberCount = numbers.length;
        int temp = 0;
        for (int i = 0; i < numberCount - 1; i++) {
            for (int j = i + 1; j < numberCount; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[j];
                }
                numbers[j] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}
