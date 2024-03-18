package g4;

import E0.AbstractC0454m;
import H0.E0;
import H0.Z;
import Z.AbstractC1725n;
import Z.C1723m;
import android.content.Context;
import u0.AbstractC5824b;
import v0.C5953f;

/* renamed from: g4.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3190r {

    /* renamed from: a  reason: collision with root package name */
    public static final C3189q f31252a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C3196x f31253b = new Object();

    public static final C3188p a(q4.j jVar, f4.i iVar, wf.k kVar, wf.k kVar2, AbstractC0454m abstractC0454m, int i10, AbstractC1725n abstractC1725n, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1645646697);
        rVar.W(952940650);
        r4.e eVar = AbstractC3172A.f31191b;
        rVar.W(1087186730);
        boolean z10 = jVar instanceof q4.j;
        Object obj = C1723m.f22654Y;
        if (z10) {
            rVar.t(false);
        } else {
            Context context = (Context) rVar.m(Z.f6888b);
            rVar.W(375474364);
            boolean g10 = rVar.g(context) | rVar.g(jVar);
            Object K10 = rVar.K();
            if (g10 || K10 == obj) {
                q4.h hVar = new q4.h(context);
                hVar.f43805c = jVar;
                K10 = hVar.a();
                rVar.h0(K10);
            }
            jVar = (q4.j) K10;
            rVar.t(false);
            rVar.t(false);
        }
        Object obj2 = jVar.f43843b;
        if (!(obj2 instanceof q4.h)) {
            if (!(obj2 instanceof r0.z)) {
                if (!(obj2 instanceof C5953f)) {
                    if (!(obj2 instanceof AbstractC5824b)) {
                        if (jVar.f43844c == null) {
                            rVar.W(294038899);
                            Object K11 = rVar.K();
                            if (K11 == obj) {
                                K11 = new C3188p(jVar, iVar);
                                rVar.h0(K11);
                            }
                            C3188p c3188p = (C3188p) K11;
                            rVar.t(false);
                            c3188p.f31244r0 = kVar;
                            c3188p.f31245s0 = kVar2;
                            c3188p.f31246t0 = abstractC0454m;
                            c3188p.f31247u0 = i10;
                            c3188p.f31248v0 = ((Boolean) rVar.m(E0.f6720a)).booleanValue();
                            c3188p.f31251y0.setValue(iVar);
                            c3188p.f31250x0.setValue(jVar);
                            c3188p.d();
                            rVar.t(false);
                            rVar.t(false);
                            return c3188p;
                        }
                        throw new IllegalArgumentException("request.target must be null.".toString());
                    }
                    b("Painter");
                    throw null;
                }
                b("ImageVector");
                throw null;
            }
            b("ImageBitmap");
            throw null;
        }
        throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }

    public static void b(String str) {
        throw new IllegalArgumentException(android.gov.nist.core.a.k("Unsupported type: ", str, ". ", android.gov.nist.core.a.A("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
