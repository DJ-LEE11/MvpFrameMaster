package com.example.libflycobanner.anim.select;

import android.view.View;

import com.example.libflycobanner.anim.base.IndicatorBaseAnimator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ObjectAnimator;

public class RotateEnter extends IndicatorBaseAnimator {
    public RotateEnter() {
        this.duration = 250;
    }

    public void setAnimation(View view) {
        this.animatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "rotation", 0, 180)});
    }
}
