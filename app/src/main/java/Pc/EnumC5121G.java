package pc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: pc.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5121G extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5121G f42899Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5121G f42900Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5121G f42901h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5121G[] f42902i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, pc.G] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, pc.G] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, pc.G] */
    static {
        ?? r32 = new Enum("DisabledPurchaseButton", 0);
        f42899Y = r32;
        ?? r42 = new Enum("Alert", 1);
        f42900Z = r42;
        ?? r52 = new Enum("ExitAlert", 2);
        f42901h0 = r52;
        EnumC5121G[] enumC5121GArr = {r32, r42, r52};
        f42902i0 = enumC5121GArr;
        AbstractC3557B.C0(enumC5121GArr);
    }

    public static EnumC5121G valueOf(String str) {
        return (EnumC5121G) Enum.valueOf(EnumC5121G.class, str);
    }

    public static EnumC5121G[] values() {
        return (EnumC5121G[]) f42902i0.clone();
    }
}
