package com.okanyuksel.spacexlaunchesandroidretrofitclient;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> listLaunches = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        final CustomListViewAdapter listViewAdapter[] = new CustomListViewAdapter[1];
        listView = (ListView) findViewById(R.id.listLaunches);


        final RestInterface[] restInterface = new RestInterface[1];
        restInterface[0] = ApiClient.getClient("https://api.spacexdata.com/").create(RestInterface.class);
        Call<List<Launch>> call = restInterface[0].getLaunches();
        call.enqueue(new Callback<List<Launch>>() {
            @Override
            public void onResponse(Call<List<Launch>> call, Response<List<Launch>> response) {

                if (response.body() != null) {
                    listLaunches.addAll(response.body());
                }

                if (listLaunches.size() > 0) {
                    for (int i = 0; i < listLaunches.size(); i++) {
                        System.out.println("******************************" + "\n");
                        System.out.println("" + listLaunches.get(i).mission_name + "\n");
                        System.out.println("" + listLaunches.get(i).launch_year + "\n");
                        System.out.println("" + listLaunches.get(i).details + "\n");
                        System.out.println("" + listLaunches.get(i).launch_success + "\n");
                        if (listLaunches.get(i).launch_success = false) {
                            System.out.println("" + listLaunches.get(i).launch_failure_details.reason + "\n");
                        }
                        System.out.println("" + listLaunches.get(i).launch_site.site_name_long + "\n");
                        System.out.println("" + listLaunches.get(i).rocket.rocket_id + "\n");
                        System.out.println("" + listLaunches.get(i).rocket.rocket_name + "\n");
                        System.out.println("" + listLaunches.get(i).rocket.rocket_type + "\n");
                        System.out.println("" + listLaunches.get(i).links.article_link + "\n");
                        System.out.println("" + listLaunches.get(i).links.mission_patch_small + "\n");
                        System.out.println("" + listLaunches.get(i).links.wikipedia + "\n");
                        System.out.println("" + listLaunches.get(i).links.video_link + "\n");
                    }
                    listViewAdapter[0] = new CustomListViewAdapter(MainActivity.this, listLaunches);
                    listView.setAdapter(listViewAdapter[0]);
                }

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        AlertDialog.Builder builder = DialogHelper.alertBuilder(MainActivity.this);
                        builder.setTitle(listLaunches.get(position).mission_name);
                        String strMessage = "Launched Rocket: " + listLaunches.get(position).rocket.rocket_name + "\n" + "Rocket Type: " + listLaunches.get(position).rocket.rocket_type;
                        if (listLaunches.get(position).details != null) {
                            strMessage += "\n" + "\n" + listLaunches.get(position).details;
                        }
                        builder.setMessage(strMessage);
                        builder.setPositiveButton("Close", null);
                        builder.show();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<Launch>> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }
}
