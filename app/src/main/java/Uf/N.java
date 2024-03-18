package Uf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class N extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final N f17778Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final N f17779Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N f17780h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ N[] f17781i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Uf.N] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Uf.N] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Uf.N] */
    static {
        ?? r32 = new Enum("ONE_COLLECTION_PARAMETER", 0);
        f17778Y = r32;
        ?? r42 = new Enum("OBJECT_PARAMETER_NON_GENERIC", 1);
        f17779Z = r42;
        ?? r52 = new Enum("OBJECT_PARAMETER_GENERIC", 2);
        f17780h0 = r52;
        N[] nArr = {r32, r42, r52};
        f17781i0 = nArr;
        AbstractC3557B.C0(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f17781i0.clone();
    }
}
