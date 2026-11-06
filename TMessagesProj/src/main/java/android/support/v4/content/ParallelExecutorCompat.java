package android.support.v4.content;

import android.os.AsyncTask;

import java.util.concurrent.Executor;

public final class ParallelExecutorCompat {
    private ParallelExecutorCompat() {
    }

    public static Executor getParallelExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }
}
