package LeetCode;

/**
 * Created by GJQ on 2016/9/8.
 */
public class RemoveNthNodeFromEndofList_19 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head.next;
        ListNode duplicate=head;
        while(node!=null){
            ListNode temp=node;
            temp.next=duplicate.next;
            duplicate.next=temp;
            node=node.next;
        }
    }
}
