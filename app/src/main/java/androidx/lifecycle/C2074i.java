package androidx.lifecycle;

import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.android.navigation.SentryNavigationListener;
import java.util.HashMap;
import java.util.List;
import s3.AbstractC5566p;
import s3.AbstractC5568s;
import s3.C5545H;

/* renamed from: androidx.lifecycle.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2074i implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25371Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f25372Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f25373h0;

    public /* synthetic */ C2074i(Object obj, int i10, Object obj2) {
        this.f25371Y = i10;
        this.f25372Z = obj;
        this.f25373h0 = obj2;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        a7.k kVar = a7.k.f23923a;
        int i10 = this.f25371Y;
        Object obj = this.f25372Z;
        Object obj2 = this.f25373h0;
        switch (i10) {
            case 0:
                switch (AbstractC2073h.f25370a[enumC2081p.ordinal()]) {
                    case 1:
                        ((DefaultLifecycleObserver) obj).onCreate(abstractC2086v);
                        break;
                    case 2:
                        ((DefaultLifecycleObserver) obj).onStart(abstractC2086v);
                        break;
                    case 3:
                        ((DefaultLifecycleObserver) obj).onResume(abstractC2086v);
                        break;
                    case 4:
                        ((DefaultLifecycleObserver) obj).onPause(abstractC2086v);
                        break;
                    case 5:
                        ((DefaultLifecycleObserver) obj).onStop(abstractC2086v);
                        break;
                    case 6:
                        ((DefaultLifecycleObserver) obj).onDestroy(abstractC2086v);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                AbstractC2084t abstractC2084t = (AbstractC2084t) obj2;
                if (abstractC2084t != null) {
                    abstractC2084t.b(abstractC2086v, enumC2081p);
                    return;
                }
                return;
            case 1:
                if (enumC2081p == EnumC2081p.ON_START) {
                    ((S) obj).g(this);
                    ((A3.d) obj2).d();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C2068c) obj2).f25355a;
                C2068c.a((List) hashMap.get(enumC2081p), abstractC2086v, enumC2081p, obj);
                C2068c.a((List) hashMap.get(EnumC2081p.ON_ANY), abstractC2086v, enumC2081p, obj);
                return;
            case 3:
                if (enumC2081p == ((EnumC2081p) obj)) {
                    a7.g gVar = (a7.g) obj2;
                    if (!AbstractC3557B.K(gVar.b(), kVar)) {
                        gVar.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (enumC2081p == ((EnumC2081p) obj)) {
                    for (a7.g gVar2 : (List) obj2) {
                        if (!AbstractC3557B.K(gVar2.b(), kVar)) {
                            gVar2.c();
                        }
                    }
                    return;
                }
                return;
            default:
                if (enumC2081p == EnumC2081p.ON_RESUME) {
                    ((AbstractC5568s) obj).b((AbstractC5566p) obj2);
                    return;
                } else if (enumC2081p == EnumC2081p.ON_PAUSE) {
                    AbstractC5568s abstractC5568s = (AbstractC5568s) obj;
                    AbstractC5566p abstractC5566p = (AbstractC5566p) obj2;
                    abstractC5568s.getClass();
                    AbstractC3557B.c0("listener", abstractC5566p);
                    abstractC5568s.f45356q.remove(abstractC5566p);
                    return;
                } else {
                    return;
                }
        }
    }

    public C2074i(DefaultLifecycleObserver defaultLifecycleObserver, AbstractC2084t abstractC2084t) {
        this.f25371Y = 0;
        AbstractC3557B.c0("defaultLifecycleObserver", defaultLifecycleObserver);
        this.f25372Z = defaultLifecycleObserver;
        this.f25373h0 = abstractC2084t;
    }

    public C2074i(C5545H c5545h, SentryNavigationListener sentryNavigationListener) {
        this.f25371Y = 5;
        AbstractC3557B.c0("navController", c5545h);
        this.f25372Z = c5545h;
        this.f25373h0 = sentryNavigationListener;
        C3636c1.l().a("ComposeNavigation");
        C3636c1.l().c("maven:io.sentry:sentry-compose");
    }

    public C2074i(Object obj) {
        this.f25371Y = 2;
        this.f25372Z = obj;
        this.f25373h0 = C2070e.f25360c.b(obj.getClass());
    }
}
