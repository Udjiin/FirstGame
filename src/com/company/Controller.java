package com.company;

import java.util.Scanner;

public class Controller {

    // Constructor
         private Model model;
         private View view;

    public Controller(Model model,View view){
        this.model=model;
        this.view=view;
    }
    //The Work method
    public void Process(){
        Scanner scanner=new Scanner((System.in));
        model.setFirstWord(inputWord(scanner,view.FIRST_INPUT_WORD,view.FIRST_WORD, view.WRONG_INPUT));
        model.setSecondWord(inputWord(scanner,view.SECOND_INPUT_WORD,view.SECOND_WORD, view.WRONG_INPUT));
        view.printMessage(view.RESULT_SENTECE+model.constructSentence(model.getFirstWord(),model.getSecondWord()));
        scanner.close();
    }

    public String inputWord(Scanner scanner,String invitationForInput,String expectedWord,String wrongInput){
        String inputLine="";
        view.printMessage(invitationForInput);
        while (scanner.hasNextLine()){
            inputLine=scanner.nextLine();
            if(inputLine.equals(expectedWord))
                break;
            else
                view.printMessage(wrongInput+"\n"+invitationForInput);
        }
        return inputLine;
    }


}
