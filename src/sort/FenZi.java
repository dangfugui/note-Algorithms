package sort;

import java.util.Arrays;

/**
 * 分治排序 git1
 * @author dang
 */
public class FenZi {
	public static void main(String[] args) {
		FenZi f=new FenZi();
		int array[]={1,4,7,5,23,6,4,7};
		f.mergeSort(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+",");
		}
	}
	//分治
	public void mergeSort(int[]array,int start,int end){
		if(start<end){
			int half=(end+start)/2;
			mergeSort(array,start,half);//递归调用
			mergeSort(array,half+1,end);//递归调用
			merge(array,start,half,end);//合并
		}
	}
	/*
	 * 合并
	 */
	private  void merge(int[] array, int start, int half, int end) {
		//System.out.println(start+"-"+half+"-"+end);
		
		int[] part1 = Arrays.copyOfRange(array,start,half+1);
		int[] part2= Arrays.copyOfRange(array,half+1,end+1);
		int p1=0,p2=0;
		for(int i=start;i<=end;i++){
			if(p1<part1.length&&p2<part2.length){
				if(part1[p1]<part2[p2]){
					array[i]=part1[p1];
					p1++;
				}else{
					array[i]=part2[p2];
					p2++;
				}
			}else if(p1<part1.length&&p2>=part2.length){
				array[i]=part1[p1];
				p1++;
			}else if(p2<part2.length&&p1>=part1.length) {
				array[i]=part2[p2];
				p2++;
			}else {
				System.out.println("error");
			}
		}
	}
}
/*
分治方法思想：将原问题分解为几个规模较小但类似于原问题的子问题，递归求解这些这子问题，然后合并这些子问题的解来建立原问题的解
每层递归的步骤：
1 分解原问题为若干子问题
2 解决这些子问题，递归地求解各个子问题
3 合并这些子问题的解
 */
