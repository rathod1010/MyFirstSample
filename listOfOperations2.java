	public ArrayList<Integer> makeArrayListInt(int n)
	{

	 ArrayList<Integer> list = new ArrayList<>();
		 for(int i=0;i<n;i++)
		 {
			  list.add(0);
		 }
		 return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		  Collections.reverse(list);  
		  return list ;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
	{
        int i = list.indexOf(m);
		list.set(i,n);
		return list;
	}
   
}