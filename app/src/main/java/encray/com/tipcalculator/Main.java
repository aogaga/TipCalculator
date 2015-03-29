package encray.com.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class Main extends ActionBarActivity {

    private  static final String BILL_TOTAL = " BILL TOTAL";
    private static  final  String CUSTOM_PERCENT = "CUSTOM_PERCENT";


    private double currentBillTotal; // bill amount entered by the user
    private int currentCustomPercent; // tip % set with the SeeekerBar

    private EditText editTextTen; // displays 10%
    private EditText editTextTenValue; // display total with 10% tip
    private EditText editTextFifteen; //displays 15% tip
    private EditText editTextFifteenValue; // displays total with 15% tip


    private EditText editTextTwenty; //displays 20% tip
    private  EditText editTextTwentyValue; // displays total with 20% tip
    private TextView editTextCustomTipValue; // displays custom tip amount
    private EditText editTextCustomTipTotal; // displays custom tip amount
    private EditText editTextCustomBillTotal; // display total with custom tip

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
