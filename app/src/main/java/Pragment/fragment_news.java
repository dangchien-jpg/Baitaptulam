package Pragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baitaptulam.R;
import com.google.android.material.tabs.TabLayout;

import News.NewsViewPagerAdapter;


public class fragment_news extends Fragment {

    private TabLayout tabLayout;
    private CustomViewPaper viewPager;

    private View mView;


    public fragment_news() {
        // Required empty public constructor
    }



//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_news, container, false);
        tabLayout = mView.findViewById(R.id.tab_layout);
        viewPager = mView.findViewById(R.id.News_viewpager);

        NewsViewPagerAdapter newsViewPagerAdapter = new NewsViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(newsViewPagerAdapter);
        viewPager.setPagingEnable(false);

        tabLayout.setupWithViewPager(viewPager);
        return mView;
    }
}