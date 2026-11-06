package ir.telgeram.Adel;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;

import android.app.AlertDialog;

import org.json.JSONObject;

import ir.telgeram.messenger.AndroidUtilities;
import ir.telgeram.messenger.LocaleController;
import ir.telgeram.messenger.R;
import ir.telgeram.ui.ActionBar.ActionBar;
import ir.telgeram.ui.ActionBar.BaseFragment;
import ir.telgeram.ui.Components.LayoutHelper;
import ir.telgeram.ui.DialogsActivity;

public class SelectColorActivity extends BaseFragment
{

	private GridView   gridview;
	//    private RequestQueue requestQueue;
	private JSONObject dataforweb;
	private Context    thiscontext;

	@Override
	public View createView(final Context context)
	{
		thiscontext = context;
		//        requestQueue = Volley.newRequestQueue(ApplicationLoader.applicationContext);
		// actionBar.setBackgroundColor(AvatarDrawable.getProfileBackColorForId(5));
		//  actionBar.setItemsBackgroundColor(AvatarDrawable.getButtonColorForId(5));
		actionBar.setBackButtonImage(R.drawable.ic_ab_back);
		actionBar.setTitle(LocaleController.getString("Themes", R.string.Themes));
		actionBar.setAddToContainer(false);
		actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick()
		{
			@Override
			public void onItemClick(int id)
			{
				if (id == -1)
				{
					finishFragment();
				}
			}
		});
		if (AndroidUtilities.isTablet())
		{
			actionBar.setOccupyStatusBar(false);
		}

		fragmentView = new FrameLayout(context);
		FrameLayout frameLayout = (FrameLayout) fragmentView;
		//frameLayout.setPadding(20,20,20,20);
		gridview = new GridView(context);
		gridview.setHorizontalSpacing(10);
		gridview.setVerticalSpacing(10);
		gridview.setAdapter(new SelectColorAdapter(context));
		gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
			{
				if (i > 0)
				{
					Setting.setActionbarcolor(ThemeChanger.LoadThemes().get(i).getActionbarcolor());
					Setting.setTabcolor(ThemeChanger.LoadThemes().get(i).getTabLayoutColor());
					ThemeChanger.ChangeTheme();
					parentLayout.rebuildAllFragmentViews(false);
					finishFragment();
				}
				else
				{
					new AlertDialog.Builder(context)
							.setTitle(LocaleController.getString("SelectColor", R.string.SelectColor))
							.setPositiveButton("ok", new DialogInterface.OnClickListener()
							{
								@Override
								public void onClick(DialogInterface dialog, int which)
								{
									finishFragment();
								}
							})
							.setNegativeButton("cancel", null)
							.show();
				}
			}
		});
		frameLayout.addView(gridview, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 80, 0, 0));
		frameLayout.addView(actionBar);
		return fragmentView;
	}
}
