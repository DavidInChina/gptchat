package Pg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Pg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1170c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1170c f14192Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1170c f14193Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1170c f14194h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1170c[] f14195i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Pg.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Pg.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Pg.c] */
    static {
        ?? r32 = new Enum("SUSPEND", 0);
        f14192Y = r32;
        ?? r42 = new Enum("DROP_OLDEST", 1);
        f14193Z = r42;
        ?? r52 = new Enum("DROP_LATEST", 2);
        f14194h0 = r52;
        EnumC1170c[] enumC1170cArr = {r32, r42, r52};
        f14195i0 = enumC1170cArr;
        AbstractC3557B.C0(enumC1170cArr);
    }

    public static EnumC1170c valueOf(String str) {
        return (EnumC1170c) Enum.valueOf(EnumC1170c.class, str);
    }

    public static EnumC1170c[] values() {
        return (EnumC1170c[]) f14195i0.clone();
    }
}
