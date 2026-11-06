package ir.telgeram.Adel;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import ir.telgeram.ui.ActionBar.BaseFragment;

public class IdFinderActivity extends BaseFragment {
    @Override
    public View createView(Context context) {
        fragmentView = new FrameLayout(context);
        return fragmentView;
    }
}
