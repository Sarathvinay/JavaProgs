import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QueueProgram<T> {
	
	T value;
	int front=-1;
	int rear=-1;
	List <T> Queue = new ArrayList<T>();
	
	public void Enqueue(T x)
	{
		if(front == -1)
			front++;
		rear++;
		Queue.add(x);
	}
	
	public void Dequeue()
	{
		if(front == rear+1 || front > rear)
			System.out.println("Nothing to remove from queue");
		else
		System.out.println("The value is :"+Queue.get(front++));
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args)
	{
		int opt;
		char opt1;
		String ch;
		Scanner stdin = new Scanner(System.in);
		QueueProgram obj1 = new QueueProgram ();
		do
		{
		System.out.println("1. Enqueue \n 2. Dequeue \n");
		opt=stdin.nextInt();
		switch (opt)
		{
		case 1:
			System.out.println("Enter the value to insert");
			ch=stdin.next();
			obj1.Enqueue(ch);
			break;
		case 2:
			obj1.Dequeue();
			break;
		}
		System.out.println("Do you want to exit (y)");
		opt1 = stdin.next().charAt(0);
		}while(opt1!='y');
		stdin.close();
	}

}
