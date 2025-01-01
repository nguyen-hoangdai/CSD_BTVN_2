/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistv2;

/**
 *
 * @author Nguyen Dai
 */
public class main {
    public static void main(String[] args) {
        LinkedListV2 list = new LinkedListV2();
        
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        
        list.addNode(7, 4);
        
        list.printNode();
        
        System.out.println("Node value: " + list.getNodeByPosition(3));
        
        
        System.out.println("The list after remove first: ");
        list.removeFirst();
        list.printNode();
        
        
        System.out.println("The list after remove last: ");
        list.removeLast();
        list.printNode();
        
        System.out.printf("The list after remove Node : ");
        list.removeNode(3);
        list.printNode();
        
       
    }
}
