package Ca;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class B extends Enum<B> {
    public static final A Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f2807Y = R4.b.C1(EnumC3958h.f36152Y, z.f2857Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ B[] f2808Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Ca.A] */
    static {
        B[] bArr = {new Enum("ContentPolicy", 0)};
        f2808Z = bArr;
        AbstractC3557B.C0(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f2808Z.clone();
    }
}
