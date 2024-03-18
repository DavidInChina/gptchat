package pc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: pc.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5127f extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5127f f42979Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5127f f42980Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5127f f42981h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC5127f f42982i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5127f[] f42983j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, pc.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, pc.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, pc.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, pc.f] */
    static {
        ?? r42 = new Enum("Lifetime", 0);
        f42979Y = r42;
        ?? r52 = new Enum("Annual", 1);
        f42980Z = r52;
        ?? r62 = new Enum("Monthly", 2);
        f42981h0 = r62;
        ?? r72 = new Enum("Weekly", 3);
        f42982i0 = r72;
        EnumC5127f[] enumC5127fArr = {r42, r52, r62, r72};
        f42983j0 = enumC5127fArr;
        AbstractC3557B.C0(enumC5127fArr);
    }

    public static EnumC5127f valueOf(String str) {
        return (EnumC5127f) Enum.valueOf(EnumC5127f.class, str);
    }

    public static EnumC5127f[] values() {
        return (EnumC5127f[]) f42983j0.clone();
    }
}
