package android.support.v4.animation;

import android.view.View;

public interface ValueAnimatorCompat {
    void setTarget(View view);
    void addListener(AnimatorListenerCompat listener);
    void addUpdateListener(AnimatorUpdateListenerCompat listener);
    void setDuration(long duration);
    void start();
    void cancel();
    float getAnimatedFraction();
}
