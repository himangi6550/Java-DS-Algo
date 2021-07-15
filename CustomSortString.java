import java.util.HashMap;
import java.util.Map;

class SortString {
	public String customSortString(String order, String str) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i;char c;String nstr="";
        for(i=0;i<str.length();i++){
            c=str.charAt(i);
            if(map.isEmpty())
                map.put(c,1);
            else if(!map.containsKey(str.charAt(i)))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
            //System.out.println(map);
            
        }
        for(i=0;i<order.length();i++){
            c=order.charAt(i);
            if(map.containsKey(c)){
                int v=map.get(c);
                while(v-->0){
                    nstr=nstr+c;
                }
                map.remove(c);
            }
            
        }//System.out.println(map);
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char k=entry.getKey();
            int v=entry.getValue();
            while(v-->0){
                    nstr=nstr+k;
                }
        }//System.out.println(nstr);
        return nstr;
    }
}
public class CustomSortString {
	public static void main(String args[]) {
		SortString s=new SortString();
	String res=s.customSortString("cbathwur","dabcddbfjtuttj");
	System.out.println(res);
	}


}
