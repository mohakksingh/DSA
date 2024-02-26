package BinarySearch.Kunal;

public class SearchInRotated {
    public static void main(String[] args) {
        
    }

    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        
        if(nums[pivot]==target){
            return pivot;
        }
        
        if(target>= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    
    public int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    

    //this will not work in duplicate values
    public int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]>=nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
        
    }
}