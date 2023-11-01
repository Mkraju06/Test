import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax of an array - datatype[] variableName = new dataytpe[length of the array];
		
		
		//Array index =  0,1,2,3,4
		//Array length = 1,2,3,4,5
		//5 bowls - gulab jamun - 0th bowl, 1st bowl
		
		int[] user = new int[5];
		//System.out.println(user.length);
		
		//Syntax to assign values - array name[index number] = value;
		user[0]=10;
		user[1]= 20;
		user[2]=30;
		user[3]= 40;
		
		
		//System.out.println(user[3]);
		 //                            0  1  2  3  4
		//datatype [] variableName = {1, 2, 3, 4, 5}
		
		int [] integers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println(integers.length);
		System.out.println(integers[3]);
		
		String [] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
		
		System.out.println(usernames.length);
		System.out.println(usernames[3]);
		
		//Array List
		//Syntax - ArrayList <Data Type> variable Name = new ArrayList<Data type>();
		//Syntax to add the values in ArrayList = arrayList Name.add();
		//Syntax to get the size of the Array list - arraylist name.size();
		//Syntax to get the index number value of array list - array list name.get(indexNumber);
		
		ArrayList <String> usernameList = new ArrayList<String>();
		
		usernameList.add("standard_user");
		usernameList.add("problem_user");
		usernameList.add("another");

		
		System.out.println(usernameList.size());
		System.out.println(usernameList.get(0));
		
		usernameList.remove(2);
		System.out.println("This is the size of the Array List after the removal: " +usernameList.size());
		
		//List
	}

}
