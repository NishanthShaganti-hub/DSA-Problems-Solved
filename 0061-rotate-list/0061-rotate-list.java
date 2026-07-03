class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        int i = 1;
        ListNode curr = head;

        while (i < len - k) {
            curr = curr.next;
            i++;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
}