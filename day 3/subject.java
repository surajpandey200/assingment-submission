class subject
{
	int maths=85;
	int hindi=65;
	int sst=78;
	int evs=87;
	int sce=98;
	
	void display()
	{
	 int avg=(maths+hindi+sst+evs+sce)/5;
	 float per=(avg*100);
     System.out.println("percentage of subject are=" +per);
	  System.out.print("The student Grade is: ");
	   if(per>=80)
        {
            System.out.print("A");
        }
        else if(per>=60 && per<80)
        {
           System.out.print("B");
        } 
        else if(per>=40 && per<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }	
	}

  public static void main(String args[])
  {
    subject s=new subject();
    s.display();
  }
}  