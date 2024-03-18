package Rh;

import K4.C0813a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import y.AbstractC6463a;
import yh.AbstractC6635s;

/* loaded from: classes2.dex */
public final class S0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15710a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15711b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15712c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15713d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1318o0 f15714e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f15715f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f15716g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f15717h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f15718i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f15719j;

    /* renamed from: k  reason: collision with root package name */
    public final Map f15720k;

    /* renamed from: l  reason: collision with root package name */
    public final Map f15721l;

    /* renamed from: m  reason: collision with root package name */
    public final List f15722m;

    /* renamed from: n  reason: collision with root package name */
    public final Map f15723n;

    /* renamed from: o  reason: collision with root package name */
    public final List f15724o;

    /* renamed from: p  reason: collision with root package name */
    public final th.h0 f15725p;

    public S0(String str, int i10, String str2, String str3, String[] strArr, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, HashMap hashMap6, ArrayList arrayList, HashMap hashMap7, ArrayList arrayList2, th.h0 h0Var) {
        this.f15711b = (-131073) & i10;
        this.f15710a = str;
        this.f15712c = str2;
        this.f15713d = str3;
        boolean z10 = AbstractC6635s.f51074Z;
        AbstractC1318o0 abstractC1318o0 = EnumC1333w0.f15959Y;
        if (!z10 && str3 != null) {
            try {
                C1332w c1332w = new C1332w();
                new C0813a(str3, 10, 0).b(c1332w);
                abstractC1318o0 = (AbstractC1318o0) c1332w.s();
            } catch (RuntimeException unused) {
                abstractC1318o0 = EnumC1327t0.f15945Y;
            }
        }
        this.f15714e = abstractC1318o0;
        this.f15715f = strArr;
        this.f15716g = hashMap;
        this.f15717h = hashMap2;
        this.f15718i = hashMap3;
        this.f15719j = hashMap4;
        this.f15720k = hashMap5;
        this.f15721l = hashMap6;
        this.f15722m = arrayList;
        this.f15723n = hashMap7;
        this.f15724o = arrayList2;
        this.f15725p = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        S0 s02 = (S0) obj;
        if (this.f15711b == s02.f15711b && this.f15710a.equals(s02.f15710a) && this.f15712c.equals(s02.f15712c) && this.f15713d.equals(s02.f15713d) && this.f15714e.equals(s02.f15714e) && Arrays.equals(this.f15715f, s02.f15715f) && this.f15716g.equals(s02.f15716g) && this.f15717h.equals(s02.f15717h) && this.f15718i.equals(s02.f15718i) && this.f15719j.equals(s02.f15719j) && this.f15720k.equals(s02.f15720k) && this.f15721l.equals(s02.f15721l) && this.f15722m.equals(s02.f15722m) && this.f15723n.equals(s02.f15723n) && this.f15724o.equals(s02.f15724o) && this.f15725p.equals(s02.f15725p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15710a;
        int v10 = E9.f.v(this.f15713d, E9.f.v(this.f15712c, (E9.f.v(str, S0.class.hashCode() * 31, 31) + this.f15711b) * 31, 31), 31);
        return this.f15725p.hashCode() + AbstractC4194d.s(this.f15724o, AbstractC6463a.f(this.f15723n, AbstractC4194d.s(this.f15722m, AbstractC6463a.f(this.f15721l, AbstractC6463a.f(this.f15720k, AbstractC6463a.f(this.f15719j, AbstractC6463a.f(this.f15718i, AbstractC6463a.f(this.f15717h, AbstractC6463a.f(this.f15716g, (((this.f15714e.hashCode() + v10) * 31) + Arrays.hashCode(this.f15715f)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
