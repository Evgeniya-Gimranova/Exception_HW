package HomeWork_03;


import HomeWork_03.src.Presenter.Presenter;
import HomeWork_03.src.View.ConsoleView;
import HomeWork_03.src.View.View;

public class Homework3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
