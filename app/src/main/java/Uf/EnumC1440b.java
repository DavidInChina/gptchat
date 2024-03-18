package Uf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Uf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1440b extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1440b f17803Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1440b f17804h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1440b f17805i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1440b f17806j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC1440b f17807k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1440b[] f17808l0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f17809Y;

    static {
        EnumC1440b enumC1440b = new EnumC1440b("METHOD_RETURN_TYPE", 0, "METHOD");
        f17803Z = enumC1440b;
        EnumC1440b enumC1440b2 = new EnumC1440b("VALUE_PARAMETER", 1, "PARAMETER");
        f17804h0 = enumC1440b2;
        EnumC1440b enumC1440b3 = new EnumC1440b("FIELD", 2, "FIELD");
        f17805i0 = enumC1440b3;
        EnumC1440b enumC1440b4 = new EnumC1440b("TYPE_USE", 3, "TYPE_USE");
        f17806j0 = enumC1440b4;
        EnumC1440b enumC1440b5 = new EnumC1440b("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        f17807k0 = enumC1440b5;
        EnumC1440b[] enumC1440bArr = {enumC1440b, enumC1440b2, enumC1440b3, enumC1440b4, enumC1440b5, new EnumC1440b("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        f17808l0 = enumC1440bArr;
        AbstractC3557B.C0(enumC1440bArr);
    }

    public EnumC1440b(String str, int i10, String str2) {
        this.f17809Y = str2;
    }

    public static EnumC1440b valueOf(String str) {
        return (EnumC1440b) Enum.valueOf(EnumC1440b.class, str);
    }

    public static EnumC1440b[] values() {
        return (EnumC1440b[]) f17808l0.clone();
    }
}
