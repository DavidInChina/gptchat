package cg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: cg.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2415f extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2415f f26628Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2415f f26629Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2415f f26630h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2415f[] f26631i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [cg.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cg.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cg.f, java.lang.Enum] */
    static {
        ?? r32 = new Enum("FORCE_FLEXIBILITY", 0);
        f26628Y = r32;
        ?? r42 = new Enum("NULLABLE", 1);
        f26629Z = r42;
        ?? r52 = new Enum("NOT_NULL", 2);
        f26630h0 = r52;
        EnumC2415f[] enumC2415fArr = {r32, r42, r52};
        f26631i0 = enumC2415fArr;
        AbstractC3557B.C0(enumC2415fArr);
    }

    public static EnumC2415f valueOf(String str) {
        return (EnumC2415f) Enum.valueOf(EnumC2415f.class, str);
    }

    public static EnumC2415f[] values() {
        return (EnumC2415f[]) f26631i0.clone();
    }
}
