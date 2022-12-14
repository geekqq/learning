package Day52;

public class ReverseLinkedList {
    static ListNode head;
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    public void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new ListNode(2);
        list.head.next = new ListNode(4);
        list.head.next.next = new ListNode(6);
        list.head.next.next.next = new ListNode(8);
        list.head.next.next.next.next = new ListNode(10);
        list.printList(head);
        head = list.reverse(head);
        list.printList(head);
    }
}
