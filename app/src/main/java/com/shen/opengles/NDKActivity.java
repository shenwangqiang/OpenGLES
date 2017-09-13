package com.shen.opengles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by shenwangqiang on 2017/9/13.
 */
public class NDKActivity extends Activity {
    private TextView mTvText;

    static {
        System.loadLibrary("YanboberJniLibName");
    }

    public native String getStringFromNative();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvText = (TextView) findViewById(R.id.tv_text);
        mTvText.setText(new NdkJniUtils().getCLanguageString());
    }
}
