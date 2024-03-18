package Jf;

import Bg.C0213f;
import Bg.Q;
import Bg.Y;
import Bg.j0;
import Mf.AbstractC1013w;
import Pf.AbstractC1153k;
import Pf.AbstractC1165x;
import Pf.C1151i;
import Pf.C1161t;
import Pf.G;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kg.C4294f;
import ug.C5928j;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class j implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9111Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f9112Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f9113h0;

    public /* synthetic */ j(Object obj, int i10, Object obj2) {
        this.f9111Y = i10;
        this.f9113h0 = obj;
        this.f9112Z = obj2;
    }

    public final Collection a() {
        int i10 = this.f9111Y;
        Object obj = this.f9113h0;
        switch (i10) {
            case 2:
                C1161t c1161t = (C1161t) obj;
                c1161t.getClass();
                HashSet hashSet = new HashSet();
                for (C4294f c4294f : (Set) c1161t.f14131e.f14134o0.mo122invoke()) {
                    Tf.d dVar = Tf.d.f17216k0;
                    hashSet.addAll(c1161t.a(c4294f, dVar));
                    hashSet.addAll(c1161t.f(c4294f, dVar));
                }
                return hashSet;
            default:
                Ig.f fVar = new Ig.f();
                for (AbstractC1013w abstractC1013w : ((AbstractC1165x) obj).m()) {
                    fVar.add(abstractC1013w.c((j0) this.f9112Z));
                }
                return fVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f9111Y;
        Object obj = this.f9113h0;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                G g10 = lVar.f9118a;
                Object obj2 = this.f9112Z;
                if (g10 == null) {
                    lVar.f9118a = (G) obj2;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + lVar.f9118a + " (attempting to reset to " + ((G) obj2) + Separators.RPAREN);
            case 1:
                Q.f2084Z.getClass();
                Q q10 = Q.f2085h0;
                Y f6 = ((AbstractC1153k) obj).f();
                List emptyList = Collections.emptyList();
                C1151i c1151i = new C1151i(0, this);
                Ag.c cVar = Ag.q.f870e;
                AbstractC3557B.b0("NO_LOCKS", cVar);
                return C0213f.n(q10, f6, emptyList, false, new C5928j(cVar, c1151i));
            case 2:
                return a();
            default:
                return a();
        }
    }
}
