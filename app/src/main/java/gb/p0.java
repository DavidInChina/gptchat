package gb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class p0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final p0 f31500Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final p0 f31501Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final p0 f31502h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ p0[] f31503i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, gb.p0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, gb.p0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, gb.p0] */
    static {
        ?? r32 = new Enum("Block", 0);
        f31500Y = r32;
        ?? r42 = new Enum("Flag", 1);
        f31501Z = r42;
        ?? r52 = new Enum("None", 2);
        f31502h0 = r52;
        p0[] p0VarArr = {r32, r42, r52};
        f31503i0 = p0VarArr;
        AbstractC3557B.C0(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f31503i0.clone();
    }
}
