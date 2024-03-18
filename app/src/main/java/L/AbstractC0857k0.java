package L;

import B0.C0184a;
import D1.C0373t;
import E0.AbstractC0461u;
import N0.C1046e;
import android.graphics.Rect;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;

/* renamed from: L.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0857k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0855j0 f10216a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0184a f10217b = new C0184a(1008);

    /* renamed from: c  reason: collision with root package name */
    public static final C0373t f10218c = new C0373t(0, 0);

    public static final T0.G a(T0.I i10, C1046e c1046e) {
        ((A9.a) i10).getClass();
        return new T0.G(c1046e, new C0373t(c1046e.f12512Y.length(), c1046e.f12512Y.length()));
    }

    public static void b(T0.z zVar, w0 w0Var, N0.C c10, AbstractC0461u abstractC0461u, T0.F f6, boolean z10, T0.s sVar) {
        C5252d c5252d;
        Rect rect;
        if (!z10) {
            return;
        }
        int b10 = sVar.b(N0.D.d(zVar.f16831b));
        if (b10 < c10.f12477a.f12467a.f12512Y.length()) {
            c5252d = c10.b(b10);
        } else if (b10 != 0) {
            c5252d = c10.b(b10 - 1);
        } else {
            c5252d = new C5252d(0.0f, 0.0f, 1.0f, (int) (B0.b(w0Var.f10340b, w0Var.f10345g, w0Var.f10346h) & 4294967295L));
        }
        long M10 = abstractC0461u.M(R4.b.r(c5252d.f43625a, c5252d.f43626b));
        C5252d K10 = A7.b.K(R4.b.r(C5251c.d(M10), C5251c.e(M10)), AbstractC4828h.i(c5252d.f(), c5252d.c()));
        if (AbstractC3557B.K((T0.F) f6.f16754a.f16731b.get(), f6)) {
            T0.D d10 = (T0.D) f6.f16755b;
            d10.getClass();
            d10.f16748k = new Rect(AbstractC4344b.Y0(K10.f43625a), AbstractC4344b.Y0(K10.f43626b), AbstractC4344b.Y0(K10.f43627c), AbstractC4344b.Y0(K10.f43628d));
            if (d10.f16746i.isEmpty() && (rect = d10.f16748k) != null) {
                d10.f16738a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }
}
