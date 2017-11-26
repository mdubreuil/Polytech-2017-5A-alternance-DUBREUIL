package com.example.epulapp.quizzandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import static com.example.epulapp.quizzandroid.R.id.button2;

public class menuFragment extends Fragment {
    private onButtonClick click;

    public menuFragment() {
        // Required empty public constructor
    }

    public interface onButtonClick {
        public void onClick(int indiceButton);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        onClickEventDo(view, button2);
        return view;
    }

    private void onClickEventDo(View view, final int idButton) {
        Button button = (Button) view.findViewById(idButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                click.onClick(idButton);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            click = (onButtonClick) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(context) + " must implement onClickEventDo");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}