class CountSorter implements IntSorter {
private static final int MAX_VALUE = 100; //this can be passed to the function if needed. 

	@Override
	public static int[] sort(int a[]){
		int frequency[] = new int[MAX_VALUE+1];
		
		//compute the frequency of each element
		for(int i=0;i<a.length;i++)
			frequency[a[i]]++;
		
		//store in an array or print directly. 
		int sorted[] = new int[a.length];
		int position =0;
		for(int i=0;i<=MAX_VALUE;i++){
			for(int j=0;j<frequency[i];j++){
				sorted[position]=i;
				position++;
			}
		}		
		return sorted;
	}
}
