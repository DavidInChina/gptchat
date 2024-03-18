package y6;

import Lg.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kf.w;
import o6.C4946z;
import p5.AbstractC5091c;
import p5.C5089a;
import p5.EnumC5090b;
import r6.AbstractC5369a;
import r6.C5370b;
import wf.k;

/* loaded from: classes.dex */
public abstract class c implements Application.ActivityLifecycleCallbacks, i {

    /* renamed from: Y  reason: collision with root package name */
    public r5.d f50826Y;

    public static Map c(Intent intent) {
        if (intent == null) {
            return w.f37484Y;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = intent.getAction();
        if (action != null) {
            linkedHashMap.put("view.intent.action", action);
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            linkedHashMap.put("view.intent.uri", dataString);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Set<String> keySet = extras.keySet();
            AbstractC3557B.b0("bundle.keySet()", keySet);
            for (String str : keySet) {
                linkedHashMap.put(R.a.r("view.arguments.", str), extras.get(str));
            }
        }
        return linkedHashMap;
    }

    @Override // y6.i
    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // y6.i
    public final void b(r5.d dVar, Context context) {
        AbstractC3557B.c0("sdkCore", dVar);
        if (context instanceof Application) {
            this.f50826Y = dVar;
            ((Application) context).registerActivityLifecycleCallbacks(this);
            return;
        }
        P4.a.m0(dVar.l(), 5, EnumC5090b.f42738Y, b.f50823Z, null, false, 56);
    }

    public final AbstractC5091c d() {
        r5.d dVar = this.f50826Y;
        if (dVar != null) {
            return dVar.l();
        }
        AbstractC5091c.f42742a.getClass();
        return C5089a.f42737b;
    }

    public final Object e(k kVar) {
        r5.d dVar = this.f50826Y;
        if (dVar != null) {
            return kVar.invoke(dVar);
        }
        AbstractC5091c.f42742a.getClass();
        P4.a.m0(C5089a.f42737b, 3, EnumC5090b.f42738Y, b.f50824h0, null, false, 56);
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        String str2;
        AbstractC3557B.c0("activity", activity);
        Bundle extras = activity.getIntent().getExtras();
        AbstractC5369a abstractC5369a = null;
        if (extras != null) {
            str = extras.getString("_dd.synthetics.test_id");
        } else {
            str = null;
        }
        if (extras != null) {
            str2 = extras.getString("_dd.synthetics.result_id");
        } else {
            str2 = null;
        }
        if (str != null && !n.n2(str) && str2 != null && !n.n2(str2)) {
            r5.d dVar = this.f50826Y;
            if (dVar != null) {
                i6.f a5 = i6.b.a(dVar);
                if (a5 instanceof AbstractC5369a) {
                    abstractC5369a = (AbstractC5369a) a5;
                }
                if (abstractC5369a != null) {
                    ((C5370b) abstractC5369a).d(new C4946z(str, str2));
                    return;
                }
                return;
            }
            AbstractC3557B.C2("sdkCore");
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }
}
