package com.example.sistem_rt.ui.biaya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sistem_rt.databinding.FragmentBiayaBinding;
import com.example.sistem_rt.ui.biaya.BiayaViewModel;

public class BiayaFragment extends Fragment {

    private FragmentBiayaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BiayaViewModel biayaViewModel =
                new ViewModelProvider(this).get(BiayaViewModel.class);

        binding = FragmentBiayaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBiaya;
        biayaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}