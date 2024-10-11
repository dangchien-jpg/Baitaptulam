package News;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import Pragment.Home_Fragment;
import Pragment.fragment_account;
import Pragment.fragment_news;

@SuppressWarnings("deprecation")
public class NewsViewPagerAdapter extends FragmentStatePagerAdapter {

    public NewsViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2BlankFragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }

    }

    @Override
    //  số lượng item
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab1";
        }
        switch (position) {
            case 1:
                return "Tab2";
        }
        switch (position) {
            case 2:
                return "Tab3";
            default:
                return "Tab1";
        }
    }
}
