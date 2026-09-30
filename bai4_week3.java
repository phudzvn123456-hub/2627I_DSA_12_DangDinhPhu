import java.util.Stack;

class soanthao{
    public String S="";
    Stack<String> s=new Stack<>();
    public void append(String w){
        s.push(S);
        S=S+w;
    }
    public void delete(int k){
        s.push(S);
        S=S.substring(0, S.length()-k);
    }
    public void print(int k){
        System.out.println(S.charAt(k-1));
    }
    public void undo(){
        S=s.pop();
    }
    public static void main(String[] args) {
        soanthao st = new soanthao();

        st.S = "abcde";

        System.out.println("--- Bắt đầu chạy Test Case ---");
        
        st.append("fg"); 
        st.print(6);       
        st.delete(5);     
        st.undo();        
        st.print(7);       
        st.undo();       
        st.print(4);       
    }
}
