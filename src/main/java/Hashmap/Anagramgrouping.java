package Hashmap;

import java.util.*;

public class Anagramgrouping {
    /*Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
    Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]*/
    public static void main(String[] args) {
        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map=new HashMap<>();
        for(String s:arr){
          char[] charStr=s.toCharArray();
            Arrays.sort(charStr);
            String res=new String(charStr);
            map.computeIfAbsent(res,k-> new ArrayList<>()).add(s);
        }

        System.out.println(map.values());
    }


}

//Map<In
// for(Integer x:ip){
   //x.sort();


