package LinkedList;

import java.util.HashSet;

public class L142 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        if (head == null) {
            return null;
        }
        while (!nodeSet.contains(head)) {
            nodeSet.add(head);
            head = head.next;
            if (head == null) {
                return null;
            }
        }

        return head;
    }
}
