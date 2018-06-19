package comqlinklater.httpsgithub.gamehub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CollectiblesCategoryActivity extends AppCompatActivity {

    private ListView cCollectiblesList;

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
        setContentView(R.layout.activity_collectibles_category);

        cCollectiblesList = (ListView) findViewById(R.id.lv_collectibles);

        ArrayAdapter<Collectibles> arrayAdapter = new ArrayAdapter<Collectibles>(this, android.R.layout.simple_list_item_1, Collectibles.collectibles);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Intent collectibleIntent = new Intent(CollectiblesCategoryActivity.this, CollectiblesActivity.class);

                collectibleIntent.putExtra( CollectiblesActivity.EXTRA_COLLECTIBLENO, position);

                startActivity( collectibleIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
            }
        };
        cCollectiblesList.setAdapter(arrayAdapter);
        cCollectiblesList.setOnItemClickListener(itemClickListener);
    }

    /**
     * onBackPressed is a command call to the back button to set animations when pulling back
     * @param ""there is no parameters
     * @return there is nothing to return
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
