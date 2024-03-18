package Jh;

import Eh.AbstractC0511j;
import Hh.l;
import Hh.n;
import Hh.o;
import yh.C6641v;
import yh.l1;

/* JADX WARN: Init of enum k0 can be incorrect */
/* JADX WARN: Init of enum l0 can be incorrect */
/* JADX WARN: Init of enum m0 can be incorrect */
/* JADX WARN: Init of enum n0 can be incorrect */
/* JADX WARN: Init of enum o0 can be incorrect */
/* JADX WARN: Init of enum p0 can be incorrect */
/* JADX WARN: Init of enum q0 can be incorrect */
/* JADX WARN: Init of enum r0 can be incorrect */
/* loaded from: classes.dex */
public enum g implements n {
    BOOLEAN(Boolean.class, r4, r17, "booleanValue", "()Z"),
    BYTE(Byte.class, Byte.TYPE, r17, "byteValue", "()B"),
    SHORT(Short.class, Short.TYPE, r17, "shortValue", "()S"),
    CHARACTER(Character.class, Character.TYPE, r17, "charValue", "()C"),
    INTEGER(Integer.class, Integer.TYPE, r17, "intValue", "()I"),
    LONG(Long.class, r22, r5, "longValue", "()J"),
    FLOAT(Float.class, Float.TYPE, r17, "floatValue", "()F"),
    DOUBLE(Double.class, Double.TYPE, r5, "doubleValue", "()D");
    

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f9261Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f9262Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l f9263h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f9264i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f9265j0;

    static {
        Class cls = Boolean.TYPE;
        o oVar = o.ZERO;
        Class cls2 = Long.TYPE;
        o oVar2 = o.SINGLE;
    }

    g(Class cls, Class cls2, o oVar, String str, String str2) {
        this.f9263h0 = oVar.a();
        this.f9261Y = C6641v.l1(cls);
        this.f9262Z = C6641v.l1(cls2);
        this.f9264i0 = str;
        this.f9265j0 = str2;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.z(182, this.f9261Y.l0().D0(), this.f9264i0, this.f9265j0, false);
        return this.f9263h0;
    }
}
