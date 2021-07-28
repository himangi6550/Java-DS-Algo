import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public List<String> solve(int open,int close,String op,List<String> list){
        if(open==0 && close==0){
            list.add(op);
            return list;
        }
        if(open!=0){
            String op1=op;
            op1=op1+'(';
            solve(open-1,close,op1,list);
        }
        if(close>open){
            String op2=op;
            op2=op2+')';
            solve(open,close-1,op2,list);
        }
        return list;
    }
    public String[] generate_Parenthesis(int n) {
        int open=n,close=n;
        String op="";
        List<String> list=new ArrayList<>();
        list= solve(open,close,op,list);
        String str[]=new String[list.size()];
        for(int i=0;i<list.size();i++)
        str[i]=list.get(i);
        return str;
    }


	public static void main(String args[]) {
		GenerateParanthesis s=new GenerateParanthesis();
		
		String[] p=s.generate_Parenthesis(4);
		for(int i=0;i<p.length;i++)
	        
		System.out.println(p[i]);
		}

}
