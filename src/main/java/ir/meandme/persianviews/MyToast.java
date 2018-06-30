package ir.meandme.persianviews;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Mostafa on 10/17/2017. :)
 */

public class MyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public MyToast(Context context, String data, int color) {
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.toast_layout, null);
        setView(layout);

        TextView tvToast = (TextView) layout.findViewById(R.id.toast_text_view);
        tvToast.setText(data);
/*
        if(color == 0) {
            tvToast.setTextColor(context.getResources().getColor(R.color.dot_dark_screen1));
        } else {

            tvToast.setTextColor(context.getResources().getColor(R.color.primary_text));
        }*/
    }


}
