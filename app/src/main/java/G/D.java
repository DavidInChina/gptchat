package G;

import h0.C3288a;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final i0.e f5416a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6216a f5417b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f5418c = new LinkedHashMap();

    public D(i0.e eVar, F.r rVar) {
        this.f5416a = eVar;
        this.f5417b = rVar;
    }

    public final wf.n a(Object obj, int i10, Object obj2) {
        C3288a c3288a;
        LinkedHashMap linkedHashMap = this.f5418c;
        C c10 = (C) linkedHashMap.get(obj);
        if (c10 != null && c10.f5413c == i10 && AbstractC3557B.K(c10.f5412b, obj2)) {
            wf.n nVar = c10.f5414d;
            if (nVar == null) {
                c3288a = new C3288a(new androidx.compose.foundation.layout.c(c10.f5415e, 2, c10), true, 1403994769);
                c10.f5414d = c3288a;
            } else {
                return nVar;
            }
        } else {
            C c11 = new C(this, i10, obj, obj2);
            linkedHashMap.put(obj, c11);
            wf.n nVar2 = c11.f5414d;
            if (nVar2 == null) {
                c3288a = new C3288a(new androidx.compose.foundation.layout.c(this, 2, c11), true, 1403994769);
                c11.f5414d = c3288a;
            } else {
                return nVar2;
            }
        }
        return c3288a;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C c10 = (C) this.f5418c.get(obj);
        if (c10 != null) {
            return c10.f5412b;
        }
        F f6 = (F) this.f5417b.mo122invoke();
        int c11 = f6.c(obj);
        if (c11 == -1) {
            return null;
        }
        return f6.d(c11);
    }
}
