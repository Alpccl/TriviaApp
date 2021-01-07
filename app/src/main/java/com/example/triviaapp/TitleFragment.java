package com.example.triviaapp;

import android.icu.text.CaseMap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.triviaapp.databinding.FragmentTitleBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TitleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TitleFragment extends Fragment {

    private FragmentTitleBinding mbinding;
    private boolean isFragmentShow;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private String mParam1;

    public TitleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TitleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TitleFragment newInstance(String param1, String param2) {
        TitleFragment fragment = new TitleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding = FragmentTitleBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());
        String name = mbinding.rtxNombre.getText().toString();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }

        mbinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
                if (isFragmentShow) {
                    closeTitleFragment();
                }else{
                    openTitleFragment();
                }
                }
            }
        });
    }



    private void openTitleFragment(){
    //instanciamos el fragmneto
    TitleFragment TitleFragment = new TitleFragment();
    //fragment manager
     FragmentManager manager = getFragmentManager();
     //creamos la transaccion
        FragmentTransaction transaction = manager.beginTransaction()
        .add(mbinding.contentFragment.getid(), TitleFragment, TitleFragment.class.getSimpleName());
        transaction.commit();
        isFragmentShow = true;
    }

    private void closeTitleFragment(){
    FragmentManager manager = getFragmentManager();
    TitleFragment titleFragment = (TitleFragment) manager.findFragmentById();
    if (TitleFragment != null) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.remove(TitleFragment).commit();
        isFragmentShow = false;
    }














    //@Override
    //public View onCreateView(LayoutInflater inflater, ViewGroup container,
      //                       Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_title, container, false);
    //}
//}