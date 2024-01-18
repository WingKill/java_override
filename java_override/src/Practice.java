import java_test.Box;

public class Practice {

	public static void main(String[] args) {
		Box[] ar = new Box[5];
        ar[0] = new Box(101, "Coffee");
        ar[1] = new Box(202, "Computer");
        ar[2] = new Box(303, "Apple");
        ar[3] = new Box(404, "Dress");
        ar[4] = new Box(505, "Fairy-tale book");

        // 배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
        for(Box e: ar) {
           if(e.getBoxNum() == 505)
              System.out.println(e);
        }
        System.out.println();
        
        int[][] arr = {
	        {11},
	        {22, 33},
	        {44, 55, 66}
	    };
        // 개수 세보기.
        int count2 = 0;
        for(int[] i : arr ) {
        	for(int j : i) {
        		count2++;
        	}
        }
        
        System.out.println(count2);
        System.out.println();
        
        for(int i = 0; i < arr.length ; i++) {
        	for(int j = 0; j< arr[i].length ; j++) {
        		System.out.print(arr[i][j] +"\t");
        	}
        	System.out.println();
        }
        System.out.println();
        
        int[][] arr2 = new int[4][4];
        int num = 1;
        for(int i = 0; i < arr2.length ; i++) {
        	for(int j = 0; j< arr2[i].length ; j++) {
        		arr2[i][j] = num++;
        		System.out.print(arr2[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        // 초기화
        for(int i = 0; i < arr2.length ; i++) {
        	for(int j = 0; j< arr2[i].length ; j++) {
        		arr2[i][j] = 0;
        	}
        }
        
        // 배열 내에 값이 리턴된 
        int count1 = 0;
        for(int[] i : arr2 ) {
        	for(int j : i) {
        		count1++;
        	}
        }
                
        num = 0;
        
        for(int i = 0; i < arr2.length ; i++) {
        	for(int j = 0; j< arr2[i].length ; j++) {
        		arr2[i][j] = count1 - num;
        		num++;
        		System.out.print(arr2[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
