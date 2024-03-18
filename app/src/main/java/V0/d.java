package V0;

import android.text.TextPaint;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5342f;
import r0.J;
import r0.K;
import r0.N;
import r0.r;
import t0.AbstractC5651j;
import t0.C5653l;
import t0.C5654m;

/* loaded from: classes2.dex */
public final class d extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    public final C5342f f18002a = new C5342f(this);

    /* renamed from: b  reason: collision with root package name */
    public Y0.j f18003b = Y0.j.f22031b;

    /* renamed from: c  reason: collision with root package name */
    public K f18004c = K.f44202d;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC5651j f18005d;

    public d(float f6) {
        super(1);
        ((TextPaint) this).density = f6;
    }

    public final void a(AbstractC5350n abstractC5350n, long j6, float f6) {
        float f10;
        boolean z10 = abstractC5350n instanceof N;
        C5342f c5342f = this.f18002a;
        if ((z10 && ((N) abstractC5350n).f44223a != r.f44263k) || ((abstractC5350n instanceof J) && j6 != C5254f.f43638c)) {
            if (Float.isNaN(f6)) {
                f10 = c5342f.f44235a.getAlpha() / 255.0f;
            } else {
                f10 = com.google.android.gms.internal.play_billing.N.o(f6, 0.0f, 1.0f);
            }
            abstractC5350n.a(f10, j6, c5342f);
        } else if (abstractC5350n == null) {
            c5342f.i(null);
        }
    }

    public final void b(AbstractC5651j abstractC5651j) {
        if (abstractC5651j != null && !AbstractC3557B.K(this.f18005d, abstractC5651j)) {
            this.f18005d = abstractC5651j;
            boolean K10 = AbstractC3557B.K(abstractC5651j, C5653l.f45622a);
            C5342f c5342f = this.f18002a;
            if (K10) {
                c5342f.m(0);
            } else if (abstractC5651j instanceof C5654m) {
                c5342f.m(1);
                C5654m c5654m = (C5654m) abstractC5651j;
                c5342f.l(c5654m.f45623a);
                c5342f.f44235a.setStrokeMiter(c5654m.f45624b);
                c5342f.k(c5654m.f45626d);
                c5342f.j(c5654m.f45625c);
                c5342f.f44235a.setPathEffect(null);
            }
        }
    }

    public final void c(K k10) {
        if (k10 != null && !AbstractC3557B.K(this.f18004c, k10)) {
            this.f18004c = k10;
            if (AbstractC3557B.K(k10, K.f44202d)) {
                clearShadowLayer();
                return;
            }
            K k11 = this.f18004c;
            float f6 = k11.f44205c;
            if (f6 == 0.0f) {
                f6 = Float.MIN_VALUE;
            }
            setShadowLayer(f6, C5251c.d(k11.f44204b), C5251c.e(this.f18004c.f44204b), androidx.compose.ui.graphics.a.s(this.f18004c.f44203a));
        }
    }

    public final void d(Y0.j jVar) {
        boolean z10;
        if (jVar != null && !AbstractC3557B.K(this.f18003b, jVar)) {
            this.f18003b = jVar;
            int i10 = jVar.f22034a;
            boolean z11 = false;
            if ((i10 | 1) == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            setUnderlineText(z10);
            Y0.j jVar2 = this.f18003b;
            jVar2.getClass();
            int i11 = jVar2.f22034a;
            if ((i11 | 2) == i11) {
                z11 = true;
            }
            setStrikeThruText(z11);
        }
    }
}
