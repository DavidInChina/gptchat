package t3;

import Qg.F0;
import Qg.n0;
import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kf.AbstractC4273I;
import kotlin.Metadata;
import nf.AbstractC4828h;
import s3.AbstractC5540C;
import s3.C5548K;
import s3.C5562l;
import s3.C5565o;
import s3.V;
import s3.W;

@V("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lt3/i;", "Ls3/W;", "Lt3/h;", "<init>", "()V", "P5/c", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class i extends W {

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f45689c = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);

    @Override // s3.W
    public final AbstractC5540C a() {
        return new h(this, AbstractC5668c.f45681a);
    }

    @Override // s3.W
    public final void d(List list, C5548K c5548k) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5562l c5562l = (C5562l) it.next();
            C5565o b10 = b();
            AbstractC3557B.c0("backStackEntry", c5562l);
            F0 f02 = b10.f45325c;
            Iterable iterable = (Iterable) f02.getValue();
            boolean z10 = iterable instanceof Collection;
            n0 n0Var = b10.f45327e;
            if (!z10 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((C5562l) it2.next()) == c5562l) {
                        Iterable<C5562l> iterable2 = (Iterable) n0Var.f14881Y.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            for (C5562l c5562l2 : iterable2) {
                                if (c5562l2 == c5562l) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C5562l c5562l3 = (C5562l) kf.t.p2((List) n0Var.f14881Y.getValue());
            if (c5562l3 != null) {
                f02.setValue(AbstractC4273I.v2((Set) f02.getValue(), c5562l3));
            }
            f02.setValue(AbstractC4273I.v2((Set) f02.getValue(), c5562l));
            b10.f(c5562l);
        }
        this.f45689c.setValue(Boolean.FALSE);
    }

    @Override // s3.W
    public final void e(C5562l c5562l, boolean z10) {
        b().e(c5562l, z10);
        this.f45689c.setValue(Boolean.TRUE);
    }
}
