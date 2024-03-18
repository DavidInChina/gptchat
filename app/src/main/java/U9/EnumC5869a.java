package u9;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: u9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5869a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5869a f46501Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5869a f46502Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5869a[] f46503h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [u9.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [u9.a, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Success", 0);
        f46501Y = r22;
        ?? r32 = new Enum("Error", 1);
        f46502Z = r32;
        EnumC5869a[] enumC5869aArr = {r22, r32};
        f46503h0 = enumC5869aArr;
        AbstractC3557B.C0(enumC5869aArr);
    }

    public static EnumC5869a valueOf(String str) {
        return (EnumC5869a) Enum.valueOf(EnumC5869a.class, str);
    }

    public static EnumC5869a[] values() {
        return (EnumC5869a[]) f46503h0.clone();
    }
}
