package com.startcat.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;


//如果使用context 使用 AndroidViewModel，否则使用ViewModel
public class MyViewModel extends AndroidViewModel{
    public int number;

    public MyViewModel(@NonNull Application application) {
        super(application);
    }
}
