package LinkedList;

public class L21 {

    /**
     * recursive version
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    /**
     * iteration version
     */
    public ListNode mergeTwoListsIterationVersion(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        ListNode head;
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode h = head;
        while (list1 != null && list2 != null) {
            while (list1 != null && list1.val <= list2.val) {
                h.next = list1;
                h = h.next;
                list1 = list1.next;
            }

            while (list1 != null && list2 != null && list1.val > list2.val) {
                h.next = list2;
                h = h.next;
                list2 = list2.next;
            }
        }
        h.next = list1 == null ? list2 : list1;

        return head;
    }
}
