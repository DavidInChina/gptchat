package Rh;

import K4.C0813a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y.AbstractC6463a;
import yh.AbstractC6635s;

/* loaded from: classes2.dex */
public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15729a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15730b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15731c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC1322q0 f15732d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f15733e;

    /* renamed from: f  reason: collision with root package name */
    public final List f15734f;

    public T0(String str, String str2, String str3, HashMap hashMap, ArrayList arrayList) {
        this.f15729a = str;
        this.f15730b = str2;
        this.f15731c = str3;
        boolean z10 = AbstractC6635s.f51074Z;
        AbstractC1322q0 abstractC1322q0 = EnumC1333w0.f15959Y;
        if (!z10 && str3 != null) {
            y7.b bVar = new y7.b(20, (AbstractC6463a) null);
            try {
                C0813a.d(str3, 0, new E(bVar));
                abstractC1322q0 = new C1320p0((AbstractC1337y0) bVar.f50831Z);
            } catch (RuntimeException unused) {
                abstractC1322q0 = EnumC1327t0.f15945Y;
            }
        }
        this.f15732d = abstractC1322q0;
        this.f15733e = hashMap;
        this.f15734f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        T0 t02 = (T0) obj;
        if (this.f15729a.equals(t02.f15729a) && this.f15730b.equals(t02.f15730b) && this.f15731c.equals(t02.f15731c) && this.f15732d.equals(t02.f15732d) && this.f15733e.equals(t02.f15733e) && this.f15734f.equals(t02.f15734f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f15731c, E9.f.v(this.f15730b, E9.f.v(this.f15729a, T0.class.hashCode() * 31, 31), 31), 31);
        return this.f15734f.hashCode() + AbstractC6463a.f(this.f15733e, (this.f15732d.hashCode() + v10) * 31, 31);
    }
}
