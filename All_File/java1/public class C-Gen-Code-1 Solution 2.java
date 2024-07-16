// public class C-Gen-Code-1 Solution 2{
// 	public boolean hasCycle(ListNode head) {
//         if(head == null || head.next == null)
//             return false;
//         return isCyclic(head, head.next.next);
//     }
    
//     private boolean isCyclic(ListNode slower, ListNode faster){
//         if(slower == faster)
//             return true;
//         if(slower == null || faster == null || faster.next == null)
//             return false;
//         return isCyclic(slower.next, faster.next.next);
//     }
// }
public class