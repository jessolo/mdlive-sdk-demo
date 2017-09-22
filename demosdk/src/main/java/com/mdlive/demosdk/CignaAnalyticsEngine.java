package com.mdlive.demosdk;

import android.util.Log;

import com.mdlive.mdlcore.tracker.analytics.engines.AnalyticsEngine;

/**
 * Created by m63460 on 9/7/17.
 */

public class CignaAnalyticsEngine implements AnalyticsEngine {

    public static final String TAG = CignaAnalyticsEngine.class.getCanonicalName();
    @Override
    public void logEvent(String eventName, String eventAction, String eventCategory) {
        Log.d(TAG, "Event Name:"+eventName+"#Action:"+eventAction+"Category: "+eventCategory);
    }
}
