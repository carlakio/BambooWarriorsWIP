package com.example.bamboowarriorswip;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;

public class OverlaySettings extends Service {
    private WindowManager windowManager;
    private View overlayView;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize WindowManager
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        // Create the overlay view
        overlayView = new View(this);
        overlayView.setBackgroundColor(Color.argb(100, 255, 0, 0)); // Semi-transparent red
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Add the view to the WindowManager
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT
        );

        windowManager.addView(overlayView, params);

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Remove the view from the WindowManager
        windowManager.removeView(overlayView);
    }
}