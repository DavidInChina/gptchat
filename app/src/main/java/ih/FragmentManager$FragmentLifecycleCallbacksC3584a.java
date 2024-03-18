package ih;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager$FragmentLifecycleCallbacks;
import android.view.View;
import hh.C3443k;
import id.AbstractC3557B;
import ng.C4844k;

/* renamed from: ih.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class FragmentManager$FragmentLifecycleCallbacksC3584a extends FragmentManager$FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4844k f33246a;

    public FragmentManager$FragmentLifecycleCallbacksC3584a(C4844k c4844k) {
        this.f33246a = c4844k;
    }

    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        AbstractC3557B.d0("fm", fragmentManager);
        AbstractC3557B.d0("fragment", fragment);
        ((C3443k) this.f33246a.f40352h0).a(fragment.getClass().getName().concat(" received Fragment#onDestroy() callback"), fragment);
    }

    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        AbstractC3557B.d0("fm", fragmentManager);
        AbstractC3557B.d0("fragment", fragment);
        View view = fragment.getView();
        if (view != null) {
            ((C3443k) this.f33246a.f40352h0).a(fragment.getClass().getName().concat(" received Fragment#onDestroyView() callback (references to its views should be cleared to prevent leaks)"), view);
        }
    }
}
