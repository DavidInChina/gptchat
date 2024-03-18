package of;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: of.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5000a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5000a f41328Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5000a f41329Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5000a f41330h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5000a[] f41331i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, of.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, of.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, of.a] */
    static {
        ?? r32 = new Enum("COROUTINE_SUSPENDED", 0);
        f41328Y = r32;
        ?? r42 = new Enum("UNDECIDED", 1);
        f41329Z = r42;
        ?? r52 = new Enum("RESUMED", 2);
        f41330h0 = r52;
        EnumC5000a[] enumC5000aArr = {r32, r42, r52};
        f41331i0 = enumC5000aArr;
        AbstractC3557B.C0(enumC5000aArr);
    }

    public static EnumC5000a valueOf(String str) {
        return (EnumC5000a) Enum.valueOf(EnumC5000a.class, str);
    }

    public static EnumC5000a[] values() {
        return (EnumC5000a[]) f41331i0.clone();
    }
}
