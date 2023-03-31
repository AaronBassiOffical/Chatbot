import java.util.Scanner;
import java.util.Random;
import java.io.*;

class interests 
{
	String genre1;
	
	String response1;
	
	String genre2;
	
	String response2;
	
}

class questions
{
	String question1;
	
	String question2;
	
	String question3;
	
	String question4;
	
	String question5;
	
	String question6;
}

    

public class chatbot 
{

	public static void main (String [] Args) throws IOException 
	{
		read_line();
		compilation();
		
	}
	
	public static String inputstring(String message)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		System.out.print(message);
		
		answer= keyboard.nextLine();
		
		return answer;
	
	}
	
	public static void compilation() 
	{
		
		Choice();
	}
	
	//level 1
	public static void intro()
	{
		String answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Chatbot: Hello I'm a chatbot how are you? ");
		
		System.out.print("User: ");
		
		answer = keyboard.nextLine();
		
		System.out.println("");
		
		if (answer.equals("Goodbye") | answer.equals("Got to go"))
		{
			System.out.println("Chatbot: Goodbye!");
			System.exit(0);
		}
	}
	
	//level 2
	public static void chatbot_interests()
	{
		System.out.print("Chatbot: I'm interested in films. ");
		
		System.out.println("");
		
		System.out.println("");
	}
	
	public static String chatbot_interest_question(String interest)
	{
		String film_interest;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Chatbot: What type of films are you interested in? ");
		
		System.out.print("User: ");
		
		film_interest=keyboard.nextLine();
		
		System.out.println("");
		
		if (film_interest.equals("Goodbye") | film_interest.equals("Got to go"))
		{
			System.out.println("Chatbot: Goodbye!");
			System.exit(0);
		}
		
		return film_interest;	
	}
	
	public static String chatbot_repeat_answer(String genre)
	{
		String interest=("");
        
		String film_interest;
        
		film_interest=chatbot_interest_question(interest);
        
		if (film_interest.equals("Goodbye") | film_interest.equals("Got to go"))
        {
			System.out.println("Chatbot: Goodbye!");
        	System.exit(0);
        }
        else
        {
        	System.out.println("Chatbot: So you like "+ film_interest + " films");
        }
       
        
        return film_interest;
	}
	
	

	//this method contains the main bulk of the other methods which is what will be run in the main method and uses a loop which will exit the program if the user types goodbye
	public static void Choice() 
	{
		interests i  = new interests();
		i.response1=("Chatbot: They scare me so much you must be brave!");
		i.response2=("Chatbot: Those are my favourtie genre of movies!");
		i.genre1=("horror");
		i.genre2=("action");
		
		
		intro();	
		
		while (true)
		{
				
			chatbot_interests();
			
			
			String interest=("");
			
			String genre;
			
			genre=chatbot_repeat_answer(interest);
			
			if (genre.equals("Goodbye") | genre.equals("Got to go"))
			{
				System.out.println("Chatbot: Goodbye!");
				break;
			}
			else
			{
				if (genre.equals("horror") | genre.equals(i.genre1))
				{
					System.out.println("");
					
					
					System.out.println("");
					
					System.out.println(i.response1);
					
					System.out.println("");
					System.out.println("Chatbot name your 5 favourite horror films:");
					
					array_input();
					
					System.out.println("");
				}
				else if  (genre.equals("action") | genre.equals(i.genre2))
				{
					System.out.println("");
					
					System.out.println(i.response2);
					
					System.out.println("");
					System.out.println("Chatbot: name your 5 favourite action films:");
					array_input();
					
					System.out.println("");
				}
				
				else
				{
					
					
					trigger_response();
				
				}
				
			}
			
	
		}
			
	}
	
	//getters and setters which will be used for the questions asked in the trigger response method below
	public static String getquestion1(questions at)
	{
		return at.question1;
		
	}
	
	public static String getquestion2(questions at)
	{
		return at.question2;
		
	}
	
	public static String getquestion3(questions at)
	{
		return at.question3;
		
	}
	
	public static String getquestion4(questions at)
	{
		return at.question4;
		
	}
	
	public static String getquestion5(questions at)
	{
		return at.question5;
		
	}
	
	public static String getquestion6(questions at)
	{
		return at.question6;
		
	}
	
	public static questions setquestion1(questions at, String question1)
	{
		at.question1=question1;
		return at;
		
	}
	
	public static questions setquestion2(questions at, String question2)
	{
		at.question2=question2;
		return at;
		
	}
	
	public static questions setquestion3(questions at, String question3)
	{
		at.question3=question3;
		return at;
		
	}
	
	public static questions setquestion4(questions at, String question4)
	{
		at.question4=question4;
		return at;
		
	}
	
	public static questions setquestion5(questions at, String question5)
	{
		at.question5=question5;
		return at;
		
	}
	
	public static questions setquestion6(questions at, String question6)
	{
		at.question6=question6;
		return at;
		
	}
	//these questions are asked to the user on a loop
	public static void trigger_response()
	{
		questions films = new questions();
		

		while (true)
		{
			System.out.println("");
		
			films=setquestion1(films, inputstring("Chatbot: Who is your favorite actor?"));	
			
			if (getquestion1(films).equals("stop"))
			{
				break;
			}
			
			
			if (getquestion1(films).equals("ryan reynolds"))
		
			{
				System.out.println("");
				random_response_question1();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
		
	
			System.out.println("");
	
			films=setquestion2(films,inputstring("Chatbot: Whats your favourie film? "));
			
			if (getquestion2(films).equals("stop"))
			{
				break;
			}
			
			if (getquestion2(films).equals("james bond"))
		
			{
				System.out.println("");
				random_response_question2();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
			
			
		
			System.out.println("");
		
			films=setquestion3(films,inputstring("Chatbot: who is your favourite actress?"));
			

			if (getquestion3(films).equals("stop"))
			{
				break;
			}
			
			if (getquestion3(films).equals("gal gadot"))
		
			{
				System.out.println("");
				random_response_question3();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
			
		
			System.out.println("");
		
			films=setquestion4(films,inputstring("Chatbot: Whos your favourite superhero? "));
			

			if (getquestion4(films).equals("stop"))
			{
				break;
			}
		
			
			if (getquestion4(films).equals("batman"))
		
			{
				System.out.println("");
				random_response_question4();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
			
		
			System.out.println("");
			
			films=setquestion5(films,inputstring("Chatbot: Do you like marvel or dc? "));
			
			if (getquestion5(films).equals("stop"))
			{
				break;
			}
			
			if (getquestion5(films).equals("marvel"))
		
			{
				System.out.println("");
				random_response_question5();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
			
			
		
			System.out.println("");
		
			films=setquestion6(films,inputstring("Chatbot: whats your favourite anime? "));
			
			if (getquestion6(films).equals("stop"))
			{
				break;
			}
			
			if (getquestion6(films).equals("naruto"))
		
			{
				System.out.println("");
				random_response_question6();
				System.out.println("");
		
			}
			else
			{
				System.out.println("");
				System.out.println("Chatbot: I dont know how to respond to that");
			}
			
			
			
			
		}
		
	
	}
	
		
	//pre made responses for the questions above which will j=use a diceroll to use on of the responses from the array randomly 
	
	public static void random_response_question1()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: hes so cool i really like him");
		
		responses[1]=("Chatbot: i dont like him all that much");
		
		responses[2]=("Chatbot: im a big fan of him in deadpool");
		
		responses[3]=("Chatbot: have you watch his new film red notice? its really good");
		
		responses[4]=("Chatbot: i like the rock");
		
		responses[5]=("Chatbot: he was super funny as pikachu");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}
	
	public static void random_response_question2()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: i think superman returns is better");
		
		responses[1]=("Chatbot: i can wait for the new film in 2022");
		
		responses[2]=("Chatbot: i love christian bale as batman");
		
		responses[3]=("Chatbot: i wonder when dc will make a good film ");
		
		responses[4]=("Chatbot: its ben so long since we had a new batman film");
		
		responses[5]=("Chatbot: i have no idea what film that is");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}
	
	public static void random_response_question3()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: i like her as wonder woman ");
		
		responses[1]=("Chatbot: i like jennifer lawrence more");
		
		responses[2]=("Chatbot: i like emma stone in spiderman more");
		
		responses[3]=("Chatbot: i think she was so good in red notice ");
		
		responses[4]=("Chatbot: i havent seen any of her films before");
		
		responses[5]=("Chatbot: she is so cool im a big fan of her");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}
	
	public static void random_response_question4()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: i think superman is better");
		
		responses[1]=("Chatbot: i think the flash is better");
		
		responses[2]=("Chatbot: i like grenn lantern more");
		
		responses[3]=("Chatbot: the avengers are my favourite superhero group ");
		
		responses[4]=("Chatbot: bro i dont even know what to say");
		
		responses[5]=("Chatbot: im not sure who my favourite is");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}
	
	public static void random_response_question5()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: i prefer marvel more");
		
		responses[1]=("Chatbot: dc films are not as good as marvel films");
		
		responses[2]=("Chatbot: the avengers are better than the justice league");
		
		responses[3]=("Chatbot: i wonder when dc will make a good film");
		
		responses[4]=("Chatbot: i think spiderman is more popular than batman or superman");
		
		responses[5]=("Chatbot: i like both of them equally");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}
	
	public static void random_response_question6()
	{
			
		String[] responses = new String [6];
		
		responses[0]=("Chatbot: that is one of my favourtie animes too");
		
		responses[1]=("Chatbot: i like dragon ball z more");
		
		responses[2]=("Chatbot: the naruto games are so good too i love playing them");
		
		responses[3]=("Chatbot: one piece is good too you should watch it");
		
		responses[4]=("Chatbot: i think animes are better than superheroes");
		
		responses[5]=("Chatbot: sasuke is my favourtie character from the show");
		
		
		int dice_roll=0;
		
		int random_number;
		
		random_number=dice_roll(dice_roll);
		
		System.out.print(responses[random_number]);
				
	}


	public static int dice_roll(int dice_roll)
	{
		Random dice = new Random();
		
		int roll;
		
		roll=dice.nextInt(6)-1;
		
		return roll;
	}

	
//level 7	
	public static void array_input()
	{
		String films [] = new String [6];
		films[0]=("");
		for (int i=1; i<6; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			
	
			System.out.print("User: ");
			films[i]=keyboard.nextLine();
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.println("This is how i rate the films you said from best to worst:");
		
		bubbleSort(films);
		
		
	}
	
	
	public static void bubbleSort(String films[])
	{
		String temp;
	
		for (int j = 0; j < films.length; j++)
		{
			for (int i = j + 1; i < films.length; i++) 
			{
		   		   if (films[i].compareTo(films[j]) < 0) 
				
		   		   {
					
		   			   temp = films[j];
					
		   			   films[j] = films[i];
					
		   			   films[i] = temp;
				
				
		   		   }
			   
			}
			System.out.println(films[j]);   	   
		}
	
	}
	
//level 8
	public static void fileoutput() throws IOException
	{
		PrintWriter outputStream = new PrintWriter(new FileWriter("intro.txt"));
		
		outputStream.println("Chatbot: Calibrating...");
		outputStream.println("Chatbot: Almost done...");
		outputStream.println("Chatbot: Calibration complete!");
	   
		outputStream.close();
	    
	}
	
	public static void read_line() throws IOException
	{
		BufferedReader inputStream = new BufferedReader(new FileReader("intro.txt"));
		
		String a = inputStream.readLine();
		System.out.println(a);
	       
		String b = inputStream.readLine();
	        
		System.out.println(b);
	        
		String c = inputStream.readLine();
		System.out.println(c);

	
		inputStream.close();
	        
	    
	}
	
}
