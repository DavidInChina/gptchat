package qg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: qg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5324a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5324a f44134Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5324a[] f44135Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, qg.a] */
    static {
        Enum r32 = new Enum("WARNING", 0);
        ?? r42 = new Enum("ERROR", 1);
        f44134Y = r42;
        EnumC5324a[] enumC5324aArr = {r32, r42, new Enum("HIDDEN", 2)};
        f44135Z = enumC5324aArr;
        AbstractC3557B.C0(enumC5324aArr);
    }

    public static EnumC5324a valueOf(String str) {
        return (EnumC5324a) Enum.valueOf(EnumC5324a.class, str);
    }

    public static EnumC5324a[] values() {
        return (EnumC5324a[]) f44135Z.clone();
    }
}
