package t7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l extends H7.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f45784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f45785b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(e eVar, Context context) {
        super(r2, 0);
        Looper looper;
        this.f45785b = eVar;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this.f45784a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        int i10 = message.what;
        if (i10 != 1) {
            AbstractC3612c.r("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f45772a;
        e eVar = this.f45785b;
        Context context = this.f45784a;
        int b10 = eVar.b(context, i11);
        AtomicBoolean atomicBoolean = i.f45775a;
        if (b10 != 1 && b10 != 2 && b10 != 3 && b10 != 9) {
            return;
        }
        Intent a5 = eVar.a(b10, context, "n");
        if (a5 == null) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0, a5, 201326592);
        }
        eVar.f(context, b10, pendingIntent);
    }
}
