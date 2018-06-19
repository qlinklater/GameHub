package comqlinklater.httpsgithub.gamehub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ConsoleActivity extends AppCompatActivity {

    public static final String EXTRA_CONSOLENO = "consoleNo";

    private ImageView cConsolePhoto;
    private TextView cConsoleName;
    private TextView cConsoleDescription;

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
        setContentView(R.layout.activity_console);

        int consoleNo = (Integer) getIntent().getExtras().get(EXTRA_CONSOLENO);

        Console console = Console.consoles[consoleNo];

        cConsolePhoto = (ImageView) findViewById(R.id.iv_console);
        cConsoleName = (TextView) findViewById(R.id.tv_name);
        cConsoleDescription = (TextView) findViewById(R.id.tv_description);

        cConsolePhoto.setImageResource( console.getImageResourceId() );
        cConsolePhoto.setContentDescription( console.getDescription() );

        cConsoleName.setText( console.getName() );
        cConsoleDescription.setText( console.getDescription() );
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
