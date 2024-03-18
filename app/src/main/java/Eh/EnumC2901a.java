package eh;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: eh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2901a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2901a f29409Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2901a f29410Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2901a[] f29411h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, eh.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eh.a] */
    static {
        ?? r32 = new Enum("NONE", 0);
        f29409Y = r32;
        Enum r42 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r52 = new Enum("POLYMORPHIC", 2);
        f29410Z = r52;
        EnumC2901a[] enumC2901aArr = {r32, r42, r52};
        f29411h0 = enumC2901aArr;
        AbstractC3557B.C0(enumC2901aArr);
    }

    public static EnumC2901a valueOf(String str) {
        return (EnumC2901a) Enum.valueOf(EnumC2901a.class, str);
    }

    public static EnumC2901a[] values() {
        return (EnumC2901a[]) f29411h0.clone();
    }
}
