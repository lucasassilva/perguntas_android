/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceiroAPPAndroid.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 *
 * @author LASilva-inf171
 */
public class NewActivity2 extends Activity {

    /**
     * Called when the activity is first created.
     */
     CheckBox opc1,opc2,opc3;
      Button avançar;
        
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main2);
    
        opc1=(CheckBox) findViewById(R.id.ques1);
        opc2=(CheckBox) findViewById(R.id.ques2);
        opc3=(CheckBox) findViewById(R.id.ques3);
        
        avançar=(Button) findViewById(R.id.proximo2);

        opc3.setOnClickListener(new View.OnClickListener(){
        
            public void onClick(View V){
            
               Toast.makeText(getApplicationContext(),"Você acertou !!!",Toast.LENGTH_LONG).show();
            
            }
        
        });
        avançar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
             Intent it = new Intent(NewActivity2.this,NewActivity3.class);
             startActivity(it);
            }
        });
        
        opc3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
               opc2.setChecked(false);
               opc1.setChecked(false);
                Toast.makeText(getApplicationContext(),"Você acertou !!!",Toast.LENGTH_LONG).show();
                int res =0;
                res++;
            }
        });
     }
    }

