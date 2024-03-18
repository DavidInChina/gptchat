package cg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: cg.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2426q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2426q f26654Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2426q f26655Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2426q f26656h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2426q[] f26657i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, cg.q] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, cg.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, cg.q] */
    static {
        ?? r32 = new Enum("FLEXIBLE_LOWER", 0);
        f26654Y = r32;
        ?? r42 = new Enum("FLEXIBLE_UPPER", 1);
        f26655Z = r42;
        ?? r52 = new Enum("INFLEXIBLE", 2);
        f26656h0 = r52;
        EnumC2426q[] enumC2426qArr = {r32, r42, r52};
        f26657i0 = enumC2426qArr;
        AbstractC3557B.C0(enumC2426qArr);
    }

    public static EnumC2426q valueOf(String str) {
        return (EnumC2426q) Enum.valueOf(EnumC2426q.class, str);
    }

    public static EnumC2426q[] values() {
        return (EnumC2426q[]) f26657i0.clone();
    }
}
