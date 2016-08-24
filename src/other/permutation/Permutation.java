package other.permutation;



//http://blog.csdn.net/hackbuteer1/article/details/6657435
/**
 * �ݹ�ʵ��ȫ����  recursion
 * @author duang
 *
 */
public class Permutation {
	public void start(){
		String str="123456789";
		System.out.println(str+"��ȫ����Ϊ��");
		recursion(str, 0, str.length()-1);
		
	}
	/**
	 * �ݹ�ȫ����
	 * @param strin	�ַ���	
	 * @param begin	�ݹ鿪ʼ���
	 * @param end	�������
	 */
	public void recursion(String strin,int begin,int end){
		char[] str=strin.toCharArray();
		if(begin==end){
			System.out.println(strin);
		}else {
			for(int i=begin;i<=end;i++){
				char swap=str[i];
				str[i]=str[begin];
				str[begin]=swap;
				recursion(new String(str), begin+1, end);
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Permutation().start();
	}
}
