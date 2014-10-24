package com.example.ps;

import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {
	
	int years;
	EditText amount, rate, futureval;
	String[] num_years = {
		      "1",
		      "2",
		      "3",
		      "4",
		      "5",
		      "6",
		      "7",
		      "8",
		      "9"
		  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        amount = (EditText)findViewById(R.id.editText1);
        rate = (EditText)findViewById(R.id.editText2);
        futureval = (EditText)findViewById(R.id.EditText01);
        Button cal = (Button)findViewById(R.id.button1);
        final Spinner spnr = (Spinner) findViewById(R.id.spinner1);
       
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, num_years);
            spnr.setAdapter(adapter);
            spnr.setOnItemSelectedListener(
                    new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                int arg2, long arg3) {
                          years = spnr.getSelectedItemPosition();
                            // TODO Auto-generated method stub
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> arg0) {
                            // TODO Auto-generated method stub
                        }
                    }
                );
    
        Double r =  Double.parseDouble(rate.getText().toString());
        int a =  Integer.parseInt(rate.getText().toString());
        CalcEngine fv = new CalcEngine(a, years,r);
        double futurval = fv.getFv();
        futureval.setText(Double.toString(futurval));
        cal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
