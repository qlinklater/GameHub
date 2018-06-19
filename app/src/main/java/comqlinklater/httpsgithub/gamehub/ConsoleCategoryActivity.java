package comqlinklater.httpsgithub.gamehub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConsoleCategoryActivity extends AppCompatActivity {

    private ListView cConsoleList;

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
        setContentView(R.layout.activity_console_category);

        cConsoleList = (ListView) findViewById(R.id.lv_consoles);

        ArrayAdapter<Console> arrayAdapter = new ArrayAdapter<Console>(this, android.R.layout.simple_list_item_1, Console.consoles);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Intent consoleIntent = new Intent(ConsoleCategoryActivity.this, ConsoleActivity.class);

                consoleIntent.putExtra( ConsoleActivity.EXTRA_CONSOLENO, position);

                startActivity( consoleIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
            }
        };
        cConsoleList.setAdapter(arrayAdapter);
        cConsoleList.setOnItemClickListener(itemClickListener);

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
