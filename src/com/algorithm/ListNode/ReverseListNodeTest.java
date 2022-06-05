package com.algorithm.ListNode;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 *
 * 1-2-3-4
 * 4-3-2-1
 */
public class ReverseListNodeTest {
    public static ListNode ReverseList(ListNode head) {
        ListNode pre =null;
        ListNode next =null;

        while(head !=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode.printListNode(node1);
        ListNode.printListNode(ReverseList(node1));
    }

}
