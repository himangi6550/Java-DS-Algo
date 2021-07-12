import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)
            return false;
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        int i=0,flag=0;
        for(;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map1.isEmpty() && map2.isEmpty()){
                map1.put(c1,c2);
                map2.put(c2,c1);
                
            }
            
            else if(!map1.containsKey(c1) && !map2.containsKey(c2))
            {
                map1.put(c1,c2);
                map2.put(c2,c1);
                
            }
            else{
                //System.out.println("HashMap5");
                if(map1.containsKey(c1)){
                    //System.out.println("HashMap1");
                    if(map1.get(c1)!=c2){//System.out.println("HashMap2");
                        flag=1;
                        break;
                    }
                }
                else {
                    if(map2.containsKey(c2)){//System.out.println("HashMap3");
                        if(map2.get(c2)!=c1){//System.out.println("HashMap4");
                            flag=1;//System.out.println(flag);
                            break;
                        }
                    }
                }
            }
            
        }
        //System.out.println("HashMap: "+ map1);
        //System.out.println("HashMap: "+ map2);
        return (flag==0);
    }
}
public class IsomorphicString {
	public static void main(String args[]) {
		Isomorphic s=new Isomorphic();
	boolean res=s.isIsomorphic("ttrrwe","uuwwoy");
	System.out.println(res);
	}

}
