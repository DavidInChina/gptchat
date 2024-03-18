package vd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: vd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6026a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6026a f47470Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6026a f47471Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6026a f47472h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6026a f47473i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC6026a f47474j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6026a[] f47475k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, vd.a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, vd.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, vd.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, vd.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, vd.a] */
    static {
        Enum r62 = new Enum("RootViewModelCombine", 0);
        ?? r72 = new Enum("MainActivityOnCreate", 1);
        f47470Y = r72;
        ?? r82 = new Enum("Auth0Init", 2);
        f47471Z = r82;
        ?? r92 = new Enum("StatsigInit", 3);
        f47472h0 = r92;
        ?? r10 = new Enum("ConversationDatabaseLoad", 4);
        f47473i0 = r10;
        ?? r11 = new Enum("MessagesDatabaseLoad", 5);
        f47474j0 = r11;
        EnumC6026a[] enumC6026aArr = {r62, r72, r82, r92, r10, r11};
        f47475k0 = enumC6026aArr;
        AbstractC3557B.C0(enumC6026aArr);
    }

    public static EnumC6026a valueOf(String str) {
        return (EnumC6026a) Enum.valueOf(EnumC6026a.class, str);
    }

    public static EnumC6026a[] values() {
        return (EnumC6026a[]) f47475k0.clone();
    }
}
