package org.testseed.LinkedList.Leetcode;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        for(ListNode a =headA; a!= null; a = a.next){
            set.add(a);
        }
        for(ListNode b = headB; b != null; b = b.next){
            if(set.contains(b)) return b;
        }
        return null;
    }
}
