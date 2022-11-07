package Day66;

public class AddTwoNumbers {
    private static Node head;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }

        public static void addToLast(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp= temp.next;
            }
            System.out.println();
        }
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        Node dummyNode = new Node(0);
        Node cur = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new Node(sum % 10);
            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummyNode.next;
    }

}