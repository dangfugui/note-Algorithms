package other.lanqiaobei;
/**
 * ���������⣺ �Ѵ�1��20��20�����ڳ�һ������Ҫ�������������ĺ���һ��������
 * @author duang
 *
 */
public class ������ {
	public static void main(String[] args) {
		������ s=new ������();
		s.start();
		System.out.println(s.ans);
	}
	int N=20;
	int ans=0;
	int list[]=new int[N+2];
	private void start() {
		// TODO �Զ����ɵķ������
		list[1]=1;
		find(2);
		//��Ϊ�ǻ��ε�  ������1��λ��Ϊ��
		/*for(int a=1;a<=N;a++){
			list[1]=a;
			find(2);
		}*/
	}
	public void find(int i){
		if(i>N){
			//print();
			ans++;
			return;
		}
		for(int a=1;a<=N;a++){
			list[i]=a;
			if(check(i)){
				find(i+1);
				list[i]=0;
			}
		}
	}
	private void print() {
		// TODO �Զ����ɵķ������
		for(int a=0;a<list.length;a++){
			System.out.print(list[a]+" ");
		}
		System.out.println();
	}
	private boolean check(int i) {
		if(i==N&&(!susu(list[i]+list[1]))){
			return false;
		}
		if(!susu(list[i-1]+list[i])){
			return false;
		}
		for(int a=1;a<i;a++){
			if(list[a]==list[i]){
				return false;
			}
		}
		return true;
	}
	//�ж�i �Ƿ�Ϊ����
	private boolean susu(int i) {
		int n=(int) Math.sqrt(i)+1;
		for(int a=2;a<=n;a++){
			if(i%a==0){
				return false;
			}
		}
		return true;
		
	}
}
