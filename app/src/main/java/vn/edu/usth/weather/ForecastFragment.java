package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout main = new LinearLayout(getActivity());
        main.setBackgroundColor(#200000F);
        main.setOrientation(LinearLayout.VERTICAL);
        //monday
        TextView monday = new TextView(getActivity());
        monday.setText("Monday: Sunny, 93 degree Fahrenheit.");
        ImageView sunny = new ImageView(getActivity());
        sunny.setImageResource(R.drawable.sunny);

        main.addView(monday);
        main.addView(sunny);
        //tuesday
        TextView tuesday = new TextView(getActivity());
        tuesday.setText("Tuesday: Cloudy, 80 degree Fahrenheit.");
        ImageView cloudy = new ImageView(getActivity());
        cloudy.setImageResource(R.drawable.cloudy);

        main.addView(tuesday);
        main.addView(cloudy);
        //wednesday
        TextView wednesday = new TextView(getActivity());
        wednesday.setText("Wednesday: Beware of thunderstorm, 76 degree Fahrenheit.");
        ImageView thunderstorm = new ImageView(getActivity());
        thunderstorm.setImageResource(R.drawable.thunderstorm);

        main.addView(wednesday);
        main.addView(thunderstorm);
        //thursday
        TextView thursday = new TextView(getActivity());
        monday.setText("Thursday: Sunny, 88 degree Fahrenheit.");
        ImageView sunny = new ImageView(getActivity());
        sunny.setImageResource(R.drawable.sunny);

        main.addView(thursday);
        main.addView(sunny);
        //friday
        TextView friday = new TextView(getActivity());
        friday.setText("Friday: Sunshower, 84 degree Fahrenheit.");
        ImageView sunshower = new ImageView(getActivity());
        sunshower.setImageResource(R.drawable.sunshower);

        main.addView(friday);
        main.addView(sunshower);
        //saturday
        TextView saturday = new TextView(getActivity());
        saturday.setText("Saturday: Windy, 71 degree Fahrenheit.");
        ImageView windy = new ImageView(getActivity());
        windy.setImageResource(R.drawable.windy);

        main.addView(saturday);
        main.addView(windy);
        //sunday
        TextView sunday = new TextView(getActivity());
        saturday.setText("Sunday: Sunny, 81 degree Fahrenheit.");
        ImageView sunny = new ImageView(getActivity());
        sunny.setImageResource(R.drawable.sunny);

        main.addView(sunday);
        main.addView(sunny);

        return main;
    }
}