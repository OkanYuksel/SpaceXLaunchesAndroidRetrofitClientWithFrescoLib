package com.okanyuksel.spacexlaunchesandroidretrofitclient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

class Base {

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("employee_name")
    @Expose
    public String employee_name;

    @SerializedName("employee_salary")
    @Expose
    public String employee_salary;

    @SerializedName("employee_age")
    @Expose
    public String employee_age;

    @SerializedName("profile_image")
    @Expose
    public String profile_image;

}

 class Core
{
    @SerializedName("core_serial")
    @Expose
    public String core_serial;

    @SerializedName("flight")
    @Expose
    public Integer flight;

    @SerializedName("block")
    @Expose
    public Object block;

    @SerializedName("gridfins")
    @Expose
    public Boolean gridfins;

    @SerializedName("legs")
    @Expose
    public Boolean legs;

    @SerializedName("reused")
    @Expose
    public Boolean reused;

    @SerializedName("land_success")
    @Expose
    public Object land_success;

    @SerializedName("landing_intent")
    @Expose
    public Boolean landing_intent;

    @SerializedName("landing_type")
    @Expose
    public Object landing_type;

    @SerializedName("landing_vehicle")
    @Expose
    public Object landing_vehicle;

}

 class FirstStage
{
    @SerializedName("cores")
    @Expose
    public List<Core> cores;
}

 class OrbitParams
{
    @SerializedName("reference_system")
    @Expose
    public String reference_system;

    @SerializedName("regime")
    @Expose
    public String regime;


    @SerializedName("longitude")
    @Expose
    public Object longitude;

    @SerializedName("semi_major_axis_km")
    @Expose
    public Object semi_major_axis_km;

    @SerializedName("eccentricity")
    @Expose
    public Object eccentricity;

    @SerializedName("periapsis_km")
    @Expose
    public Integer periapsis_km;

    @SerializedName("apoapsis_km")
    @Expose
    public Integer apoapsis_km;

    @SerializedName("inclination_deg")
    @Expose
    public Integer inclination_deg;

    @SerializedName("period_min")
    @Expose
    public Object period_min;

    @SerializedName("lifespan_years")
    @Expose
    public Object lifespan_years;


    @SerializedName("epoch")
    @Expose
    public Object epoch;

    @SerializedName("mean_motion")
    @Expose
    public Object mean_motion;

    @SerializedName("raan")
    @Expose
    public Object raan;

    @SerializedName("arg_of_pericenter")
    @Expose
    public Object arg_of_pericenter;

    @SerializedName("mean_anomaly")
    @Expose
    public Object mean_anomaly;
}

 class Payload
{
    @SerializedName("payload_id")
    @Expose
    public String payload_id;

    @SerializedName("norad_id")
    @Expose
    public  List<Object> norad_id;

    @SerializedName("reused")
    @Expose
    public Boolean reused;

    @SerializedName("customers")
    @Expose
    public  List<String> customers;

    @SerializedName("nationality")
    @Expose
    public String nationality;

    @SerializedName("manufacturer")
    @Expose
    public String manufacturer;

    @SerializedName("payload_type")
    @Expose
    public String payload_type;

    @SerializedName("payload_mass_kg")
    @Expose
    public Integer payload_mass_kg;

    @SerializedName("payload_mass_lbs")
    @Expose
    public Integer payload_mass_lbs;

    @SerializedName("orbit")
    @Expose
    public String orbit;

    @SerializedName("orbit_params")
    @Expose
    public OrbitParams orbit_params;

}

 class SecondStage
{
    @SerializedName("block")
    @Expose
    public Integer block;
    @SerializedName("payloads")
    @Expose
    public  List<Payload> payloads;
}

 class Fairings
{
    @SerializedName("reused")
    @Expose
    public Boolean reused;

    @SerializedName("recovery_attempt")
    @Expose
    public Boolean recovery_attempt;

    @SerializedName("recovered")
    @Expose
    public Boolean recovered;

    @SerializedName("ship")
    @Expose
    public Object ship;
}

 class Rocket
{
    @SerializedName("rocket_id")
    @Expose
    public String rocket_id;

    @SerializedName("rocket_name")
    @Expose
    public String rocket_name;

    @SerializedName("rocket_type")
    @Expose
    public String rocket_type;

    @SerializedName("first_stage")
    @Expose
    public FirstStage first_stage;

/*
    @SerializedName("second_stage")
    @Expose
    public SecondStage second_stage;
*/
    @SerializedName("fairings")
    @Expose
    public Fairings fairings;
}

 class Telemetry
{
    @SerializedName("flight_club")
    @Expose
    public Object flight_club;
}

 class Reuse
{
    @SerializedName("core")
    @Expose
    public Boolean core;

    @SerializedName("side_core1")
    @Expose
    public Boolean side_core1;

    @SerializedName("side_core2")
    @Expose
    public Boolean side_core2;

    @SerializedName("fairings")
    @Expose
    public Boolean fairings;

    @SerializedName("capsule")
    @Expose
    public Boolean capsule;
}

 class LaunchSite
{
    @SerializedName("site_id")
    @Expose
    public String site_id;

    @SerializedName("site_name")
    @Expose
    public String site_name;

    @SerializedName("site_name_long")
    @Expose
    public String site_name_long;

}


 class LaunchFailureDetails
{
    @SerializedName("time")
    @Expose
    public Integer time;

    @SerializedName("altitude")
    @Expose
    public Object altitude;

    @SerializedName("reason")
    @Expose
    public String reason;
}

 class Links
{
    @SerializedName("mission_patch")
    @Expose
    public String mission_patch;

    @SerializedName("mission_patch_small")
    @Expose
    public String mission_patch_small;

    @SerializedName("reddit_campaign")
    @Expose
    public Object reddit_campaign;

    @SerializedName("reddit_launch")
    @Expose
    public Object reddit_launch;

    @SerializedName("reddit_recovery")
    @Expose
    public Object reddit_recovery;

    @SerializedName("reddit_media")
    @Expose
    public Object reddit_media;

    @SerializedName("presskit")
    @Expose
    public Object presskit;

    @SerializedName("article_link")
    @Expose
    public String article_link;

    @SerializedName("wikipedia")
    @Expose
    public String wikipedia;

    @SerializedName("video_link")
    @Expose
    public String video_link;

    @SerializedName("youtube_id")
    @Expose
    public String youtube_id;

    @SerializedName("flickr_images")
    @Expose
    public  List<Object> flickr_images;

}

 class Timeline
{
    @SerializedName("webcast_liftoff")
    @Expose
    public Integer webcast_liftoff;
}

public class Repo
{
    @SerializedName("flight_number")
    @Expose
    public Integer flight_number;

    @SerializedName("mission_name")
    @Expose
    public String mission_name;

    @SerializedName("mission_id")
    @Expose
    public List<Object> mission_id;

    @SerializedName("upcoming")
    @Expose
    public Boolean upcoming;

    @SerializedName("launch_year")
    @Expose
    public String launch_year;

    @SerializedName("launch_date_unix")
    @Expose
    public Integer launch_date_unix;

    @SerializedName("launch_date_utc")
    @Expose
    public Date launch_date_utc;

    @SerializedName("launch_date_local")
    @Expose
    public Date launch_date_local;

    @SerializedName("is_tentative")
    @Expose
    public Boolean is_tentative;

    @SerializedName("tentative_max_precision")
    @Expose
    public String tentative_max_precision;

    @SerializedName("tbd")
    @Expose
    public Boolean tbd;

    @SerializedName("launch_window")
    @Expose
    public Integer launch_window;

    @SerializedName("rocket")
    @Expose
    public Rocket rocket;

    @SerializedName("ships")
    @Expose
    public List<Object> ships;

    @SerializedName("telemetry")
    @Expose
    public Telemetry telemetry;

    @SerializedName("reuse")
    @Expose
    public Reuse reuse;

    @SerializedName("launch_site")
    @Expose
    public LaunchSite launch_site;

    @SerializedName("launch_success")
    @Expose
    public Boolean launch_success;

    @SerializedName("launch_failure_details")
    @Expose
    public LaunchFailureDetails launch_failure_details;

    @SerializedName("links")
    @Expose
    public Links links;

    @SerializedName("details")
    @Expose
    public String details;

    @SerializedName("static_fire_date_utc")
    @Expose
    public Date static_fire_date_utc;

    @SerializedName("static_fire_date_unix")
    @Expose
    public Integer static_fire_date_unix;

    @SerializedName("timeline")
    @Expose
    public Timeline timeline;
}