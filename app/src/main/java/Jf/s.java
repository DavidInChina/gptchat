package Jf;

import id.AbstractC3557B;
import kg.C4290b;
import kg.C4294f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class s extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final s f9211Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final s f9212h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final s f9213i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final s f9214j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ s[] f9215k0;

    /* renamed from: Y  reason: collision with root package name */
    public final C4294f f9216Y;

    static {
        s sVar = new s("UBYTEARRAY", 0, C4290b.e("kotlin/UByteArray", false));
        f9211Z = sVar;
        s sVar2 = new s("USHORTARRAY", 1, C4290b.e("kotlin/UShortArray", false));
        f9212h0 = sVar2;
        s sVar3 = new s("UINTARRAY", 2, C4290b.e("kotlin/UIntArray", false));
        f9213i0 = sVar3;
        s sVar4 = new s("ULONGARRAY", 3, C4290b.e("kotlin/ULongArray", false));
        f9214j0 = sVar4;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f9215k0 = sVarArr;
        AbstractC3557B.C0(sVarArr);
    }

    public s(String str, int i10, C4290b c4290b) {
        C4294f i11 = c4290b.i();
        AbstractC3557B.b0("getShortClassName(...)", i11);
        this.f9216Y = i11;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f9215k0.clone();
    }
}
