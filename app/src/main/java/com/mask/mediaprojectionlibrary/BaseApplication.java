package com.mask.mediaprojectionlibrary;

import android.util.Log;

/**
 * 应用基类Application(继承于框架基类Application)
 * Created by lishilin on 2016/11/29.
 */
public class BaseApplication extends BaseFrameApplication {

    @Override
    protected Class getCrashLauncherActivity() {
        return MainActivity.class;
    }

    @Override
    protected void uncaughtException(Thread thread, Throwable ex) {
        super.uncaughtException(thread, ex);
    }

    @Override
    protected void onInitData() {
        super.onInitData();
        Log.i("yangliu", "BaseApplication onInitData");
    }

    @Override
    protected void onInitDataThread() {
        super.onInitDataThread();
        Log.i("yangliu","BaseApplication onInitDataThread");
    }
}