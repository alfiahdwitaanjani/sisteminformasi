package com.example.sistem_rt.ui.pengantar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PengantarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PengantarViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
