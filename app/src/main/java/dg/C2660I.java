package dg;

/* renamed from: dg.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2660I {

    /* renamed from: k  reason: collision with root package name */
    public static final C2660I f28293k = new C2660I(false, false, false, false, false, new C2660I(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28294a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28295b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28296c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28297d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28298e;

    /* renamed from: f  reason: collision with root package name */
    public final C2660I f28299f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28300g;

    /* renamed from: h  reason: collision with root package name */
    public final C2660I f28301h;

    /* renamed from: i  reason: collision with root package name */
    public final C2660I f28302i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28303j;

    public C2660I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C2660I c2660i, boolean z15, C2660I c2660i2, C2660I c2660i3, boolean z16, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        c2660i = (i10 & 32) != 0 ? null : c2660i;
        z15 = (i10 & 64) != 0 ? true : z15;
        c2660i2 = (i10 & 128) != 0 ? c2660i : c2660i2;
        c2660i3 = (i10 & 256) != 0 ? c2660i : c2660i3;
        z16 = (i10 & 512) != 0 ? false : z16;
        this.f28294a = z10;
        this.f28295b = z11;
        this.f28296c = z12;
        this.f28297d = z13;
        this.f28298e = z14;
        this.f28299f = c2660i;
        this.f28300g = z15;
        this.f28301h = c2660i2;
        this.f28302i = c2660i3;
        this.f28303j = z16;
    }
}
