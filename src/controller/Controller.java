package controller;

import model.Model;

public class Controller extends ControllerMethods {
    public void test(){
        Model model=setter();
        game(model);
    }
}
