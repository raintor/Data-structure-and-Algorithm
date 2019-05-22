package algorithm_and_data_structure.a2_stack;

import java.util.Stack;

/**
 * @author: raintor
 * @Date: 2019/1/11 21:38
 * @Description:
 */
public class Test {
    /**
     *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     */
    public static void main(String[] args){
        System.out.println(isNice("(({}[]))"));
    }
    public static boolean isNice(String s){
        char[] strch = s.toCharArray();
        Stack<Character> sta = new Stack<Character>();
        for(int i=0;i<strch.length;i++){
            if(strch[i]=='('||strch[i]=='['||strch[i]=='{')
                sta.push(strch[i]);
            else{
                if(sta.isEmpty())
                    return false;
                char ch = sta.pop();
                if(strch[i]==')'&&ch!='(')
                    return false;
                if(strch[i]==']'&&ch!='[')
                    return false;
                if(strch[i]=='}'&&ch!='{')
                    return false;
            }
        }
        return true;
    }
}
