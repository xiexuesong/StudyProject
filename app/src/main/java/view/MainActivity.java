package view;

import android.view.View;
import android.widget.Button;

import com.wangzhen.admin.studyproject.R;

import base.BaseActivity;
import butterknife.BindView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.bt_acquire)
    Button bt_acquire;//获取天气信息

    @Override
    public void setLayoutId() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        bt_acquire.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_acquire:

                break;
            default:
                break;
        }
    }
}
