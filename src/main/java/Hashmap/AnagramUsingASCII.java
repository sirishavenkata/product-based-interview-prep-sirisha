package Hashmap;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramUsingASCII {

    public static void main(String[] args) {
        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map=new HashMap<>();
        for(String s :arr){
            int[] count =new int[26];
            for( char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            StringBuilder sc=new StringBuilder();
            for(int i:count) {
                sc.append(i);
                sc.append("#");
            }
            String key=new String(sc);
            System.out.println(key);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
    }
}
