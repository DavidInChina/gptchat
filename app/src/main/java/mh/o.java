package Mh;

import yh.AbstractC6632q;

/* JADX WARN: Init of enum h0 can be incorrect */
/* JADX WARN: Init of enum i0 can be incorrect */
/* JADX WARN: Init of enum j0 can be incorrect */
/* JADX WARN: Init of enum k0 can be incorrect */
/* JADX WARN: Init of enum l0 can be incorrect */
/* loaded from: classes2.dex */
public enum o {
    INTEGER(21, r6),
    LONG(22, r8),
    FLOAT(23, r6),
    DOUBLE(24, r8),
    REFERENCE(25, r6);
    

    /* renamed from: n0  reason: collision with root package name */
    public static /* synthetic */ n f12180n0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f12181Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Hh.o f12182Z;

    static {
        Hh.o oVar = Hh.o.SINGLE;
        Hh.o oVar2 = Hh.o.DOUBLE;
    }

    o(int i10, Hh.o oVar) {
        this.f12181Y = i10;
        this.f12182Z = oVar;
    }

    public static o a(AbstractC6632q abstractC6632q) {
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
            if (!abstractC6632q.H(Void.TYPE)) {
                return INTEGER;
            }
            throw new IllegalArgumentException("Variable type cannot be void");
        }
        return REFERENCE;
    }
}
