import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len=strs.length;
        List<List<String>> list=new ArrayList<List<String>>();
       
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<len;i++){
            String s=strs[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            s=new String(ch);
            
            if(!map.containsKey(s)){
                
                List<String> lt=new ArrayList<String>();lt.add(strs[i]);
                map.put(s,lt);
                
            }
            else{
                List<String> l=map.get(s);
                l.add(strs[i]);
                map.put(s,l);
            }
            
        }
        for (Map.Entry mapElement : map.entrySet()) 
        {
            String key = (String)mapElement.getKey();
            list.add(map.get(key));
        }
        
        return list;
    }
    public static void main(String args[]) {
    	GroupAnagrams s=new GroupAnagrams();
    	String str[]={"eat","tea","tan","ate","nat","bat"};

    	List<List<String>> p=s.groupAnagrams(str);
    	for (int i=0;i<p.size();i++) 
        {
            //String key = (String)mapElement.getKey();
            System.out.println(p.get(i));
        }
		//System.out.println(p);
		}
}

