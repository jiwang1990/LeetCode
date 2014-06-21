
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            if(prev != null && prev.val == current.val){
                prev.next = current.next;
                current = current.next;
            }else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
