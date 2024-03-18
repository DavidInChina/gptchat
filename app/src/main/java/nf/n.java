package Nf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f12832Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final n f12833Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final n f12834h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ n[] f12835i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Nf.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Nf.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Nf.n] */
    static {
        ?? r32 = new Enum("RUNTIME", 0);
        f12832Y = r32;
        ?? r42 = new Enum("BINARY", 1);
        f12833Z = r42;
        ?? r52 = new Enum("SOURCE", 2);
        f12834h0 = r52;
        n[] nVarArr = {r32, r42, r52};
        f12835i0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f12835i0.clone();
    }
}
