package com.example.sistem_rt.ui.kegiatan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KegiatanViewModel extends ViewModel{

    private final MutableLiveData<String> mText;

    public KegiatanViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
