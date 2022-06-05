package com.algorithm.ListNode;

/**
 * 剑指offer: 输入一个链表，输出该链表中倒数第k个结点。
 * 首先两个节点/指针，一个节点 node1 先开始跑，指针 node1 跑到 k-1 个节点后，
 * 另一个节点 node2 开始跑，当 node1 跑到最后时，node2 所指的节点就是倒数第k个节点也就是正数第(L-K+1)个节点。
 */
public class LastKNode {

    public static ListNode getLastKNode(int k,ListNode head){
        // 如果链表为空或者k小于等于0
        if (head == null || k <= 0) {
            return null;
        }

        ListNode node1 =head;
        ListNode node2 =head;

        int count=0;
        int index=k;
        while(node1 !=null){
            node1 = node1.next;

            count++;
            if(k<1){
                node2 = node2.next;
            }
            k--;
        }

        // 如果节点个数小于所求的倒数第k个节点，则返回空
        if (count < index)
            return null;

        return node2;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode.printListNode(node1);
        System.out.println(getLastKNode(2,node1).val);
    }

}
