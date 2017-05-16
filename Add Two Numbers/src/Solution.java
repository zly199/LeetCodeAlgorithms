/**
 * Created by ZLY on 2017-05-16.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l2;
        while (l1!=null||l2!=null){

            if (l1==null) l1 = new ListNode(0);
            if (l2==null) l2 = new ListNode(0);
            l2.val = l2.val+l1.val;
            while (l2.val>9){
                l2.val=l2.val-10;
                if (l2.next!=null) l2.next.val=l2.next.val+1;
                else l2.next = new ListNode(1);
            }
            if (l1.next==null&&l2.next==null){
                break;
            }
            if (l1.next==null){
                l1.next = new ListNode(0);
            }
            l1=l1.next;
            if (l2.next==null){
                l2.next = new ListNode(0);
            }
            l2=l2.next;
        }
        return result;
    }

    public static void main(String[] args) {
/*        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next = new ListNode(4);*/
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        l1.next = new ListNode(8);
        ListNode resule = addTwoNumbers(l1,l2);
        System.out.println();

    }
}
