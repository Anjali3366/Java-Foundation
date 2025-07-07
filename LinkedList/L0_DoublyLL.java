public class L0_DoublyLL {
    // Node of Doubly LL
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int d, Node n, Node p) {
            data = d;
            next = n;
            prev = p;
        }

        public Node(int d) {
            data = d;
            next = null;
            prev = null;
        }

    }

    // function to covert arr into Doubly LL
    public static Node covertToDll(int[] arr) {
        Node head = new Node(arr[0]);
        Node back = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, back);
            back.next = temp;
            back = back.next;
        }

        return head;
    }

    // fn for printing the Doubly LL
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -- ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // Deletion will divide into four parts -- 1. delete from head 2. delete from
    // tail 3. delete kth node 4. delete node with value

    // 1. delete from head
    public static Node deleteFromHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;

    }

    // 2. delete from tail
    public static Node deleteFromTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        Node back = temp.prev;
        back.next = null;
        temp.prev = null;

        return head;
    }

    // 3. delete the Kth node
    public static Node deleteKthNode(Node head, int k) {

        int count = 0;
        Node KNode = head;

        while (KNode != null) {
            count++;
            if (count == k) {
                break;
            }
            KNode = KNode.next;
        }

        Node front = KNode.next;
        Node back = KNode.prev;
        if (front == null && back == null) {
            return null;
        } else if (front == null) {
            return deleteFromTail(head);
        } else if (back == null) {
            return deleteFromHead(head);
        }

        front.prev = back;
        back.next = front;
        KNode.next = null;
        KNode.prev = null;

        return head;
    }

    // 4. delete node with value
    public static Node deleteWithValue(Node head, int val) {
        Node VNode = head;
        boolean found = false;

        while (VNode != null) {
            if (VNode.data == val) {
                found = true;
                break;
            }
            VNode = VNode.next;
        }

        if (!found) {
            System.out.println("Not found!");
            return head;
        }

        Node back = VNode.prev;
        Node front = VNode.next;

        if (back == null && front == null) {
            return null;
        } else if (back == null) {
            return deleteFromHead(head);
        } else if (front == null) {
            return deleteFromTail(head);
        }

        front.prev = back;
        back.next = front;
        VNode.next = null;
        VNode.prev = null;

        return head;
    }

    // Insertion will be divided into five part -- 1. insert at head 2. insert at
    // tail 3. insert at Kth position 4. insert before given value 5. insert after
    // given value

    // 1. insert at head
    public static Node insertAtHead(Node head, int nVal) {
        Node temp = new Node(nVal, head, null);
        head.prev = temp;
        head = temp;

        return head;

    }

    // 2. insert at tail

    public static Node insertAtTail(Node head, int NVal) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node n = new Node(NVal, null, temp);
        temp.next = n;

        return head;
    }

    // 3. insert at kth Node

    public static Node insertAtKthPos(Node head, int nVal, int k) {
        if (head == null || k == 1) {
            return insertAtHead(head, nVal);
        }

        int count = 0;
        boolean flag = false;
        Node temp = head;
        Node prevN = null;
        while (temp != null) {
            count++;

            if (count == k) {
                flag = true;
                Node n = new Node(nVal, temp, prevN);
                temp.prev = n;
                prevN.next = n;
                break;

            }
            prevN = temp;
            temp = temp.next;
        }

        if (!flag) {
            System.out.println("K is greater than size of LL ");
        }

        return head;
    }

    // 4. insert before given value X
    public static Node insertBeforeX(Node head, int nVal, int x) {
        boolean found = false;
        Node xNode = head;

        while (xNode != null) {
            if (xNode.data == x) {
                found = true;
                break;
            }
            xNode = xNode.next;
        }
        if (!found) {
            System.out.println("Node not found!");
            return head;
        }

        Node back = xNode.prev;

        if (back == null) {
            return insertAtHead(head, nVal);
        }

        Node n = new Node(nVal, xNode, back);
        back.next = n;
        xNode.prev = n;

        return head;
    }

    // 5. insert after given value x
    public static Node insertAfterX(Node head, int nVal, int x) {

        boolean found = false;
        Node xNode = head;

        while (xNode != null) {

            if (xNode.data == x) {
                found = true;
                break;

            }
            xNode = xNode.next;

        }

        if (!found) {
            System.out.println("Node not found!");
            return head;
        }
        Node front = xNode.next;

        if (front == null) {
            return insertAtTail(head, nVal);
        }

        Node n = new Node(nVal, front, xNode);
        xNode.next = n;
        front.prev = n;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7 };

        // conversion from arr to DLL
        Node head = covertToDll(arr);
        printDLL(head);

        // // deletion from head
        // head = deleteFromHead(head);
        // printDLL(head);

        // // deletion from tail
        // head = deleteFromTail(head);
        // printDLL(head);

        // // deletion of Kth node
        // head = deleteKthNode(head, 2);
        // printDLL(head);

        // // deletion of Node with Value
        // head = deleteWithValue(head, 5);
        // printDLL(head);

        // // Insertion at head
        // head = insertAtHead(head, 8);
        // printDLL(head);

        // // Insertion at tail
        // head = insertAtTail(head, 9);
        // printDLL(head);

        // // Insertion at Kth position
        // head = insertAtKthPos(head, 8, 3);
        // printDLL(head);

        // Insertion before given value X
        head = insertBeforeX(head, 9, 1);
        printDLL(head);

        // // Insertion After given Value X
        // head = insertAfterX(head, 0, 1);
        // printDLL(head);
    }
}
