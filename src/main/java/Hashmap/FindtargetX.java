package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindtargetX {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15} ;
        int target=3;

        int res[] =  findTarget(arr,target);
        for(int x:res){
            System.out.println(x);
        }

    }

    private static int[] findTarget(int[] arr,int target) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            res = target - arr[i];
            if (map.containsKey(res)) {
                return new int[]{map.get(res), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
