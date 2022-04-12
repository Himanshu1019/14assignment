

class LL
{
    private Node head=null;
		private Node tail=null;
		
		class Node
		{
			int data;
			Node next;
			
			Node(int data, Node next)
			{
				this.data=data;
				this.next=next;
			}
			Node(int val)
			{
				this.data=val;
				this.next=null;
			}
		}
		
		
		public void deletelast()
		{
			Node temp=head;
			while(temp.next.next !=null)
			{
				temp=temp.next;
				
			}temp.next=null;
		}
		
		
		
		
		public void insertfirst(int data )
		{
			Node node= new Node (data);
			if(head==null)
			{
				head=node;
				tail=node;
				
			}
			else
			{
				
			node.next=head;
			head=node;
		}
		}
		public void insert(int data, int index)
		{
			
			Node temp;
			temp=head;
			int position;
			for(position=1;position<index-1;position++)
			{
				temp=temp.next;
				
			}
			Node node=new Node(data);
			node.next=temp.next;
			temp.next=node;
			
			
		
		}
			
		
			public void insertatlast(int data)
			{
				Node node= new Node (data);

				if(tail ==null)
				{
					tail=node;
					head=node;
				}
				else
				{

				
					tail.next=node;
					tail=node;
					
				}
				
			}
			
			public void deletefirst()
			{
				head=head.next;
				if(head==null) {
					tail=null;
				}
				
			}
			
			
		public void display()
		{
			Node temp=head;
			while(temp !=null) {
				
				System.out.print(temp.data);
				temp=temp.next;
					System.out.print("...");
				
			}	System.out.print("null....");
			System.out.print("\n");
		}
	public static void main (String[] args) 
	{
		
			LL a=new LL();
			//a.insertatlast(40);
			
			
			a.insertfirst(30);
			a.insertfirst(56);
			a.insertatlast(70);
			
			a.insert(40,3);
			
			//a.insertatlast(30);
			//a.display();
			//a.insertatlast(40);
			//a.insertatlast(50);
			//a.display();
			//a.insert(9, 5);
			//a.display();
			//a.insert(30,2);
			//a.display();
			//a.deletefirst();
			//a.display();
			// a.deletelast();
			 a.display();
	
	}
}
