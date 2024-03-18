package N;

import h.C3281g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import lf.C4439d;
import z.AbstractC6708l;

/* renamed from: N.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029m implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12366a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12367b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12368c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12369d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12370e;

    /* renamed from: f  reason: collision with root package name */
    public final C1034s f12371f;

    public C1029m(LinkedHashMap linkedHashMap, ArrayList arrayList, int i10, int i11, boolean z10, C1034s c1034s) {
        this.f12366a = linkedHashMap;
        this.f12367b = arrayList;
        this.f12368c = i10;
        this.f12369d = i11;
        this.f12370e = z10;
        this.f12371f = c1034s;
        if (arrayList.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.').toString());
    }

    public static void n(Map map, C1034s c1034s, C1033q c1033q, int i10, int i11) {
        C1034s c1034s2;
        boolean z10 = false;
        if (c1034s.f12410c) {
            r a5 = c1033q.a(i11);
            r a10 = c1033q.a(i10);
            if (i11 > i10) {
                z10 = true;
            }
            c1034s2 = new C1034s(a5, a10, z10);
        } else {
            r a11 = c1033q.a(i10);
            r a12 = c1033q.a(i11);
            if (i10 > i11) {
                z10 = true;
            }
            c1034s2 = new C1034s(a11, a12, z10);
        }
        if (i10 <= i11) {
            map.put(Long.valueOf(c1033q.f12395a), c1034s2);
            return;
        }
        throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + c1034s2).toString());
    }

    @Override // N.Q
    public final boolean a() {
        return this.f12370e;
    }

    @Override // N.Q
    public final C1033q b() {
        if (this.f12370e) {
            return j();
        }
        return g();
    }

    @Override // N.Q
    public final C1034s c() {
        return this.f12371f;
    }

    @Override // N.Q
    public final C1033q d() {
        if (h() == 1) {
            return g();
        }
        return j();
    }

    @Override // N.Q
    public final boolean e(Q q10) {
        if (this.f12371f != null && q10 != null && (q10 instanceof C1029m)) {
            C1029m c1029m = (C1029m) q10;
            if (this.f12370e == c1029m.f12370e && this.f12368c == c1029m.f12368c && this.f12369d == c1029m.f12369d) {
                List list = this.f12367b;
                int size = list.size();
                List list2 = c1029m.f12367b;
                if (size == list2.size()) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        C1033q c1033q = (C1033q) list.get(i10);
                        C1033q c1033q2 = (C1033q) list2.get(i10);
                        c1033q.getClass();
                        if (c1033q.f12395a == c1033q2.f12395a && c1033q.f12397c == c1033q2.f12397c && c1033q.f12398d == c1033q2.f12398d) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // N.Q
    public final int f() {
        return this.f12369d;
    }

    @Override // N.Q
    public final C1033q g() {
        return (C1033q) this.f12367b.get(p(this.f12369d, false));
    }

    @Override // N.Q
    public final int h() {
        int i10 = this.f12368c;
        int i11 = this.f12369d;
        if (i10 < i11) {
            return 2;
        }
        if (i10 > i11) {
            return 1;
        }
        return ((C1033q) this.f12367b.get(i10 / 2)).b();
    }

    @Override // N.Q
    public final Map i(C1034s c1034s) {
        r rVar;
        C1033q c1033q;
        r rVar2 = c1034s.f12408a;
        long j6 = rVar2.f12405c;
        r rVar3 = c1034s.f12409b;
        int i10 = (j6 > rVar3.f12405c ? 1 : (j6 == rVar3.f12405c ? 0 : -1));
        boolean z10 = c1034s.f12410c;
        if (i10 == 0) {
            int i11 = rVar2.f12404b;
            int i12 = rVar3.f12404b;
            if ((z10 && i11 >= i12) || (!z10 && i11 <= i12)) {
                return P4.a.o0(new C3959i(Long.valueOf(j6), c1034s));
            }
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + c1034s).toString());
        }
        C4439d c4439d = new C4439d();
        r rVar4 = c1034s.f12408a;
        if (z10) {
            rVar = rVar3;
        } else {
            rVar = rVar4;
        }
        n(c4439d, c1034s, d(), rVar.f12404b, d().f12400f.f12477a.f12467a.f12512Y.length());
        m(new C3281g(this, c4439d, c1034s, 15));
        if (z10) {
            rVar3 = rVar4;
        }
        if (h() == 1) {
            c1033q = j();
        } else {
            c1033q = g();
        }
        n(c4439d, c1034s, c1033q, 0, rVar3.f12404b);
        c4439d.b();
        c4439d.f38324r0 = true;
        if (c4439d.f38320n0 > 0) {
            return c4439d;
        }
        C4439d c4439d2 = C4439d.f38311s0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", c4439d2);
        return c4439d2;
    }

    @Override // N.Q
    public final C1033q j() {
        return (C1033q) this.f12367b.get(p(this.f12368c, true));
    }

    @Override // N.Q
    public final int k() {
        return this.f12368c;
    }

    @Override // N.Q
    public final int l() {
        return this.f12367b.size();
    }

    @Override // N.Q
    public final void m(wf.k kVar) {
        C1033q c1033q;
        int o10 = o(d().f12395a);
        if (h() == 1) {
            c1033q = j();
        } else {
            c1033q = g();
        }
        int o11 = o(c1033q.f12395a);
        int i10 = o10 + 1;
        if (i10 >= o11) {
            return;
        }
        while (i10 < o11) {
            kVar.invoke(this.f12367b.get(i10));
            i10++;
        }
    }

    public final int o(long j6) {
        Object obj = this.f12366a.get(Long.valueOf(j6));
        if (obj != null) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("Invalid selectableId: ", j6).toString());
    }

    public final int p(int i10, boolean z10) {
        int f6 = AbstractC6708l.f(h());
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    throw new RuntimeException();
                }
                z10 = true;
            }
            return (i10 - (!z10 ? 1 : 0)) / 2;
        }
        if (z10) {
            z10 = false;
            return (i10 - (!z10 ? 1 : 0)) / 2;
        }
        z10 = true;
        return (i10 - (!z10 ? 1 : 0)) / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f12370e);
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f6 = 2;
        sb2.append((this.f12368c + 1) / f6);
        sb2.append(", endPosition=");
        sb2.append((this.f12369d + 1) / f6);
        sb2.append(", crossed=");
        sb2.append(E9.f.T(h()));
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        List list = this.f12367b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C1033q c1033q = (C1033q) list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(c1033q);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String sb5 = sb3.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb5);
        sb2.append(sb5);
        sb2.append(')');
        return sb2.toString();
    }
}
