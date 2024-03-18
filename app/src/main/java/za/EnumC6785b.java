package za;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: za.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6785b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6785b f51780Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6785b f51781Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6785b[] f51782h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [za.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [za.b, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Camera", 0);
        f51780Y = r22;
        ?? r32 = new Enum("Gallery", 1);
        f51781Z = r32;
        EnumC6785b[] enumC6785bArr = {r22, r32};
        f51782h0 = enumC6785bArr;
        AbstractC3557B.C0(enumC6785bArr);
    }

    public static EnumC6785b valueOf(String str) {
        return (EnumC6785b) Enum.valueOf(EnumC6785b.class, str);
    }

    public static EnumC6785b[] values() {
        return (EnumC6785b[]) f51782h0.clone();
    }
}
