package com.sw.tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sw.general.utils.CheckUtils;
import com.sw.general.utils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    private EditText mEtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtContent = findViewById(R.id.et_content);
    }

    /**
     * 确定
     *
     * @param view
     */
    public void certain(View view) {
        String content = mEtContent.getText().toString().trim();
        ToastUtils.getInstance(this).showToast("" + CheckUtils.isBankCard(content));
    }
}
