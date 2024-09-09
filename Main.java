public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(triangleType(2,2,2)); //should be 1
		System.out.println(triangleType(2,4,4)); //should be 2
		System.out.println(triangleType(2,3,4)); //should be 3
	}
	
	public static int triangleType(int s1, int s2, int s3) {
	    if (s1 == s2 && s2 == s3) {
	        return 1; //if all sides are equal, return 1 for equilateral 
	    }
	    else if (s1 == s2 || s2 == s3 || s3 == s1) {
	        return 2; //if only 2 sides are equal, return 2 for isoceles        
	    }
	    else if (s1 != s2 && s2 != s3 && s3 != s1) {
	       return 3; //if all sides are diff, return 3 for scalene
	    }
	    else {
	        return 4; //if none of the above are applicable, return 4 for invalid
	    }
	    
	}
}
