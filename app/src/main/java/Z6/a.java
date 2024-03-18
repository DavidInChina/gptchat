package Z6;

import Z.C1724m0;
import Z.G0;
import Z.o1;
import Z0.l;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.C3963m;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import r0.C5347k;
import t0.AbstractC5650i;
import u0.AbstractC5824b;

/* loaded from: classes2.dex */
public final class a extends AbstractC5824b implements G0 {

    /* renamed from: k0  reason: collision with root package name */
    public final Drawable f23224k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1724m0 f23225l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1724m0 f23226m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C3963m f23227n0;

    public a(Drawable drawable) {
        long j6;
        AbstractC3557B.c0("drawable", drawable);
        this.f23224k0 = drawable;
        o1 o1Var = o1.f22665a;
        this.f23225l0 = AbstractC4828h.Z(0, o1Var);
        AbstractC3957g abstractC3957g = c.f23229a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j6 = AbstractC4828h.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j6 = C5254f.f43638c;
        }
        this.f23226m0 = AbstractC4828h.Z(new C5254f(j6), o1Var);
        this.f23227n0 = R4.b.D1(new X0.b(29, this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // Z.G0
    public final void a() {
        c();
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f23224k0.setAlpha(N.p(AbstractC4344b.Y0(f6 * 255), 0, 255));
        return true;
    }

    @Override // Z.G0
    public final void c() {
        Drawable drawable = this.f23224k0;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // Z.G0
    public final void d() {
        Drawable drawable = this.f23224k0;
        drawable.setCallback((Drawable.Callback) this.f23227n0.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        ColorFilter colorFilter;
        if (c5347k != null) {
            colorFilter = c5347k.f44247a;
        } else {
            colorFilter = null;
        }
        this.f23224k0.setColorFilter(colorFilter);
        return true;
    }

    @Override // u0.AbstractC5824b
    public final void f(l lVar) {
        int i10;
        AbstractC3557B.c0("layoutDirection", lVar);
        int ordinal = lVar.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i10 = 0;
        }
        this.f23224k0.setLayoutDirection(i10);
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        return ((C5254f) this.f23226m0.getValue()).f43640a;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        AbstractC3557B.c0("<this>", abstractC5650i);
        AbstractC5352p a5 = abstractC5650i.V().a();
        ((Number) this.f23225l0.getValue()).intValue();
        int Y02 = AbstractC4344b.Y0(C5254f.d(abstractC5650i.g()));
        int Y03 = AbstractC4344b.Y0(C5254f.b(abstractC5650i.g()));
        Drawable drawable = this.f23224k0;
        drawable.setBounds(0, 0, Y02, Y03);
        try {
            a5.h();
            drawable.draw(AbstractC5340d.a(a5));
        } finally {
            a5.q();
        }
    }
}
