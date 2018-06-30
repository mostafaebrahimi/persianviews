package ir.meandme.persianviews;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;

/**
 * Created by Mostafa on 8/7/2017. :)
 */

public abstract class OnOneOffClickListener implements View.OnClickListener {

    private static final long MIN_CLICK_INTERVAL=600;

    private long mLastClickTime;

    public static boolean isViewClicked = false;


    public abstract void onSingleClick(View v);

    @Override
    public final void onClick(View v) {
        long currentClickTime= SystemClock.uptimeMillis();
        long elapsedTime=currentClickTime-mLastClickTime;

        mLastClickTime=currentClickTime;

        if(elapsedTime<=MIN_CLICK_INTERVAL)
            return;
        if(!isViewClicked){
            isViewClicked = true;
            startTimer();
        } else {
            return;
        }
        onSingleClick(v);
    }
    /**
     * This method delays simultaneous touch events of multiple views.
     */
    private void startTimer() {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                isViewClicked = false;
            }
        }, 600);

    }

}