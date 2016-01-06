package com.example.horinoa.mykotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mhellotext ;
    private TextView mcounttext;
    private Button mhellobuttom;
    private Button mcountbuttom;
    private Button mlistbuttom;
    private Mydata mMydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Hellobutton).setOnClickListener(this);
        findViewById(R.id.Countbutton).setOnClickListener(this);
        findViewById(R.id.listchangebuttom).setOnClickListener(this);
        mlistbuttom = (Button)findViewById(R.id.listchangebuttom);
        mhellobuttom = (Button)findViewById(R.id.Hellobutton);
        mcountbuttom = (Button)findViewById(R.id.Countbutton);
        mhellotext = (TextView)findViewById(R.id.Hellotext);
        mcounttext = (TextView)findViewById(R.id.Counttext);

        mMydata = new Mydata();
        //MylistFragment mylistFragmeny = getSupportFragmentManager().findFragmentById(R.id.listfragment)
    }

    @Override
    public void onClick(View v) {
        int getID = v.getId();
        switch (getID){
            case R.id.Hellobutton:
                mhellotext.setText(mMydata.getHello());
                break;
            case R.id.Countbutton:
                int setInt = mMydata.getCountData()+ 1;
                mcounttext.setText(String.valueOf(setInt));
                mMydata.setCountData(setInt);
                try{
                    mMydata.runtest();
                }catch (Exception e){
                    Log.e("LOG_TAG", "File Reading Error", e);
                }
                break;
            case R.id.listchangebuttom:
                MylistFragment mylistFragment = (MylistFragment) getFragmentManager().
                                                findFragmentById(R.id.listfragment);
                mylistFragment.reflashListFragment();
                break;
            default:
                break;
        }

    }
}
