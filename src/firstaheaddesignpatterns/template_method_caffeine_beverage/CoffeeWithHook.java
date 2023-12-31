package firstaheaddesignpatterns.template_method_caffeine_beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
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

        System.out.println("Would you like milk and sugar with your coffee [y/n] ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(null == answer){
            return  "no";
        }
        return answer;
    }
}
