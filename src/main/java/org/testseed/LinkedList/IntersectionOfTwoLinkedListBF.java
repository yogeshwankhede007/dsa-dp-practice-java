package org.testseed.LinkedList;

import org.testseed.LinkedList.Leetcode.ListNode;

public class IntersectionOfTwoLinkedListBF {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for(ListNode a = headA; a!= null; a =a.next){
            for(ListNode b = headB; b != null; b = b.next){
                if(a == b) return a;
            }
        }
        return null;
    }
}
