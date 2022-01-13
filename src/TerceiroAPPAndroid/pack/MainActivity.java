package TerceiroAPPAndroid.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    CheckBox op1,op2,op3;
    Button avançar;
    
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        op1=(CheckBox) findViewById(R.id.quest1);
        op2=(CheckBox) findViewById(R.id.quest2);
        op3=(CheckBox) findViewById(R.id.quest3);
        
        avançar=(Button) findViewById(R.id.proximo);

        op3.setOnClickListener(new View.OnClickListener(){
        
            public void onClick(View V){
            
               Toast.makeText(getApplicationContext(),"Você acertou !!!",Toast.LENGTH_LONG).show();
            
            }
        
        });
        avançar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
              Intent it = new Intent(MainActivity.this,NewActivity2.class);
                startActivity(it);
            }
        });
        
        op3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
               op2.setChecked(false);
               op1.setChecked(false);
                Toast.makeText(getApplicationContext(),"Você acertou !!!",Toast.LENGTH_LONG).show();
                int res =0;
                res++;
            }
        });
     }
 }