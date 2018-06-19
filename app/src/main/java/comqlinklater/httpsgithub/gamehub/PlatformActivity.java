package comqlinklater.httpsgithub.gamehub;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlatformActivity extends AppCompatActivity {

    public static final String EXTRA_PLATFORMNO = "platformNo";

    private ImageView pPlatformPhoto;
    private TextView pPlatformName;
    private TextView pPlatformDescription;

    /**
     * /**
     * onCreate is the method that is run when er create an instance of this activity
     *
     * @param savedInstanceState is a bundle object that allows the activity to restore
     *                           itself to a previously saved instance
     * @return nothing is returned
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platform);

        int platformNo = (Integer) getIntent().getExtras().get(EXTRA_PLATFORMNO);

        Platform platform = Platform.platforms[platformNo];

        pPlatformPhoto = (ImageView) findViewById(R.id.iv_platform);
        pPlatformName = (TextView) findViewById(R.id.tv_name);
        pPlatformDescription = (TextView) findViewById(R.id.tv_description);

        pPlatformPhoto.setImageResource( platform.getImageResourceId() );
        pPlatformPhoto.setContentDescription( platform.getDescription() );

        pPlatformName.setText( platform.getName() );
        pPlatformDescription.setText( platform.getDescription() );
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
