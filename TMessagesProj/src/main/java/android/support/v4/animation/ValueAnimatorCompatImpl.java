package android.support.v4.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

class ValueAnimatorCompatImpl implements ValueAnimatorCompat {
    private final ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);

    @Override
    public void setTarget(View view) {
        animator.setTarget(view);
    }

    @Override
    public void addListener(final AnimatorListenerCompat listener) {
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                listener.onAnimationStart(ValueAnimatorCompatImpl.this);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                listener.onAnimationEnd(ValueAnimatorCompatImpl.this);
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                listener.onAnimationCancel(ValueAnimatorCompatImpl.this);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                listener.onAnimationRepeat(ValueAnimatorCompatImpl.this);
            }
        });
    }

    @Override
    public void addUpdateListener(final AnimatorUpdateListenerCompat listener) {
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                listener.onAnimationUpdate(ValueAnimatorCompatImpl.this);
            }
        });
    }

    @Override
    public void setDuration(long duration) {
        animator.setDuration(duration);
    }

    @Override
    public void start() {
        animator.start();
    }

    @Override
    public void cancel() {
        animator.cancel();
    }

    @Override
    public float getAnimatedFraction() {
        return animator.getAnimatedFraction();
    }
}
