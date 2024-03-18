package A;

import B.C0183z1;
import Z.C1720k0;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;
import q0.C5254f;
import t0.AbstractC5650i;

/* renamed from: A.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0026k implements L0 {

    /* renamed from: a  reason: collision with root package name */
    public final J0 f226a;

    /* renamed from: b  reason: collision with root package name */
    public C5251c f227b;

    /* renamed from: c  reason: collision with root package name */
    public final EdgeEffect f228c;

    /* renamed from: d  reason: collision with root package name */
    public final EdgeEffect f229d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f230e;

    /* renamed from: f  reason: collision with root package name */
    public final EdgeEffect f231f;

    /* renamed from: g  reason: collision with root package name */
    public final List f232g;

    /* renamed from: h  reason: collision with root package name */
    public final EdgeEffect f233h;

    /* renamed from: i  reason: collision with root package name */
    public final EdgeEffect f234i;

    /* renamed from: j  reason: collision with root package name */
    public final EdgeEffect f235j;

    /* renamed from: k  reason: collision with root package name */
    public final EdgeEffect f236k;

    /* renamed from: l  reason: collision with root package name */
    public int f237l;

    /* renamed from: m  reason: collision with root package name */
    public final C1720k0 f238m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f239n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f240o;

    /* renamed from: p  reason: collision with root package name */
    public long f241p;

    /* renamed from: q  reason: collision with root package name */
    public B0.t f242q;

    /* renamed from: r  reason: collision with root package name */
    public final AbstractC4326r f243r;

    public C0026k(Context context, J0 j02) {
        this.f226a = j02;
        EdgeEffect y02 = A7.b.y0(context);
        this.f228c = y02;
        EdgeEffect y03 = A7.b.y0(context);
        this.f229d = y03;
        EdgeEffect y04 = A7.b.y0(context);
        this.f230e = y04;
        EdgeEffect y05 = A7.b.y0(context);
        this.f231f = y05;
        List G02 = AbstractC4344b.G0(y04, y02, y05, y03);
        this.f232g = G02;
        this.f233h = A7.b.y0(context);
        this.f234i = A7.b.y0(context);
        this.f235j = A7.b.y0(context);
        this.f236k = A7.b.y0(context);
        int size = G02.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((EdgeEffect) G02.get(i10)).setColor(androidx.compose.ui.graphics.a.s(this.f226a.f80a));
        }
        this.f237l = -1;
        this.f238m = U3.f.h0(0);
        this.f239n = true;
        this.f241p = C5254f.f43637b;
        this.f243r = androidx.compose.ui.layout.a.k(B0.I.a(AbstractC0032n.f256a, jf.y.f36177a, new C0022i(this, null)), new C0024j(this)).g(new T(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x028d, code lost:
        if (r6.isFinished() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0290, code lost:
        if (r9 != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0292, code lost:
        if (r10 == false) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    @Override // A.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j6, int i10, a1 a1Var) {
        long j10;
        float f6;
        float f10;
        long r10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22;
        if (C5254f.f(this.f241p)) {
            return ((C5251c) a1Var.invoke(new C5251c(j6))).f43623a;
        }
        boolean z15 = this.f240o;
        C0034o c0034o = C0034o.f259a;
        EdgeEffect edgeEffect = this.f229d;
        EdgeEffect edgeEffect2 = this.f228c;
        EdgeEffect edgeEffect3 = this.f231f;
        EdgeEffect edgeEffect4 = this.f230e;
        if (!z15) {
            long L10 = AbstractC4828h.L(this.f241p);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                f19 = c0034o.b(edgeEffect4);
            } else {
                f19 = 0.0f;
            }
            if (f19 == 0.0f) {
                i11 = 31;
            } else {
                k(C5251c.f43619b, L10);
                i11 = 31;
            }
            if (i12 >= i11) {
                f20 = c0034o.b(edgeEffect3);
            } else {
                f20 = 0.0f;
            }
            if (f20 != 0.0f) {
                l(C5251c.f43619b, L10);
                i11 = 31;
            }
            if (i12 >= i11) {
                f21 = c0034o.b(edgeEffect2);
            } else {
                f21 = 0.0f;
            }
            if (f21 != 0.0f) {
                m(C5251c.f43619b, L10);
                i11 = 31;
            }
            if (i12 >= i11) {
                f22 = c0034o.b(edgeEffect);
            } else {
                f22 = 0.0f;
            }
            if (f22 != 0.0f) {
                j(C5251c.f43619b, L10);
            }
            this.f240o = true;
        }
        C5251c c5251c = this.f227b;
        if (c5251c != null) {
            j10 = c5251c.f43623a;
        } else {
            j10 = AbstractC4828h.L(this.f241p);
        }
        if (C5251c.e(j6) != 0.0f) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 31) {
                f15 = c0034o.b(edgeEffect2);
            } else {
                f15 = 0.0f;
            }
            if (f15 == 0.0f) {
                if (i13 >= 31) {
                    f17 = c0034o.b(edgeEffect);
                } else {
                    f17 = 0.0f;
                }
                if (f17 != 0.0f) {
                    f6 = j(j6, j10);
                    if (i13 >= 31) {
                        f18 = c0034o.b(edgeEffect);
                    } else {
                        f18 = 0.0f;
                    }
                    if (f18 == 0.0f) {
                        edgeEffect.onRelease();
                    }
                }
            } else {
                f6 = m(j6, j10);
                if (i13 >= 31) {
                    f16 = c0034o.b(edgeEffect2);
                } else {
                    f16 = 0.0f;
                }
                if (f16 == 0.0f) {
                    edgeEffect2.onRelease();
                }
            }
            if (C5251c.d(j6) != 0.0f) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 31) {
                    f11 = c0034o.b(edgeEffect4);
                } else {
                    f11 = 0.0f;
                }
                if (f11 == 0.0f) {
                    if (i14 >= 31) {
                        f13 = c0034o.b(edgeEffect3);
                    } else {
                        f13 = 0.0f;
                    }
                    if (f13 != 0.0f) {
                        float l10 = l(j6, j10);
                        if (i14 >= 31) {
                            f14 = c0034o.b(edgeEffect3);
                        } else {
                            f14 = 0.0f;
                        }
                        if (f14 == 0.0f) {
                            edgeEffect3.onRelease();
                        }
                        f10 = l10;
                    }
                } else {
                    f10 = k(j6, j10);
                    if (i14 >= 31) {
                        f12 = c0034o.b(edgeEffect4);
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 == 0.0f) {
                        edgeEffect4.onRelease();
                    }
                }
                r10 = R4.b.r(f10, f6);
                if (!C5251c.b(r10, C5251c.f43619b)) {
                    i();
                }
                long g10 = C5251c.g(j6, r10);
                long j11 = ((C5251c) a1Var.invoke(new C5251c(g10))).f43623a;
                long g11 = C5251c.g(g10, j11);
                boolean z16 = false;
                if (Ad.l.k0(i10, 1)) {
                    if (C5251c.d(g11) > 0.5f) {
                        k(g11, j10);
                    } else if (C5251c.d(g11) < -0.5f) {
                        l(g11, j10);
                    } else {
                        z13 = false;
                        if (C5251c.e(g11) <= 0.5f) {
                            m(g11, j10);
                        } else if (C5251c.e(g11) < -0.5f) {
                            j(g11, j10);
                        } else {
                            z14 = false;
                            if (!z13 || z14) {
                                z10 = true;
                                if (edgeEffect4.isFinished() && C5251c.d(j6) < 0.0f) {
                                    float d10 = C5251c.d(j6);
                                    if (edgeEffect4 instanceof C0021h0) {
                                        C0021h0 c0021h0 = (C0021h0) edgeEffect4;
                                        float f23 = c0021h0.f212b + d10;
                                        c0021h0.f212b = f23;
                                        if (Math.abs(f23) > c0021h0.f211a) {
                                            c0021h0.onRelease();
                                        }
                                    } else {
                                        edgeEffect4.onRelease();
                                    }
                                    z11 = edgeEffect4.isFinished();
                                } else {
                                    z11 = false;
                                }
                                if (!edgeEffect3.isFinished() && C5251c.d(j6) > 0.0f) {
                                    float d11 = C5251c.d(j6);
                                    if (!(edgeEffect3 instanceof C0021h0)) {
                                        C0021h0 c0021h02 = (C0021h0) edgeEffect3;
                                        float f24 = c0021h02.f212b + d11;
                                        c0021h02.f212b = f24;
                                        if (Math.abs(f24) > c0021h02.f211a) {
                                            c0021h02.onRelease();
                                        }
                                    } else {
                                        edgeEffect3.onRelease();
                                    }
                                    if (z11 && !edgeEffect3.isFinished()) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                }
                                if (!edgeEffect2.isFinished() && C5251c.e(j6) < 0.0f) {
                                    float e10 = C5251c.e(j6);
                                    if (!(edgeEffect2 instanceof C0021h0)) {
                                        C0021h0 c0021h03 = (C0021h0) edgeEffect2;
                                        float f25 = c0021h03.f212b + e10;
                                        c0021h03.f212b = f25;
                                        if (Math.abs(f25) > c0021h03.f211a) {
                                            c0021h03.onRelease();
                                        }
                                    } else {
                                        edgeEffect2.onRelease();
                                    }
                                    if (!z11 || edgeEffect2.isFinished()) {
                                        z16 = true;
                                    }
                                    z11 = z16;
                                }
                                if (edgeEffect.isFinished() && C5251c.e(j6) > 0.0f) {
                                    float e11 = C5251c.e(j6);
                                    if (edgeEffect instanceof C0021h0) {
                                        C0021h0 c0021h04 = (C0021h0) edgeEffect;
                                        float f26 = c0021h04.f212b + e11;
                                        c0021h04.f212b = f26;
                                        if (Math.abs(f26) > c0021h04.f211a) {
                                            c0021h04.onRelease();
                                        }
                                    } else {
                                        edgeEffect.onRelease();
                                    }
                                    if (!z11) {
                                    }
                                    i();
                                }
                                return C5251c.h(r10, j11);
                            }
                        }
                        z14 = true;
                        if (!z13) {
                        }
                        z10 = true;
                        if (edgeEffect4.isFinished()) {
                        }
                        z11 = false;
                        if (!edgeEffect3.isFinished()) {
                            float d112 = C5251c.d(j6);
                            if (!(edgeEffect3 instanceof C0021h0)) {
                            }
                            if (z11) {
                            }
                            z12 = true;
                            z11 = z12;
                        }
                        if (!edgeEffect2.isFinished()) {
                            float e102 = C5251c.e(j6);
                            if (!(edgeEffect2 instanceof C0021h0)) {
                            }
                            if (!z11) {
                            }
                            z16 = true;
                            z11 = z16;
                        }
                        if (edgeEffect.isFinished()) {
                        }
                    }
                    z13 = true;
                    if (C5251c.e(g11) <= 0.5f) {
                    }
                    z14 = true;
                    if (!z13) {
                    }
                    z10 = true;
                    if (edgeEffect4.isFinished()) {
                    }
                    z11 = false;
                    if (!edgeEffect3.isFinished()) {
                    }
                    if (!edgeEffect2.isFinished()) {
                    }
                    if (edgeEffect.isFinished()) {
                    }
                }
                z10 = false;
                if (edgeEffect4.isFinished()) {
                }
                z11 = false;
                if (!edgeEffect3.isFinished()) {
                }
                if (!edgeEffect2.isFinished()) {
                }
                if (edgeEffect.isFinished()) {
                }
            }
            f10 = 0.0f;
            r10 = R4.b.r(f10, f6);
            if (!C5251c.b(r10, C5251c.f43619b)) {
            }
            long g102 = C5251c.g(j6, r10);
            long j112 = ((C5251c) a1Var.invoke(new C5251c(g102))).f43623a;
            long g112 = C5251c.g(g102, j112);
            boolean z162 = false;
            if (Ad.l.k0(i10, 1)) {
            }
            z10 = false;
            if (edgeEffect4.isFinished()) {
            }
            z11 = false;
            if (!edgeEffect3.isFinished()) {
            }
            if (!edgeEffect2.isFinished()) {
            }
            if (edgeEffect.isFinished()) {
            }
        }
        f6 = 0.0f;
        if (C5251c.d(j6) != 0.0f) {
        }
        f10 = 0.0f;
        r10 = R4.b.r(f10, f6);
        if (!C5251c.b(r10, C5251c.f43619b)) {
        }
        long g1022 = C5251c.g(j6, r10);
        long j1122 = ((C5251c) a1Var.invoke(new C5251c(g1022))).f43623a;
        long g1122 = C5251c.g(g1022, j1122);
        boolean z1622 = false;
        if (Ad.l.k0(i10, 1)) {
        }
        z10 = false;
        if (edgeEffect4.isFinished()) {
        }
        z11 = false;
        if (!edgeEffect3.isFinished()) {
        }
        if (!edgeEffect2.isFinished()) {
        }
        if (edgeEffect.isFinished()) {
        }
    }

    @Override // A.L0
    public final AbstractC4326r b() {
        return this.f243r;
    }

    @Override // A.L0
    public final boolean c() {
        float f6;
        boolean z10;
        List list = this.f232g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i10);
            if (Build.VERSION.SDK_INT >= 31) {
                f6 = C0034o.f259a.b(edgeEffect);
            } else {
                f6 = 0.0f;
            }
            if (f6 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190  */
    @Override // A.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j6, C0183z1 c0183z1, AbstractC4825e abstractC4825e) {
        C0018g c0018g;
        int i10;
        C0026k c0026k;
        long j10;
        long d10;
        float f6;
        float f10;
        long l10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (abstractC4825e instanceof C0018g) {
            c0018g = (C0018g) abstractC4825e;
            int i11 = c0018g.f205j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0018g.f205j0 = i11 - Integer.MIN_VALUE;
                Object obj = c0018g.f203h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c0018g.f205j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j10 = c0018g.f202Z;
                            c0026k = c0018g.f201Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            d10 = Z0.p.d(j10, ((Z0.p) obj).f22815a);
                            c0026k.f240o = false;
                            if (Z0.p.b(d10) <= 0.0f) {
                                int Y02 = AbstractC4344b.Y0(Z0.p.b(d10));
                                int i12 = Build.VERSION.SDK_INT;
                                EdgeEffect edgeEffect = c0026k.f230e;
                                if (i12 >= 31) {
                                    edgeEffect.onAbsorb(Y02);
                                } else if (edgeEffect.isFinished()) {
                                    edgeEffect.onAbsorb(Y02);
                                }
                            } else if (Z0.p.b(d10) < 0.0f) {
                                int i13 = -AbstractC4344b.Y0(Z0.p.b(d10));
                                int i14 = Build.VERSION.SDK_INT;
                                EdgeEffect edgeEffect2 = c0026k.f231f;
                                if (i14 >= 31) {
                                    edgeEffect2.onAbsorb(i13);
                                } else if (edgeEffect2.isFinished()) {
                                    edgeEffect2.onAbsorb(i13);
                                }
                            }
                            if (Z0.p.c(d10) <= 0.0f) {
                                int Y03 = AbstractC4344b.Y0(Z0.p.c(d10));
                                int i15 = Build.VERSION.SDK_INT;
                                EdgeEffect edgeEffect3 = c0026k.f228c;
                                if (i15 >= 31) {
                                    edgeEffect3.onAbsorb(Y03);
                                } else if (edgeEffect3.isFinished()) {
                                    edgeEffect3.onAbsorb(Y03);
                                }
                            } else if (Z0.p.c(d10) < 0.0f) {
                                int i16 = -AbstractC4344b.Y0(Z0.p.c(d10));
                                int i17 = Build.VERSION.SDK_INT;
                                EdgeEffect edgeEffect4 = c0026k.f229d;
                                if (i17 >= 31) {
                                    edgeEffect4.onAbsorb(i16);
                                } else if (edgeEffect4.isFinished()) {
                                    edgeEffect4.onAbsorb(i16);
                                }
                            }
                            if (d10 != Z0.p.f22813b) {
                                c0026k.i();
                            }
                            c0026k.e();
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                if (C5254f.f(this.f241p)) {
                    Object pVar = new Z0.p(j6);
                    c0018g.f205j0 = 1;
                    if (c0183z1.invoke(pVar, c0018g) == obj2) {
                        return obj2;
                    }
                    return yVar;
                }
                int i18 = (Z0.p.b(j6) > 0.0f ? 1 : (Z0.p.b(j6) == 0.0f ? 0 : -1));
                C0034o c0034o = C0034o.f259a;
                if (i18 > 0) {
                    int i19 = Build.VERSION.SDK_INT;
                    EdgeEffect edgeEffect5 = this.f230e;
                    if (i19 >= 31) {
                        f14 = c0034o.b(edgeEffect5);
                    } else {
                        f14 = 0.0f;
                    }
                    if (f14 != 0.0f) {
                        int Y04 = AbstractC4344b.Y0(Z0.p.b(j6));
                        if (i19 >= 31) {
                            edgeEffect5.onAbsorb(Y04);
                        } else if (edgeEffect5.isFinished()) {
                            edgeEffect5.onAbsorb(Y04);
                        }
                        f6 = Z0.p.b(j6);
                        if (Z0.p.c(j6) > 0.0f) {
                            int i20 = Build.VERSION.SDK_INT;
                            EdgeEffect edgeEffect6 = this.f228c;
                            if (i20 >= 31) {
                                f12 = c0034o.b(edgeEffect6);
                            } else {
                                f12 = 0.0f;
                            }
                            if (f12 != 0.0f) {
                                int Y05 = AbstractC4344b.Y0(Z0.p.c(j6));
                                if (i20 >= 31) {
                                    edgeEffect6.onAbsorb(Y05);
                                } else if (edgeEffect6.isFinished()) {
                                    edgeEffect6.onAbsorb(Y05);
                                }
                                f10 = Z0.p.c(j6);
                                l10 = AbstractC4828h.l(f6, f10);
                                if (l10 != Z0.p.f22813b) {
                                    i();
                                }
                                j10 = Z0.p.d(j6, l10);
                                Object pVar2 = new Z0.p(j10);
                                c0018g.f201Y = this;
                                c0018g.f202Z = j10;
                                c0018g.f205j0 = 2;
                                obj = c0183z1.invoke(pVar2, c0018g);
                                if (obj == obj2) {
                                    return obj2;
                                }
                                c0026k = this;
                                d10 = Z0.p.d(j10, ((Z0.p) obj).f22815a);
                                c0026k.f240o = false;
                                if (Z0.p.b(d10) <= 0.0f) {
                                }
                                if (Z0.p.c(d10) <= 0.0f) {
                                }
                                if (d10 != Z0.p.f22813b) {
                                }
                                c0026k.e();
                                return yVar;
                            }
                        }
                        if (Z0.p.c(j6) < 0.0f) {
                            int i21 = Build.VERSION.SDK_INT;
                            EdgeEffect edgeEffect7 = this.f229d;
                            if (i21 >= 31) {
                                f11 = c0034o.b(edgeEffect7);
                            } else {
                                f11 = 0.0f;
                            }
                            if (f11 != 0.0f) {
                                int i22 = -AbstractC4344b.Y0(Z0.p.c(j6));
                                if (i21 >= 31) {
                                    edgeEffect7.onAbsorb(i22);
                                } else if (edgeEffect7.isFinished()) {
                                    edgeEffect7.onAbsorb(i22);
                                }
                                f10 = Z0.p.c(j6);
                                l10 = AbstractC4828h.l(f6, f10);
                                if (l10 != Z0.p.f22813b) {
                                }
                                j10 = Z0.p.d(j6, l10);
                                Object pVar22 = new Z0.p(j10);
                                c0018g.f201Y = this;
                                c0018g.f202Z = j10;
                                c0018g.f205j0 = 2;
                                obj = c0183z1.invoke(pVar22, c0018g);
                                if (obj == obj2) {
                                }
                            }
                        }
                        f10 = 0.0f;
                        l10 = AbstractC4828h.l(f6, f10);
                        if (l10 != Z0.p.f22813b) {
                        }
                        j10 = Z0.p.d(j6, l10);
                        Object pVar222 = new Z0.p(j10);
                        c0018g.f201Y = this;
                        c0018g.f202Z = j10;
                        c0018g.f205j0 = 2;
                        obj = c0183z1.invoke(pVar222, c0018g);
                        if (obj == obj2) {
                        }
                    }
                }
                if (Z0.p.b(j6) < 0.0f) {
                    int i23 = Build.VERSION.SDK_INT;
                    EdgeEffect edgeEffect8 = this.f231f;
                    if (i23 >= 31) {
                        f13 = c0034o.b(edgeEffect8);
                    } else {
                        f13 = 0.0f;
                    }
                    if (f13 != 0.0f) {
                        int i24 = -AbstractC4344b.Y0(Z0.p.b(j6));
                        if (i23 >= 31) {
                            edgeEffect8.onAbsorb(i24);
                        } else if (edgeEffect8.isFinished()) {
                            edgeEffect8.onAbsorb(i24);
                        }
                        f6 = Z0.p.b(j6);
                        if (Z0.p.c(j6) > 0.0f) {
                        }
                        if (Z0.p.c(j6) < 0.0f) {
                        }
                        f10 = 0.0f;
                        l10 = AbstractC4828h.l(f6, f10);
                        if (l10 != Z0.p.f22813b) {
                        }
                        j10 = Z0.p.d(j6, l10);
                        Object pVar2222 = new Z0.p(j10);
                        c0018g.f201Y = this;
                        c0018g.f202Z = j10;
                        c0018g.f205j0 = 2;
                        obj = c0183z1.invoke(pVar2222, c0018g);
                        if (obj == obj2) {
                        }
                    }
                }
                f6 = 0.0f;
                if (Z0.p.c(j6) > 0.0f) {
                }
                if (Z0.p.c(j6) < 0.0f) {
                }
                f10 = 0.0f;
                l10 = AbstractC4828h.l(f6, f10);
                if (l10 != Z0.p.f22813b) {
                }
                j10 = Z0.p.d(j6, l10);
                Object pVar22222 = new Z0.p(j10);
                c0018g.f201Y = this;
                c0018g.f202Z = j10;
                c0018g.f205j0 = 2;
                obj = c0183z1.invoke(pVar22222, c0018g);
                if (obj == obj2) {
                }
            }
        }
        c0018g = new C0018g(this, abstractC4825e);
        Object obj3 = c0018g.f203h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c0018g.f205j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
    }

    public final void e() {
        List list = this.f232g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i10);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            i();
        }
    }

    public final boolean f(AbstractC5650i abstractC5650i, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C5254f.d(this.f241p), (-C5254f.b(this.f241p)) + abstractC5650i.R(this.f226a.f81b.a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean g(AbstractC5650i abstractC5650i, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C5254f.b(this.f241p), abstractC5650i.R(this.f226a.f81b.b(abstractC5650i.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean h(AbstractC5650i abstractC5650i, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int Y02 = AbstractC4344b.Y0(C5254f.d(this.f241p));
        float c10 = this.f226a.f81b.c(abstractC5650i.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, abstractC5650i.R(c10) + (-Y02));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void i() {
        if (this.f239n) {
            int i10 = this.f237l;
            C1720k0 c1720k0 = this.f238m;
            if (i10 == c1720k0.h()) {
                c1720k0.i(c1720k0.h() + 1);
            }
        }
    }

    public final float j(long j6, long j10) {
        float f6;
        float d10 = C5251c.d(j10) / C5254f.d(this.f241p);
        float f10 = -(C5251c.e(j6) / C5254f.b(this.f241p));
        float f11 = 1 - d10;
        int i10 = Build.VERSION.SDK_INT;
        C0034o c0034o = C0034o.f259a;
        EdgeEffect edgeEffect = this.f229d;
        if (i10 >= 31) {
            f10 = c0034o.c(edgeEffect, f10, f11);
        } else {
            edgeEffect.onPull(f10, f11);
        }
        float b10 = C5254f.b(this.f241p) * (-f10);
        if (Build.VERSION.SDK_INT >= 31) {
            f6 = c0034o.b(edgeEffect);
        } else {
            f6 = 0.0f;
        }
        if (f6 != 0.0f) {
            return C5251c.e(j6);
        }
        return b10;
    }

    public final float k(long j6, long j10) {
        float f6;
        float e10 = C5251c.e(j10) / C5254f.b(this.f241p);
        float d10 = C5251c.d(j6) / C5254f.d(this.f241p);
        float f10 = 1 - e10;
        int i10 = Build.VERSION.SDK_INT;
        C0034o c0034o = C0034o.f259a;
        EdgeEffect edgeEffect = this.f230e;
        if (i10 >= 31) {
            d10 = c0034o.c(edgeEffect, d10, f10);
        } else {
            edgeEffect.onPull(d10, f10);
        }
        float d11 = C5254f.d(this.f241p) * d10;
        if (Build.VERSION.SDK_INT >= 31) {
            f6 = c0034o.b(edgeEffect);
        } else {
            f6 = 0.0f;
        }
        if (f6 != 0.0f) {
            return C5251c.d(j6);
        }
        return d11;
    }

    public final float l(long j6, long j10) {
        float f6;
        float e10 = C5251c.e(j10) / C5254f.b(this.f241p);
        float f10 = -(C5251c.d(j6) / C5254f.d(this.f241p));
        int i10 = Build.VERSION.SDK_INT;
        C0034o c0034o = C0034o.f259a;
        EdgeEffect edgeEffect = this.f231f;
        if (i10 >= 31) {
            f10 = c0034o.c(edgeEffect, f10, e10);
        } else {
            edgeEffect.onPull(f10, e10);
        }
        float d10 = C5254f.d(this.f241p) * (-f10);
        if (Build.VERSION.SDK_INT >= 31) {
            f6 = c0034o.b(edgeEffect);
        } else {
            f6 = 0.0f;
        }
        if (f6 != 0.0f) {
            return C5251c.d(j6);
        }
        return d10;
    }

    public final float m(long j6, long j10) {
        float f6;
        float d10 = C5251c.d(j10) / C5254f.d(this.f241p);
        float e10 = C5251c.e(j6) / C5254f.b(this.f241p);
        int i10 = Build.VERSION.SDK_INT;
        C0034o c0034o = C0034o.f259a;
        EdgeEffect edgeEffect = this.f228c;
        if (i10 >= 31) {
            e10 = c0034o.c(edgeEffect, e10, d10);
        } else {
            edgeEffect.onPull(e10, d10);
        }
        float b10 = C5254f.b(this.f241p) * e10;
        if (Build.VERSION.SDK_INT >= 31) {
            f6 = c0034o.b(edgeEffect);
        } else {
            f6 = 0.0f;
        }
        if (f6 != 0.0f) {
            return C5251c.e(j6);
        }
        return b10;
    }
}
