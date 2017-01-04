package bughunters.tashfik.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    InputStream inputStream;

    String[] ids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputStream = getResources().openRawResource(R.raw.sample);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {



                ids=csvLine.split(",");
                try{

                   Log.e("Collumn 1 ",""+ids[0]) ;



                }catch (Exception e){
                    Log.e("Unknown fuck",e.toString());
                }
            }




        }
        catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: "+ex);
        }



    }
}
