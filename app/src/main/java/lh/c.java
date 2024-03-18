package Lh;

import Eh.AbstractC0511j;
import yh.AbstractC6632q;

/* loaded from: classes2.dex */
public enum c implements Hh.n {
    INTEGER(k.ZERO),
    LONG(m.ZERO),
    FLOAT(g.ZERO),
    DOUBLE(e.ZERO),
    VOID(Hh.m.f7819Y),
    REFERENCE(n.f11208Y);
    

    /* renamed from: Y  reason: collision with root package name */
    public final Hh.n f11175Y;

    c(Hh.n nVar) {
        this.f11175Y = nVar;
    }

    public static c h(AbstractC6632q abstractC6632q) {
        if (abstractC6632q.a1()) {
            if (abstractC6632q.H(Long.TYPE)) {
                return LONG;
            }
            if (abstractC6632q.H(Double.TYPE)) {
                return DOUBLE;
            }
            if (abstractC6632q.H(Float.TYPE)) {
                return FLOAT;
            }
            if (abstractC6632q.H(Void.TYPE)) {
                return VOID;
            }
            return INTEGER;
        }
        return REFERENCE;
    }

    @Override // Hh.n
    public final boolean b() {
        return this.f11175Y.b();
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return this.f11175Y.e(lVar, abstractC0511j);
    }
} 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = AbstractC5204e0.a(typeface, i10, z10);
        }
        C5207f0 c5207f0 = this.f43385h;
        if (c5207f0.f43427m) {
            c5207f0.f43426l = typeface;
            TextView textView = (TextView) this.f43384g.get();
            if (textView != null) {
                WeakHashMap weakHashMap = D1.Z.f3247a;
                if (D1.K.b(textView)) {
                    textView.post(new Z(textView, typeface, c5207f0.f43424j));
                } else {
                    textView.setTypeface(typeface, c5207f0.f43424j);
                }
            }
        }
    }

    @Override // r1.AbstractC5355b
    public final void e(int i10) {
    }
}
