package com.example.a6calculator2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a6calculator2.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    Button Reset, Calculate;
    EditText Price, InitialPayment, Term, InterestRate;
    TextView MonthlyPayment1, MonthlyPayment2;
    private FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = FragmentMainBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        Reset = binding.buttonReset;
        Calculate = binding.buttonCalculate;
        Price = binding.Price;
        InitialPayment = binding.InitialPayment;
        Term = binding.Term;
        InterestRate = binding.InterestRate;
        MonthlyPayment1 = binding.Monthlypayment;
        MonthlyPayment2 = binding.Mounthlypayment2;

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myLogs", "Click");
                Price.setText(""); Price.setHint("");
                InitialPayment.setText(""); InitialPayment.setHint("");
                Term.setText(""); Term.setHint("");
                InterestRate.setText(""); InterestRate.setHint("");
                MonthlyPayment1.setText("");
                MonthlyPayment2.setText("");
            }
        });
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myLogs", "Click");

                /*double price, initialpayment, term, interestrate, monthlypayment;

                int count = 0;
                try {
                    price = Double.parseDouble(Price.getText().toString());
                } catch (Exception e) {
                    Price.setHint("Обязательно заполните это поле");
                    count += 1;
                }
                try {
                    initialpayment = Double.parseDouble(InitialPayment.getText().toString());
                } catch (Exception e) {
                    InitialPayment.setHint("Обязательно заполните это поле");
                    count += 1;
                }
                try {
                    term = Double.parseDouble(Term.getText().toString());
                } catch (Exception e) {
                    Term.setHint("Срок");
                    count += 1;
                }
                try {
                    interestrate = Double.parseDouble(InterestRate.getText().toString());
                } catch (Exception e) {
                    InterestRate.setHint("Ставка");
                    count += 1;
                }
                if (count != 0)
                    return;
                price = Double.parseDouble(Price.getText().toString());
                initialpayment = Double.parseDouble(InitialPayment.getText().toString());
                term = Double.parseDouble(Term.getText().toString());
                interestrate = Double.parseDouble(InterestRate.getText().toString());
                if (term == 0)
                    monthlypayment = (price - initialpayment);
                else if (interestrate == 0)
                    monthlypayment = (price - initialpayment) / term;
                else {
                    interestrate = interestrate / 100 / 12;
                    term = term * 12;
                    double variable = interestrate * Math.pow(1 + interestrate, term);
                    monthlypayment = (price - initialpayment) * (variable / (Math.pow((1 + interestrate), term) - 1));
                }

                MonthlyPayment1.setText("Ежемесячный платеж");
                MonthlyPayment2.setText((String.format("%.2f", monthlypayment)).toString() + " Р");*/
            }
        });

        return view;
    }
}