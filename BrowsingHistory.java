import java.util.Stack;

class BrowsingHistory {
    
    Stack<String> s1=new Stack<>();
    Stack<String> s2=new Stack<>();

    public void BrowserHistory(String homepage) {
        s1.push(homepage);
    }
    
    public void visit(String url) {
        s1.push(url);
        if(s2.size()>0)
        while(!s2.isEmpty())
            s2.pop();
    }
    
    public String back(int steps) {
        String t=null;
        while(s1.size()>1 && steps>0){
            t=s1.pop();
            s2.push(t);steps--;
        }
       
            return s1.peek();
    }
    
    public String forward(int steps) {

        while(steps-- >0 && s2.size()>0)
            s1.push(s2.pop());
                 return s1.peek();
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */