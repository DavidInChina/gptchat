package Jf;

import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class t extends Enum {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ t[] f9217i0;

    /* renamed from: Y  reason: collision with root package name */
    public final C4290b f9218Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4294f f9219Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4290b f9220h0;

    static {
        t[] tVarArr = {new t("UBYTE", 0, C4290b.e("kotlin/UByte", false)), new t("USHORT", 1, C4290b.e("kotlin/UShort", false)), new t("UINT", 2, C4290b.e("kotlin/UInt", false)), new t("ULONG", 3, C4290b.e("kotlin/ULong", false))};
        f9217i0 = tVarArr;
        AbstractC3557B.C0(tVarArr);
    }

    public t(String str, int i10, C4290b c4290b) {
        this.f9218Y = c4290b;
        C4294f i11 = c4290b.i();
        AbstractC3557B.b0("getShortClassName(...)", i11);
        this.f9219Z = i11;
        C4291c g10 = c4290b.g();
        this.f9220h0 = new C4290b(g10, C4294f.e(i11.b() + "Array"));
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f9217i0.clone();
    }
}
