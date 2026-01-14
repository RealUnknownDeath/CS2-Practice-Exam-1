import java.lang.reflect.Array;
import java.util.ArrayList;

public class StarshipExplorer {

    // variable declaration section
    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    public Alien[] aliens = new Alien[50];

    public static void main(String[] args) {
        System.out.println("Hello World! Good luck on your exams!");
        StarshipExplorer test = new StarshipExplorer();

    }

    public StarshipExplorer(){
        int num1 = -1;
        int num2 = -1;
        for(int q = 0; q < 50; q++){
            while(num1 < 0 || num1 > 75){
                num1 = (int)Math.round(Math.random()*10)*10 + 1;
            }
            while(num2 <= 0 || num2 > 100){
                num2 = (int)Math.round(Math.random()*10)*10;
            }

            aliens[q] = new Alien(num1, num2);
        }
        System.out.println(descipher(alienLanguage));
        displayAliens();
    }

    public void displayAliens(){
        for(int i = 0; i < 50; i++){
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergyLevels(Alien[] list){
        ArrayList<Integer> checker = new ArrayList<>();

        for(int i = 0; i < list.length; i++){
            if(checker.contains(list[i].getEnergyLevel())){
                return true;
            }
            checker.add(list[i].getEnergyLevel());
        }

        return false;
    }

    public String descipher(String s){
        String returner = "";
        for(int i = 0; i < s.toCharArray().length; i++){
            if(s.charAt(i) == '*') {
                returner = returner + (s.substring(i+1, i + 2));
            }
        }
        return returner;
    }


}