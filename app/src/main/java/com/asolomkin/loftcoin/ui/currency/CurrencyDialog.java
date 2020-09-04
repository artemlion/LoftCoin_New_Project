package com.asolomkin.loftcoin.ui.currency;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.asolomkin.loftcoin.R;
import com.asolomkin.loftcoin.data.CurrencyRepo;
import com.asolomkin.loftcoin.data.CurrencyRepoImpl;
import com.asolomkin.loftcoin.databinding.DialogCurrencyBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class CurrencyDialog extends AppCompatDialogFragment {

    private DialogCurrencyBinding binding;

    private CurrencyRepo currencyRepo;

    private CurrencyAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currencyRepo = new CurrencyRepoImpl(requireContext());
        adapter = new CurrencyAdapter();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        binding = DialogCurrencyBinding.inflate(getLayoutInflater());
        return new MaterialAlertDialogBuilder(requireActivity())
                .setTitle(R.string.choose_currency)
                .setView(binding.getRoot())
                .create();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.recycler.setLayoutManager(new LinearLayoutManager(requireActivity()));
        binding.recycler.setAdapter(adapter);
        currencyRepo.availableCurrencies().observe(this, adapter::submitList);
    }

    @Override
    public void onDestroy() {
        binding.recycler.setAdapter(null);
        super.onDestroy();
    }
}
