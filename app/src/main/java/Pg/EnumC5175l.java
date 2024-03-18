package pg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: pg.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5175l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ EnumC5175l[] f43149Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC5175l[] enumC5175lArr = {new Enum("COMMON_SUPER_TYPE", 0), new Enum("INTERSECTION_TYPE", 1)};
        f43149Y = enumC5175lArr;
        AbstractC3557B.C0(enumC5175lArr);
    }

    public static EnumC5175l valueOf(String str) {
        return (EnumC5175l) Enum.valueOf(EnumC5175l.class, str);
    }

    public static EnumC5175l[] values() {
        return (EnumC5175l[]) f43149Y.clone();
    }
}
