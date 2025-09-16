package com.example.sistem_rt.ui.kegiatan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sistem_rt.databinding.FragmentKegiatanBinding;
import com.example.sistem_rt.ui.kegiatan.KegiatanViewModel;

public class KegiatanFragment extends Fragment {
    private FragmentKegiatanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KegiatanViewModel kegiatanViewModel =
                new ViewModelProvider(this).get(KegiatanViewModel.class);

        binding = FragmentKegiatanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKegiatan;
        kegiatanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
