import java.util.Map;
import java.util.Map.Entry;  
class HalfArraySize {
    public Map<Integer,Integer> sort(Map<Integer,Integer> map){
    List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(map.entrySet());  
//sorting the list elements  
Collections.sort(list, new Comparator<Entry<Integer, Integer>>()   
{  
public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)   
{  

//compare two object and return an integer  
return o1.getValue().compareTo(o2.getValue());}   

});
                 }
  

    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int j=0,c;
        for(int i=0;i<arr.length;i=i+j){
            while(j<ar.length && arr[j]!=arr[i]){
                c++;
                j++;
            }
            map.put(ar[i],c);
        }
        sorted=sort(map);
        int elem=0,curr_count=0;
        for(int k:map){
            if(map.get(k)+curr_count<arr.length/2){
                elem++;
                curr_count+=map.get(k);
            }
            else
                break;
            
        }
        return elem;
        
 
    }
}