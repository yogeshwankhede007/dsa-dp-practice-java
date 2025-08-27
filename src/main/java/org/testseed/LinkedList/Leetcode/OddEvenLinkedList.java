package org.testseed.LinkedList.Leetcode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode odd = head, even = head.next, evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

//        odd=1      even=2
//          ↓          ↓
//          1 ─────────→ 3 → 4 → 5 → null
//             \
//               2 → 3 → 4 → 5 → null


        odd.next = evenHead;
        return head;
    }
}
