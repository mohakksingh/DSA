public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,432,1245,45,322,5};
        int target=45;
        
        System.out.println(linearSearch3(nums, target));
    }

    //search in the array if item found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;

    }

    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return arr[i];
            }
        }
        return -1;

    }
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return true;
            }
        }
        return false;

    }
}
