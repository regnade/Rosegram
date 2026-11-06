package android.support.v4.animation;

public interface AnimatorListenerCompat {
    void onAnimationStart(ValueAnimatorCompat animation);
    void onAnimationEnd(ValueAnimatorCompat animation);
    void onAnimationCancel(ValueAnimatorCompat animation);
    void onAnimationRepeat(ValueAnimatorCompat animation);
}
