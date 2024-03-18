package ca;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ca.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2320l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2320l f26398Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2320l f26399Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2320l f26400h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2320l[] f26401i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ca.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ca.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ca.l, java.lang.Enum] */
    static {
        ?? r42 = new Enum("NotLoaded", 0);
        f26398Y = r42;
        ?? r52 = new Enum("Loading", 1);
        f26399Z = r52;
        ?? r62 = new Enum("Loaded", 2);
        f26400h0 = r62;
        EnumC2320l[] enumC2320lArr = {r42, r52, r62, new Enum("Error", 3)};
        f26401i0 = enumC2320lArr;
        AbstractC3557B.C0(enumC2320lArr);
    }

    public static EnumC2320l valueOf(String str) {
        return (EnumC2320l) Enum.valueOf(EnumC2320l.class, str);
    }

    public static EnumC2320l[] values() {
        return (EnumC2320l[]) f26401i0.clone();
    }
}
