package BasicsOfJava;

public class LoopConcept {

	public static void main(String[] args) {

	//1. while loop
	// Disadv : It will generate infinite loop if you don't give incremental/decremental part
		
		int i =1; //initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1; //incremental/decremental	
		
		}
		
		System.out.println("*********");

		
	// j++ means j=j+1
		
	//2.For Loop
		
		for(int j=1;j<=10;j++) { //initialization ; conditional ; incremental
			System.out.println(j);	
		}
	
	System.out.println("*********");
	
	//print 10 to 1
	//k-- means k=k-1
	//10,9,8,7,6,5,4,3,2,1
	//-1>-10 : true
	//1>10 :false

		for(int k=10;k>=1;k--) { //initialization ; conditional ; decremental
			System.out.println(k);	
		}
		
	}

}
