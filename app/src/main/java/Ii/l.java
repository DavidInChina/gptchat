package Ii;

import android.view.ViewTreeObserver;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8667Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f8668Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f8669h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f8670i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f8667Y = i10;
        this.f8668Z = obj;
        this.f8669h0 = obj2;
        this.f8670i0 = obj3;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f8667Y;
        Object obj2 = this.f8670i0;
        Object obj3 = this.f8669h0;
        Object obj4 = this.f8668Z;
        switch (i10) {
            case 0:
                long j6 = ((Mg.b) obj).f12130Y;
                io.sentry.android.core.z zVar = (io.sentry.android.core.z) obj4;
                k kVar = (k) zVar.f34265h0;
                if (kVar != null) {
                    zVar.f34265h0 = null;
                    Long l10 = kVar.f8663c;
                    if (l10 == null || l10.longValue() >= 500) {
                        m mVar = (m) obj2;
                        String str = kVar.f8664d;
                        ((wf.k) zVar.f34263Y).invoke(new C0805j(!AbstractC3557B.K(str, (String) obj3), kVar.f8661a, kVar.f8662b, Mg.b.e(j6), kVar.f8663c, mVar));
                    }
                }
                return yVar;
            default:
                Throwable th2 = (Throwable) obj;
                r4.f fVar = (r4.f) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                r4.j jVar = (r4.j) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(jVar);
                    return yVar;
                }
                fVar.getClass();
                throw null;
        }
    }
}
