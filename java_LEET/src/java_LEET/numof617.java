package java_LEET;

  public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
     }
 }
 

class numof617 {
	
	public static void main(String[] args) {
		int[] rt1 =new int[]{1,3,2,5};
		int[] rt2 =new int[]{2,1,3,null,4,null,7};
		//일단 노드배열 받기
		TreeNode root1 = new TreeNode();
		TreeNode root2 = new TreeNode();
		maketreenode( rt1,root1,0);
		
	}
	public static TreeNode maketreenode(int[] rt,TreeNode root,int cnt) {
		root.val=rt[cnt];
		root.left=maketreenode( rt,root.left,cnt+1);
		
	}
	
	
	    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	    	
	    	TreeNode root = new TreeNode();
	    	if(root1 == null)  root = root2;
			else if(root2 == null)  root = root1;
			else {
				root.val = root1.val + root2.val;
		    	root.left = mergeTrees(root1.left, root2.left);
		    	root.right = mergeTrees(root1.right, root2.right);
	    	}
	    	return root;
		}
	}

