package ir.telgeram.Adel.Olds;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import ir.telgeram.ui.ActionBar.BaseFragment;

public class DeleteBySelectContacts extends BaseFragment {
    public DeleteBySelectContacts(Bundle args) {
        super(args);
    }

    @Override
    public View createView(Context context) {
        fragmentView = new FrameLayout(context);
        return fragmentView;
    }
}
