public class DeleteElement {
    public static int searchElement(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
         
        }
        return -1;
    }

    public static int[] deleteElement(int arr[], int element){
         // for deleting first we have to find element postion 
       
        int post = searchElement(arr, element);

        if(post == -1){
          System.out.println("Element not found in the array ");
          return arr;
        }

        int[] newArr = new int[arr.length - 1];  
        for (int i = 0, j = 0; i < arr.length; i++) {  
            if (i != post) {  
                newArr[j++] = arr[i];  
            } }
            return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
         arr = deleteElement(arr, 2);

        for (int num : arr) {  
            System.out.print(num + " ");  
        } 
    }
    
}
