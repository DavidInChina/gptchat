package F;

import A.B0;
import E0.g0;
import G.AbstractC0556k;
import G.C0549d;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: F.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531e implements AbstractC0556k {

    /* renamed from: a  reason: collision with root package name */
    public final J f4921a;

    public C0531e(J j6) {
        this.f4921a = j6;
    }

    @Override // G.AbstractC0556k
    public final int a() {
        return ((z) this.f4921a.h()).f5015j;
    }

    @Override // G.AbstractC0556k
    public final int b() {
        n nVar = (n) kf.t.p2(((z) this.f4921a.h()).f5012g);
        if (nVar != null) {
            return ((A) nVar).f4826a;
        }
        return 0;
    }

    @Override // G.AbstractC0556k
    public final int c(int i10) {
        Object obj;
        List list = ((z) this.f4921a.h()).f5012g;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                obj = list.get(i11);
                if (((A) ((n) obj)).f4826a == i10) {
                    break;
                }
                i11++;
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar == null) {
            return 0;
        }
        return ((A) nVar).f4840o;
    }

    @Override // G.AbstractC0556k
    public final float d(int i10, int i11) {
        J j6 = this.f4921a;
        z zVar = (z) j6.h();
        List list = zVar.f5012g;
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += ((A) ((n) list.get(i13))).f4841p;
        }
        int size2 = (i12 / list.size()) + zVar.f5018m;
        int g10 = i10 - j6.g();
        int min = Math.min(Math.abs(i11), size2);
        if (i11 < 0) {
            min *= -1;
        }
        return ((size2 * g10) + min) - j6.f4873c.f4850b.h();
    }

    @Override // G.AbstractC0556k
    public final void e(int i10, int i11) {
        J j6 = this.f4921a;
        C c10 = j6.f4873c;
        c10.a(i10, i11);
        c10.f4852d = null;
        C0538l c0538l = j6.f4887q;
        c0538l.f4933a.clear();
        c0538l.f4934b = C0549d.f5492b;
        c0538l.f4935c = -1;
        g0 g0Var = j6.f4884n;
        if (g0Var != null) {
            ((androidx.compose.ui.node.a) g0Var).k();
        }
    }

    @Override // G.AbstractC0556k
    public final int f() {
        return this.f4921a.f4873c.f4850b.h();
    }

    @Override // G.AbstractC0556k
    public final int g() {
        return this.f4921a.g();
    }

    public final Object h(wf.n nVar, AbstractC4825e abstractC4825e) {
        Object c10 = this.f4921a.c(B0.f14Y, nVar, abstractC4825e);
        if (c10 == EnumC5000a.f41328Y) {
            return c10;
        }
        return jf.y.f36177a;
    }
}
