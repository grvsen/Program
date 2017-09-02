import java.util.Scanner;

class Node1 
{
	int data;
	Node1 next;
	Node1(int data)
	{
        this.data = data;
        next = null;
    }
}

class SingleLinkedList
{
	public static Node1 insert(Node1 head,int data)
	{
        Node1 currentNode = head;
        
        // creating new node with given data
        Node1 newNode = new Node1(data);  
        
        // check if the head is null (i.e. linkedList is empty)
        if (currentNode == null)
        {   
            currentNode = newNode;
            head = currentNode;
        }
        else
        {
            // retrieving the tail of the linkedList
            while(currentNode.next != null)
            {   
                currentNode = currentNode.next;
            }
            // adding the new node to the tail of the list
            currentNode.next = newNode;
        }
        // returning the head of the linkedList
        return head;    
    }
	public static void display(Node1 head) 
	{
        Node1 start = head;
        while(start != null) 
        {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node1 head = null;
        int N = sc.nextInt();

        while(N-- > 0)
        {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
      display(head);
        sc.close();
    }
}
