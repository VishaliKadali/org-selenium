package javachallenge;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="PyramidIndiaPyramidNoida";
			
			str=str.replaceAll("Pyramid","");
			String result=str.substring(0, 5) + " " +str.substring(5);
			System.out.println(result);
	}

}
