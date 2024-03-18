package Hf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Hf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0725b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0725b f7698Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC0725b f7699Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0725b[] f7700h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Hf.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Hf.b, java.lang.Enum] */
    static {
        ?? r22 = new Enum("JAVA", 0);
        f7698Y = r22;
        ?? r32 = new Enum("KOTLIN", 1);
        f7699Z = r32;
        EnumC0725b[] enumC0725bArr = {r22, r32};
        f7700h0 = enumC0725bArr;
        AbstractC3557B.C0(enumC0725bArr);
    }

    public static EnumC0725b valueOf(String str) {
        return (EnumC0725b) Enum.valueOf(EnumC0725b.class, str);
    }

    public static EnumC0725b[] values() {
        return (EnumC0725b[]) f7700h0.clone();
    }
}
