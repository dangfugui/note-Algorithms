package other.�˻ʺ�;

public class Digui {
	public int N=8;
	public int list[]=new int[16];
	public int anscount=0;//���ж��������з�ʽ
	public static void main(String[] args) {
		Digui digui=new Digui();
		digui.find(1);//�ӵ�һ����ʼ
		System.out.println(digui.anscount);
	}
	public void find(int i){
		if(i>N){
			print(list);
			anscount++;
			return;
		}
		for(int a=1;a<=N;a++){
			list[i]=a;//��i���ڵ�a��λ�ã�a��1-8��ÿ��������һ��
			if(check(i)){//����i���Ƿ��������
				find(i+1);//�����������������һ�е�λ�á�
			}
			
		}
		
		
	}
	private boolean check(int n) {//����n���Ƿ��������
		for(int i=1;i<n;i++ ){//��n��֮ǰ�ļ�飬
			if(list[n]==list[i]||Math.abs(n-i)==Math.abs(list[n]-list[i])){
				//��һ��������ʾ����ͬһ�У�
				//�ڶ���������ʾ���Ƿ���ͬһб�Խ���
				//����������������㣬��������������Լ�����ȥ��
				return false;
			}
		}
		return true;
	}
	private void print(int a[]){
		for(int b=0;b<a.length;b++){
			System.out.print(a[b]);
		}
		System.out.println();
	}
	
}
