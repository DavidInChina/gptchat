package na;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class N1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final N1 f39840Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final N1 f39841Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N1 f39842h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ N1[] f39843i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, na.N1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, na.N1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, na.N1] */
    static {
        ?? r42 = new Enum("Input", 0);
        f39840Y = r42;
        Enum r52 = new Enum("Suggestion", 1);
        ?? r62 = new Enum("Starter", 2);
        f39841Z = r62;
        ?? r72 = new Enum("Gizmo", 3);
        f39842h0 = r72;
        N1[] n1Arr = {r42, r52, r62, r72};
        f39843i0 = n1Arr;
        AbstractC3557B.C0(n1Arr);
    }

    public static N1 valueOf(String str) {
        return (N1) Enum.valueOf(N1.class, str);
    }

    public static N1[] values() {
        return (N1[]) f39843i0.clone();
    }
}
