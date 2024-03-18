package S9;

import ca.C2317i;
import ca.C2329u;
import ca.C2330v;
import ca.EnumC2323o;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.C2976e;
import fa.C2979h;
import fa.n;
import fa.q;
import fa.w;
import ha.C3360c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;
import wd.C6190g0;
import wd.Y;
import x8.W;

/* loaded from: classes.dex */
public final class i extends N9.f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16422a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16423b;

    /* renamed from: c  reason: collision with root package name */
    public C2330v f16424c;

    /* renamed from: d  reason: collision with root package name */
    public C2329u f16425d = new C2329u(null);

    /* renamed from: e  reason: collision with root package name */
    public List f16426e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC2965B f16427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C2969F c2969f, boolean z10) {
        super(c2969f);
        AbstractC3557B.c0("message", c2969f);
        this.f16422a = z10;
        this.f16423b = AbstractC4344b.N0(c2969f);
        a(c2969f);
    }

    @Override // N9.f
    public final boolean a(C2969F c2969f) {
        C3360c c3360c;
        AbstractC3557B.c0("message", c2969f);
        this.f16423b.add(c2969f);
        boolean z10 = c2969f.f30017j;
        AbstractC2965B abstractC2965B = c2969f.f30015h;
        if (z10 && (c3360c = c2969f.f30032y) != null) {
            boolean z11 = abstractC2965B instanceof n;
            if (z11 && this.f16422a) {
                C6190g0.Companion.getClass();
                if (AbstractC3557B.K(c2969f.f30023p, "gpt-4-ada-v2") && z11) {
                    n nVar = (n) abstractC2965B;
                    if (Lg.n.c2(Bi.c.Q(nVar.f30070b, '\''), ".json", false)) {
                        this.f16424c = new C2330v(Bi.c.Q(nVar.f30070b, '\''));
                    }
                }
            }
            this.f16425d = new C2329u(c3360c.f32057a);
            this.f16426e = c3360c.f32058b;
        }
        if (!W.O(c2969f) && !W.N(c2969f)) {
            return false;
        }
        this.f16427f = abstractC2965B;
        if (this.f16425d.f26421g == null || !z10) {
            return true;
        }
        this.f16427f = new n(android.gov.nist.core.a.g(K8.d.K0(abstractC2965B), " [\u2776](code://python)"));
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        q qVar;
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        List list = this.f16426e;
        C2330v c2330v = this.f16424c;
        AbstractC2965B abstractC2965B = this.f16427f;
        if (c2330v == null && list == null && abstractC2965B == null) {
            qVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                if (list.size() > 1) {
                    arrayList.add(new C2979h(list));
                } else {
                    arrayList.add(new C2976e((Y) t.f2(list)));
                }
            }
            if ((abstractC2965B instanceof fa.t) || (abstractC2965B instanceof n)) {
                arrayList.add(abstractC2965B);
            } else if (abstractC2965B instanceof q) {
                arrayList.addAll(((q) abstractC2965B).f30075b);
            }
            if (c2330v != null) {
                arrayList.add(new w(c2330v.f26422g));
            }
            qVar = new q(arrayList);
        }
        ArrayList arrayList2 = this.f16423b;
        return AbstractC4344b.F0(new C2317i(W.H(arrayList2).b(enumC2323o), arrayList2, qVar, this.f16425d));
    }
}
