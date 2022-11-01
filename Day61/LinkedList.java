package Day61;

public class LinkedList {
    private static ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void add(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        }
        ListNode temp= head;
        while (temp.next != null) {
            temp =temp.next;
        }
        temp.next = node;
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next =null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new ListNode(23);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(-5);
        list.head.next.next.next = new ListNode(0);
        list.head.next.next.next.next = new ListNode(9);
        list.print(head);
        head = reverse(head);
        list.print(head);
    }
}
