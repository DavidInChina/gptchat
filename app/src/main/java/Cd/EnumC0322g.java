package Cd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Cd.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0322g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0322g f3052Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC0322g f3053Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC0322g f3054h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0322g[] f3055i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Cd.g] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Cd.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Cd.g] */
    static {
        ?? r32 = new Enum("Disabled", 0);
        f3052Y = r32;
        ?? r42 = new Enum("NotHalted", 1);
        f3053Z = r42;
        ?? r52 = new Enum("Halted", 2);
        f3054h0 = r52;
        EnumC0322g[] enumC0322gArr = {r32, r42, r52};
        f3055i0 = enumC0322gArr;
        AbstractC3557B.C0(enumC0322gArr);
    }

    public static EnumC0322g valueOf(String str) {
        return (EnumC0322g) Enum.valueOf(EnumC0322g.class, str);
    }

    public static EnumC0322g[] values() {
        return (EnumC0322g[]) f3055i0.clone();
    }
}
