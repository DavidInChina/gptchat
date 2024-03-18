package L0;

import A.C0039q0;
import G0.AbstractC0579h;
import G0.AbstractC0586o;
import G0.C0571a;
import G0.g0;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l0.AbstractC4325q;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4325q f10418a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10419b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.compose.ui.node.a f10420c;

    /* renamed from: d  reason: collision with root package name */
    public final j f10421d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10422e;

    /* renamed from: f  reason: collision with root package name */
    public o f10423f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10424g;

    public o(AbstractC4325q abstractC4325q, boolean z10, androidx.compose.ui.node.a aVar, j jVar) {
        this.f10418a = abstractC4325q;
        this.f10419b = z10;
        this.f10420c = aVar;
        this.f10421d = jVar;
        this.f10424g = aVar.f24843Z;
    }

    public final o a(g gVar, wf.k kVar) {
        int i10;
        j jVar = new j();
        jVar.f10410Z = false;
        jVar.f10411h0 = false;
        kVar.invoke(jVar);
        m mVar = new m(kVar);
        int i11 = this.f10424g;
        if (gVar != null) {
            i10 = 1000000000;
        } else {
            i10 = 2000000000;
        }
        o oVar = new o(mVar, false, new androidx.compose.ui.node.a(i11 + i10, true), jVar);
        oVar.f10422e = true;
        oVar.f10423f = this;
        return oVar;
    }

    public final void b(androidx.compose.ui.node.a aVar, ArrayList arrayList) {
        C2104h I10 = aVar.I();
        int i10 = I10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = I10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.S()) {
                    if (aVar2.f24831B0.d(8)) {
                        arrayList.add(R4.b.s(aVar2, this.f10419b));
                    } else {
                        b(aVar2, arrayList);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final g0 c() {
        if (this.f10422e) {
            o i10 = i();
            if (i10 != null) {
                return i10.c();
            }
            return null;
        }
        AbstractC0586o p12 = R4.b.p1(this.f10420c);
        if (p12 == null) {
            p12 = this.f10418a;
        }
        return AbstractC0579h.z(p12, 8);
    }

    public final void d(List list) {
        List l10 = l(false);
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) l10.get(i10);
            if (oVar.j()) {
                list.add(oVar);
            } else if (!oVar.f10421d.f10411h0) {
                oVar.d(list);
            }
        }
    }

    public final C5252d e() {
        g0 c10 = c();
        if (c10 != null) {
            if (!c10.G0().f37732r0) {
                c10 = null;
            }
            if (c10 != null) {
                return androidx.compose.ui.layout.a.d(c10).F(c10, true);
            }
        }
        return C5252d.f43624e;
    }

    public final C5252d f() {
        g0 c10 = c();
        if (c10 != null) {
            if (!c10.G0().f37732r0) {
                c10 = null;
            }
            if (c10 != null) {
                return androidx.compose.ui.layout.a.c(c10);
            }
        }
        return C5252d.f43624e;
    }

    public final List g(boolean z10, boolean z11) {
        if (!z10 && this.f10421d.f10411h0) {
            return kf.v.f37483Y;
        }
        if (j()) {
            ArrayList arrayList = new ArrayList();
            d(arrayList);
            return arrayList;
        }
        return l(z11);
    }

    public final j h() {
        boolean j6 = j();
        j jVar = this.f10421d;
        if (j6) {
            jVar.getClass();
            j jVar2 = new j();
            jVar2.f10410Z = jVar.f10410Z;
            jVar2.f10411h0 = jVar.f10411h0;
            jVar2.f10409Y.putAll(jVar.f10409Y);
            k(jVar2);
            return jVar2;
        }
        return jVar;
    }

    public final o i() {
        androidx.compose.ui.node.a aVar;
        o oVar = this.f10423f;
        if (oVar != null) {
            return oVar;
        }
        androidx.compose.ui.node.a aVar2 = this.f10420c;
        boolean z10 = this.f10419b;
        if (z10) {
            aVar = R4.b.u0(aVar2, n.f10415h0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = R4.b.u0(aVar2, n.f10416i0);
        }
        if (aVar == null) {
            return null;
        }
        return R4.b.s(aVar, z10);
    }

    public final boolean j() {
        if (this.f10419b && this.f10421d.f10410Z) {
            return true;
        }
        return false;
    }

    public final void k(j jVar) {
        if (!this.f10421d.f10411h0) {
            List l10 = l(false);
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) l10.get(i10);
                if (!oVar.j()) {
                    for (Map.Entry entry : oVar.f10421d.f10409Y.entrySet()) {
                        u uVar = (u) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = jVar.f10409Y;
                        Object obj = linkedHashMap.get(uVar);
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>", uVar);
                        Object invoke = uVar.f10474b.invoke(obj, value);
                        if (invoke != null) {
                            linkedHashMap.put(uVar, invoke);
                        }
                    }
                    oVar.k(jVar);
                }
            }
        }
    }

    public final List l(boolean z10) {
        String str;
        if (this.f10422e) {
            return kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f10420c, arrayList);
        if (z10) {
            u uVar = r.f10464t;
            j jVar = this.f10421d;
            g gVar = (g) U3.f.T(jVar, uVar);
            if (gVar != null && jVar.f10410Z && (!arrayList.isEmpty())) {
                arrayList.add(a(gVar, new C0571a(4, gVar)));
            }
            u uVar2 = r.f10446b;
            LinkedHashMap linkedHashMap = jVar.f10409Y;
            if (linkedHashMap.containsKey(uVar2) && (!arrayList.isEmpty()) && jVar.f10410Z) {
                Object obj = linkedHashMap.get(uVar2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null) {
                    str = (String) kf.t.h2(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, a(null, new C0039q0(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
