package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherFragmentAdapter extends FragmentStateAdapter {
    public WeatherFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            default:
                return new WeatherAndForecastFragment();
                break;
            case 0:
                return new WeatherAndForecastFragment();
                break;
            case 1:
                return new WeatherAndForecastFragment();
                break;
            case 2:
                return new WeatherAndForecastFragment();
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
