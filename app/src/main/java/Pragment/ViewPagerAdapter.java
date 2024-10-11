package Pragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

@SuppressWarnings("deprecation")
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Home_Fragment();
            case 1:
                return new fragment_news();
            case 2:
                return new fragment_account();
            default:
                return new Home_Fragment();
        }

    }

    @Override
    //  số lượng item
    public int getCount() {
        return 3;
    }
}
