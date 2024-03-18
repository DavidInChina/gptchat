package eh;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: eh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2902b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2902b f29412Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2902b f29413Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2902b[] f29414h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, eh.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, eh.b] */
    static {
        ?? r32 = new Enum("WHITESPACE_SEPARATED", 0);
        f29412Y = r32;
        ?? r42 = new Enum("ARRAY_WRAPPED", 1);
        f29413Z = r42;
        EnumC2902b[] enumC2902bArr = {r32, r42, new Enum("AUTO_DETECT", 2)};
        f29414h0 = enumC2902bArr;
        AbstractC3557B.C0(enumC2902bArr);
    }

    public static EnumC2902b valueOf(String str) {
        return (EnumC2902b) Enum.valueOf(EnumC2902b.class, str);
    }

    public static EnumC2902b[] values() {
        return (EnumC2902b[]) f29414h0.clone();
    }
}
