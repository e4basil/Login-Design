package basi.test.com.login.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import basi.test.com.login.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_login;
    private TextView textforgotpassword;
    @BindView(R.id.login_emailid)
    EditText loginEmailid;
    @BindView(R.id.login_password)
    EditText loginPassword;
    @BindView(R.id.already_user)
    TextView alreadyUser;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        unbinder = ButterKnife.bind(this);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);

        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "SFUIDisplay-Thin.otf");

        loginEmailid.setTypeface(custom_font1);
        loginPassword.setTypeface(custom_font1);
        btn_login.setTypeface(custom_font1);
        alreadyUser.setTypeface(custom_font1);
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
//                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
                break;

        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
