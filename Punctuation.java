/*
Sam Heinonen 
Period 6
Learning: Using string methods and more if else statements
Pseudocode:
Main:
	call searchIt
searchit
	Make the speech a string
	Make the string that will be printed
	call getPunctuationWords
	call print
getPunctuationWords
	find length of speech
	for(x < length)
		checkPunctuation
		if there is punctuation
			find last whitespace
			make substring of witespace until punctuation
			add whitespace to printed string
checkPunctuation
	if punctuation
		return true
	else
		return false
print
	print 3 blank lines and string
*/
public class Punctuation
{
	public Punctuation()
	{

	}
	public static void main(String[] args)
	{
		Punctuation pu = new Punctuation();
		pu.searchIt();
	}
	public void searchIt()
	{
		/* The String that will have the words taken out of */ String speech = new String("Blood, Sweat, and Tears by Winston Churchill " +"May 13, 1940 " +"Mr. Speaker: " +	"On Friday evening last I received His Majesty’s commission to form a new " +	"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +		"I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of theprincipal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +		"Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." +		"Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +		"We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " +		"But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\"");
		String printed = new String(""); //String that will be printed
		printed = getPunctuationWords(speech, printed);
		printWords(printed);
	}
	public String getPunctuationWords(String speechIn, String printed)
	{
		int speechLength;
		int lastWhiteSpace = 0;
		char speechChar;
		boolean isPunctuation = false;
		speechLength = speechIn.length(); //Sets the length
		for(int x = 0; x < speechLength; x++) //Checks every char, stops when everything has been checked
		{
			speechChar = speechIn.charAt(x); //Gets the char
			isPunctuation = checkPunctuation(speechChar); //Sees if the char is punctuation
			if(isPunctuation) //If it is
			{
				lastWhiteSpace = speechIn.lastIndexOf(' ', x); //Finds last space
				printed = printed + " " + speechIn.substring(lastWhiteSpace + 1, x+1); //Adds the word to be printed(+1 is so that it doesnt try and take substring with -1
			}
		}
		return printed; //Returns the
	}
	public boolean checkPunctuation(char punctuationAt)
	{
		boolean punctuation = false;
		if(punctuationAt == '.' || punctuationAt == ',' || punctuationAt == ';' || punctuationAt == ':' || punctuationAt == '!' || punctuationAt == '?' || punctuationAt == '\'' || punctuationAt == '"' || punctuationAt == '(' || punctuationAt == ')' || punctuationAt == '-')
		//If there is punctuation
		{
			punctuation = true;
		}
		else
			punctuation = false;
		return punctuation;
	}
	public void printWords(String printedIn)
	{
		System.out.print("\n\n\n" + printedIn + "\n\n\n");
	}
}

