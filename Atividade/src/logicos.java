
public class logicos {
	
	public static void main(String args[]){
		int x=6,y=5,z=7,a=3;

		
		//and
		if (x > y && x <z){
			System.out.printf("%s %s %s %s %s %n",x,"É maior q:",y,"e é menor q:",z,"/n");
		}
		
		//or
		if (x > y || x <z){
			System.out.printf("%s %s %s %s %s %n",x,"É maior q:",y,"ou é menor q:",z,"/n");
		}
		
		//not
		if (!(x < a)){
			System.out.printf("%s %s %s",x,"É maior q:",a);
		}
		
		
	
	}
		

}


