package com.example.triviaapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.triviaapp.databinding.FragmentTriviaFailBinding;

import java.util.zip.Inflater;


public class TriviaFail extends Fragment {

   private FragmentTriviaFailBinding mbinding;


    public TriviaFail() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      mbinding = FragmentTriviaFailBinding.inflate(inflater, container, false);
        return mbinding.getRoot();

        mbinding.btcomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(mbinding.getRoot()).navigate(R.id.action_triviaFail_to_triviaFragment);
            }
        });
    }
}