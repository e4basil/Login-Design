package basi.test.com.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
        handler=new Handler();
        lauchApp();
    }
    private void lauchApp() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //   String uservalue = SharedPreferenceUtil.getSharedvalueString(Constants.LOGIN_KEY, SplashActivity.this);
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
