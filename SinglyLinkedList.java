public class SinglyLinkedList{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public int lengthOfSinglyLinked(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertBegining(int value){
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        head = newHead;
    }
    public void insertEnd(int value){
        ListNode newNode =new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertAnywhere(int value,int position){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next =null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode prevous = null;
        while(current.next != null){
            previous = current
            current = current.next;

        }
        previous.next = null;
        
    }
    public ListNode deleteAnywhere(){
        if(head == null){
            return null;
        }else if(position == 1 && head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }else if{
            ListNode previous = head;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current = null
        }

        
        
    }
    public static void main(String args[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.insertBegining(5);
        sll.insertEnd(100);
        sll.display();
        
        //  System.out.println(sll.lengthOfSinglyLinked());
    }
}