package q9;

import Df.H;
import L0.u;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import Z.r;
import id.AbstractC3557B;
import java.util.List;
import kf.t;
import nf.AbstractC4828h;
import wf.o;

/* renamed from: q9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5288e {

    /* renamed from: a  reason: collision with root package name */
    public static final long f43998a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f43999b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f44000c = 0;

    static {
        Mg.a aVar = Mg.b.f12127Z;
        Mg.d dVar = Mg.d.f12133h0;
        f43998a = H.x0(500, dVar);
        f43999b = H.x0(1500, dVar);
    }

    public static final void a(List list, boolean z10, long j6, long j10, o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        boolean z11;
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z12;
        AbstractC3557B.c0("animationStates", list);
        AbstractC3557B.c0("animatedContent", oVar);
        u uVar = io.sentry.compose.b.f34309a;
        r rVar = (r) abstractC1725n;
        rVar.X(61559512);
        if ((i11 & 2) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 4) != 0) {
            j11 = f43998a;
        } else {
            j11 = j6;
        }
        if ((i11 & 8) != 0) {
            j12 = f43999b;
        } else {
            j12 = j10;
        }
        rVar.W(-343327108);
        boolean g10 = rVar.g(list);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = AbstractC4828h.Z(t.f2(list), o1.f22665a);
            rVar.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar.t(false);
        rVar.W(-343327034);
        if (list.size() > 1) {
            j13 = j12;
            j14 = j11;
            z12 = false;
            AbstractC1734s.e(list, new C5286c(z11, list, j11, j12, abstractC1710f0, null), rVar);
        } else {
            j14 = j11;
            j13 = j12;
            z12 = false;
        }
        rVar.t(z12);
        oVar.invoke(abstractC1710f0.getValue(), rVar, Integer.valueOf((i10 >> 9) & 112));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C5287d(list, z11, j14, j13, oVar, i10, i11);
        }
    }
}
