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
public class LinkedListV2 {

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addNode(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        newNode.next = temp;
        prev.next = newNode;
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node delected = head;
        System.out.println("Delected node: " + delected.data);
        head = head.next;
        return delected;
    }

    public Node removeLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;        //prev trc, temp sau
            temp = temp.next;
        }
        Node delected = temp;
        System.out.println("Delected node: " + delected.data);
        prev.next = null;
        return delected;
    }

    public Node removeNode(int index) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        Node delected = temp;
        System.out.println("Delected node: " + delected.data);
        prev.next = temp.next;
        return delected;
    }

    public int getNodeByPosition(int index) {
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                break;
            }
            temp = temp.next;
            count++;
        }
        return temp.data;
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
