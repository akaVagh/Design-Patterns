/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.strategy;

import java.util.Arrays;

/**
 *
 * @author harsh vaghani
 */
public class Test {

    public static void main(String[] args) {
        int[] numbers1 = {55, 11, 44, 99, 66, 77, 22};
        int[] numbers2 = {55, 11, 44, 99, 66, 77, 22};
        System.out.println("Numbers in Original Order: " + Arrays.toString(numbers1));
        Arranger ascendingArranger = new Arranger(new AscendingSorting());
        ascendingArranger.arrange(numbers1);
        System.out.println("Numbers in Ascending Order :" + Arrays.toString(numbers1));
        Arranger descendingArranger = new Arranger(new DescendingSorting());
        descendingArranger.arrange(numbers2);
        System.out.println("Numbers in Descending Order :" + Arrays.toString(numbers2));
    }
}
