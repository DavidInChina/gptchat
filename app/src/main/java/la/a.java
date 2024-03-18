package La;

import Ad.l;
import Ng.D0;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.S;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Set;
import kf.AbstractC4273I;
import kf.x;

/* loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ c f10961Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z9.a f10962Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ S f10963h0;

    public a(c cVar, Z9.a aVar, S s10) {
        this.f10961Y = cVar;
        this.f10962Z = aVar;
        this.f10963h0 = s10;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
        c cVar = this.f10961Y;
        LinkedHashMap linkedHashMap = cVar.f10971c;
        Z9.a aVar = this.f10962Z;
        Set set = (Set) linkedHashMap.get(aVar);
        if (set == null) {
            set = x.f37485Y;
        }
        linkedHashMap.put(aVar, AbstractC4273I.s2(set, this.f10963h0));
        long j6 = c.f10968e;
        D0 d02 = cVar.f10972d;
        if (d02 != null) {
            d02.k(null);
        }
        cVar.f10972d = l.O0(cVar.f10970b, null, null, new b(j6, cVar, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(AbstractC2086v abstractC2086v) {
        AbstractC2072g.d(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(AbstractC2086v abstractC2086v) {
        AbstractC2072g.e(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(AbstractC2086v abstractC2086v) {
        AbstractC2072g.f(this, abstractC2086v);
    }
}
