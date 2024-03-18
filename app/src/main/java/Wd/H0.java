package wd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class H0 extends Enum<H0> {
    public static final G0 Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f48337Y = R4.b.C1(EnumC3958h.f36152Y, F0.f48334Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final H0 f48338Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final H0 f48339h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ H0[] f48340i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [wd.G0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [wd.H0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [wd.H0, java.lang.Enum] */
    static {
        ?? r22 = new Enum("GOOGLE_PLAY", 0);
        f48338Z = r22;
        ?? r32 = new Enum("OTHER", 1);
        f48339h0 = r32;
        H0[] h0Arr = {r22, r32};
        f48340i0 = h0Arr;
        AbstractC3557B.C0(h0Arr);
    }

    public static H0 valueOf(String str) {
        return (H0) Enum.valueOf(H0.class, str);
    }

    public static H0[] values() {
        return (H0[]) f48340i0.clone();
    }
}
