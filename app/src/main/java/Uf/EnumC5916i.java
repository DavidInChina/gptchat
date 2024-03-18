package uf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: uf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5916i extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5916i f46760Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5916i[] f46761Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, uf.i] */
    static {
        Enum r22 = new Enum("TOP_DOWN", 0);
        ?? r32 = new Enum("BOTTOM_UP", 1);
        f46760Y = r32;
        EnumC5916i[] enumC5916iArr = {r22, r32};
        f46761Z = enumC5916iArr;
        AbstractC3557B.C0(enumC5916iArr);
    }

    public static EnumC5916i valueOf(String str) {
        return (EnumC5916i) Enum.valueOf(EnumC5916i.class, str);
    }

    public static EnumC5916i[] values() {
        return (EnumC5916i[]) f46761Z.clone();
    }
}
