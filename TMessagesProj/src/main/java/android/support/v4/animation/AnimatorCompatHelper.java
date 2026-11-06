package android.support.v4.animation;

import android.view.View;

public final class AnimatorCompatHelper {
    private AnimatorCompatHelper() {
    }

    public static ValueAnimatorCompat emptyValueAnimator() {
        return new ValueAnimatorCompatImpl();
    }

    public static void clearInterpolator(View view) {
        view.animate().setInterpolator(null);
    }
}
