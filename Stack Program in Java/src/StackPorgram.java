import static java.lang.System.*;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
@SuppressWarnings("unused")
public class StackPorgram<T> {
	
	private List<T> cStack = new ArrayList<T>();
	private int top=-1;
	
	private T inputval;
	
	public void addElement(T inputval){
		top++;
		System.out.println("Adding the value : "+inputval);
		cStack.add(inputval);
	}
	
	@SuppressWarnings({"hiding" , "unchecked"})
	public <T> T removeElement()
	{
		if(top == -1)
		{
			out.println("No value to remove");
			exit(0);
		}
		return (T) cStack.get(top--);
	}

	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) {
		StackPorgram Obj1 = new StackPorgram();
		DataInputStream stdin = new DataInputStream(System.in);
		Scanner stdin1 = new Scanner(System.in);
		int ch;
		char opt;
		do
		{
			out.println("1. Push into the stack \n 2. Pop from the stack \n");
			ch = stdin1.nextInt();
		switch(ch)
		{
		case 1:
			try {
				out.println("Enter a value to Insert \n");
				Obj1.inputval=(char)stdin.read();;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("Read the value : "+Obj1.inputval);
			Obj1.addElement(Obj1.inputval);
			break;
		case 2:
			out.println("Value popped from the Stack is :"+ Obj1.removeElement());
			break;
		}
		out.print("Do you want to exit (Y/y)");
		opt=stdin1.next().charAt(0);
		out.println("opt is "+opt);
		} while(opt !='y');
		stdin1.close();
}
}
