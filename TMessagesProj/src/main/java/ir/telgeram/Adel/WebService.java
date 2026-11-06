package ir.telgeram.Adel;

import android.os.AsyncTask;

public class WebService extends AsyncTask<String, Void, String> {
    public WebService(Object listener) {
    }

    @Override
    protected String doInBackground(String... params) {
        return BaseApplication.OK;
    }
}
