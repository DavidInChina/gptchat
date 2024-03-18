package od;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: od.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4990a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4990a f41297Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4990a f41298Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4990a[] f41299h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, od.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, od.a] */
    static {
        ?? r22 = new Enum("Sentry", 0);
        f41297Y = r22;
        ?? r32 = new Enum("ForegroundDetector", 1);
        f41298Z = r32;
        EnumC4990a[] enumC4990aArr = {r22, r32};
        f41299h0 = enumC4990aArr;
        AbstractC3557B.C0(enumC4990aArr);
    }

    public static EnumC4990a valueOf(String str) {
        return (EnumC4990a) Enum.valueOf(EnumC4990a.class, str);
    }

    public static EnumC4990a[] values() {
        return (EnumC4990a[]) f41299h0.clone();
    }
}
