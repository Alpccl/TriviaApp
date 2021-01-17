package com.example.triviaapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.triviaapp.databinding.FragmentTriviaGoneBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TriviaGone#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TriviaGone extends Fragment {

    private FragmentTriviaGoneBinding mbinding;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TriviaGone() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      mbinding = FragmentTriviaGoneBinding.inflate(inflater, container, false);
        return mbinding.getRoot();

        mbinding.btcomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(mbinding.getRoot()).navigate(R.id.action_triviaGone_to_triviaFragment);
            }
        });
    }
}