package com.algorithm.test;
/*
题目描述：一个链表，奇数位升序偶数位降序，让链表变成升序的。
比如：1 8 3 6 5 4 7 2 9，最后输出1 2 3 4 5 6 7 8 9。
 */
class ListNode{
    int val;
    ListNode next;
    public ListNode(int i){
        this.val = i;
    }
}

public class NodeTest2 {

    public static ListNode[] getListNodeList(ListNode head){
        int i=1;
        ListNode head1= null;
        ListNode head2= null;
        ListNode cur1= null;
        ListNode cur2= null;
        while(head !=null){
            if(i%2==1){
                if(cur1==null){
                    head1 = head;
                    cur1 = head1;
                }else {
                    cur1.next = head;
                    cur1= cur1.next;
                }
            }else {
                if(cur2 == null){
                    head2 = head;
                    cur2 = head2;
                }else {
                    cur2.next = head;
                    cur2 = cur2.next;
                }
            }
            i++;
            head = head.next;
        }
        cur1.next = null;
        cur2.next = null;

        ListNode[] nodes = {head1,head2};
        return nodes;
    }

    

    public static ListNode init(){
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(8);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(6);
        ListNode ListNode5 = new ListNode(5);
        ListNode ListNode6 = new ListNode(4);
        ListNode ListNode7 = new ListNode(7);
        ListNode ListNode8 = new ListNode(2);
        ListNode ListNode9 = new ListNode(9);

        ListNode1.next = ListNode2;
        ListNode2.next = ListNode3;
        ListNode3.next = ListNode4;
        ListNode4.next = ListNode5;
        ListNode5.next = ListNode6;
        ListNode6.next = ListNode7;
        ListNode7.next = ListNode8;
        ListNode8.next = ListNode9;
        return ListNode1;
    }

    public static void print(ListNode head){
        StringBuffer sbf = new StringBuffer();
        while(head !=null){
            sbf.append(head.val+"->");
            head = head.next;
        }
        System.out.println(sbf);
    }


    public static void main(String[] args) {
        ListNode head = NodeTest2.init();
        ListNode[] nodes =NodeTest2.getListNodeList(head);
        for(int i =0;i<nodes.length;i++){
            NodeTest2.print(nodes[i]);
        }
    }
}



