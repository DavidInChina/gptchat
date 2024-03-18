package Lf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class h extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ h[] f11092Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h[] hVarArr = {new Enum("FROM_DEPENDENCIES", 0), new Enum("FROM_CLASS_LOADER", 1), new Enum("FALLBACK", 2)};
        f11092Y = hVarArr;
        AbstractC3557B.C0(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f11092Y.clone();
    }
}
