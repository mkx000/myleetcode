package LinkedList;

import java.util.HashSet;

public class L160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        while (headA != null) {
            nodeSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (nodeSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}
