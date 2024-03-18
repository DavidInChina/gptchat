package Jh;

import Hh.l;
import Hh.o;
import yh.C6641v;
import yh.l1;

/* JADX WARN: Init of enum j0 can be incorrect */
/* JADX WARN: Init of enum k0 can be incorrect */
/* JADX WARN: Init of enum l0 can be incorrect */
/* JADX WARN: Init of enum m0 can be incorrect */
/* JADX WARN: Init of enum n0 can be incorrect */
/* JADX WARN: Init of enum o0 can be incorrect */
/* JADX WARN: Init of enum p0 can be incorrect */
/* JADX WARN: Init of enum q0 can be incorrect */
/* loaded from: classes.dex */
public enum b {
    BOOLEAN(Boolean.class, r7, "(Z)Ljava/lang/Boolean;"),
    BYTE(Byte.class, r7, "(B)Ljava/lang/Byte;"),
    SHORT(Short.class, r7, "(S)Ljava/lang/Short;"),
    CHARACTER(Character.class, r7, "(C)Ljava/lang/Character;"),
    INTEGER(Integer.class, r7, "(I)Ljava/lang/Integer;"),
    LONG(Long.class, r19, "(J)Ljava/lang/Long;"),
    FLOAT(Float.class, r7, "(F)Ljava/lang/Float;"),
    DOUBLE(Double.class, r19, "(D)Ljava/lang/Double;");
    

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f9237Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l f9238Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f9239h0 = "valueOf";

    /* renamed from: i0  reason: collision with root package name */
    public final String f9240i0;

    static {
        o oVar = o.ZERO;
        o oVar2 = o.SINGLE;
    }

    b(Class cls, o oVar, String str) {
        this.f9237Y = C6641v.l1(cls);
        this.f9238Z = new l(oVar.f7825Y * (-1), 0);
        this.f9240i0 = str;
    }
}
