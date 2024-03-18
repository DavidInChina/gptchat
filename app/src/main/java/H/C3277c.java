package h;

import G.C;
import H0.C0709v0;
import K4.J;
import N.f0;
import N.t0;
import W.R1;
import Z.AbstractC1710f0;
import Z.M;
import d1.C2584s;
import d1.DialogC2582q;
import g.AbstractC3110c;
import java.util.Iterator;
import jf.y;
import kf.v;
import lh.AbstractC4471A;
import q1.AbstractC5260f;

/* renamed from: h.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3277c implements M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31649b;

    public /* synthetic */ C3277c(int i10, Object obj) {
        this.f31648a = i10;
        this.f31649b = obj;
    }

    @Override // Z.M
    public final void dispose() {
        int i10 = this.f31648a;
        y yVar = null;
        Object obj = this.f31649b;
        switch (i10) {
            case 0:
                J j6 = ((C3275a) obj).f31645a;
                if (j6 != null) {
                    j6.i0();
                    yVar = y.f36177a;
                }
                if (yVar != null) {
                    return;
                }
                throw new IllegalStateException("Launcher has not been initialized".toString());
            case 1:
                Iterator it = ((C3283i) obj).f30996b.iterator();
                while (it.hasNext()) {
                    ((AbstractC3110c) it.next()).cancel();
                }
                return;
            case 2:
                ((C) obj).f5414d = null;
                return;
            case 3:
                G.M m10 = (G.M) obj;
                int h10 = m10.f5443d.h();
                for (int i11 = 0; i11 < h10; i11++) {
                    m10.b();
                }
                return;
            case 4:
                ((t0) obj).k();
                return;
            case 5:
                f0 f0Var = (f0) obj;
                f0Var.h();
                f0Var.f12323i.setValue(Boolean.FALSE);
                return;
            case 6:
                R1 r12 = (R1) obj;
                r12.c();
                J.Z(r12, null);
                AbstractC5260f.N(r12, null);
                r12.f19597r0.getViewTreeObserver().removeOnGlobalLayoutListener(r12);
                r12.f19599t0.removeViewImmediate(r12);
                return;
            case 7:
                ((C0709v0) obj).f7054a.mo122invoke();
                return;
            case 8:
                DialogC2582q dialogC2582q = (DialogC2582q) obj;
                dialogC2582q.dismiss();
                dialogC2582q.f27892l0.c();
                return;
            case 9:
                C2584s c2584s = (C2584s) obj;
                c2584s.c();
                J.Z(c2584s, null);
                c2584s.f27911u0.removeViewImmediate(c2584s);
                return;
            case 10:
                ((a7.d) obj).f23910f = null;
                return;
            case 11:
                AbstractC4471A abstractC4471A = (AbstractC4471A) ((AbstractC1710f0) obj).getValue();
                if (abstractC4471A != null) {
                    abstractC4471A.b();
                    return;
                }
                return;
            case 12:
                kh.e eVar = (kh.e) obj;
                v vVar = v.f37483Y;
                eVar.getClass();
                eVar.f37554d.setValue(vVar);
                return;
            default:
                ((kh.l) obj).close();
                return;
        }
    }
}
