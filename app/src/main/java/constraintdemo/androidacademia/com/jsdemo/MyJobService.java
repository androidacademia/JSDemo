package constraintdemo.androidacademia.com.jsdemo;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by girishkumarshakya on 11/04/18.
 */

public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        for (int i=0;i<10;i++){
            Log.i("MyJobService",""+i);
        }
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
