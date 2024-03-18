package Dg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ b[] f3651Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b[] bVarArr = {new Enum("ERROR_CLASS", 0), new Enum("ERROR_FUNCTION", 1), new Enum("ERROR_SCOPE", 2), new Enum("ERROR_MODULE", 3), new Enum("ERROR_PROPERTY", 4), new Enum("ERROR_TYPE", 5), new Enum("PARENT_OF_ERROR_SCOPE", 6)};
        f3651Y = bVarArr;
        AbstractC3557B.C0(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3651Y.clone();
    }
}
