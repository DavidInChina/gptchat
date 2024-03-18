package Vc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class A extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final A f18524Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ A[] f18525h0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f18526Y;

    static {
        A a5 = new A("Canary", 0, "canary");
        A a10 = new A("Local", 1, "local");
        A a11 = new A("Prod", 2, "prod");
        f18524Z = a11;
        A[] aArr = {a5, a10, a11};
        f18525h0 = aArr;
        AbstractC3557B.C0(aArr);
    }

    public A(String str, int i10, String str2) {
        this.f18526Y = str2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f18525h0.clone();
    }
}
