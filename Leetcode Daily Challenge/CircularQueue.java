// https://leetcode.com/problems/design-circular-queue/

class Node {
    Node next;
    int value;
}

class MyCircularQueue {
    private Node front, rear;
    private int len, size;

    public MyCircularQueue(int k) {
        len = 0;
        size = k;
        front = null;
        rear = null;
    }

    public boolean enQueue(int value) {
        if (len == size)
            return false;
        if (front == null && rear == null) {
            Node tmp = new Node();
            tmp.value = value;
            front = tmp;
            rear = tmp;
        } else {
            Node tmp = new Node();
            tmp.value = value;
            rear.next = tmp;
            rear = tmp;
        }
        len++;
        return true;
    }

    public boolean deQueue() {
        if (len == 0)
            return false;
        if (len == 1) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        len--;
        return true;
    }

    public int Front() {
        if (len == 0)
            return -1;
        return front.value;
    }

    public int Rear() {
        if (len == 0)
            return -1;
        return rear.value;
    }

    public boolean isEmpty() {
        if (len == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (len == size) {
            return true;
        }
        return false;
    }
}

class CircularQueue {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        System.out.println(obj.enQueue(4));
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(9));
        // System.out.println(obj.enQueue(3));
        // System.out.println(obj.enQueue(4));
        // System.out.println(obj.Rear());
        // System.out.println(obj.isFull());
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
        System.out.println(obj.Front());
        // System.out.println(obj.enQueue(4));
        // System.out.println(obj.Rear());
    }
}