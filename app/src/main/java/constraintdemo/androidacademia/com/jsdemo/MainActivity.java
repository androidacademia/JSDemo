package constraintdemo.androidacademia.com.jsdemo;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    JobScheduler jobScheduler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jobScheduler = (JobScheduler)getSystemService(JOB_SCHEDULER_SERVICE);

        JobInfo.Builder builder = new JobInfo.Builder(1,new ComponentName(getPackageName(),
                MyJobService.class.getName()));

        builder.setMinimumLatency(60000);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        builder.setRequiresCharging(true);



        jobScheduler.schedule(builder.build());
    }
}
