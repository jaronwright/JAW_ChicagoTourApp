package com.example.android.chicagotourapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.landmark_item_0_name), getString(R.string.landmark_item_0_address), getString(R.string.landmark_item_0_url), R.drawable.sites0));
        attractions.add(new Attraction(getString(R.string.landmark_item_1_name), getString(R.string.landmark_item_1_address), getString(R.string.landmark_item_1_url), R.drawable.sites1));
        attractions.add(new Attraction(getString(R.string.landmark_item_2_name), getString(R.string.landmark_item_2_address), getString(R.string.landmark_item_2_url), R.drawable.sites2));
        attractions.add(new Attraction(getString(R.string.landmark_item_3_name), getString(R.string.landmark_item_3_address), getString(R.string.landmark_item_3_url), R.drawable.sites3));
        attractions.add(new Attraction(getString(R.string.landmark_item_4_name), getString(R.string.landmark_item_4_address), getString(R.string.landmark_item_4_url), R.drawable.sites4));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.attraction_landmarks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = attractions.get(position);

                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(attraction.getLink()));
                startActivity(i);
            }
        });

        return rootView;
    }

    public LandmarksFragment() {
    }
}
