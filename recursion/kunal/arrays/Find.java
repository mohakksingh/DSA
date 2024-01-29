package recursion.kunal.arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        System.out.println(findEveryIndex2(arr, 4, 0));

    }

    static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }   


    static int findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return  findIndex(arr, target, index+1);
        }
    }  
    
    
    static int findLastIndex(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return  findLastIndex(arr, target, index-1);
        }
    }   

    static ArrayList<Integer> list =new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
        
    }

    static ArrayList<Integer> findEveryIndex(int[] arr,int target,int index,ArrayList<Integer>list){
            if(index==arr.length){
                return list;
            }
            if(arr[index]==target){
                list.add(index);
            }
            return findEveryIndex(arr, target,index+1, list);
    }


    static ArrayList<Integer> findEveryIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
            if(index==arr.length){
                return list;
            }
            if(arr[index]==target){
                list.add(index);
            }
            ArrayList<Integer> ansFromBelowCalls=findEveryIndex2(arr, target,index+1);
            list.addAll(ansFromBelowCalls);
            return list;
    }



}
