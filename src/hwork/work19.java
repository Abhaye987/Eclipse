package hwork;

public class work19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.println("Armstrong numbers between 1 and 500:");

		        for (int i = 1; i <= 500; i++) {
		            if (isArmstrong(i)) {
		                System.out.println(i);
		            }
		        }
		    }
                public static boolean isArmstrong(int num) {
		        int originalNum, remainder, result = 0, n = 0;

		        originalNum = num;

		        while (originalNum != 0) {
		            originalNum /= 10;
		            ++n;
		        }

		        originalNum = num;
                    while (originalNum != 0) {
		            remainder = originalNum % 10;
		            result += Math.pow(remainder, n);
		            originalNum /= 10;
		        }

		        return result == num;
		    }
}
