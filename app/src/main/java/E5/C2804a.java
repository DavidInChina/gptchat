package e5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import d5.b;
import d5.f;
import d5.g;
import f5.C2937a;
import i4.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4828h;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2804a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h0  reason: collision with root package name */
    public static C2804a f28972h0;

    /* renamed from: Y  reason: collision with root package name */
    public int f28973Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f28974Z;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, e5.a] */
    public static synchronized C2804a a() {
        C2804a c2804a;
        synchronized (C2804a.class) {
            try {
                if (f28972h0 == null) {
                    ?? obj = new Object();
                    obj.f28973Y = 0;
                    obj.f28974Z = false;
                    f28972h0 = obj;
                }
                c2804a = f28972h0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2804a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(Context context) {
        k kVar = new k(13);
        b bVar = new b(context, 2);
        Object obj = new Object();
        androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(context);
        b bVar2 = new b(context, 1);
        b bVar3 = new b(context, 4);
        b bVar4 = new b(context, 0);
        b bVar5 = new b(context, 3);
        C2937a.d("DeviceFingerprint", "Collecting fingerprint signals", new Throwable[0]);
        g[] gVarArr = {kVar, bVar, obj, aVar, bVar2, bVar3, bVar4, bVar5};
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC4828h.f40328j = "";
            jSONObject.put("mobile_sdk__build_version", "2.4.1(11)");
            for (int i10 = 0; i10 < 8; i10++) {
                Iterator it = gVarArr[i10].a().iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    Object obj2 = fVar.f28002b;
                    boolean z10 = obj2 instanceof List;
                    String str = fVar.f28001a;
                    if (z10) {
                        jSONObject.put(str, new JSONArray((Collection) fVar.f28002b));
                    } else {
                        jSONObject.put(str, obj2);
                    }
                }
            }
            String str2 = AbstractC4828h.f40328j;
            if (!str2.isEmpty()) {
                jSONObject.put("mobile_sdk__errors", str2);
            }
        } catch (Exception e10) {
            C2937a.c("DeviceFingerprint", "Error collecting signals", e10);
        }
        return jSONObject.toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f28974Z = isChangingConfigurations;
        int i10 = this.f28973Y - 1;
        this.f28973Y = i10;
        if (i10 == 0 && !isChangingConfigurations) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i10 = this.f28973Y + 1;
        this.f28973Y = i10;
        if (i10 == 1 && !this.f28974Z) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
