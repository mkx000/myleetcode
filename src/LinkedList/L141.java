package LinkedList;


public class L141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = slow.next;

        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
        }
        return false;
    }
}
