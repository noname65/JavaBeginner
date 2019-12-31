package lifesimulator;
import java.util.Scanner;
public class LifeSimulator{
    public static String Text_is_added_to_wrap_automatically(String input1,String input2){
        int text_max=40;
        int text_esc=1;
        for(int i=0;i<input2.length();i++){
            input1+=input2.substring(i,i+1);
            if(input1.length()>=text_max*text_esc){
                input1+="\n";
                text_esc++;
            }
        }
        return input1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	int numberOfChildren = 0;
        final String BUSINESS_MAN = "business man";
        final String ENGINEER = "engineer";
        final String ARTIST = "artist";
        final String HELPING_PROFESSION = "helping profession";
        String name,wantsToMarry,wantsChildren,isRuleBreaker;
        String child1n, child2n, child3n, child4n, child5n, child6n, child7n;
        String child1g, child2g, child3g, child4g, child5g, child6g, child7g;
        String lifeParagraph = "";
        String actualJob = "";
        String actualWealth = null;
	double childProb;
        double occupationProbability;
        System.out.print("Please enter your name.\nYour input:");
        name = s.nextLine();
        System.out.print("\nType in the job you want.\nYour input:");
        s.nextLine();
        System.out.print("\nEnter whether you want to get married.\nYour input:");
        wantsToMarry = s.nextLine();
        System.out.print("\nEnter whether you want children.\nYour input:");
        wantsChildren = s.nextLine();
        System.out.print("\nEnter whether you want to break the rules.\nYour input:");
        isRuleBreaker = s.nextLine();
	child1n = "john";
	child2n = "luke";
	child3n = "mark";
	child4n = "paul";
	child5n = "mary";
	child6n = "cindy";
	child7n = "sally";
	child1g = "male";
	child2g = "male";
	child3g = "male";
	child4g = "male";
	child5g = "female";
	child6g = "female";
	child7g = "female";
        childProb = Math.random();
        if(childProb > 0.30 && childProb <= 0.40){
            numberOfChildren = 1;
        }else if(childProb > 0.40 && childProb <= 0.50){
            numberOfChildren = 2;
        }else if(childProb > 0.50 && childProb <= 0.60){
            numberOfChildren = 3;
        }else if(childProb > 0.60 && childProb <= 0.70){
            numberOfChildren = 4;
        }else if(childProb > 0.70 && childProb <= 0.80){
            numberOfChildren = 5;
        }else if(childProb > 0.80 && childProb <= 0.90){
            numberOfChildren = 6;
        }else if(childProb > 0.9 && childProb <= 1){
            numberOfChildren = 7;
        }
        occupationProbability = Math.random();
        if (occupationProbability <= 0.30){
            actualJob = BUSINESS_MAN;
        } else if (occupationProbability > 0.30 && occupationProbability <= 0.60){
            actualJob = HELPING_PROFESSION;
        } else if (occupationProbability > 0.60 && occupationProbability <= 0.65){
            actualJob = ENGINEER;
        } else if (occupationProbability > 0.65 && occupationProbability <= 0.75){
            actualJob = ARTIST;
        }
        switch(actualJob){
            case BUSINESS_MAN:
                if(Math.random() <= 0.70){
                    actualWealth = "rich";
                }else{
                    actualWealth = "middle class";
                }
                break;
            case ARTIST:
                if(Math.random() <= 0.10) {
                    actualWealth = "rich";
                }else{
                    actualWealth = "poor";
                }
                break;
            case ENGINEER:
                actualWealth = "rich";
                break;
            case HELPING_PROFESSION:
                actualWealth = "middle class";
                break;
        }
        if(isRuleBreaker.equals("yes")){
            if(Math.random() > 0.30){
                actualWealth = "rich";
            }
        } else {
        }
        lifeParagraph += name;
        lifeParagraph += " was an interesting person.";
        if(wantsToMarry.equals("yes")){
            lifeParagraph += (name + " wants to marry.");
        }
        lifeParagraph = (name + " became a " + actualJob + "They were a " + actualWealth + " person!");
        if(numberOfChildren > 0){
            lifeParagraph += "They had " + numberOfChildren + " children!";
            if(wantsChildren.equals("yes")){
                lifeParagraph += "They are soooo happy!! :)";
            } else{
                lifeParagraph += "The children really stress them out!";
            }
            if(numberOfChildren >= 1){
                lifeParagraph += "Their 1st child was named " + child1n + ". ";
                lifeParagraph += "They were " + child1g + ". ";
            }
            if(numberOfChildren >= 2){
                lifeParagraph += "Their 2nd child was named " + child2n + ". ";
                lifeParagraph += "They were " + child2g + ". ";
            }
            if(numberOfChildren >= 3){
                lifeParagraph += "Their 3rd child was named " + child3n + ". ";
                lifeParagraph += "They were " + child3g + ". ";
            }
            if(numberOfChildren >= 4){
                lifeParagraph += "Their 4th child was named " + child4n + ". ";
                lifeParagraph += "They were " + child4g + ". ";
            }
            if(numberOfChildren >= 5){
                lifeParagraph += "Their 5th child was named " + child5n + ". ";
                lifeParagraph += "They were " + child5g + ". ";
            }
            if(numberOfChildren >= 6){
                lifeParagraph += "Their 6th child was named " + child6n + ". ";
                lifeParagraph += "They were " + child6g + ". ";
            }
            if(numberOfChildren >= 7){
                lifeParagraph += "Their 7th child was named " + child7n + ". ";
                lifeParagraph += "They were " + child7g + ". ";
            }
        }else{
            if(wantsChildren.equals("yes")){
                lifeParagraph += "They cried every night because they had no offspring";
            }else{
                lifeParagraph += "They lucked out by not getting burdened with children.";
            }
        }
        System.out.println(Text_is_added_to_wrap_automatically("",lifeParagraph));
    }
    
}
