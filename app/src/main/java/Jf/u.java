package Jf;

import Bg.A;
import Bg.m0;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.G;
import Pf.I;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f9221a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f9222b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f9223c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f9224d;

    static {
        t[] values;
        t[] values2 = t.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (t tVar : values2) {
            arrayList.add(tVar.f9219Z);
        }
        f9221a = kf.t.P2(arrayList);
        s[] values3 = s.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (s sVar : values3) {
            arrayList2.add(sVar.f9216Y);
        }
        kf.t.P2(arrayList2);
        f9222b = new HashMap();
        f9223c = new HashMap();
        AbstractC4268D.h1(new HashMap(P4.a.n0(4)), new C3959i[]{new C3959i(s.f9211Z, C4294f.e("ubyteArrayOf")), new C3959i(s.f9212h0, C4294f.e("ushortArrayOf")), new C3959i(s.f9213i0, C4294f.e("uintArrayOf")), new C3959i(s.f9214j0, C4294f.e("ulongArrayOf"))});
        t[] values4 = t.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (t tVar2 : values4) {
            linkedHashSet.add(tVar2.f9220h0.i());
        }
        f9224d = linkedHashSet;
        for (t tVar3 : t.values()) {
            HashMap hashMap = f9222b;
            C4290b c4290b = tVar3.f9220h0;
            C4290b c4290b2 = tVar3.f9218Y;
            hashMap.put(c4290b, c4290b2);
            f9223c.put(c4290b2, tVar3.f9220h0);
        }
    }

    public static final boolean a(A a5) {
        AbstractC1000i k10;
        if (m0.m(a5) || (k10 = a5.y0().k()) == null) {
            return false;
        }
        AbstractC1003l mo20k = k10.mo20k();
        if (!(mo20k instanceof G) || !AbstractC3557B.K(((I) ((G) mo20k)).f14010j0, q.f9204k) || !f9221a.contains(k10.getName())) {
            return false;
        }
        return true;
    }
}
