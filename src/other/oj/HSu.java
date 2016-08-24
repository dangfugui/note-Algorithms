package other.oj;


public class HSu {
	final static int n=5;//一共五本书五个人
	static boolean book[]={false,false,false,false,false};//未被借走
	static int [][]a={{1,1,0,0,0},{1,0,0,0,0},{0,0,1,1,1},{0,0,1,0,0},{0,0,0,1,1}};
	static int b[] = new int[n];//n本书被谁借走了
	
	public static void main(String[] args) {
		dfs(0);
	}
	//第k个人的情况
	public static void dfs(int k){
		if(k==5) {print(); return;}
		//第i本书的情况
		for(int i=0;i<n;i++){
			if(book[i]==false &&a[k][i]==1){//可借的
				book[i]=true;
				b[k]=i;//第k本书被借给了第i个人
				dfs(k+1);
				book[i]=false;
				b[k]=0;
			}
		}
	}
	private static void print() {
		for(int i=0;i<5;i++){
			System.out.print(b[i]+"-");
		}
		System.out.println();
	}
}


/*
 借书问题
      
    学校放暑假时，信息学辅导教师有n本书要分给参加培训的n个学生。如：A，B，C，D，E共5本书要分给参加培训的张、刘、王、李、孙5位学生，
    每人只能选1本。教师事先让每个人将自己喜爱的书填写在如下的表中，然后根据他们填写的表来分配书本，希望设计一个程序帮助教师求出可能的分配方案，
    使每个学生都满意。


	A	B	C	D	E
张	1	1	0	0	0
王	1	0	0	0	0
刘	0	0	1	1	1
孙	0	0	1	0	0
李	0	0	0	1	1
 * */
