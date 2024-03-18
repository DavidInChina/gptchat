package androidx.lifecycle;

import android.app.Activity;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class I extends AbstractC2075j {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public I(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i10 = processLifecycleOwner.f25314Y + 1;
        processLifecycleOwner.f25314Y = i10;
        if (i10 == 1 && processLifecycleOwner.f25317i0) {
            processLifecycleOwner.f25319k0.k(EnumC2081p.ON_START);
            processLifecycleOwner.f25317i0 = false;
        }
    }
}
