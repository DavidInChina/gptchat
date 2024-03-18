package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import u5.RunnableC5841a;

/* loaded from: classes2.dex */
public final class TempSensorBreadcrumbsIntegration implements X, Closeable, SensorEventListener {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34045Y;

    /* renamed from: Z  reason: collision with root package name */
    public io.sentry.G f34046Z;

    /* renamed from: h0  reason: collision with root package name */
    public SentryAndroidOptions f34047h0;

    /* renamed from: i0  reason: collision with root package name */
    public SensorManager f34048i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f34049j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f34050k0 = new Object();

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.f34045Y = context;
    }

    public final void a(r1 r1Var) {
        try {
            SensorManager sensorManager = (SensorManager) this.f34045Y.getSystemService("sensor");
            this.f34048i0 = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.f34048i0.registerListener(this, defaultSensor, 3);
                    r1Var.getLogger().f(EnumC3642e1.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    r.f.e(TempSensorBreadcrumbsIntegration.class);
                } else {
                    r1Var.getLogger().f(EnumC3642e1.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                }
            } else {
                r1Var.getLogger().f(EnumC3642e1.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
            }
        } catch (Throwable th2) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34050k0) {
            this.f34049j0 = true;
        }
        SensorManager sensorManager = this.f34048i0;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f34048i0 = null;
            SentryAndroidOptions sentryAndroidOptions = this.f34047h0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f34046Z = io.sentry.A.f33710a;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34047h0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f34047h0.isEnableSystemEventBreadcrumbs()));
        if (this.f34047h0.isEnableSystemEventBreadcrumbs()) {
            try {
                r1Var.getExecutorService().submit(new RunnableC5841a(this, 18, r1Var));
            } catch (Throwable th2) {
                r1Var.getLogger().d(EnumC3642e1.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length != 0 && fArr[0] != 0.0f && this.f34046Z != null) {
            C3640e c3640e = new C3640e();
            c3640e.f34320h0 = "system";
            c3640e.f34322j0 = "device.event";
            c3640e.a("action", "TYPE_AMBIENT_TEMPERATURE");
            c3640e.a("accuracy", Integer.valueOf(sensorEvent.accuracy));
            c3640e.a(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(sensorEvent.timestamp));
            c3640e.f34323k0 = EnumC3642e1.INFO;
            c3640e.a("degree", Float.valueOf(sensorEvent.values[0]));
            C3686u c3686u = new C3686u();
            c3686u.c("android:sensorEvent", sensorEvent);
            this.f34046Z.o(c3640e, c3686u);
        }
    }
}
