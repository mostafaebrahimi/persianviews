package ir.meandme.persianviews;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Mostafa on 7/20/2017. :)
 */

public class ConfigAndURLs {

    public static Typeface getFontRegular(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Shabnam-FD.ttf");
    }

    public static Typeface getFontLight(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Shabnam-Light-FD.ttf");
    }


    public static Typeface getFontBold(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Shabnam-Bold-FD.ttf");
    }






}
