package Cb;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class g0 extends Enum<g0> {
    public static final f0 Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f2941Y = R4.b.C1(EnumC3958h.f36152Y, e0.f2938Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final g0 f2942Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final g0 f2943h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final g0 f2944i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final g0 f2945j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final g0 f2946k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ g0[] f2947l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Cb.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Cb.g0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Cb.g0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Cb.g0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Cb.g0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Cb.g0] */
    static {
        ?? r52 = new Enum("NotStarted", 0);
        f2942Z = r52;
        ?? r62 = new Enum("EmailVerified", 1);
        f2943h0 = r62;
        ?? r72 = new Enum("InfoSubmitted", 2);
        f2944i0 = r72;
        ?? r82 = new Enum("ArkoseComplete", 3);
        f2945j0 = r82;
        ?? r92 = new Enum("PhoneVerified", 4);
        f2946k0 = r92;
        g0[] g0VarArr = {r52, r62, r72, r82, r92};
        f2947l0 = g0VarArr;
        AbstractC3557B.C0(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f2947l0.clone();
    }
}
