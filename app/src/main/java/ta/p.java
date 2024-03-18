package Ta;

import Df.H;
import Df.w;
import Jc.F;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.s0;
import wd.u0;
import x8.W;

/* loaded from: classes2.dex */
public final class p implements F {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.a f17025a;

    public p(Yc.a aVar) {
        this.f17025a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        n nVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i11 = nVar.f17019h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f17019h0 = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f17017Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f17019h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    o oVar = new o(str2, str3, str, null);
                    w a5 = C.a(c.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(c.class), a5);
                    nVar.f17019h0 = 1;
                    Yc.a aVar = this.f17025a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, oVar, nVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    Vc.w wVar = (Vc.w) xVar;
                    boolean K10 = AbstractC3557B.K(((c) wVar.f18565a).f16980a, "error");
                    Object obj2 = wVar.f18565a;
                    if (K10) {
                        c cVar = (c) obj2;
                        String str4 = cVar.f16982c;
                        if (str4 != null && Lg.n.Z1(str4, "expired", true)) {
                            return new s0(0, new Exception());
                        }
                        String str5 = cVar.f16982c;
                        if (str5 != null && Lg.n.Z1(str5, "unavailable", true)) {
                            return new s0(0, new Exception());
                        }
                        String str6 = cVar.f16983d;
                        return new s0(0, new Exception());
                    }
                    return new u0(((c) obj2).f16981b);
                } else if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof r) {
                        xVar.getClass();
                        return x.a((r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        nVar = new n(this, abstractC4825e);
        Object obj3 = nVar.f17017Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f17019h0;
        if (i10 == 0) {
        }
        xVar = (x) obj3;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
