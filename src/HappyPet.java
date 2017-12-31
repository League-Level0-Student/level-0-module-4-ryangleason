//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	static int happiness = 0;
	//    Initialize to zero.

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String petkind = JOptionPane.showInputDialog("What kind of pet do you want to buy??");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
for (int i = 0; i < 5; i++) {
	
int option = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happiness options", JOptionPane.CANCEL_OPTION, JOptionPane.OK_OPTION, null, new String[] { "Pet", "Feed" ,"Play","Kick","Ignore"}, null);
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			if (option==0) { pet(petkind);
			happiness +=10;
			}
			if (option==1) { Feed(petkind);
			happiness +=5;
			}
			if (option==2) { Play(petkind);
			happiness +=15;
			}
			if (option==3) { Kick(petkind);
			happiness -=40;
			}
			if (option==4) { Ignore(petkind);
			happiness -=10;
			}
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happiness>25) {
			JOptionPane.showMessageDialog(null, "Your " + petkind + " loves you and they will not kill you in your sleep (Hooray!)");
			}
			if(happiness<25) {
				JOptionPane.showMessageDialog(null, "Your " + petkind + " hates you and they will kill you in your sleep (Nooooooo)");
				}
	}
	
	
 //	 4. Create methods to handle each of your user selections.
	static void pet (String petType) {
		JOptionPane.showMessageDialog(null,  petType+ " likes to be pet! +10 happiness :3");
		
	}
	static void Feed (String petType) {
		JOptionPane.showMessageDialog(null,  petType+ " is not hungry but likes the offer +5 happiness :3");
		
	}
	static void Play (String petType) {
		JOptionPane.showMessageDialog(null,  petType+ " Loves to play, but will tire you out before it gets tired +15 happiness :3");
		
	}
	static void Kick (String petType) {
		JOptionPane.showMessageDialog(null,  petType+ " goes flying and clearly hates your guts -40 happiness 3:< ");
		
	}
	static void Ignore (String petType) {
		JOptionPane.showMessageDialog(null,  petType+ " doesn't like to be ignored and makes quiet a racket-10 happiness :/ ");
		
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
