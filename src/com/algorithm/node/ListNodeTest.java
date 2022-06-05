package com.algorithm.node;

/**
 * 链表练习
 */
public class ListNodeTest {
    public static class ListNode{
        private int value;
        private ListNode next;

        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public static ListNode combinedListNode(ListNode list1, ListNode list2){
        if (list1 == null && list2 == null) {
            return null;
        }
        if(null == list1){
            return list2;
        }
        if(null == list2){
            return list1;
        }

        ListNode newHead = null;
        if(list1.value> list2.value){
            newHead = list2;
            list2 =list2.next;
        }else {
            newHead = list1;
            list1 =list1.next;
        }

        ListNode tmp = newHead;
        while(list1.next != null && list2.next !=null){
            if(list1.value> list2.value){
                tmp.next = list2;
            }else {
                tmp.next = list1;
            }

            list1 = list1.next;
            list2 = list2.next;
            tmp = tmp.next;
        }

        if(list2.next !=null){
            tmp.next = list2.next;
        }
        if(list1.next !=null){
            tmp.next = list1.next;
        }
        return newHead;
    }

    /**
     *      * 输入：1->2->4, 1->3->4
     *      * 输出：1->1->2->3->4->4
     * @param args
     */
    public static void main(String[] args) {
        ListNode node4= new ListNode(4, null);
        ListNode node2= new ListNode(2, node4);
        ListNode node1= new ListNode(1, node2);

        ListNode node44= new ListNode(4, null);
        ListNode node33= new ListNode(3, node44);
        ListNode node11= new ListNode(1, node33);
        
    }
}
