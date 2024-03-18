package com.openai.voice.webrtc;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import androidx.core.graphics.drawable.IconCompat;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlin.Metadata;
import o1.C4903s;
import o1.L;
import o1.M;
import o1.Q;
import o1.r;
import o1.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/openai/voice/webrtc/VoiceModeForegroundService;", "Landroid/app/Service;", "<init>", "()V", "Wc/d", "voice-webrtc_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VoiceModeForegroundService extends Service {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f27708Y = 0;

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Long l10;
        NotificationChannel notificationChannel;
        ComponentName componentName;
        Q[] qArr;
        Q[] qArr2 = null;
        long j6 = 0;
        if (intent != null) {
            l10 = Long.valueOf(intent.getLongExtra("start_time", 0L));
        } else {
            l10 = null;
        }
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = getString(R.string.notification_channel_name);
        M m10 = new M(this);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            notificationChannel = null;
        } else {
            notificationChannel = r.c("voice_mode_ongoing", string, 5);
            r.p(notificationChannel, null);
            r.q(notificationChannel, null);
            r.s(notificationChannel, true);
            r.t(notificationChannel, uri, audioAttributes);
            r.d(notificationChannel, false);
            r.r(notificationChannel, 0);
            r.u(notificationChannel, null);
            r.e(notificationChannel, false);
        }
        if (i12 >= 26) {
            L.a(m10.f40446a, notificationChannel);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            componentName = launchIntentForPackage.getComponent();
        } else {
            componentName = null;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 7404, Intent.makeMainActivity(componentName), 201326592);
        v vVar = new v(this, "voice_mode_ongoing");
        vVar.f40496j = true;
        vVar.f40503q.flags |= 2;
        if (l10 != null) {
            j6 = l10.longValue();
        }
        Notification notification = vVar.f40503q;
        notification.when = j6;
        vVar.f40494h = 2;
        vVar.f40500n = 1;
        notification.icon = R.drawable.ic_notification_small_icon;
        vVar.f40492f = v.b(getString(R.string.notification_content));
        vVar.f40493g = activity;
        String string2 = getString(R.string.voice_notification_end);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 7405, new Intent().setAction("End"), 67108864);
        AbstractC3557B.b0("getBroadcast(...)", broadcast);
        IconCompat b10 = IconCompat.b(null, "", R.drawable.outline_close_24);
        Bundle bundle = new Bundle();
        CharSequence b11 = v.b(string2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            qArr = null;
        } else {
            qArr = (Q[]) arrayList.toArray(new Q[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            qArr2 = (Q[]) arrayList2.toArray(new Q[arrayList2.size()]);
        }
        vVar.f40488b.add(new C4903s(b10, b11, broadcast, bundle, qArr2, qArr, true, 0, true, false, false));
        Notification a5 = vVar.a();
        AbstractC3557B.b0("build(...)", a5);
        startForeground(4414, a5);
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        sendBroadcast(new Intent().setAction("End").setPackage(getPackageName()));
    }
}
