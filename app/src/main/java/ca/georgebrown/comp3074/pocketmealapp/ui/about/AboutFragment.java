package ca.georgebrown.comp3074.pocketmealapp.ui.about;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ca.georgebrown.comp3074.pocketmealapp.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class AboutFragment extends Fragment {

    // UI Navigation Code Variables
    private TextView AboutContent;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View aboutPage = new AboutPage(getContext())
                .isRTL(false)
                .setImage(R.mipmap.ic_launcher)
                .setDescription("Description") //getString(R.string.about_us_description)
                // .addItem(new Element("Version " + BuildConfig.VERSION_NAME, R.drawable.ic_info))
                .addItem(new Element().setTitle("Version 1.0.0 - 04.2020"))
                .addGroup("Connect with us")
                .addGitHub("SteevenOrell/CapstoneProject-PocketMealSystem")
                .addEmail("101133638@georgebrown.ca")
                .create();



        return inflater.inflate(R.layout.fragment_about, container, false);
    }
}
