package LinkedList;

import java.util.*;

public class L23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b) -> (a.val - b.val));
        // 将 k 个链表的头结点加入最小堆
        for (ListNode head : lists) {
            if (head != null)
                pq.add(head);
        }

        while (!pq.isEmpty()) {
            // 获取最小节点，接到结果链表中
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            // p 指针不断前进
            p = p.next;
        }
        return dummy.next;
    }

    public static void lambda(){
        String[] arr = {"program", "creek", "is", "a", "java", "site"};
        Arrays.sort(arr, (String m, String n) -> Integer.compare(m.length(), n.length()));
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        L23.lambda();
    }
}
