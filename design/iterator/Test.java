/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.iterator;

/**
 *
 * @author harsh vaghani
 */
public class Test {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator itrVar = namesRepository.getIterator();
                itrVar.hasNext();) {
            String name = (String) itrVar.next();
            System.out.println("Name : " + name);
        }
    }
}
