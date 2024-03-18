package aa;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: aa.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1938a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1938a f24016Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1938a f24017Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1938a f24018h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1938a f24019i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1938a[] f24020j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, aa.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, aa.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, aa.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, aa.a] */
    static {
        ?? r42 = new Enum("Unknown", 0);
        f24016Y = r42;
        ?? r52 = new Enum("Success", 1);
        f24017Z = r52;
        ?? r62 = new Enum("Declined", 2);
        f24018h0 = r62;
        ?? r72 = new Enum("InProgress", 3);
        f24019i0 = r72;
        EnumC1938a[] enumC1938aArr = {r42, r52, r62, r72};
        f24020j0 = enumC1938aArr;
        AbstractC3557B.C0(enumC1938aArr);
    }

    public static EnumC1938a valueOf(String str) {
        return (EnumC1938a) Enum.valueOf(EnumC1938a.class, str);
    }

    public static EnumC1938a[] values() {
        return (EnumC1938a[]) f24020j0.clone();
    }
}
