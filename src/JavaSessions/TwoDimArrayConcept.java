package JavaSessions;

public class TwoDimArrayConcept {

	public static void main(String[] args) {

//		int i[];
//		i = new int[4];
//		
//		int l[] = new int[40];

		int myNum[][] = {
						{1,2,3,4},
						{10,20,30,40,50},
						{100,200,300,400,500,600},
						{2,3}
						};
		
		
		for(int i=0; i<myNum.length; i++) {
			for(int j=0; j<myNum[i].length; j++) {
				System.out.print(myNum[i][j] + " ");
			}
			System.out.println();			
		}
		
		System.out.println("-------");
		
		//for each:
		for(int e[] : myNum) {
			for(int p : e) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------");

		
		
		///
		int data[][] = new int[4][5];
		data[0][0] = 10;
		data[0][1] = 20;
		//data[4][5] = 100;

		//System.out.println(data[0][5]);
		
		
		
		
	}

}
