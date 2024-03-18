package na;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class M1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final M1 f39831Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final M1 f39832Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final M1 f39833h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final M1 f39834i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final M1 f39835j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ M1[] f39836k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, na.M1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, na.M1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, na.M1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, na.M1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, na.M1] */
    static {
        ?? r52 = new Enum("Default", 0);
        f39831Y = r52;
        ?? r62 = new Enum("Loading", 1);
        f39832Z = r62;
        ?? r72 = new Enum("GizmoLoading", 2);
        f39833h0 = r72;
        ?? r82 = new Enum("DetailedGizmo", 3);
        f39834i0 = r82;
        ?? r92 = new Enum("BriefGizmo", 4);
        f39835j0 = r92;
        M1[] m1Arr = {r52, r62, r72, r82, r92};
        f39836k0 = m1Arr;
        AbstractC3557B.C0(m1Arr);
    }

    public static M1 valueOf(String str) {
        return (M1) Enum.valueOf(M1.class, str);
    }

    public static M1[] values() {
        return (M1[]) f39836k0.clone();
    }
}
