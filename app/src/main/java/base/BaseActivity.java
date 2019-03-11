package base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.wangzhen.admin.studyproject.R;

import butterknife.ButterKnife;

/**
 * Created by admin on 2019/3/11.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected static String TAG = "MDL";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayoutId();
        ButterKnife.bind(this);
        TAG = getClass().getSimpleName();
    }

    public abstract void setLayoutId();
    public abstract void initData();
    public abstract void initEvent();

    protected View $findViewById(int viewId){
        View view = findViewById(viewId);
        return view;
    }

}
