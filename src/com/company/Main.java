/*
* author: Stepanenko Yevgeniy
* date:   07/02/2019
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	Model model =new Model();
	View view= new View();
	Controller controller=new Controller(model,view);
	controller.Process();
    }
}
