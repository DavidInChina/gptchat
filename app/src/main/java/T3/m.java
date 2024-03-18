package t3;

import h0.C3288a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l8.AbstractC4344b;
import s3.AbstractC5540C;
import s3.C5548K;
import s3.C5562l;
import s3.V;
import s3.W;

@V("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lt3/m;", "Ls3/W;", "Lt3/l;", "<init>", "()V", "B2/u", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class m extends W {
    @Override // s3.W
    public final AbstractC5540C a() {
        C3288a c3288a = AbstractC5670e.f45683a;
        return new l(this);
    }

    @Override // s3.W
    public final void d(List list, C5548K c5548k) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C5562l) it.next());
        }
    }

    @Override // s3.W
    public final void e(C5562l c5562l, boolean z10) {
        b().e(c5562l, z10);
        int j22 = kf.t.j2((Iterable) b().f45328f.f14881Y.getValue(), c5562l);
        int i10 = 0;
        for (Object obj : (Iterable) b().f45328f.f14881Y.getValue()) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                C5562l c5562l2 = (C5562l) obj;
                if (i10 > j22) {
                    b().b(c5562l2);
                }
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
    }
}
