package main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution.ListNode head = Solution.init();
        Solution.printList(head);
        head = Solution.linkIter(head);
        Solution.printList(head);
        head = Solution.linkRecursive(head);
        Solution.printList(head);
    }
}