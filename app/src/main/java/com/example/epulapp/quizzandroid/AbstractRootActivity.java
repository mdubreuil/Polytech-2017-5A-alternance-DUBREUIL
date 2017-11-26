package com.example.epulapp.quizzandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static com.example.epulapp.quizzandroid.R.id.button2;

public class AbstractRootActivity extends AppCompatActivity implements menuFragment.onButtonClick {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quizz);

        fragmentManager = getFragmentManager();
        menuFragment menu = new menuFragment();

        changeFragment(menu, false);
    }

    @Override
    public void onClick(int idButton) {
        switch(idButton) {
            case button2:
                quizzFragment question = new quizzFragment();
                changeFragment(question, true);
                break;
            default :
                System.out.println("Button id not recognized");
        }
    }

    public void changeFragment(Fragment frag, boolean isReplace){
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        if(isReplace){
            fragmentTransaction.replace(R.id.fragment_container, frag);
        } else {
            fragmentTransaction.add(R.id.fragment_container, frag);
        }
        fragmentTransaction.commit();
    }
}

