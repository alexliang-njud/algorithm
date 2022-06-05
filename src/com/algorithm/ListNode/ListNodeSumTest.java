package com.algorithm.ListNode;

/**
 * Leetcode:给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class ListNodeSumTest {


    public static ListNode addSum(ListNode head1,ListNode head2){

        ListNode result = new ListNode();
        ListNode cur = result;

        int tag=0;
        int sum=0;
        while(head1 !=null || head2 !=null){
            int num1 = head1 !=null? head1.val:0;
            int num2 = head2 !=null? head2.val:0;

            sum = tag+ num1+num2;
            //tag 进位值
            tag = sum/10;

            //cur为新链表的游标
            cur.next = new ListNode(sum%10);
            cur = cur.next;

            if(head1 !=null){
                head1 = head1.next;
            }
            if(head2 !=null){
                head2 = head2.next;
            }
        }
        //当最后依然有进位时，需要补充
        if(tag >0){
            cur.next = new ListNode(tag);
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode.printListNode(node1);
        ListNode.printListNode(node4);
        ListNode.printListNode(addSum(node1,node4));
    }
}


