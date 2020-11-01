class employee
{
	char name;
	int age;
	char city;
	 
	 void display()
	  {
		  System.out.println("The name is Saurab" +name);
		  System.out.println("The age is 23" +age);
		  System.out.println("The city is chennai" +city);
	  }

   public static void main(String args[])
   {
 	 employee e=new employee();
      e.display();
   }

}   