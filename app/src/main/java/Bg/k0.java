package Bg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class k0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final k0 f2131Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final k0 f2132Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ k0[] f2133h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Bg.k0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Bg.k0] */
    static {
        ?? r22 = new Enum("SUPERTYPE", 0);
        f2131Y = r22;
        ?? r32 = new Enum("COMMON", 1);
        f2132Z = r32;
        k0[] k0VarArr = {r22, r32};
        f2133h0 = k0VarArr;
        AbstractC3557B.C0(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f2133h0.clone();
    }
}
