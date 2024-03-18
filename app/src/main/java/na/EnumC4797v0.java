package na;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: na.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4797v0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4797v0 f40129Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4797v0 f40130Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4797v0 f40131h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4797v0[] f40132i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, na.v0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, na.v0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, na.v0] */
    static {
        ?? r32 = new Enum("ScrollToBottom", 0);
        f40129Y = r32;
        ?? r42 = new Enum("ScrollToLast", 1);
        f40130Z = r42;
        ?? r52 = new Enum("NoScroll", 2);
        f40131h0 = r52;
        EnumC4797v0[] enumC4797v0Arr = {r32, r42, r52};
        f40132i0 = enumC4797v0Arr;
        AbstractC3557B.C0(enumC4797v0Arr);
    }

    public static EnumC4797v0 valueOf(String str) {
        return (EnumC4797v0) Enum.valueOf(EnumC4797v0.class, str);
    }

    public static EnumC4797v0[] values() {
        return (EnumC4797v0[]) f40132i0.clone();
    }
}
