package first;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input a sentence in 1 action,all words separated by spaces & reverse sent.
		
		/*String str=JOptionPane.showInputDialog("write a sentence");
		String[] arr=str.split(" ");
		String str1="";
		for(int i=arr.length-1;i>=0;i--) {
			str1+=arr[i]+" ";
		}
		str=str1;
		System.out.println(str); */
		//input a sent.in 1 action,all words separated by spaces & switch
		//to capital first letter if it's lowerCase
		
		/*String sent=JOptionPane.showInputDialog("write a sentence");
		char[] ch=sent.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		for(int i=0;i<ch.length;i++) {
			if(i==0) {Character.toUpperCase(ch[i]);}
			else if((ch[i]==' ')&&(Character.isLowerCase(ch[i+1]))){
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		sent=sent.copyValueOf(ch);
	    System.out.println(sent); */
		//find all primary nums in series
		/*int[] nums= {1,2,3,4,5,6,7,8,9,10};
		int[] nums2=nums.clone();
		for(int j=2;j<10;j++) {
		for(int i=0;i<nums.length;i++) {
			if((nums[i]%j==0)&&(j!=nums[i])) {
				nums2[i]=0;
			}
		}
		}
		for(int a=0;a<nums2.length;a++) {
			if(nums2[a]!=0) {
				System.out.print(nums2[a]);
			}
		}*/
		//nums 10-20:find non primaries & write with their dividers
		/*int[] arr1=new int[10];
		for(int j=2;j<10;j++) {
		for(int i=0;i<arr1.length;i++) {  //initialising array
			arr1[i]=i+10;
			if((arr1[i]%j==0)&&(j!=arr1[i])) {
				System.out.println(String.format("the nonprimary: %s by %s & %s",arr1[i],j,arr1[i]/j));
			}*/
		
	     //a series of 5 random nums 1-50.for each check if primary & if not 
		//write the dividers.output in array,not in printing
		 int[] nums=new int[5];
		 int[] div=new int[20];
		 int[] nonprim=new int[10];
		 int a=0;
		 int z=0;
		 for(int j=2;j<10;j++) {
		 for(int i=0;i<nums.length;i++) {
			 nums[i]=(int)Math.round((Math.random()*49+1));
			 if((nums[i]%j==0)&&(j!=nums[i])) {
					div[a]=(nums[i]/j);
					div[a+1]=j;
					a=a+2;
					nonprim[z]=nums[i];
					z++;
			 }
		 }
		 }
		 a=0;
		 for(int b=0;b<nonprim.length;b++) {
			 if(nonprim[b]!=0) {
			 System.out.println("non primary: "+nonprim[b]+" "+div[a]+" "+div[a+1]);
		     a=a+2;
			 }
		 }
	}
	}
	

