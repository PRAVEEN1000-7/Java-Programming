
public class OutputFormatting
{
	public static void main(String[] args) {
		
		String[] names = {"apple","banana","orange","strawberry","blueberry","mango","grape","watermelon"};
		
		for(String name : names){
		    System.out.println("============================");
		    System.out.printf("%10s\n",name);
		    for(int i=0;i<10;i++){System.out.print(i);};
		    System.out.printf("\n%-10s\n",name);
		    for(int i=0;i<10;i++){System.out.print(i);};
		    System.out.println();
		   
		}
	}
}