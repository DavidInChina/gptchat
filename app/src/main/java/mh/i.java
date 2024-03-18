package Mh;

import Eh.AbstractC0511j;
import yh.l1;

/* JADX WARN: Init of enum h0 can be incorrect */
/* JADX WARN: Init of enum i0 can be incorrect */
/* JADX WARN: Init of enum j0 can be incorrect */
/* JADX WARN: Init of enum k0 can be incorrect */
/* JADX WARN: Init of enum m0 can be incorrect */
/* loaded from: classes2.dex */
public enum i implements Hh.n {
    f12158h0("INTEGER", r1),
    f12159i0("DOUBLE", r4),
    f12160j0("FLOAT", r1),
    f12161k0("LONG", r4),
    f12162l0("VOID", Hh.o.ZERO),
    f12163m0("REFERENCE", r1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f12165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Hh.l f12166Z;

    static {
        Hh.o oVar = Hh.o.SINGLE;
        Hh.o oVar2 = Hh.o.DOUBLE;
    }

    i(String str, Hh.o oVar) {
        this.f12165Y = r2;
        this.f12166Z = new Hh.l(oVar.f7825Y * (-1), 0);
    }

    public static i h(l1.a aVar) {
        if (aVar.a1()) {
            if (aVar.H(Long.TYPE)) {
                return f12161k0;
            }
            if (aVar.H(Double.TYPE)) {
                return f12159i0;
            }
            if (aVar.H(Float.TYPE)) {
                return f12160j0;
            }
            if (aVar.H(Void.TYPE)) {
                return f12162l0;
            }
            return f12158h0;
        }
        return f12163m0;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f12165Y);
        return this.f12166Z;
    }
}
