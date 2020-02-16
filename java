import java.util.*;

class Count{
    int count=0;
}
public class Solution {
    
    public static int KsmallestElementSumRec(BinaryTreeNode<Integer> root,int k,Count count){
        
        if(root==null){
            return 0;
        }
        
        if(count.count>k){
            return 0;
        }
        
        int res=KsmallestElementSumRec(root.left,k,count);
        if(count.count>=k){
            return res;
        }
        
        res+=root.data;
        count.count++;
        if(count.count>=k){
            return res;
        }
        
        return res+KsmallestElementSumRec(root.right,k,count);
    } 
    
	public static int ksmallestElementSum(BinaryTreeNode<Integer> root, int k) {
		/*
		 * Your class should be named Solution.Don't write main().Don't take
		 * input, it is passed as function argument.Don't print output.Taking
		 * input and printing output is handled automatically.
		 */
         Count count=new Count();
        return KsmallestElementSumRec(root,k,count);
	}

}
