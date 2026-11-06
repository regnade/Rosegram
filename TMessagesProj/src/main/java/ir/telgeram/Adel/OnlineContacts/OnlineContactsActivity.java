package ir.telgeram.Adel.OnlineContacts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import ir.telgeram.ui.ActionBar.BaseFragment;

public class OnlineContactsActivity extends BaseFragment {
    public OnlineContactsActivity(Bundle args) {
        super(args);
    }

    @Override
    public View createView(Context context) {
        fragmentView = new FrameLayout(context);
        return fragmentView;
    }
}
