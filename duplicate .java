public class RemoveDuplicates {
	public static int removeDuplicateElements(int array[], int nm){  
        if (nm==0 || nm==1){  
            return nm;  
        }  
        int[] temp = new int[nm];  
        int j = 0,i=0;  
        for ( i=0; i<nm-1; i++){  
            if (array[i] != array[i+1]){  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[nm-1];     
        for (i=0; i<j; i++){  
            array[i] = temp[i];  
        }  
        return j;  
    }       
	public static void main(String[] args) {
		
	int[] arr= {1,1,2,3,3,3,5,6,6};
	int length = arr.length;  
    length= removeDuplicateElements(arr, length);  
    for (int i=0; i<length; i++)  
       System.out.print(arr[i]+" "); 
	
}
}
