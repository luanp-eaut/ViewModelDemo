package eaut.it.mobileappdev.viewmodeldemo;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    int counter  = 0;

    public void increaseCounter(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
