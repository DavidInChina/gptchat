package k1;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A  reason: collision with root package name */
    public float f36781A;

    /* renamed from: B  reason: collision with root package name */
    public String f36782B;

    /* renamed from: C  reason: collision with root package name */
    public int f36783C;

    /* renamed from: D  reason: collision with root package name */
    public float f36784D;

    /* renamed from: E  reason: collision with root package name */
    public float f36785E;

    /* renamed from: F  reason: collision with root package name */
    public int f36786F;

    /* renamed from: G  reason: collision with root package name */
    public int f36787G;

    /* renamed from: H  reason: collision with root package name */
    public int f36788H;

    /* renamed from: I  reason: collision with root package name */
    public int f36789I;

    /* renamed from: J  reason: collision with root package name */
    public int f36790J;

    /* renamed from: K  reason: collision with root package name */
    public int f36791K;

    /* renamed from: L  reason: collision with root package name */
    public int f36792L;

    /* renamed from: M  reason: collision with root package name */
    public int f36793M;

    /* renamed from: N  reason: collision with root package name */
    public float f36794N;

    /* renamed from: O  reason: collision with root package name */
    public float f36795O;
    public int P;
    public int Q;

    /* renamed from: R  reason: collision with root package name */
    public int f36796R;
    public boolean S;
    public boolean T;

    /* renamed from: U  reason: collision with root package name */
    public String f36797U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f36798V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f36799W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f36800X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f36801Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f36802Z;

    /* renamed from: a  reason: collision with root package name */
    public int f36803a;

    /* renamed from: a0  reason: collision with root package name */
    public int f36804a0;

    /* renamed from: b  reason: collision with root package name */
    public int f36805b;

    /* renamed from: b0  reason: collision with root package name */
    public int f36806b0;

    /* renamed from: c  reason: collision with root package name */
    public float f36807c;

    /* renamed from: c0  reason: collision with root package name */
    public int f36808c0;

    /* renamed from: d  reason: collision with root package name */
    public int f36809d;

    /* renamed from: d0  reason: collision with root package name */
    public int f36810d0;

    /* renamed from: e  reason: collision with root package name */
    public int f36811e;

    /* renamed from: e0  reason: collision with root package name */
    public int f36812e0;

    /* renamed from: f  reason: collision with root package name */
    public int f36813f;

    /* renamed from: f0  reason: collision with root package name */
    public int f36814f0;

    /* renamed from: g  reason: collision with root package name */
    public int f36815g;

    /* renamed from: g0  reason: collision with root package name */
    public float f36816g0;

    /* renamed from: h  reason: collision with root package name */
    public int f36817h;

    /* renamed from: h0  reason: collision with root package name */
    public int f36818h0;

    /* renamed from: i  reason: collision with root package name */
    public int f36819i;

    /* renamed from: i0  reason: collision with root package name */
    public int f36820i0;

    /* renamed from: j  reason: collision with root package name */
    public int f36821j;

    /* renamed from: j0  reason: collision with root package name */
    public float f36822j0;

    /* renamed from: k  reason: collision with root package name */
    public int f36823k;

    /* renamed from: k0  reason: collision with root package name */
    public i1.d f36824k0;

    /* renamed from: l  reason: collision with root package name */
    public int f36825l;

    /* renamed from: m  reason: collision with root package name */
    public int f36826m;

    /* renamed from: n  reason: collision with root package name */
    public int f36827n;

    /* renamed from: o  reason: collision with root package name */
    public float f36828o;

    /* renamed from: p  reason: collision with root package name */
    public int f36829p;

    /* renamed from: q  reason: collision with root package name */
    public int f36830q;

    /* renamed from: r  reason: collision with root package name */
    public int f36831r;

    /* renamed from: s  reason: collision with root package name */
    public int f36832s;

    /* renamed from: t  reason: collision with root package name */
    public int f36833t;

    /* renamed from: u  reason: collision with root package name */
    public int f36834u;

    /* renamed from: v  reason: collision with root package name */
    public int f36835v;

    /* renamed from: w  reason: collision with root package name */
    public int f36836w;

    /* renamed from: x  reason: collision with root package name */
    public int f36837x;

    /* renamed from: y  reason: collision with root package name */
    public int f36838y;

    /* renamed from: z  reason: collision with root package name */
    public float f36839z;

    public final void a() {
        this.f36801Y = false;
        this.f36798V = true;
        this.f36799W = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.S) {
            this.f36798V = false;
            if (this.f36788H == 0) {
                this.f36788H = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.T) {
            this.f36799W = false;
            if (this.f36789I == 0) {
                this.f36789I = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f36798V = false;
            if (i10 == 0 && this.f36788H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f36799W = false;
            if (i11 == 0 && this.f36789I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f36807c != -1.0f || this.f36803a != -1 || this.f36805b != -1) {
            this.f36801Y = true;
            this.f36798V = true;
            this.f36799W = true;
            if (!(this.f36824k0 instanceof i1.h)) {
                this.f36824k0 = new i1.h();
            }
            ((i1.h) this.f36824k0).C(this.f36796R);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i10);
        boolean z11 = false;
        if (1 == getLayoutDirection()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36808c0 = -1;
        this.f36810d0 = -1;
        this.f36804a0 = -1;
        this.f36806b0 = -1;
        this.f36812e0 = this.f36833t;
        this.f36814f0 = this.f36835v;
        float f6 = this.f36839z;
        this.f36816g0 = f6;
        int i17 = this.f36803a;
        this.f36818h0 = i17;
        int i18 = this.f36805b;
        this.f36820i0 = i18;
        float f10 = this.f36807c;
        this.f36822j0 = f10;
        if (z10) {
            int i19 = this.f36829p;
            if (i19 != -1) {
                this.f36808c0 = i19;
            } else {
                int i20 = this.f36830q;
                if (i20 != -1) {
                    this.f36810d0 = i20;
                }
                i11 = this.f36831r;
                if (i11 != -1) {
                    this.f36806b0 = i11;
                    z11 = true;
                }
                i12 = this.f36832s;
                if (i12 != -1) {
                    this.f36804a0 = i12;
                    z11 = true;
                }
                i13 = this.f36837x;
                if (i13 != -1) {
                    this.f36814f0 = i13;
                }
                i14 = this.f36838y;
                if (i14 != -1) {
                    this.f36812e0 = i14;
                }
                if (z11) {
                    this.f36816g0 = 1.0f - f6;
                }
                if (this.f36801Y && this.f36796R == 1) {
                    if (f10 == -1.0f) {
                        this.f36822j0 = 1.0f - f10;
                        this.f36818h0 = -1;
                        this.f36820i0 = -1;
                    } else if (i17 != -1) {
                        this.f36820i0 = i17;
                        this.f36818h0 = -1;
                        this.f36822j0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f36818h0 = i18;
                        this.f36820i0 = -1;
                        this.f36822j0 = -1.0f;
                    }
                }
            }
            z11 = true;
            i11 = this.f36831r;
            if (i11 != -1) {
            }
            i12 = this.f36832s;
            if (i12 != -1) {
            }
            i13 = this.f36837x;
            if (i13 != -1) {
            }
            i14 = this.f36838y;
            if (i14 != -1) {
            }
            if (z11) {
            }
            if (this.f36801Y) {
                if (f10 == -1.0f) {
                }
            }
        } else {
            int i21 = this.f36829p;
            if (i21 != -1) {
                this.f36806b0 = i21;
            }
            int i22 = this.f36830q;
            if (i22 != -1) {
                this.f36804a0 = i22;
            }
            int i23 = this.f36831r;
            if (i23 != -1) {
                this.f36808c0 = i23;
            }
            int i24 = this.f36832s;
            if (i24 != -1) {
                this.f36810d0 = i24;
            }
            int i25 = this.f36837x;
            if (i25 != -1) {
                this.f36812e0 = i25;
            }
            int i26 = this.f36838y;
            if (i26 != -1) {
                this.f36814f0 = i26;
            }
        }
        if (this.f36831r == -1 && this.f36832s == -1 && this.f36830q == -1 && this.f36829p == -1) {
            int i27 = this.f36813f;
            if (i27 != -1) {
                this.f36808c0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                }
            } else {
                int i28 = this.f36815g;
                if (i28 != -1) {
                    this.f36810d0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                }
            }
            int i29 = this.f36809d;
            if (i29 != -1) {
                this.f36804a0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i15 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                return;
            }
            int i30 = this.f36811e;
            if (i30 != -1) {
                this.f36806b0 = i30;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i15 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }
    }
}
