package com.example.sistem_rt.ui.pengantar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sistem_rt.databinding.FragmentPengantarBinding;

public class PengantarFragment extends Fragment {

    private FragmentPengantarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PengantarViewModel pengantarViewModel =
                new ViewModelProvider(this).get(PengantarViewModel.class);

        binding = FragmentPengantarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPengantar;
        pengantarViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
