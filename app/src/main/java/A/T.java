package A;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import o0.AbstractC4871f;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import t0.AbstractC5646e;

/* loaded from: classes2.dex */
public final class T extends H0.Q implements AbstractC4871f {

    /* renamed from: e  reason: collision with root package name */
    public final C0026k f110e;

    public T(C0026k c0026k) {
        this.f110e = c0026k;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        return AbstractC3557B.K(this.f110e, ((T) obj).f110e);
    }

    @Override // o0.AbstractC4871f
    public final void f(AbstractC5646e abstractC5646e) {
        boolean z10;
        G0.J j6 = (G0.J) abstractC5646e;
        j6.a();
        C0026k c0026k = this.f110e;
        if (!C5254f.f(c0026k.f241p)) {
            AbstractC5352p a5 = j6.f5596Y.f45612Z.a();
            c0026k.f237l = c0026k.f238m.h();
            Canvas a10 = AbstractC5340d.a(a5);
            EdgeEffect edgeEffect = c0026k.f235j;
            if (A7.b.N0(edgeEffect) != 0.0f) {
                c0026k.h(j6, edgeEffect, a10);
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = c0026k.f230e;
            boolean z11 = false;
            if (!edgeEffect2.isFinished()) {
                z10 = c0026k.g(j6, edgeEffect2, a10);
                A7.b.q1(edgeEffect, A7.b.N0(edgeEffect2));
            } else {
                z10 = false;
            }
            EdgeEffect edgeEffect3 = c0026k.f233h;
            if (A7.b.N0(edgeEffect3) != 0.0f) {
                c0026k.f(j6, edgeEffect3, a10);
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c0026k.f228c;
            boolean isFinished = edgeEffect4.isFinished();
            J0 j02 = c0026k.f226a;
            if (!isFinished) {
                int save = a10.save();
                a10.translate(0.0f, j6.R(j02.f81b.d()));
                boolean draw = edgeEffect4.draw(a10);
                a10.restoreToCount(save);
                if (!draw && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                A7.b.q1(edgeEffect3, A7.b.N0(edgeEffect4));
            }
            EdgeEffect edgeEffect5 = c0026k.f236k;
            if (A7.b.N0(edgeEffect5) != 0.0f) {
                c0026k.g(j6, edgeEffect5, a10);
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c0026k.f231f;
            if (!edgeEffect6.isFinished()) {
                if (!c0026k.h(j6, edgeEffect6, a10) && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                A7.b.q1(edgeEffect5, A7.b.N0(edgeEffect6));
            }
            EdgeEffect edgeEffect7 = c0026k.f234i;
            if (A7.b.N0(edgeEffect7) != 0.0f) {
                int save2 = a10.save();
                a10.translate(0.0f, j6.R(j02.f81b.d()));
                edgeEffect7.draw(a10);
                a10.restoreToCount(save2);
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c0026k.f229d;
            if (!edgeEffect8.isFinished()) {
                if (c0026k.f(j6, edgeEffect8, a10) || z10) {
                    z11 = true;
                }
                A7.b.q1(edgeEffect7, A7.b.N0(edgeEffect8));
                z10 = z11;
            }
            if (z10) {
                c0026k.i();
            }
        }
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public final int hashCode() {
        return this.f110e.hashCode();
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f110e + ')';
    }
}
