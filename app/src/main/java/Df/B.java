package Df;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class B extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final B f3622Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final B f3623Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final B f3624h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final B f3625i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ B[] f3626j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Df.B] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Df.B] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Df.B] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Df.B] */
    static {
        ?? r42 = new Enum("PUBLIC", 0);
        f3622Y = r42;
        ?? r52 = new Enum("PROTECTED", 1);
        f3623Z = r52;
        ?? r62 = new Enum("INTERNAL", 2);
        f3624h0 = r62;
        ?? r72 = new Enum("PRIVATE", 3);
        f3625i0 = r72;
        B[] bArr = {r42, r52, r62, r72};
        f3626j0 = bArr;
        AbstractC3557B.C0(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3626j0.clone();
    }
}
