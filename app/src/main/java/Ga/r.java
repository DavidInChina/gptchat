package Ga;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class r extends Enum<r> {
    public static final q Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f6233Y = R4.b.C1(EnumC3958h.f36152Y, p.f6232Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final r f6234Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ r[] f6235h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Ga.q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Ga.r] */
    static {
        Enum r22 = new Enum("Created", 0);
        ?? r32 = new Enum("Updated", 1);
        f6234Z = r32;
        r[] rVarArr = {r22, r32};
        f6235h0 = rVarArr;
        AbstractC3557B.C0(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f6235h0.clone();
    }
}
