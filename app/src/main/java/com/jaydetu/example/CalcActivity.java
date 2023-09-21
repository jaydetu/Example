package com.jaydetu.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.jaydetu.example.databinding.ActivityCalcBinding;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcActivity extends AppCompatActivity {

    private ActivityCalcBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // for using view binding
        // get layout and inflate (create needed java code) and set as view
        binding = ActivityCalcBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void caclulate() {
        //int result = binding.editTextNumber * binding.editTextNumber2;
        //DecimalFormat precision = new DecimalFormat("#,###.00");
        //binding.editTextNumber3.setText(result);

        //NumberFormat cf = NumberFormat.getCurrencyInstance();
        //binding.editTextNumber3.setText(cf.format(result));
    }

    public void clearForm (View view) {
        // if object id in xml is same as java field
        // get data
        binding.editTextNumber.setText("");
        binding.editTextNumber2.setText("");
        binding.editTextNumber3.setText("");
    }
}
