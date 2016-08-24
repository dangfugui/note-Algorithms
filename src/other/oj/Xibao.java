package other.oj;
import java.util.Scanner;


public class Xibao {
	public int[][] map=new int[99][99];
	public int m,n,ans=0;
	public int []dx={-1,0,1,0};
	public int []dy={0,-1,0,1};
	public static void main(String[] args) {
		new Xibao().start();
	}
	public void start() {
		init();
		for(int a=1;a<=m;a++){
			for(int b=1;b<=n;b++){
				if(map[a][b]!=0){
					dfs(a,b);
					ans++;
				}
				
			}
		}
		System.out.println(ans);
	}
	private void dfs(int a, int b) {
		// TODO 自动生成的方法存根
		map[a][b]=0;
		for(int i=0;i<4;i++){
			int y=a+dy[i];
			int x=b+dx[i];
			if(map[y][x]!=0){
				dfs(y,x);
			}
		}
		
	}
	private void init() {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		//System.out.println(m+"-"+n);
	
		for(int a=1;a<=m;a++){
			for(int b=1;b<=n;b++){
				map[a][b]=scan.nextInt();
			}
		}
	}
}


/*
 2、细胞 一矩形阵列由数字0到9组成,数字1到9代表细胞,细胞
的定义为沿细胞数字上下左右还是细胞数字则为同一细胞,
求给定矩形阵列的细胞个数。
输入：整数m,n(m行，n列)
      矩阵
输出：细胞的个数。

4 10
0 2 3 4 5 0 0 0 6 7
1 0 3 4 5 6 0 5 0 0
2 0 4 5 6 0 0 6 7 1
0 0 0 0 0 0 0 0 8 9

**/