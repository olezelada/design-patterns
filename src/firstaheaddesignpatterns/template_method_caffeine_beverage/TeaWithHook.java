package firstaheaddesignpatterns.template_method_caffeine_beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Steeping the tea through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like Lemon with your tea [y/n] ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if(null == answer){
            return  "no";
        }
        return answer;
    }
}
