package com.algorithm.ListNode;

/**
 * 剑指offer:输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * 假设我们有两个链表 A,B；
 * A的头节点A1的值与B的头结点B1的值比较，假设A1小，则A1为头节点；
 * A2再和B1比较，假设B1小,则，A1指向B1；
 * A2再和B2比较 就这样循环往复就行了，应该还算好理解。
 */

public class ListNodeMerge {
    public static ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        //当A1比B1小，则用A2与B1比较，直到找到AZZZ比B1大
        if(list1.val <= list2.val){
            list1.next = merge(list1.next, list2);
            return list1;
        }else{
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(7);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(10);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode.printListNode(node1);
        ListNode.printListNode(node4);
        ListNode.printListNode(merge(node1,node4));
    }
}
