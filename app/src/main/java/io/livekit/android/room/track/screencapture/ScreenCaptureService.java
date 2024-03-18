package io.livekit.android.room.track.screencapture;

import Ye.a;
import Ye.b;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "Ye/a", "Ye/b", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class ScreenCaptureService extends Service {
    public static final a Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final b f33705Y = new b(this);

    /* renamed from: Z  reason: collision with root package name */
    public int f33706Z;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f33706Z++;
        return this.f33705Y;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i10 = this.f33706Z - 1;
        this.f33706Z = i10;
        if (i10 == 0) {
            stopSelf();
            return false;
        }
        return false;
    }
}
