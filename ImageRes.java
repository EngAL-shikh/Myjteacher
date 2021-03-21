package com.example.myteacher;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.HashMap;

public class ImageRes {

    private HashMap<Character,Integer> hashMap;

    public ImageRes(){
        hashMap = new HashMap<>();
        hashMap.put(' ',R.drawable.space);
        hashMap.put('ا',R.drawable.alef);
        hashMap.put('ل',R.drawable.laam);
        hashMap.put('م',R.drawable.mem);
        hashMap.put('ر',R.drawable.raa);
        hashMap.put('و',R.drawable.waaw);
        hashMap.put('ب',R.drawable.baa);
        hashMap.put('ي',R.drawable.yaa);
        hashMap.put('ه',R.drawable.haa);
        hashMap.put('ت',R.drawable.taa);
        hashMap.put('ح',R.drawable.a_7aa);
    }

    public int getImg(char Char){
        if(hashMap.containsKey(Char))
               return hashMap.get(Char);
          else
              return -1;
    }

    public void animatedChange(Context c, final ImageView v, final Bitmap new_image) {
        // context
        final Animation anim_out = AnimationUtils.loadAnimation(c, android.R.anim.fade_out);
        final Animation anim_in  = AnimationUtils.loadAnimation(c, android.R.anim.fade_in);
        anim_out.setAnimationListener(new Animation.AnimationListener()
        {
            @Override public void onAnimationStart(Animation animation) {}
            @Override public void onAnimationRepeat(Animation animation) {}
            @Override public void onAnimationEnd(Animation animation)
            {
                v.setImageBitmap(new_image);
                anim_in.setAnimationListener(new Animation.AnimationListener() {
                    @Override public void onAnimationStart(Animation animation) {}
                    @Override public void onAnimationRepeat(Animation animation) {}
                    @Override public void onAnimationEnd(Animation animation) {}
                });
                v.startAnimation(anim_in);
                // this
            }
        });
        v.startAnimation(anim_out);
    }


}