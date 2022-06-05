package com.algorithm.ListNode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(){

    }
    public ListNode(int val){
         this.val =val;
    }

    public static void printListNode(ListNode head){
        StringBuffer stringBuffer = new StringBuffer();
        while (head !=null){
            stringBuffer.append(head.val);
            if(head.next!=null){
                stringBuffer.append("->");
            }
            head = head.next;
        }
        System.out.println(stringBuffer.toString());
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printListNode(node1);
    }

}
