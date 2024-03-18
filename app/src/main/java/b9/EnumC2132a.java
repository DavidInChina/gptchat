package b9;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: b9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2132a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2132a f25655Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2132a f25656Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2132a f25657h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC2132a f25658i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2132a[] f25659j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, b9.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, b9.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, b9.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, b9.a] */
    static {
        ?? r52 = new Enum("Auth0", 0);
        f25655Y = r52;
        ?? r62 = new Enum("Apple", 1);
        f25656Z = r62;
        ?? r72 = new Enum("Google", 2);
        f25657h0 = r72;
        Enum r82 = new Enum("Microsoft", 3);
        ?? r92 = new Enum("AccountCreation", 4);
        f25658i0 = r92;
        EnumC2132a[] enumC2132aArr = {r52, r62, r72, r82, r92};
        f25659j0 = enumC2132aArr;
        AbstractC3557B.C0(enumC2132aArr);
    }

    public static EnumC2132a valueOf(String str) {
        return (EnumC2132a) Enum.valueOf(EnumC2132a.class, str);
    }

    public static EnumC2132a[] values() {
        return (EnumC2132a[]) f25659j0.clone();
    }
}
