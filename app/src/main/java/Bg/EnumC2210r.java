package bg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: bg.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2210r extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ EnumC2210r[] f25973Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC2210r[] enumC2210rArr = {new Enum("SOURCE", 0), new Enum("BINARY", 1)};
        f25973Y = enumC2210rArr;
        AbstractC3557B.C0(enumC2210rArr);
    }

    public static EnumC2210r valueOf(String str) {
        return (EnumC2210r) Enum.valueOf(EnumC2210r.class, str);
    }

    public static EnumC2210r[] values() {
        return (EnumC2210r[]) f25973Y.clone();
    }
}
