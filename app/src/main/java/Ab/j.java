package Ab;

import Df.H;
import Df.w;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.u0;
import x8.W;
import zb.AbstractC6810a;
import zb.C6813d;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6810a f766a;

    public j(AbstractC6810a abstractC6810a) {
        this.f766a = abstractC6810a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f765h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f765h0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f763Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f765h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    iVar.f765h0 = 1;
                    Bb.c cVar = (Bb.c) this.f766a;
                    cVar.getClass();
                    Bb.b bVar = new Bb.b(str, map, null);
                    w a5 = C.a(C6813d.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C6813d.class), a5);
                    Yc.a aVar = cVar.f2044a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, bVar, iVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new u0(((C6813d) ((Vc.w) xVar).f18565a).f51814a);
                }
                if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                }
                if (xVar instanceof Vc.r) {
                    xVar.getClass();
                    return x.a((Vc.r) xVar);
                }
                throw new RuntimeException();
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj2 = iVar.f763Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f765h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
