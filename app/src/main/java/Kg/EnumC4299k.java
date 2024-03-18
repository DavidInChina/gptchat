package kg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: kg.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4299k extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4299k f37538Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4299k f37539Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4299k f37540h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4299k[] f37541i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, kg.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, kg.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, kg.k] */
    static {
        ?? r32 = new Enum("BEGINNING", 0);
        f37538Y = r32;
        ?? r42 = new Enum("MIDDLE", 1);
        f37539Z = r42;
        ?? r52 = new Enum("AFTER_DOT", 2);
        f37540h0 = r52;
        EnumC4299k[] enumC4299kArr = {r32, r42, r52};
        f37541i0 = enumC4299kArr;
        AbstractC3557B.C0(enumC4299kArr);
    }

    public static EnumC4299k valueOf(String str) {
        return (EnumC4299k) Enum.valueOf(EnumC4299k.class, str);
    }

    public static EnumC4299k[] values() {
        return (EnumC4299k[]) f37541i0.clone();
    }
}
