package Uc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Uc.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1421f extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1421f f17668Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1421f f17669Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1421f f17670h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1421f f17671i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1421f f17672j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1421f[] f17673k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Uc.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Uc.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Uc.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Uc.f] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Uc.f] */
    static {
        ?? r52 = new Enum("VOICE_MODE", 0);
        f17668Y = r52;
        ?? r62 = new Enum("CAMERA", 1);
        f17669Z = r62;
        ?? r72 = new Enum("GALLERY", 2);
        f17670h0 = r72;
        ?? r82 = new Enum("WHISPER", 3);
        f17671i0 = r82;
        ?? r92 = new Enum("DEFAULT", 4);
        f17672j0 = r92;
        EnumC1421f[] enumC1421fArr = {r52, r62, r72, r82, r92};
        f17673k0 = enumC1421fArr;
        AbstractC3557B.C0(enumC1421fArr);
    }

    public static EnumC1421f valueOf(String str) {
        return (EnumC1421f) Enum.valueOf(EnumC1421f.class, str);
    }

    public static EnumC1421f[] values() {
        return (EnumC1421f[]) f17673k0.clone();
    }
}
