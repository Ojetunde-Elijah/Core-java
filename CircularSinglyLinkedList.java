public class CircularSinglyList{

    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
            next = null;    
        }

    }
    public  void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        } else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;

    }

    public static void main (String[] args){

    }
}