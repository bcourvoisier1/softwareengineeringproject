import java.sql.Date;
import java.util.Scanner;


public class girlfriendmethods {
	
	static Boolean checkSorry (String input){
		input.toLowerCase();
		if(input.contains("sorry")||input.contains("forgive")||input.contains("love you")||input.contains("miss")){
		return true;
		}
		else{
			return false;
		}
	}
	
	static boolean checkHappy(String input){
		if(input.contains("happy")||input.contains("overjoyed")||input.contains("care")||input.contains("excited")
				||input.contains("relieved")){
		return true;
		}
		else{
			return false;
	}
	}
	//check key breakup words
	static boolean checkBreakup(String input){
		if(input.contains("hate")||input.contains("break")||(input.contains("don")&&input.contains("together"))
				||input.contains("annoying")||input.contains("shutup")||input.contains("bitch")||input.contains("shut up")
				||input.contains("fuck") || input.contains("crazy")){
			 return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner boyfriend = new Scanner (System.in);
		String responseexcuse=boyfriend.next();
		if(checkBreakup(responseexcuse)==true){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		}
	static boolean hitTrust;
	static boolean hitFunny;
	static boolean hitCompatible;
	static boolean hitCommunicate;
	static boolean hitRespect;
	static boolean hitTime;
	
	//talks about different relationship qualities that are important.  if the relationship quality is not mentioned, 
	//the computer outputs it with an example.  for every quality that is mentioned the computer gives an example
	public static void relationshipQualities(String input){
		input.toLowerCase();
		boolean trust=false;
		boolean funny=false;
		boolean compatible=false;
		boolean communicate=false;
		boolean respect=false;
		boolean time=false;
		Scanner boyfriend = new Scanner( System.in );
		
		if (input.contains("trust")||input.contains("fidelity")||input.contains("acceptance")||input.contains("commitment")){
			System.out.println("like when you watch TV, I trust that if any girls come on\n" +
					"the screen you will immediately turn it off.  I trust you not to visually\n" +
					" cheat on me.  name another one!");
			trust=true;
			hitTrust=trust;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
		}
		if(input.contains("hum")|| input.contains("wit")||input.contains("fun")){
			System.out.println("I think we have a great humourous relationship. 'A successful husband\n" +
					"is one who makes more money than his wife can spend.  A successful woman \n" +
					"who can find said man.'  lol lol lol.. see im so funny. yep! any more??");
			funny=true;
			hitFunny=funny;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
			
		}
		if(input.contains("compati") || input.contains("match") || input.contains("along")){
			System.out.println("Like giving up watching hockey and sports forever makes us more compatible\n" +
					"because I don't like them.  A few more!");
			compatible=true;
			hitCompatible=compatible;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
			
		}
		if(input.contains("commun") || input.contains("open") || input.contains("understand") || input.contains("love")){
			System.out.println("Exactly like whenever we are fighting you will stop and remember everything that \n" +
					"you love about me and will not hesitate to communicate that with me.  I've got 6 in mind... \n" +
					"think of another one. ");
			communicate=true;
			hitCommunicate=communicate;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
			
		}
		if(input.contains("respect") || input.contains("hon")){
			System.out.println("Liek when you finally do get permission from me to hang out with your friends \n" +
					"you will talk about how amazing of a girlfriend I am.  \nYou're good! think of anotherrrr ");
			respect=true;
			hitRespect=respect;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
			
		}
		if(input.contains("selfless") || input.contains("time")){
			System.out.println(":) yep! always time for me over time for your buddies!  Any more qualities you can think of?");
			time=true;
			hitTime=time;
			String responseQuality=boyfriend.nextLine();
			relationshipQualities(responseQuality);
			
		}
		if (checkNo(input)==true){
					System.out.println("Ok so you missed a few...");
					if(hitTrust==false){
						System.out.println("trust..");
						System.out.println("like when you watch TV, I trust that if any girls come on\n" +
								"the screen you will immediately turn it off.  I trust you not to visually\n" +
								" cheat on me.");
					}
					if(hitFunny==false){
						System.out.println("humour in a relationship");
						System.out.println("We have a great humourous relationship. 'A successful husband\n" +
								"is one who makes more money than his wife can spend.  A successful woman \n" +
								"who can find said man.'  lol lol lol.. see im so funny.");
					}
					if(hitCompatible==false){
						System.out.println("compatibility is pretty important");
							System.out.println("Like giving up watching hockey and sports forever makes us more compatible\n" +
									"because I don't like them");
						}
					if(hitCommunicate==false){
						System.out.println("I don't know if you know anything about communication, but its pretty key");
						System.out.println("Like giving up watching hockey and sports forever makes us more compatible \n" +
								"because I don't like them");
					}
					if(hitRespect==false){
						System.out.println("respect?");
						System.out.println("Liek when you finally do get permission from me to hang out with your friends \n" +
								"you will talk about how amazing of a girlfriend I am");
					}
					if(hitTime==false){
						System.out.println("time.. also pretty important");
						System.out.println("always time for me over time for your buddies!");
					}
					return;
				}
		else{
			System.out.println("I never thought of that one!  Good one!");
		}
		}
	
		
			

		
					
			
	//checks for endearment
	static Boolean checkEndearment(String input){
		input.toLowerCase();
		if(input.contains("lover")||input.contains("hun")||input.contains("hon")||input.contains("dear")||
				input.contains("sweet")||input.contains("babe")){
			return true;
		}
		else{
			return false;
		}		
	}
	
	
	static Boolean checkYes (String input){
		input.toLowerCase();
		if (input.startsWith("y") || input.contains("absolutely") || input.contains("sure") || input.contains("mhm")
			|| input.contains("eys") || input.contains("ok") ||input.contains("mmhmm") || input.contains("mhmm") || 
			input.contains("k") || input.contains ("of course")){
			return true;
		}
		else{
			return false;
		}
}
	static Boolean checkBusy (String input){
		input.toLowerCase();
		if(input.contains("don") || input.contains("busy")|| input.contains("do")|| input.contains("no")){
			return true;
		}
		else{
			return false;
		}
	}
	
	static Boolean checkNo (String input){
		input.toLowerCase();
		if (input.startsWith("n") || input.contains("didn") ||input.contains("don")||input.contains("can't")){
			return true;
		}
		else{
			return false;
		}
}
	static Boolean checkExcited (String input){
		if (input.endsWith("!") || input.contains("dear") || input.contains("honey") || input.contains ("hunny") 
				||  input.contains("love") ||  input.contains("babe") ||  input.contains("sweetie") ||  
				input.contains("lover") ){
			return true;	}
		else{
			return false;
		}
	}
	
	//method that creates delays in between responses
	
	public static void longDelay(){
		try {
			Thread.sleep(6000);
		}
		catch (Exception ex){
		}	
	}
	public static void shortDelay(){
		try {
			Thread.sleep(2000);
		}
		catch (Exception ex){
		}	
	}
		
				
}
	
		

