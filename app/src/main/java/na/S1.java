package na;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class S1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final S1 f39867Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final S1 f39868Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final S1 f39869h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ S1[] f39870i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [na.S1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [na.S1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [na.S1, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Gizmo", 0);
        f39867Y = r32;
        ?? r42 = new Enum("Upsell", 1);
        f39868Z = r42;
        ?? r52 = new Enum("None", 2);
        f39869h0 = r52;
        S1[] s1Arr = {r32, r42, r52};
        f39870i0 = s1Arr;
        AbstractC3557B.C0(s1Arr);
    }

    public static S1 valueOf(String str) {
        return (S1) Enum.valueOf(S1.class, str);
    }

    public static S1[] values() {
        return (S1[]) f39870i0.clone();
    }
}
