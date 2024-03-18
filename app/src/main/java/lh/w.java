package lh;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class w extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final w f38515Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final w f38516h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final w f38517i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final w f38518j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ w[] f38519k0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f38520Y;

    static {
        w wVar = new w("None", 0, 0);
        f38515Z = wVar;
        w wVar2 = new w("Orientation90", 1, 90);
        f38516h0 = wVar2;
        w wVar3 = new w("Orientation180", 2, 180);
        f38517i0 = wVar3;
        w wVar4 = new w("Orientation270", 3, 270);
        f38518j0 = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f38519k0 = wVarArr;
        AbstractC3557B.C0(wVarArr);
    }

    public w(String str, int i10, int i11) {
        this.f38520Y = i11;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f38519k0.clone();
    }
}
