package Rh;

import K4.C0813a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y.AbstractC6463a;
import yh.AbstractC6635s;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final String f15641a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15642b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15643c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15644d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1314m0 f15645e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f15646f;

    /* renamed from: g  reason: collision with root package name */
    public final List f15647g;

    public L(String str, int i10, String str2, String str3, HashMap hashMap, ArrayList arrayList) {
        this.f15642b = i10 & (-131073);
        this.f15641a = str;
        this.f15643c = str2;
        this.f15644d = str3;
        boolean z10 = AbstractC6635s.f51074Z;
        AbstractC1314m0 abstractC1314m0 = EnumC1333w0.f15959Y;
        if (!z10 && str3 != null) {
            S4.o oVar = new S4.o(23);
            try {
                C0813a.d(str3, 0, new E(oVar));
                abstractC1314m0 = new C1312l0((AbstractC1337y0) oVar.f16184Z);
            } catch (RuntimeException unused) {
                abstractC1314m0 = EnumC1327t0.f15945Y;
            }
        }
        this.f15645e = abstractC1314m0;
        this.f15646f = hashMap;
        this.f15647g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l10 = (L) obj;
        if (this.f15642b == l10.f15642b && this.f15641a.equals(l10.f15641a) && this.f15643c.equals(l10.f15643c) && this.f15644d.equals(l10.f15644d) && this.f15645e.equals(l10.f15645e) && this.f15646f.equals(l10.f15646f) && this.f15647g.equals(l10.f15647g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15641a;
        int v10 = E9.f.v(this.f15644d, E9.f.v(this.f15643c, (E9.f.v(str, L.class.hashCode() * 31, 31) + this.f15642b) * 31, 31), 31);
        return this.f15647g.hashCode() + AbstractC6463a.f(this.f15646f, (this.f15645e.hashCode() + v10) * 31, 31);
    }
}
