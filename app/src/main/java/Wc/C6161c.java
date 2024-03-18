package wc;

import Df.H;
import Df.w;
import Vc.q;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.K0;
import x8.W;

/* renamed from: wc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6161c {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.f f48301a;

    public C6161c(Yc.f fVar) {
        this.f48301a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Type inference failed for: r8v9, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C6159a c6159a;
        int i10;
        x xVar;
        if (abstractC4825e instanceof C6159a) {
            c6159a = (C6159a) abstractC4825e;
            int i11 = c6159a.f48298h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6159a.f48298h0 = i11 - Integer.MIN_VALUE;
                Object obj = c6159a.f48296Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6159a.f48298h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    w a5 = C.a(C6165g.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C6165g.class), a5);
                    c6159a.f48298h0 = 1;
                    Yc.f fVar = this.f48301a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, abstractC5163j, c6159a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    C6165g c6165g = (C6165g) ((Vc.w) xVar).f18565a;
                    AbstractC3557B.c0("<this>", c6165g);
                    return new Vc.w(new K0(c6165g.f48309e, c6165g.f48305a, c6165g.f48306b, c6165g.f48307c, c6165g.f48308d));
                } else if ((xVar instanceof q) || (xVar instanceof r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c6159a = new C6159a(this, abstractC4825e);
        Object obj2 = c6159a.f48296Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6159a.f48298h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
