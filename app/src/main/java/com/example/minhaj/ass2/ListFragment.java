package com.example.minhaj.ass2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by Minhaj on 10/16/2017.
 */

public class ListFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container , Bundle savedInsatnce){

        View view = inflater.inflate(R.layout.fragment_list,container , false);

        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.RecyclerView);
        ListAdapter listAdapter = new ListAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
