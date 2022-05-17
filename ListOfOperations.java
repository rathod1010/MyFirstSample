class ArrayListOps {

	public ArrayList<Integer> makeArrayListInt(int n)
	{
         int ar[] = new int[n];
		 for(int i=0;i<n;i++)
		 {
			 ar[i]=0;
		 }
		 ArrayList<Integer> list = new ArrayList<>();
		 for(Integer i : ar)
		 {
			 list.add(i);
		 }
		 return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
          for(int a=0,b=list.size()-1;a<b;a++)
		  {
			  list.add(a,list.remove(b));
		  }
		  return list ;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
	{
        int i = list.indexOf(m);
		list.set(i,n);
		return list;
	}
   
}
public class Source{
	public static void main(String[] args) {
	}
}