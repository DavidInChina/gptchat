package O9;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class B extends Enum<B> {
    public static final A Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f13441Y = R4.b.C1(EnumC3958h.f36152Y, C1141z.f13650Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final B f13442Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final B f13443h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ B[] f13444i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [O9.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, O9.B] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, O9.B] */
    static {
        ?? r32 = new Enum("InProgress", 0);
        f13442Z = r32;
        ?? r42 = new Enum("FinishedSuccessfully", 1);
        f13443h0 = r42;
        B[] bArr = {r32, r42, new Enum("FinishedPartialCompletion", 2)};
        f13444i0 = bArr;
        AbstractC3557B.C0(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f13444i0.clone();
    }
}
