package Vf;

import Jf.p;
import Sf.AbstractC1385d;
import Sf.C1386e;
import Uf.D;
import Yf.C1694f;
import bg.AbstractC2193a;
import bg.AbstractC2196d;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import s3.z;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4294f f18943a = C4294f.e("message");

    /* renamed from: b  reason: collision with root package name */
    public static final C4294f f18944b = C4294f.e("allowedTargets");

    /* renamed from: c  reason: collision with root package name */
    public static final C4294f f18945c = C4294f.e("value");

    /* renamed from: d  reason: collision with root package name */
    public static final Map f18946d = AbstractC4268D.a1(new C3959i(p.f9187t, D.f17728c), new C3959i(p.f9190w, D.f17729d), new C3959i(p.f9191x, D.f17731f));

    public static Wf.h a(C4291c c4291c, AbstractC2196d abstractC2196d, z zVar) {
        AbstractC2193a l10;
        AbstractC3557B.c0("kotlinName", c4291c);
        AbstractC3557B.c0("annotationOwner", abstractC2196d);
        AbstractC3557B.c0("c", zVar);
        if (AbstractC3557B.K(c4291c, p.f9180m)) {
            C4291c c4291c2 = D.f17730e;
            AbstractC3557B.b0("DEPRECATED_ANNOTATION", c4291c2);
            AbstractC2193a l11 = abstractC2196d.l(c4291c2);
            if (l11 != null) {
                return new g(l11, zVar);
            }
        }
        C4291c c4291c3 = (C4291c) f18946d.get(c4291c);
        if (c4291c3 == null || (l10 = abstractC2196d.l(c4291c3)) == null) {
            return null;
        }
        return b(zVar, l10, false);
    }

    public static Wf.h b(z zVar, AbstractC2193a abstractC2193a, boolean z10) {
        AbstractC3557B.c0("annotation", abstractC2193a);
        AbstractC3557B.c0("c", zVar);
        C4290b a5 = AbstractC1385d.a(R4.b.k1(R4.b.d1(((C1386e) abstractC2193a).f16607a)));
        if (AbstractC3557B.K(a5, C4290b.j(D.f17728c))) {
            return new l(abstractC2193a, zVar);
        }
        if (AbstractC3557B.K(a5, C4290b.j(D.f17729d))) {
            return new k(abstractC2193a, zVar);
        }
        if (AbstractC3557B.K(a5, C4290b.j(D.f17731f))) {
            return new b(zVar, abstractC2193a, p.f9191x);
        }
        if (AbstractC3557B.K(a5, C4290b.j(D.f17730e))) {
            return null;
        }
        return new C1694f(zVar, abstractC2193a, z10);
    }
}
