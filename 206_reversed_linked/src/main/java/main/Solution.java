package main;

class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode init() {
        int[] arr = {1, 2, 3, 4, 5};

        ListNode dummy = new ListNode(arr[0], null);
        ListNode current = dummy;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i], null);
            current = current.next;
        }

        return dummy;
    }

    public static ListNode linkRecursive(ListNode source) {

        if (source == null || source.next == null)
            return source;
        ListNode newNode = linkRecursive(source.next);

        if (source.next != null) {
            source.next.next = source;
            source.next = null;
        }
        return newNode;
    }

    public static ListNode linkIter(ListNode source)
    {
        ListNode current = source;
        ListNode prev = null;
        while (current != null)
        {
            ListNode nextElem = current.next;
            current.next = prev;
            prev = current;
            current = nextElem;
        }
        return prev;
    }

    public static void printList(ListNode list){
        ListNode current = list;
        System.out.print("{");
        while (current != null){
            System.out.print(current.next == null ? current.val : current.val + " ");
            current = current.next;
        }
        System.out.println("}");
    }
}