package other.lanqiaobei;

import java.math.BigDecimal;

/*
 *    ����һ�������ܴ������ʹ��Ӹߵ���ǰһλ�ܱ�1������ǰ2λ�ܱ�2������������ǰnλ�ܱ�n������
*/
public class ����߾������� {
	
	public static void main(String[] args) {
		new ����߾�������().start();
		BigDecimal bg=new BigDecimal("123.123");
		
		
	}
	
	private int A[]=new int[200];
	private int B[]=new int[200];
	int  i,j,k,n,r;
	public void start(){
		 A[1]=1;
		 for(i=2;i<=100;i++) A[i]=0;  //�ó�ֵ:��λΪ1,����Ϊ0
		  n=1;   i=1;
		  while(A[1]<=9)
		  {
		    if (i>=n)    //�����и�������������ĸ߾�������
		    {
		        n=i;               //ת�浽����B��
		        for (k=1;k<=n;k++)   B[k]=A[k];
		    }
		     i=i+1;r=0;
		     for(j=1;j<=i;j++)     //����iλ�Ƿ���������
		        r=r*10+A[j];
		     r=r%i;
		     if(r!=0)               //������������
		      {
		        A[i]=A[i]+i-r ;      //��iλ���ܵĽ�
		        while (A[i]>9 && i>1)  //�������iλ��,���ݵ�ǰһλ
		        {
		            A[i]=0;  i=i-1;  A[i]=A[i]+i;

		        }
		      }
		   }
		   for(int a=0;a<100;a++){
		       System.out.print(B[a]);
		   }
		}
		
		
	
	private void copy() {
		// TODO �Զ����ɵķ������
		for(int a=0;a<B.length;a++){
			A[a]=B[a];
		}
	}
}
