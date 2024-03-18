package cb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: cb.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2383x extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2383x f26556Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2383x f26557Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2383x[] f26558h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, cb.x] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, cb.x] */
    static {
        ?? r22 = new Enum("OAuth", 0);
        f26556Y = r22;
        ?? r32 = new Enum("Unknown", 1);
        f26557Z = r32;
        EnumC2383x[] enumC2383xArr = {r22, r32};
        f26558h0 = enumC2383xArr;
        AbstractC3557B.C0(enumC2383xArr);
    }

    public static EnumC2383x valueOf(String str) {
        return (EnumC2383x) Enum.valueOf(EnumC2383x.class, str);
    }

    public static EnumC2383x[] values() {
        return (EnumC2383x[]) f26558h0.clone();
    }
}
