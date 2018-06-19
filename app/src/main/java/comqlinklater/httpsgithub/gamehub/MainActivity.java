package comqlinklater.httpsgithub.gamehub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private ListView mOptionsList;

    /**
     * onCreate is the method that is run when er create an instance of this activity
     *
     * @param savedInstanceState is a bundle object that allows the activity to restore
     *                           itself to a previously saved instance
     * @return nothing is returned
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOptionsList = (ListView) findViewById(R.id.lv_options);


        String[] options = new String[]{"Video game platforms", "Video game consoles", "Collectibles", "Stores", "Share your experience"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent platformIntent = new Intent(MainActivity.this, PlatformCategoryActivity.class);
                Intent consolesIntent = new Intent(MainActivity.this, ConsoleCategoryActivity.class);
                Intent collectiblesIntent = new Intent(MainActivity.this, CollectiblesCategoryActivity.class);

                Intent mapsIntent;
                Intent shareIntent;

                Intent Chooser;

                Uri mapsIntentUri = Uri.parse("geo:49.8998, -97.1375?z=10&q=" + Uri.encode("Video Games Stores"));

                if (position == 0) {
                    startActivity(platformIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                } else if (position == 1) {
                    startActivity(consolesIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                } else if (position == 2) {
                    startActivity(collectiblesIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                } else if (position == 3) {
                    mapsIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);

                    if (mapsIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapsIntent);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    }
                } else if (position == 4) {
                    shareIntent = new Intent(Intent.ACTION_VIEW);

                    shareIntent.setType("text/plain");

                    shareIntent.putExtra(Intent.EXTRA_TEXT, "I want to say this about GameHub: \n");

                    Chooser = Intent.createChooser(shareIntent, "Select an app...");

                    startActivity(Chooser);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                }
            }
        };

        mOptionsList.setAdapter(arrayAdapter);
        mOptionsList.setOnItemClickListener(itemClickListener);
    }
}
