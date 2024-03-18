package Wa;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f20861Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final n f20862Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ n[] f20863h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Wa.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Wa.n, java.lang.Enum] */
    static {
        ?? r22 = new Enum("AlwaysAllow", 0);
        f20861Y = r22;
        ?? r32 = new Enum("Unset", 1);
        f20862Z = r32;
        n[] nVarArr = {r22, r32};
        f20863h0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f20863h0.clone();
    }
}
