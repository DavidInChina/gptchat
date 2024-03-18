package androidx.lifecycle;

import a1.C1915c;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class N extends Fragment {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f25303Z = 0;

    /* renamed from: Y  reason: collision with root package name */
    public K f25304Y;

    public final void a(EnumC2081p enumC2081p) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC3557B.b0("activity", activity);
            C1915c.i(activity, enumC2081p);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC2081p.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC2081p.ON_DESTROY);
        this.f25304Y = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC2081p.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        K k10 = this.f25304Y;
        if (k10 != null) {
            k10.f25302a.b();
        }
        a(EnumC2081p.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        K k10 = this.f25304Y;
        if (k10 != null) {
            ProcessLifecycleOwner processLifecycleOwner = k10.f25302a;
            int i10 = processLifecycleOwner.f25314Y + 1;
            processLifecycleOwner.f25314Y = i10;
            if (i10 == 1 && processLifecycleOwner.f25317i0) {
                processLifecycleOwner.f25319k0.k(EnumC2081p.ON_START);
                processLifecycleOwner.f25317i0 = false;
            }
        }
        a(EnumC2081p.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC2081p.ON_STOP);
    }
}
