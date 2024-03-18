package Hf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Hf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0724a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0724a f7695Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC0724a f7696Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0724a[] f7697h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Hf.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Hf.a, java.lang.Enum] */
    static {
        ?? r22 = new Enum("CALL_BY_NAME", 0);
        f7695Y = r22;
        ?? r32 = new Enum("POSITIONAL_CALL", 1);
        f7696Z = r32;
        EnumC0724a[] enumC0724aArr = {r22, r32};
        f7697h0 = enumC0724aArr;
        AbstractC3557B.C0(enumC0724aArr);
    }

    public static EnumC0724a valueOf(String str) {
        return (EnumC0724a) Enum.valueOf(EnumC0724a.class, str);
    }

    public static EnumC0724a[] values() {
        return (EnumC0724a[]) f7697h0.clone();
    }
}
