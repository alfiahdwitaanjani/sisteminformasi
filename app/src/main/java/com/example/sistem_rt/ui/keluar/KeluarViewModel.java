package com.example.sistem_rt.ui.keluar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KeluarViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public KeluarViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
