package com.example.l_clan.Domains.WebDevelopment.Backend.BackendFragment.DatabaseFragmentpart.OracleFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.l_clan.R;

public class OracleFragmentWebsite extends Fragment {


    public OracleFragmentWebsite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_oracle_website, container, false);
        ImageView imageView1 = view.findViewById(R.id.BackendOracleResourceimage1);
        ImageView imageView2 = view.findViewById(R.id.BackendOracleResourceimage2);
        ImageView imageView3 = view.findViewById(R.id.BackendOracleResourceimage3);
        ImageView imageView4 = view.findViewById(R.id.BackendOracleResourceimage4);
        ImageView imageView5 = view.findViewById(R.id.BackendOracleResourceimage5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.oracletutorial.com/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.javatpoint.com/oracle-tutorial");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.w3schools.blog/oracle-tutorial");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://dotnettutorials.net/course/oracle-tutorials/");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.freecodecamp.org/news/tag/oracle/");
            }
        });



        return view;
    }

    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}