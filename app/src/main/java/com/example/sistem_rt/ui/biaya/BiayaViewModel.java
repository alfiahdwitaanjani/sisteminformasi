package com.example.sistem_rt.ui.biaya;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BiayaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public BiayaViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
