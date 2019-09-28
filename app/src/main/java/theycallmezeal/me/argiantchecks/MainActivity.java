package theycallmezeal.me.argiantchecks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.button);
        final Intent goToCheckActivity = new Intent(this, CheckActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameText = (EditText) findViewById(R.id.nameText);
                String name = nameText.getText().toString();

                EditText amountText = (EditText) findViewById(R.id.amountText);
                String amount = amountText.getText().toString();

                EditText memoText = (EditText) findViewById(R.id.memoText);
                String memo = memoText.getText().toString();

                goToCheckActivity.putExtra("name", name);
                goToCheckActivity.putExtra("amount", amount);
                goToCheckActivity.putExtra("memo", memo);
                startActivity(goToCheckActivity);
            }
        });
    }
}
