package com.okanyuksel.spacexlaunchesandroidretrofitclient;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<Launch> {
    private @Nullable  ResizeOptions mResizeOptions;
    private final LayoutInflater inflater;
    private final Context context;
    private ViewHolder holder;
    private final ArrayList<Launch> launches;


    public CustomListViewAdapter(Context context, ArrayList<Launch> launches) {
        super(context,0, launches);
        this.context = context;
        this.launches = launches;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return launches.size();
    }

    @Override
    public Launch getItem(int position) {
        return launches.get(position);
    }

    @Override
    public long getItemId(int position) {
        return launches.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.row_layout, null);

            holder = new ViewHolder();
            holder.launchPatchMini = (SimpleDraweeView) convertView.findViewById(R.id.imgMiniPatch);
            holder.launchMissionName = (TextView) convertView.findViewById(R.id.tvMissionName);
            holder.launchedRocketName =  (TextView) convertView.findViewById(R.id.tvRocketName);
            holder.launchYear = (TextView) convertView.findViewById(R.id.tvLaunchYear);
            convertView.setTag(holder);

        }
        else{
            //Get viewholder we already created
            holder = (ViewHolder)convertView.getTag();
        }

        Launch launch = launches.get(position);
        if(launch != null){
          /*  try {
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(launch.links.mission_patch_small).getContent());
                holder.launchPatchMini.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            Uri myUri = Uri.parse(launch.links.mission_patch_small);
            final ImageRequest imageRequest =
                    ImageRequestBuilder.newBuilderWithSource(myUri)
                            .setResizeOptions(mResizeOptions)
                            .build();
            holder.launchPatchMini.setImageRequest(imageRequest);

            holder.launchMissionName.setText("Mission Name: " + launch.mission_name);
            holder.launchedRocketName.setText("Rocket Name: " + launch.rocket.rocket_name);
            holder.launchYear.setText(launch.launch_year);
        }
        return convertView;
    }

    //View Holder Pattern for better performance
    private static class ViewHolder {
        TextView launchMissionName;
        TextView launchedRocketName;
        TextView launchYear;
        SimpleDraweeView launchPatchMini;
    }
}