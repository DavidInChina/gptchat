package Uf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class I extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final I f17765Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final I f17766h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final I f17767i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ I[] f17768j0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f17769Y;

    static {
        I i10 = new I("IGNORE", 0, "ignore");
        f17765Z = i10;
        I i11 = new I("WARN", 1, "warn");
        f17766h0 = i11;
        I i12 = new I("STRICT", 2, "strict");
        f17767i0 = i12;
        I[] iArr = {i10, i11, i12};
        f17768j0 = iArr;
        AbstractC3557B.C0(iArr);
    }

    public I(String str, int i10, String str2) {
        this.f17769Y = str2;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f17768j0.clone();
    }
}
