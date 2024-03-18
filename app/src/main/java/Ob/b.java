package Ob;

import Df.H;
import Df.w;
import Pb.f;
import Pb.g;
import Pb.h;
import Qb.e;
import Vc.q;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.G;
import com.openai.experiment.o;
import com.openai.experiment.r;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.u0;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class b implements Nb.a {

    /* renamed from: a  reason: collision with root package name */
    public final r f13671a;

    /* renamed from: b  reason: collision with root package name */
    public final h f13672b;

    public b(r rVar, h hVar) {
        this.f13671a = rVar;
        this.f13672b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f13670h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f13670h0 = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f13668Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f13670h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    int a5 = ((G) this.f13671a).a(o.f27693c);
                    aVar.f13670h0 = 1;
                    h hVar = this.f13672b;
                    hVar.getClass();
                    g gVar = new g(a5, null);
                    w a10 = C.a(f.class);
                    Je.a n22 = R4.b.n2(H.O(a10), C.f37623a.b(f.class), a10);
                    Yc.a aVar2 = hVar.f13926a;
                    aVar2.getClass();
                    obj = W.S(aVar2, n22, gVar, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    f fVar = (f) ((Vc.w) xVar).f18565a;
                    AbstractC3557B.c0("<this>", fVar);
                    List<Pb.c> list = fVar.f13922a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (Pb.c cVar : list) {
                        AbstractC3557B.c0("<this>", cVar);
                        arrayList.add(new e(cVar.f13916a, cVar.f13917b, cVar.f13918c));
                    }
                    return new u0(new Qb.f(arrayList));
                } else if (xVar instanceof q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof Vc.r) {
                        xVar.getClass();
                        return x.a((Vc.r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f13668Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f13670h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
