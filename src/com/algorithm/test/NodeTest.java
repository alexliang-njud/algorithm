package com.algorithm.test;

/**
 * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
 *
 */
class Node {
    Node next = null;// 节点的引用，指向下一个节点
    int data;// 节点的对象，即内容

    public Node(int data) {
        this.data = data;
    }
}

public class NodeTest {
    Node head = null; // 头节点

    /**
     * 向链表中插入数据
     *
     * @param d
     */
    public void addNode(int d) {
        Node newNode = new Node(d);// 实例化一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    /**
     *
     * @param index:删除第index个节点
     * @return
     */
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     *
     * @return 返回节点长度
     */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    @Override
    public String toString(){
        StringBuffer stb = new StringBuffer();
        if(head==null) {
            return "";
        }
        stb.append(head.data);
        Node tmp = head;
        while(tmp.next !=null){
            tmp = tmp.next;
           stb.append("->");
           stb.append(tmp.data);
        }
        return stb.toString();
    }

    public void changeNode(){
        Node curHead = head;
        if (head == null || head.next == null) return;
        Node pre = null;
        Node next = null;
        while (curHead !=null){
            next = curHead.next;
            curHead.next = pre;
            pre = curHead;
            curHead = next;
        }
        head = pre;
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        NodeTest nodeTest = new NodeTest();
        nodeTest.head = new Node(1);
        nodeTest.addNode(2);
        nodeTest.addNode(3);
        nodeTest.addNode(4);
        nodeTest.addNode(5);
        System.out.println(nodeTest.toString());
        nodeTest.changeNode();
        System.out.println(nodeTest.toString());
    }


}
