package Bg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class T extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ T[] f2087Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        T[] tArr = {new Enum("CHECK_ONLY_LOWER", 0), new Enum("CHECK_SUBTYPE_AND_LOWER", 1), new Enum("SKIP_LOWER", 2)};
        f2087Y = tArr;
        AbstractC3557B.C0(tArr);
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f2087Y.clone();
    }
}
