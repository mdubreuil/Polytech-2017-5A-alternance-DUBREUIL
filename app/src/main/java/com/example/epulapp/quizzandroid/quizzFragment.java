package com.example.epulapp.quizzandroid;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// TODO : Should recieve broadcast notification and send notification
public class quizzFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quizz, container, false);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Intent intent = new Intent("Coucou");
        LocalBroadcastManager.getInstance(this.getActivity()).sendBroadcast(intent);
    }

}

