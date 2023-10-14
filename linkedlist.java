import org.w3c.dom.Node;

public class linkedlist {



    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }


    }
     public Node head = null;
     public  Node tail = null;

     public void addnode(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
     }


     public void display(){

          Node current = head;

          if(head == null){
              System.out.println("list is empty");

          }else{
              while(current != null){
                  System.out.println(current.data+ " ");
                  current = current.next;
              }
          }
         System.out.println();

    }

    public void delete(){
        if(head == null){
            System.out.println("list is empty");

        }else{
           head = head.next;
        }
    }


    public static void main(String[] args) {

        linkedlist sList =new linkedlist();

        //Add nodes to the list
        sList.addnode(1);
        sList.addnode(2);
        sList.addnode(3);
        sList.addnode(4);
        sList.delete();

        //Displays the nodes present in the list
           sList.display();
    }

}