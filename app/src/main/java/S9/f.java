package S9;

import ah.C1999j;
import ca.C2317i;
import ca.C2326r;
import ca.EnumC2323o;
import ea.C2824c;
import eh.C2917q;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.C2976e;
import fa.EnumC2970G;
import fa.EnumC2971H;
import fa.n;
import fa.q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.C3959i;
import kf.t;
import kf.v;
import l8.AbstractC4344b;
import r9.y;
import x8.W;

/* loaded from: classes.dex */
public final class f extends N9.f {

    /* renamed from: c  reason: collision with root package name */
    public static final C3959i f16414c = y.S("1729x1024");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16415a;

    /* renamed from: b  reason: collision with root package name */
    public C2326r f16416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C2969F c2969f) {
        super(c2969f);
        C2326r c2326r;
        C3959i c3959i;
        AbstractC3557B.c0("message", c2969f);
        this.f16415a = AbstractC4344b.N0(c2969f);
        v vVar = v.f37483Y;
        boolean z10 = c2969f.f30017j;
        C3959i c3959i2 = f16414c;
        if (z10) {
            AbstractC2965B abstractC2965B = c2969f.f30015h;
            if (abstractC2965B instanceof n) {
                try {
                    C2917q c2917q = md.b.f39132a;
                    String str = ((n) abstractC2965B).f30070b;
                    c2917q.getClass();
                    C2824c c2824c = (C2824c) c2917q.b(C2824c.Companion.serializer(), str);
                    String str2 = c2824c.f29100a;
                    if (str2 != null) {
                        c3959i = y.S(str2);
                    } else {
                        c3959i = c3959i2;
                    }
                    c2326r = new C2326r(c3959i, c2824c.f29101b, new q(vVar), false);
                } catch (C1999j unused) {
                    c2326r = new C2326r(c3959i2, null, new q(vVar), false);
                }
                this.f16416b = c2326r;
            }
        }
        c2326r = new C2326r(c3959i2, null, new q(vVar), false);
        this.f16416b = c2326r;
    }

    @Override // N9.f
    public final boolean a(C2969F c2969f) {
        this.f16415a.add(c2969f);
        EnumC2971H enumC2971H = EnumC2971H.f30050j0;
        q qVar = null;
        Collection collection = null;
        AbstractC2965B abstractC2965B = c2969f.f30015h;
        EnumC2971H enumC2971H2 = c2969f.f30011d;
        if (enumC2971H2 == enumC2971H && c2969f.f30017j && (abstractC2965B instanceof q)) {
            q qVar2 = this.f16416b.f26415i;
            if (qVar2 != null) {
                collection = qVar2.f30075b;
            }
            if (collection == null) {
                collection = v.f37483Y;
            }
            List list = ((q) abstractC2965B).f30075b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C2976e) {
                    arrayList.add(obj);
                }
            }
            this.f16416b = C2326r.H0(this.f16416b, new q(t.w2(arrayList, collection)), true, 3);
        } else if (enumC2971H2 == EnumC2971H.f30047Z) {
            if (c2969f.f30022o == EnumC2970G.f30034Y) {
                C2326r c2326r = this.f16416b;
                q qVar3 = c2326r.f26415i;
                if (qVar3 != null) {
                    qVar = new q(t.x2(abstractC2965B, qVar3.f30075b));
                }
                this.f16416b = C2326r.H0(c2326r, qVar, false, 11);
            }
        }
        if (!W.O(c2969f) && !W.N(c2969f)) {
            return false;
        }
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        ArrayList arrayList = this.f16415a;
        return AbstractC4344b.F0(new C2317i(W.H(arrayList).b(enumC2323o), arrayList, null, this.f16416b));
    }
}
