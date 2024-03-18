package Bg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class p0 extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final p0 f2146h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final p0 f2147i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final p0 f2148j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ p0[] f2149k0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f2150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f2151Z;

    static {
        p0 p0Var = new p0("INVARIANT", 0, "", true);
        f2146h0 = p0Var;
        p0 p0Var2 = new p0("IN_VARIANCE", 1, "in", false);
        f2147i0 = p0Var2;
        p0 p0Var3 = new p0("OUT_VARIANCE", 2, "out", true);
        f2148j0 = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f2149k0 = p0VarArr;
        AbstractC3557B.C0(p0VarArr);
    }

    public p0(String str, int i10, String str2, boolean z10) {
        this.f2150Y = str2;
        this.f2151Z = z10;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f2149k0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2150Y;
    }
}
