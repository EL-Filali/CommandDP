import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> argument=new ArrayList<>();
        argument.add(3);
        argument.add(2);
        argument.add(4);
        argument.add(8);
        argument.add(7);
        argument.add(9);
        List<Integer> list=returnerLesNombrePremier(argument);
        System.out.println(list);
    }

    public static String inverserString(String chaine){
        Stack<Character> stack=new Stack<>();
        String result="";
        for (char c:chaine.toCharArray()) {
            stack.push(c);
        }
        while(!stack.isEmpty()){
            result=result+stack.pop();
        }
        return  result;
    }

    public static List<Integer> returnerLesNombrePremier(List<Integer> nombres){

        List<Integer> nombresPremier=new ArrayList<>();
        for (int n:nombres) {
            boolean isPremier=true;
            for(int i = 2; i<=n/2; i++){
                System.out.println("n"+n+"==="+n % i );
                if( n%i  ==0) {
                    isPremier=false;
                    break;
                }

            }
            if(isPremier)
                nombresPremier.add(n);
        }
        return nombresPremier;
    }
}
