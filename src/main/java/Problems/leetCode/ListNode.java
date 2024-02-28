package Problems.leetCode;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(){

    }

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}
