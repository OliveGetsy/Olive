package program;



public interface Topic 
	{
		 void understand();
	}
			 class Topic1  implements Topic
			{
				public void understand()
				{
				System.out.println("Topic1");
			     }
				
			}
			 class Topic2 implements Topic
			{
				public void understand()
				{
				System.out.println("Topic2");
				}
			}
			class Subject
			{
			public static void main(String args[])
			{
				Topic t=new Topic1();
				t.understand();
			}

}
