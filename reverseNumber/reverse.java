public class reverse{
public static void main(String[] args){
int[] a = {1,2,3,4,5};

int p=4;
for(int i=0;i<2;i++){
	int x=a[i];
	int y=a[p];
	int temp=y;
	
	a[p]=x;
	a[i]=y;
	
	x=temp;
	
	p--;
	
	
}
for(int j = 0 ; j <a.length;j++){
	System.out.print(a[j]);
}

}

}