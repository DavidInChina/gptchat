package g4;

import Df.H;
import E0.AbstractC0454m;
import E0.C0453l;
import Ng.E0;
import Ng.Q;
import Qg.F0;
import Qg.s0;
import Sg.C1394f;
import Z.C1718j0;
import Z.C1724m0;
import Z.G0;
import Z.o1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5341e;
import r0.C5347k;
import t0.AbstractC5650i;
import t0.C5649h;
import t4.C5674b;
import u0.AbstractC5824b;
import u0.C5823a;

/* renamed from: g4.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3188p extends AbstractC5824b implements G0 {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f31236z0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public C1394f f31237k0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1724m0 f31239m0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1724m0 f31241o0;

    /* renamed from: p0  reason: collision with root package name */
    public AbstractC3181i f31242p0;

    /* renamed from: q0  reason: collision with root package name */
    public AbstractC5824b f31243q0;

    /* renamed from: s0  reason: collision with root package name */
    public wf.k f31245s0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f31248v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1724m0 f31249w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1724m0 f31250x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C1724m0 f31251y0;

    /* renamed from: l0  reason: collision with root package name */
    public final F0 f31238l0 = s0.c(new C5254f(C5254f.f43637b));

    /* renamed from: n0  reason: collision with root package name */
    public final C1718j0 f31240n0 = H.h0(1.0f);

    /* renamed from: r0  reason: collision with root package name */
    public wf.k f31244r0 = C3174b.f31206h0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC0454m f31246t0 = C0453l.f4074b;

    /* renamed from: u0  reason: collision with root package name */
    public int f31247u0 = C5649h.f45620c;

    public C3188p(q4.j jVar, f4.i iVar) {
        o1 o1Var = o1.f22665a;
        this.f31239m0 = AbstractC4828h.Z(null, o1Var);
        this.f31241o0 = AbstractC4828h.Z(null, o1Var);
        C3177e c3177e = C3177e.f31218a;
        this.f31242p0 = c3177e;
        AbstractC5650i.f45621D.getClass();
        this.f31249w0 = AbstractC4828h.Z(c3177e, o1Var);
        this.f31250x0 = AbstractC4828h.Z(jVar, o1Var);
        this.f31251y0 = AbstractC4828h.Z(iVar, o1Var);
    }

    @Override // Z.G0
    public final void a() {
        C1394f c1394f = this.f31237k0;
        G0 g02 = null;
        if (c1394f != null) {
            Ad.l.P(c1394f, null);
        }
        this.f31237k0 = null;
        AbstractC5824b abstractC5824b = this.f31243q0;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        }
        if (g02 != null) {
            g02.a();
        }
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f31240n0.i(f6);
        return true;
    }

    @Override // Z.G0
    public final void c() {
        C1394f c1394f = this.f31237k0;
        G0 g02 = null;
        if (c1394f != null) {
            Ad.l.P(c1394f, null);
        }
        this.f31237k0 = null;
        AbstractC5824b abstractC5824b = this.f31243q0;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        }
        if (g02 != null) {
            g02.c();
        }
    }

    @Override // Z.G0
    public final void d() {
        G0 g02;
        if (this.f31237k0 != null) {
            return;
        }
        E0 z10 = Bi.c.z();
        Tg.e eVar = Q.f12904a;
        C1394f g10 = Ad.l.g(AbstractC4344b.Q0(z10, ((Og.d) Sg.u.f16684a).f13759j0));
        this.f31237k0 = g10;
        AbstractC5824b abstractC5824b = this.f31243q0;
        AbstractC5824b abstractC5824b2 = null;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            g02.d();
        }
        if (this.f31248v0) {
            q4.h a5 = q4.j.a((q4.j) this.f31250x0.getValue());
            a5.f43804b = ((f4.q) ((f4.i) this.f31251y0.getValue())).f29633b;
            a5.f43802O = null;
            q4.j a10 = a5.a();
            Drawable b10 = u4.d.b(a10, a10.f43835G, a10.f43834F, a10.f43841M.f43762j);
            if (b10 != null) {
                abstractC5824b2 = j(b10);
            }
            k(new C3179g(abstractC5824b2));
            return;
        }
        Ad.l.O0(g10, null, null, new C3184l(this, null), 3);
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        this.f31241o0.setValue(c5347k);
        return true;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        AbstractC5824b abstractC5824b = (AbstractC5824b) this.f31239m0.getValue();
        if (abstractC5824b != null) {
            return abstractC5824b.h();
        }
        return C5254f.f43638c;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        this.f31238l0.setValue(new C5254f(abstractC5650i.g()));
        AbstractC5824b abstractC5824b = (AbstractC5824b) this.f31239m0.getValue();
        if (abstractC5824b != null) {
            abstractC5824b.g(abstractC5650i, abstractC5650i.g(), this.f31240n0.h(), (C5347k) this.f31241o0.getValue());
        }
    }

    public final AbstractC5824b j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C5341e c5341e = new C5341e(bitmap);
            int i10 = this.f31247u0;
            C5823a c5823a = new C5823a(c5341e, Z0.i.f22797b, Ng.H.c(bitmap.getWidth(), bitmap.getHeight()));
            c5823a.f46332n0 = i10;
            return c5823a;
        }
        return new Z6.a(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(AbstractC3181i abstractC3181i) {
        AbstractC5824b abstractC5824b;
        wf.k kVar;
        AbstractC5824b a5;
        G0 g02;
        AbstractC5824b a10;
        q4.k kVar2;
        AbstractC5824b abstractC5824b2;
        boolean z10;
        AbstractC3181i abstractC3181i2 = this.f31242p0;
        AbstractC3181i abstractC3181i3 = (AbstractC3181i) this.f31244r0.invoke(abstractC3181i);
        this.f31242p0 = abstractC3181i3;
        this.f31249w0.setValue(abstractC3181i3);
        G0 g03 = null;
        if (abstractC3181i3 instanceof C3180h) {
            kVar2 = ((C3180h) abstractC3181i3).f31223b;
        } else {
            if (abstractC3181i3 instanceof C3178f) {
                kVar2 = ((C3178f) abstractC3181i3).f31220b;
            }
            abstractC5824b = null;
            if (abstractC5824b == null) {
                abstractC5824b = abstractC3181i3.a();
            }
            this.f31243q0 = abstractC5824b;
            this.f31239m0.setValue(abstractC5824b);
            if (this.f31237k0 != null && abstractC3181i2.a() != abstractC3181i3.a()) {
                a5 = abstractC3181i2.a();
                if (!(a5 instanceof G0)) {
                    g02 = (G0) a5;
                } else {
                    g02 = null;
                }
                if (g02 != null) {
                    g02.c();
                }
                a10 = abstractC3181i3.a();
                if (a10 instanceof G0) {
                    g03 = (G0) a10;
                }
                if (g03 != null) {
                    g03.d();
                }
            }
            kVar = this.f31245s0;
            if (kVar != null) {
                kVar.invoke(abstractC3181i3);
                return;
            }
            return;
        }
        t4.f a11 = kVar2.b().f43854m.a(AbstractC3190r.f31252a, kVar2);
        if (a11 instanceof C5674b) {
            AbstractC5824b a12 = abstractC3181i2.a();
            if (abstractC3181i2 instanceof C3179g) {
                abstractC5824b2 = a12;
            } else {
                abstractC5824b2 = null;
            }
            AbstractC5824b a13 = abstractC3181i3.a();
            AbstractC0454m abstractC0454m = this.f31246t0;
            C5674b c5674b = (C5674b) a11;
            if ((kVar2 instanceof q4.q) && ((q4.q) kVar2).f43892g) {
                z10 = false;
            } else {
                z10 = true;
            }
            abstractC5824b = new C3195w(abstractC5824b2, a13, abstractC0454m, c5674b.f45744c, z10, c5674b.f45745d);
            if (abstractC5824b == null) {
            }
            this.f31243q0 = abstractC5824b;
            this.f31239m0.setValue(abstractC5824b);
            if (this.f31237k0 != null) {
                a5 = abstractC3181i2.a();
                if (!(a5 instanceof G0)) {
                }
                if (g02 != null) {
                }
                a10 = abstractC3181i3.a();
                if (a10 instanceof G0) {
                }
                if (g03 != null) {
                }
            }
            kVar = this.f31245s0;
            if (kVar != null) {
            }
        }
        abstractC5824b = null;
        if (abstractC5824b == null) {
        }
        this.f31243q0 = abstractC5824b;
        this.f31239m0.setValue(abstractC5824b);
        if (this.f31237k0 != null) {
        }
        kVar = this.f31245s0;
        if (kVar != null) {
        }
    }
}
