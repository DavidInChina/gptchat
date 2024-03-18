package Df;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f3643Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final n f3644Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final n f3645h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ n[] f3646i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Df.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Df.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Df.n, java.lang.Enum] */
    static {
        ?? r32 = new Enum("INSTANCE", 0);
        f3643Y = r32;
        ?? r42 = new Enum("EXTENSION_RECEIVER", 1);
        f3644Z = r42;
        ?? r52 = new Enum("VALUE", 2);
        f3645h0 = r52;
        n[] nVarArr = {r32, r42, r52};
        f3646i0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f3646i0.clone();
    }
}
