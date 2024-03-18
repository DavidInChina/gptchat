package R8;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class B extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final B f15132Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final B f15133Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final B f15134h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ B[] f15135i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, R8.B] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, R8.B] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, R8.B] */
    static {
        ?? r32 = new Enum("LEFT", 0);
        f15132Y = r32;
        ?? r42 = new Enum("CENTER", 1);
        f15133Z = r42;
        ?? r52 = new Enum("RIGHT", 2);
        f15134h0 = r52;
        B[] bArr = {r32, r42, r52};
        f15135i0 = bArr;
        AbstractC3557B.C0(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f15135i0.clone();
    }
}
