package Kf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final Cf.h f9799Y = new Cf.h(6, 0);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ d[] f9800Z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        d[] dVarArr = {new Enum("Function", 0), new Enum("SuspendFunction", 1), new Enum("KFunction", 2), new Enum("KSuspendFunction", 3), new Enum("UNKNOWN", 4)};
        f9800Z = dVarArr;
        AbstractC3557B.C0(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9800Z.clone();
    }
}
