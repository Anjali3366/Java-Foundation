public class InsertElement {
    public static int[] insertElement(int arr[], int element , int pos){

     if(pos>arr.length){
        System.out.println("Invalid Position !");
        return arr;
     }

       int[] newArr = new int[arr.length + 1];  
       for (int i = pos; i < arr.length; i++) {  
        
                arr[i] = element;
            
              
       }
           return newArr;
   }
   public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
        arr = insertElement(arr, 2,5);

       for (int num : arr) {  
           System.out.print(num + " ");  
       } 
   }
    
}
