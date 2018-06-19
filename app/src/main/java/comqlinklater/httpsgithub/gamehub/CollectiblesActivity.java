package comqlinklater.httpsgithub.gamehub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CollectiblesActivity extends AppCompatActivity {

    public final static String EXTRA_COLLECTIBLENO = "collectibleNo";

    private ImageView cCollectiblePhoto;
    private TextView cCollectibleName;
    private TextView cCollectibleDescription;

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
        setContentView(R.layout.activity_collectibles);

        int collectibleNo = (Integer) getIntent().getExtras().get(EXTRA_COLLECTIBLENO);

        Collectibles collectibles = Collectibles.collectibles[collectibleNo];

        cCollectiblePhoto = (ImageView) findViewById(R.id.iv_collectible);
        cCollectibleName = (TextView) findViewById(R.id.tv_name);
        cCollectibleDescription = (TextView) findViewById(R.id.tv_description);

        cCollectiblePhoto.setImageResource( collectibles.getImageResourceId() );
        cCollectiblePhoto.setContentDescription( collectibles.getDescription() );

        cCollectibleName.setText( collectibles.getName() );
        cCollectibleDescription.setText( collectibles.getDescription() );
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
