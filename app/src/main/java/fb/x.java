package Fb;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class x extends Enum<x> {
    public static final w Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f5177Y = R4.b.C1(EnumC3958h.f36152Y, v.f5176Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final x f5178Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ x[] f5179h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Fb.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Fb.x] */
    static {
        Enum r42 = new Enum("Pending", 0);
        Enum r52 = new Enum("Fail", 1);
        Enum r62 = new Enum("Success", 2);
        ?? r72 = new Enum("Unknown", 3);
        f5178Z = r72;
        x[] xVarArr = {r42, r52, r62, r72};
        f5179h0 = xVarArr;
        AbstractC3557B.C0(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f5179h0.clone();
    }
}
