package sort;

import java.util.Arrays;

//该算法是采用分治法u
public class 归并 {
	public static void main(String[] args) {
		归并 g=new 归并();
		int [] array={3,5,7,1};
		g.sort(array,0,array.length-1);
		for(int a:array){
			System.out.println(a+",");
		}
	}

	public void sort(int[] array, int start, int end) {
		if(start<end){
			int half=(start+end)/2;
			sort(array,start,half);
			sort(array,half+1,end);
			Merge(array,start,end);
		}
	}

	private void Merge(int[] array, int start, int end) {
		int half=(start+end)/2;
		int[] part1 = Arrays.copyOfRange(array,start,half+1);
		int[] part2 = Arrays.copyOfRange(array,half+1,end+1);
		int p1=0,p2=0;
		for(int i=start;i<=end;i++){
			if(p1<part1.length&&p2<part2.length){
				if(part1[p1]<part2[p2]){
					array[i]=part1[p1++];
				}else {
					array[i]=part2[p2++];
				}
			}else if(p1<part1.length){
				array[i]=part1[p1++];
			}else if(p2<part2.length){
				array[i]=part2[p2++];
			}
		}
	}

	
}
