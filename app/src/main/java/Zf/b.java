package Zf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f23719Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final b f23720Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final b f23721h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ b[] f23722i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Zf.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Zf.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Zf.b] */
    static {
        ?? r32 = new Enum("INFLEXIBLE", 0);
        f23719Y = r32;
        ?? r42 = new Enum("FLEXIBLE_UPPER_BOUND", 1);
        f23720Z = r42;
        ?? r52 = new Enum("FLEXIBLE_LOWER_BOUND", 2);
        f23721h0 = r52;
        b[] bVarArr = {r32, r42, r52};
        f23722i0 = bVarArr;
        AbstractC3557B.C0(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f23722i0.clone();
    }
}
