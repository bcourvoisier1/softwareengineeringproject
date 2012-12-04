import java.util.Scanner;

public class happy extends girlfriendmethods {
	
	static int fight = 0;
	//all variables used by the output at the end of the conversation
	static String relationshipQuality;
	static String greeting;
	static Boolean hitgreeting = false;
	static Boolean hitBreakup = false;
	static String busy;
	static Boolean hitbusy = false;
	static Boolean hitforever = false;
	static String forever;
	static String celebcrush;
	static Boolean hitcrush = false;
	static Boolean hitmovie = false;
	static Boolean hitsand = false;
	static Boolean hitbuysomething = false;
	static Boolean hitbuyshoes = false;
	static Boolean hitforgotbirthday = false;
	static Boolean hitbreakup = false;
	//start of conversation
	public static void main(String[] args) {

		Scanner boyfriend = new Scanner(System.in);
		String response, responsequestion, responsetoday, responsePlace;

		System.out.println("Hi BFF (Best Boyfriend Forever) LOL.  How r u??");
		responsequestion = boyfriend.nextLine();
		greeting = responsequestion;
		if (checkBreakup(responsequestion) == true) {
			breakup();
		}
		if (responsequestion.contains("how")||responsequestion.endsWith("u") || responsequestion.endsWith("?")
				|| responsequestion.endsWith("you")) {
			System.out.println("I'm good!!! What are you doing today??");
			responsetoday = boyfriend.nextLine();
			if (checkBreakup(responsetoday) == true) {
				breakup();
			}
			System.out
					.println(" Okeee well I really want to hang out with you!!  Where will we meet?");
			responsePlace = boyfriend.nextLine();
			if (checkBreakup(responsePlace) == true) {
				breakup();
			}
			if (checkBusy(responsePlace) == true
					|| responsePlace.contains("can")) {
				ifBusy();
			} else {
				System.out.println("ok! great choice! I love it at "
						+ responsePlace);
				togetherForever();
			}
		} else {
			System.out.println("Aren't you goign to ask how I am?");
			responsetoday = boyfriend.nextLine();
			if (checkBreakup(responsetoday) == true) {
				breakup();
			}
			// fight 1
			if (checkNo(responsetoday) == true) {
				System.out
						.println("Fine, I'll ask myself how I am.  How are you today girlfriend???");
				fight++;
				hitgreeting = true;
				System.out
						.println("I'm good, thanks for asking!!! What are you doing today boyfriend??");
				responsetoday = boyfriend.nextLine();
				if (checkBreakup(responsetoday) == true) {
					breakup();
				}
				System.out
						.println(" Okeee well I really want to hang out with you!!  Where will we meet?");
				responsePlace = boyfriend.nextLine();
				if (checkBusy(responsePlace) == true
						|| responsePlace.contains("can")) {
					ifBusy();
				} else {
					System.out.println("Ok what time???");
					String responseTime = boyfriend.nextLine();
					if (checkBreakup(responseTime) == true) {
						breakup();
					}
					System.out.println("thats a perfect time!.. just like you");
					togetherForever();
				}
			} else {
				System.out
						.println("I'm good, thanks for asking!!! What are you doing today boyfriend??");
				responsetoday = boyfriend.nextLine();
				if (checkBreakup(responsetoday) == true) {
					breakup();
				}
				System.out
						.println(" Okeee well I really want to hang out with you!!  Where will we meet?");
				responsePlace = boyfriend.nextLine();
				if (checkBreakup(responsePlace) == true) {
					breakup();
				}
				if (checkBusy(responsePlace) == true
						|| responsePlace.contains("can")) {
					ifBusy();
				} else {
					System.out.println("Ok what time???");
					String responseTime = boyfriend.nextLine();
					if (checkBreakup(responseTime) == true) {
						breakup();
					}
					System.out
							.println("yep thats a perfect time.. just like you");
					togetherForever();
				}
			}

		}
	}
	//checks if the user wants to be together forever if not, then talks about commitment issues
	public static void togetherForever() {
		Scanner boyfriend = new Scanner(System.in);
		System.out
				.println("I just realized that we haven't seen eachother in 17 hours OMGZZ");
		System.out
				.println("I know we've only been together for like 10 days and 4 hours but I just want ");
		System.out
				.println("to be together forever don't you feel the same??!!");
		String responseForever = boyfriend.nextLine();
		forever = responseForever;
		if (checkBreakup(responseForever) == true) {
			breakup();
		}
		if (checkYes(responseForever) == true) {
			System.out
					.println("omg you make me the happiest girl in the world when you say things like that");
			twentyQuestions();
		}
		if (checkYes(responseForever) == false)
			System.out.println("haha are you kidding right now");
		responseForever = boyfriend.nextLine();
		if (checkBreakup(responseForever) == true) {
			breakup();
		}
		if (checkYes(responseForever) == true) {
			System.out.println("haha such a trickster!");
			twentyQuestions();
		} else {
			if (checkYes(responseForever) == false)
				;
			System.out.println("so you are seroius?");
			responseForever = boyfriend.nextLine();
			if (checkBreakup(responseForever) == true) {
				breakup();
			}
			if (checkYes(responseForever) == true) {
				// fight 2
				fight++;
				hitforever = true;
				System.out
						.println("Well I canÕt say that IÕm happy about that.\n"
								+ "  Why are we even together if you canÕt picture  a future together??");
				String responseFuture = boyfriend.nextLine();
				if (checkBreakup(responseFuture) == true) {
					breakup();
				}
				System.out
						.println("Ok, Ok, I get it.. maybe we should take things slower.. \n");
				System.out
						.println("I know I can come off a bit extreme sometimes");
				String responseExtreme = boyfriend.nextLine();
				if (checkBreakup(responseExtreme) == true) {
					breakup();
				}
				System.out
						.println("but at the same time.. you need to sort out your commitment issues aswell");
				String responseCommitment = boyfriend.nextLine();
				if (checkBreakup(responseCommitment) == true) {
					breakup();
				}
				if (checkNo(responseCommitment) == true) {
					System.out
							.println("You definitely have commitment issues.  It's ok, I believe that's\n"
									+ "why fate brought us together.. for me to help you through them");
					System.out
							.println("So lets play a game to get to know eachother better.. ");

				} else {
					System.out.println("So brave of you to admit your flaws");
					System.out
							.println("Lets try to play a game to work through your issues..");
				}

				twentyQuestions();

			} else {
				System.out.println("ok good i was worried!");
				System.out.println("But before we get married...");
				System.out
						.println("next year on the beach.. let's get to know eachother a little bit more.");
				twentyQuestions();
			}
		}
	}

	// fight 3
	//checks if the user is busy when girlfriend wants to hang out
	public static void ifBusy() {
		Scanner boyfriend = new Scanner(System.in);
		hitbusy = true;
		System.out.println("oh.. But you said we would hang out:(");
		String responseBusy = boyfriend.nextLine();
		if (checkBreakup(responseBusy) == true) {
			breakup();
		}
		if (checkBusy(responseBusy) == true || checkNo(responseBusy) == true) {
			System.out.println("You definitely did.  That's cool though...");
			System.out.println("umm so anyways...");
			fight++;
			System.out.println("Just a reminder...");
			togetherForever();
		} else {
			fight++;
			System.out.println("ok yeah its cool but just a reminder..");
			togetherForever();
		}

	}

	static String movie;
	static String crush;
	//series of questions that the user and computer get to know eachother better
	public static void twentyQuestions() {
		Scanner boyfriend = new Scanner(System.in);
		String responseTime, responsePlace;
		System.out
				.println("Let's play 20 questions.  I'm gonna ask the questions and then I'll answer");
		System.out.println("ok?!");
		String response20 = boyfriend.nextLine();
		if (checkBreakup(response20) == true) {
			breakup();
		}
		if (checkYes(response20) == false) {
			System.out.println("I know you mean yes hehe");
		} else {
			System.out.println("Ok yay!");
		}

		System.out.println("who's your celebrity crush?");
		String responsecrush = boyfriend.nextLine();
		if (checkBreakup(responsecrush) == true) {
			breakup();
		}
		crush = responsecrush;
		if (responsecrush.contains("you")) {
			System.out
					.println("wow, I LOVE YOU.  I also love Robert Pattinson.  Would marry him in a heartbeat");
			hitcrush = false;
		} else {
			hitcrush = true;
			System.out
					.println("oh? "
							+ responsecrush
							+ " really?  hmm.  well I am in LOVE with robert pattinson, obviously");
		}
		System.out.println("What's your favorite movie??");
		String responsemovie = boyfriend.nextLine();
		if (checkBreakup(responsemovie) == true) {
			breakup();
		}
		movie = responsemovie;
		if (responsemovie.contains("twilight")
				|| responsemovie.contains("new moon")
				|| responsemovie.contains("breaking dawn")
				|| responsemovie.contains("eclipse")) {
			hitmovie = false;
			System.out
					.println("WOW you are ACTUALLY the most perfect guy ever");
		} else {
			hitmovie = true;
			System.out
					.println("WHAT? Youre kidding, right? Twilight isn't your favorite movie? DO YOU WANT ME TO KILL MYSELF?");
			String responsesuicide = boyfriend.nextLine();
			if (checkBreakup(responsesuicide) == true) {
				breakup();
			}
			System.out
					.println("Hahaha.. you're so funny. I'm kidding.. kind of. It'll grow on you. I watch it everynight before bed, you'll be joining me");
		}

		System.out
				.println("What's your favorite highschool class of all time?");
		String responsehighschool = boyfriend.nextLine();
		if (checkBreakup(responsehighschool) == true) {
			breakup();
		}
		if (responsehighschool.contains("cook")
				|| responsehighschool.contains("home")) {
			System.out
					.println("WOW WE'RE THE SAME!! I love "
							+ responsehighschool
							+ "too!  We're"
							+ "learning how to make cookies right now.. I will be the best housewife ever ;) ;) ");
			System.out
					.println("...But don't ever say make me a sandwhich, cause that is SO sexist ");
			System.out.println("What's your fav food? ");
		} else {
			System.out.println("Hmm.. I dont really like  "
					+ responsehighschool
					+ " but that's ok!  I like cooking!! We're");
			System.out
					.println("learning how to make cookies right now.. I will be the best housewife ever ;) ;) ");

			System.out
					.println("...But don't ever say make me a sandwich, cause that is SO sexist ");
			System.out.println("What's your fav food??");
		}
		String responsefood = boyfriend.nextLine();
		if (checkBreakup(responsefood) == true) {
			breakup();
		}
		if (responsefood.contains("san")) {
			hitsand = true;
			fight++;
			mad();
		} else {
			hitsand = false;
			System.out
					.println("I caviar and escargot.  I hope ur taking notes :) What kind of TV do u watch?");
		}

		String responsetv = boyfriend.nextLine();
		if (checkBreakup(responsetv) == true) {
			breakup();
		}
		System.out.println("Well u won't be watching any of " + responsetv
				+ " when we're together! haha ");
		System.out
				.println("You better start catching up on some real housewives of orange county cause that's all we'll ");
		System.out
				.println("be watching!  I just wanna be a trophy wife like them haha");
		System.out.println("What do you want to do when you get older?");

		String responsecareer = boyfriend.nextLine();
		if (checkBreakup(responsecareer) == true) {
			breakup();
		}
		System.out.println("How much do " + responsecareer + "s make?");
		String responsemoney = boyfriend.nextLine();
		if (checkBreakup(responsemoney) == true) {
			breakup();
		}

		System.out
				.println("Well you are going to have to make more money than that! hopefully you can work");
		System.out
				.println("3 jobs.  I have champagne taste :) How many bday presents are you going to get me? ");
		String responsebdaypres = boyfriend.next();

		System.out.println("Only " + responsebdaypres
				+ "  ?!?! Do you even know when my birthday month is??");
		String responsebday = boyfriend.next();
		responsebday = responsebday.toLowerCase();
		//4 guess to get birthday month right
		int count = 0;
		while (!responsebday.contains("uly")) {
			count++;
			if (count == 1) {
				System.out.println("Umm.. I think you better guess again ");
				responsebday = boyfriend.next();
			}
			if (count == 2) {
				System.out.println("Try again... :S");
				responsebday = boyfriend.next();
			}
			if (count == 3) {
				System.out.println("ok seriously don't be funny.. guess again");
				responsebday = boyfriend.next();
			}
			if (count == 4) {
				if (fight == 5) {
					System.out.println("ITS in JULY. wow.");
					trustIssues();
				} else {
					hitforgotbirthday = true;
					System.out.println("BUDDY. its in July.  July 17th.");
					System.out
							.println("We're obviously having some issues in our relationship if you can't even remember my birthday");
					goRelationshipQualities();
					System.out
							.println("ok.. that was a good exercise. But I'm gunna go.  I hope u take the time to really \n"
									+ "think about what we just discussed.  These are things that are really important to me.  I'll phone u \n"
									+ "later to talk about your thoughts.  ok? Have a good day thinking about me.  Bye! ");
					advice();
				}
			}
		}
		if (responsebday.contains("uly")) {
			System.out
					.println("OMG U DO KNOW!! u are the best! But the private jet is back, so I'm gonna go \n"
							+ "get ready and then ill come to your house and you can take me louis vitton shopping!!");
			System.out.println("Bye! xoxoxox");
			String responsebye = boyfriend.nextLine();
			advice();
		}
	}
	//method to take to the method where they talk about important relationship qualities
	public static void goRelationshipQualities() {
		Scanner boyfriend = new Scanner(System.in);
		System.out.println("We need to talk about our relationship");
		System.out
				.println("So why don't u name some qualities that you think are important in a relationship.");
		String boyfriendrelationship = boyfriend.nextLine();
		relationshipQualities(boyfriendrelationship);
		return;
	}

	//if the user mentions a keyword for break up (hate, break, dont together, shut up, crazy, swear words) the girlfriend
	//breaks up with you
	public static void breakup() {
		hitBreakup = true;
		Scanner boyfriend = new Scanner(System.in);
		System.out.println("Excuse me??");
		String responseexcuse = boyfriend.nextLine();
		if (responseexcuse.contains("break")) {
			System.out
					.println("actually I am breaking up with you.  no one ever breaks up with me.");
		} else {
			System.out.println("are you breaking up with me?");
			String responsebreakup = boyfriend.nextLine();
			if (checkYes(responsebreakup) == false
					|| checkNo(responsebreakup) == true) {
				System.out
						.println("omg you are too.. this is it my life is over. you ruined everything.");
			}

			System.out
					.println("we had a future together!! I already had my wedding dress picked out ");
			String responseWedding = boyfriend.nextLine();
			System.out
					.println("just answer me one quick question before you leave me sitting here crying for the rest of my life");
			String responseTears = boyfriend.nextLine();
			System.out.println("what was your best friends name again?");
			String responsebestfriend = boyfriend.nextLine();
			System.out
					.println("ohhh right..."
							+ responsebestfriend
							+ ".  I thought it was him.  \n"
							+ "we hooked up at a party 2 weeks ago.  Truth is.. I've actually liked him the whole time"
							+ "\n and was using you to make him jealous.. I dont even really like you.  How does that make you feel");
			String responsehappy = boyfriend.nextLine();
			if (checkHappy(responsehappy) == true
					|| responsehappy.contains("good")) {
				System.out
						.println("ohh it makes you "
								+ responsehappy
								+ "does it?  well we'll just see how"
								+ responsehappy
								+ " you"
								+ "\n when everyone finds out that I broke up with you because you still wet the bed");
				String responsestuffies = boyfriend.nextLine();
				if (checkNo(responsestuffies) == true) {
					System.out
							.println("no one said it had to be true.  Honestly I would just stay home from school tomorrow");
					System.out
							.println("and probably for the rest of your life.  maybe switch schools\n"
									+ "no one breaks up with me");
					System.out.println("have a great life. Bye Loser");
					advice();
				} else {
					System.out
							.println("HAH! I actually never knew you still wet the bed.  I just made that up.");
					System.out
							.println("Well you're screwed now.. I would honestly just stay home from school tomorrow"
									+ "and probably for the rest of your life.  Maybe switch schools.. or countries.  No one breaks up with\n"
									+ "me and gets away with it.  Have a nice life. bahahahahaha");
					advice();
				}

			} else {
				System.out
						.println("Good. Actually I am breaking you with you.  I never liked you the whole time anyways.\n "
								+ "I might consider switching schools, you aren't going to be the most popular person at school tomorrow.");
				String responseSwitch = boyfriend.nextLine();
				System.out.println("I'm telling everyone I broke up with you because you still wet the bed.  Have a great life. \n i hate your face. bye.");
					advice();
				}
			}

		}
	//if the user specifically says his favorite food is a sandwhich after she says that she finds that rude she gets very angry
	
	public static void mad() {
		fight++;
		hitsand = true;
		Scanner boyfriend = new Scanner(System.in);
		System.out
				.println("WOW You show no emotion. You don't care about my feelings at all \n"
						+ "  Are you completely emotionally unattached, like your father?");
		String responseEmotion = boyfriend.nextLine();
		if (checkBreakup(responseEmotion) == true) {
			breakup();
		}
		if (checkNo(responseEmotion) == false
				&& checkYes(responseEmotion) == false) {
			System.out.println("I asked you a question!.. Yes or No.");
			responseEmotion = boyfriend.nextLine();
			if (checkBreakup(responseEmotion) == true) {
				breakup();
			}
		}
		System.out
				.println("No wonder your parents got a divorce\n I don't know how she put up with this emotional"
						+ "abuse for so long");
		String responseAbuse = boyfriend.nextLine();
		if (checkBreakup(responseAbuse) == true) {
			breakup();
		}
		System.out
				.println("Honestly I don't even want to hear it You were the one that put me in a bad mood \n"
						+ "you deserve me being mad at you because you are a bad boyfriend.  Are you going to buy me"
						+ "something to cheer me up");
		String responseBuy = boyfriend.nextLine();
		if (checkBreakup(responseBuy) == true) {
			breakup();
		}

		if (checkYes(responseBuy) == true || responseBuy.contains("want")) {
			System.out
					.println("Ok, so there are these $800 shoes that I just have to have.  I'm a size 7 \n.  If you don't want me "
							+ "to leave you for Justin Bieber I know that he will buy them for me.. and I know you don't want that\n  "
							+ "so you will right?:)");
			String responseShoes = boyfriend.nextLine();
			if (checkBreakup(responseShoes) == true) {
				breakup();
			}
			if (checkYes(responseShoes) == true) {
				System.out
						.println("WOW you are the best!! but we have been fighting a bit lately."
								+ "\n  we should talk about some relationship qualities that are important in relationships"
								+ "so we can continuously improve our relationship. \n What do u think are some good qualities?");
				String responseQualities = boyfriend.nextLine();
				if (checkBreakup(responseQualities) == true) {
					breakup();
				}
				relationshipQualities(responseQualities);
				System.out
						.println("Ok, I'm glad we talked about relationship stuff. ");
				System.out
						.println("Lets get back to your commitment issues.  Whats your favorite tv show?");
			//if they fight 4 times then she accuses him of cheating on her
			} else { 
				if (fight >= 4) {
					hitbuyshoes = true;
					System.out
							.println("Wow. if you wont buy them for me then that just proves it. ");
					trustIssues();
				} else {
					hitbuyshoes = true;
					System.out
							.println("Ok, ok I know, I'm being a bit crazy. I'm sorry.  Lets talk about some relationship"
									+ "qualities that we can both agree on.  You name one.");
					String responseQualities = boyfriend.nextLine();
					if (checkBreakup(responseQualities) == true) {
						breakup();
					}
					relationshipQualities(responseQualities);
					System.out
							.println("Ok, I'm glad we talked about relationship stuff. ");
					System.out
							.println("Lets get back to your commitment issues.  Whats your favorite tv show?");
				}
			}
		} else {
			//if they fight 4 times then it enters trust issues and she accuses him of cheating on her
			hitbuysomething = true;
			if (fight >= 4) {
				trustIssues();
			} else {
				System.out
						.println("you know what.. I'm leaving. you need to think about your priorities in life. \n "
								+ "Ill talk to in a bit when you think about what you have done.  Bye");
				advice();
				return;
			}
		}
	}

	
	//using information from conversation she brings up things that the user has said to justify you
	//cheating on her
	public static void trustIssues() {
		Scanner boyfriend = new Scanner(System.in);
		System.out.println("you are cheating on me aren't you??");
		String responseCheating = boyfriend.nextLine();
		if (checkBreakup(responseCheating) == true) {
			breakup();
		}
		if (checkYes("responseCheating") == true) {
			System.out
					.println("well that settles it then. Were done.  I'm breaking up with you.");
			System.out
					.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time.  "
							+ "\nEveryone will know u cheated on me & also still wet the bed.");
			System.out.println("bye loser");
			System.exit(1);
		} else {
			System.out
					.println("well its pretty obviously! we've been fighting for this whole conversation");
			String response = boyfriend.nextLine();
			System.out
					.println("... you never even asked me how I was doing when we started talking.  I had to insinuate that myself...");
			System.out
					.println("you told me you didn't want to be together forever.");
			System.out
					.println("you asked me to make you a sandwich after I blatently told you how offensive i think it is when guys \n"
							+ " ask me to make make them a sandwhich.");
			System.out.println("YOU FORGET MY BIRTHDAY!");
			if (!movie.contains("twilight") || !movie.contains("new moon")
					|| !movie.contains("breaking dawn")
					|| !movie.contains("eclipse")) {
				longDelay();
				System.out
						.println("AND TO TOP IT ALL OFF TWILIGHT ISN'T EVEN YOUR FAVORITE MOVIE !!!!");
				System.out.println("Who's that celebrity crush of yours again?");
				String crushresponse = boyfriend.nextLine();
				if (crushresponse != crush) {
					System.out.println("WHAT! before you said it was " + crush
							+ "!! You are cheating on me with both of them?!");
					String cheatresponse = boyfriend.nextLine();
					if (checkYes("cheatresponse") == true) {
						System.out
								.println("well that settles it then. Were done.  I'm breaking up with you.");
						System.out
								.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time");
						System.out.println("bye.");
					} else {
						System.out
								.println("oh you're not??  Ok do me a favor then.  tell me how long we've been together");
						String responseTogether = boyfriend.nextLine();
						if (!responseTogether.contains("10")
								|| !responseTogether.contains("4")
								|| !responseTogether.contains("ten")
								|| !responseTogether.contains("four")) {
							System.out
									.println("ITS BEEN TEN DAYS AND 4 HOURS!!  We just talked about it!!");
							System.out
									.println("you are so out of touch with reality. im over it.  you have serious issues");
							System.out
									.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time.  "
											+ "\nEveryone will know u cheated on me & also still wet the bed.");
							System.out.println("bye loser.");
						} else {
							System.out
									.println("well if you know that.. WHY HAVENT U PROPOSED");
							String responseproposed = boyfriend.nextLine();
							System.out.println("oh right... commitment issues");
							System.out
									.println("well that settles it then. you have commitment issues and I can't handle it.  \nI'm breaking up with you.");
							System.out
									.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time.  "
											+ "\nEveryone will know u cheated on me & also still wet the bed.");
							System.out.println("bye loser.");
							System.exit(1);
						}
					}
				} else {
					System.out
							.println("ok right right it was her.  tell me how long we've been together");
					String responseTogether = boyfriend.nextLine();
					if (!responseTogether.contains("10")
							|| !responseTogether.contains("4")
							|| !responseTogether.contains("ten")
							|| !responseTogether.contains("four")) {
						System.out
								.println("ITS BEEN TEN DAYS AND FOUR HOURS!!  We just talked about it!!");
						System.out
								.println("you obvioulsy cant remember that because you spend all day dreaming about\n"
										+ crush + "!!");
						System.out
								.println("well that settles it then. I can't handle your emotional cheating. I'm breaking up with you \n");
						System.out
								.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time.  "
										+ "\nEveryone will know u cheated on me with"
										+ crush
										+ " and also still wet the bed.");
						System.out.println("bye loser.");
						System.exit(1);
					} else {
						System.out
								.println("well if you know that.. WHY HAVENT U PROPOSED");
						String responseproposed = boyfriend.nextLine();
						System.out
								.println("oh right... commitment issues and the fact that you are in love with"
										+ crush);
						System.out
								.println("well that settles it then. I can't handle your issues.  \nI'm breaking up with you.");
						System.out
								.println("I wouldn't come to school tomorrow if I were you, it's not going to be a good time.  "
										+ "\nEveryone will know u cheated on me with"
										+ crush
										+ " and also still wet the bed.");
						System.out.println("bye loser.");
						System.exit(1);
					}
				}

			}

		}
	}
	//advice column.  Keeps track of what you say and if it makes her mad, it tells you why it made her mad and 
	// what you should say next time instead.
	public static void advice() {
		System.out
				.println("\n \n Hello! My name is Dr. Phil.  I know you might be confused by why some of the things you said \n"
						+ "made your girlfriend mad. This is what I am here for! I will tell you where you went wrong and what you\n "
						+ "should have said differently to give a different outcome in the conversation\n \n");
		int count = 0;
		if (hitgreeting == true) {
			System.out
					.println("I know it might not seem like that big of a deal, but you didn't even ask how she was doing \n"
							+ "today after she had asked you. She thought that that was pretty inconsiderate.  Next time try saying \n"
							+ "Hi darling how are you doing today!?"
							+ "The response you get from her will be a lot less sarcastic\n \n");
			count++;
		}
		if (hitbusy == true) {
			System.out
					.println("She said she wanted to hang out and she offered you a time.  Regardless of whether or \n"
							+ "not you said you would hang out with her today, you should have cancelled all plans. and when she asked \n"
							+ " 'where will we meet'  you could have said anywhere, but you should not have said that you were busy.\n \n");
			count++;
		}
		if (hitforever == true) {
			System.out
					.println("You are not the brightest now are you??  This girl is your world!  You live and breathe \n "
							+ "To please her.  So no, you probably shouldn't have said "
							+ forever
							+ " when she asked if you \n"
							+ " you wanted to be together forever.  Furthermore, when she confirmed it with you TWICE, that you \n"
							+ "were indeed serious you could have saved yourself some trouble by saying yes, I'm kidding.  Now she's"
							+ "\n certain you have commitment issues.\n \n");
			count++;
		}
		if (hitcrush == true) {
			System.out
					.println("So I know she didn't seem that mad about this one, but she buried it into her tiny little brain \n"
							+ "and was saving it for later if you got into a fight.  "
							+ crush
							+ "... really? That was a trap.  Your celebrity \n"
							+ "crush is HER. HER, HER, HER,  Everything will always be her.\n \n");
			count++;
		}
		if (hitmovie == true) {
			System.out
					.println(movie
							+ ".  Really dude? Again this was a trap... used for leverage in a later argument.  "
							+ "Anyone of the twilight series movies will save you from suprise detonation\n \n");
			count++;

		}
		if (hitsand == true) {
			System.out
					.println("Buddy really?  This wasn't even a set up... She blatantly told you how she feels about guys that \n"
							+ "ask their girlfriends to make them sandwhiches... and then she asks what your favorite food is... and you say \n"
							+ " A SANDWICH?!... NOTHING ELSE came to mind??? I'm not going to even tell you advice about that one.  I'm hoping \n"
							+ "you can think of something else better to say next time. (ie// anything except for sandwhich)\n \n");
			count++;
		}
		if (hitbuysomething == true) {
			System.out
					.println("All you had to say when she asked if you were going to buy her something was yes... would have "
							+ "\n saved u some headache.\n \n");
			count++;
		}
		if (hitbuyshoes == true) {
			System.out
					.println("When are you going to learn. yes, yes, yes.  Almost always the answer. Yes to I want to be together \n"
							+ "forever, yes to 'will you buy me $800 shoes.' Even if you don't have the money, just pick up some extra shifts."
							+ "you wont regret it, you will however, regret making her angry.\n \n");
			count++;
		}
		if (hitforgotbirthday == true) {
			System.out
					.println("Well, you forgot her birthday month. AFTER FOUR GUESSES.  Its July, just so you know.  I would probably \n"
							+ "take a pen and a paper and write July down 100 times so you will never forget EVER.  You could have totally\n "
							+ "avoided going into the whole 'relationship qualities' discussion and she would have come and picked you up\n "
							+ "in her private jet and you would have had a lovely day together.\n \n");
			count++;
		}
		if (hitbreakup == true) {
			System.out
					.println("yeah, this is so beyond my scope.  It's irrepairable. You said something to her, and she ended it. \n"
							+ "just take her advice and switch schools.., maybe countries. Her only goal is to make your life miserable from here \n"
							+ "on in. Sorry buddy");
			System.exit(1);
			count++;
		}
		if (count == 0) {
			System.out
					.println("Well done sir! I have to say she is very high maintenence but you managed to say everything right. \n"
							+ "a borderline miracle in this case.  You are officially granted the most patient person in the world. Congrats and \n"
							+ " Keep doing what you are doing! Cheers!");
			System.exit(1);
		} else {
			System.out
					.println("Well, kind sir.  My work here is done.  I've done all I can do and I hope that you have taken my \n"
							+ "advice seriously.  Best of luck chatting with your girlfriend next time. ");
			System.exit(1);
		}

	}
}
