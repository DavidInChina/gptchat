package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class J extends AbstractC2075j {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public J(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.AbstractC2075j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = N.f25303Z;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", findFragmentByTag);
            ((N) findFragmentByTag).f25304Y = this.this$0.f25321m0;
        }
    }

    @Override // androidx.lifecycle.AbstractC2075j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f25315Z - 1;
        processLifecycleOwner.f25315Z = i10;
        if (i10 == 0) {
            Handler handler = processLifecycleOwner.f25318j0;
            AbstractC3557B.Z(handler);
            handler.postDelayed(processLifecycleOwner.f25320l0, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        H.a(activity, new I(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC2075j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f25314Y - 1;
        processLifecycleOwner.f25314Y = i10;
        if (i10 == 0 && processLifecycleOwner.f25316h0) {
            processLifecycleOwner.f25319k0.k(EnumC2081p.ON_STOP);
            processLifecycleOwner.f25317i0 = true;
        }
    }
}
