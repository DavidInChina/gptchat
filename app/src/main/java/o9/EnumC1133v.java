package O9;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: O9.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1133v extends Enum<EnumC1133v> {
    public static final C1131u Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f13606Y = R4.b.C1(EnumC3958h.f36152Y, C1129t.f13593Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1133v f13607Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1133v f13608h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1133v f13609i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1133v f13610j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1133v[] f13611k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [O9.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, O9.v] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, O9.v] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, O9.v] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, O9.v] */
    static {
        ?? r52 = new Enum("User", 0);
        f13607Z = r52;
        ?? r62 = new Enum("Assistant", 1);
        f13608h0 = r62;
        ?? r72 = new Enum("System", 2);
        f13609i0 = r72;
        Enum r82 = new Enum("Critic", 3);
        ?? r92 = new Enum("Tool", 4);
        f13610j0 = r92;
        EnumC1133v[] enumC1133vArr = {r52, r62, r72, r82, r92};
        f13611k0 = enumC1133vArr;
        AbstractC3557B.C0(enumC1133vArr);
    }

    public static EnumC1133v valueOf(String str) {
        return (EnumC1133v) Enum.valueOf(EnumC1133v.class, str);
    }

    public static EnumC1133v[] values() {
        return (EnumC1133v[]) f13611k0.clone();
    }
}
