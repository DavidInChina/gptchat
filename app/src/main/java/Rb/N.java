package Rb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class N extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final N f15283Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final N f15284Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N f15285h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ N[] f15286i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Rb.N] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Rb.N] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Rb.N] */
    static {
        ?? r32 = new Enum("CONVERSATION", 0);
        f15283Y = r32;
        ?? r42 = new Enum("SHARED_CONVERSATION", 1);
        f15284Z = r42;
        ?? r52 = new Enum("GIZMO", 2);
        f15285h0 = r52;
        N[] nArr = {r32, r42, r52};
        f15286i0 = nArr;
        AbstractC3557B.C0(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f15286i0.clone();
    }
}
