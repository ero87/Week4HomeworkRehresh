package com.example.ero.week4homework2;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageDialogFragment extends DialogFragment {
    private static int position;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (getArguments() != null) {
            position = getArguments().getInt(InfoAdapter.BUNDLE_KEY);
        }
        View view = inflater.inflate(R.layout.pager_item, container, false);
        final ViewPager viewPager = view.findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getDialog().getContext());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);

        return view;
    }
}
