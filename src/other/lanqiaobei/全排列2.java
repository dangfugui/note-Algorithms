package other.lanqiaobei;

public class ȫ����2 {
	char str[]={'1','2','3'};
	public static void main(String[] args) {
		ȫ����2 q=new ȫ����2();
		q.run();
	}
	public void run(){
		tree(0);
	}
	public void tree(int i){
		if(i>=str.length){
			for (int j = 0; j < str.length; j++) {
				System.out.print(str[j]+",");
			}
			System.out.println();
			return;
		}
		for (int a = i; a < str.length; a++) {
			char z=str[i];
			str[i]=str[a];
			str[a]=z;//����
			tree(i+1);
			z=str[i];
			str[i]=str[a];
			str[a]=z;//����
		}
	}
}
