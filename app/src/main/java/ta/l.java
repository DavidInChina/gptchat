package Ta;

import Df.H;
import Df.w;
import Jc.AbstractC0810d;
import Jc.y;
import Vc.t;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes2.dex */
public final class l implements AbstractC0810d {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.f f17014a;

    /* renamed from: b  reason: collision with root package name */
    public final ge.d f17015b = P4.a.d(h.f16999h0);

    public l(Yc.f fVar) {
        this.f17014a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        x xVar;
        t tVar;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f16986h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f16986h0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f16984Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f16986h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    e eVar = new e(str, null);
                    w a5 = C.a(Jc.g.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Jc.g.class), a5);
                    dVar.f16986h0 = 1;
                    Yc.f fVar = this.f17014a;
                    fVar.getClass();
                    obj = W.S(fVar, n22, eVar, dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    Vc.w wVar = (Vc.w) xVar;
                    Jc.g gVar = (Jc.g) wVar.f18565a;
                    if (gVar.f9049a == y.f9076Z) {
                        if (AbstractC3557B.K(gVar.f9051c, "file_expired")) {
                            tVar = new t(new Exception());
                        } else {
                            Object obj2 = wVar.f18565a;
                            String str2 = ((Jc.g) obj2).f9051c;
                            if (str2 != null && Lg.n.Z1(str2, "unavailable", true)) {
                                tVar = new t(new Exception());
                            } else {
                                String str3 = ((Jc.g) obj2).f9052d;
                                return new t(new Exception());
                            }
                        }
                        return tVar;
                    }
                    return xVar;
                }
                return xVar;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj3 = dVar.f16984Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f16986h0;
        if (i10 == 0) {
        }
        xVar = (x) obj3;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
