package other.lanqiaobei;

public class ȫ���� {
	
	public static void main(String[] args) {
		ȫ���� q=new ȫ����();
		q.start();
	}
	
	private int N=3;
	private int list[] =new int[N];
	
	public void start(){
		for(int a=0;a<N;a++){
			list[a]=a+1;
		}
		tree(0);
		
	}
	public void tree(int i){
		if(i>=N){
			print();
			return;
		}
		//��������  �����������λ��
		for(int a=i;a<N;a++){
			swap(i, a);
			tree(i+1);
			swap(i,a);
		}
	}
	private void print() {
		for(int a=0;a<list.length;a++){
			System.out.print(list[a]);
		}
		System.out.println();
		
	}
	public void swap(int a,int b){
		int c=list[a];
		list[a]=list[b];
		list[b]=c;
	}
}
