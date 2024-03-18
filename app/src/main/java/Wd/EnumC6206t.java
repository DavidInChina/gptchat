package wd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: wd.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6206t extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6206t f48459Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6206t f48460Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6206t f48461h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6206t[] f48462i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, wd.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, wd.t] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, wd.t] */
    static {
        ?? r32 = new Enum("Developer", 0);
        f48459Y = r32;
        ?? r42 = new Enum("Internal", 1);
        f48460Z = r42;
        ?? r52 = new Enum("Production", 2);
        f48461h0 = r52;
        EnumC6206t[] enumC6206tArr = {r32, r42, r52};
        f48462i0 = enumC6206tArr;
        AbstractC3557B.C0(enumC6206tArr);
    }

    public static EnumC6206t valueOf(String str) {
        return (EnumC6206t) Enum.valueOf(EnumC6206t.class, str);
    }

    public static EnumC6206t[] values() {
        return (EnumC6206t[]) f48462i0.clone();
    }
}
