package s3;

import h.C3281g;
import id.AbstractC3557B;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    public C5565o f45276a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45277b;

    public abstract AbstractC5540C a();

    public final C5565o b() {
        C5565o c5565o = this.f45276a;
        if (c5565o != null) {
            return c5565o;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List list, C5548K c5548k) {
        Kg.e eVar = new Kg.e(Kg.m.i1(Kg.m.n1(kf.t.V1(list), new C3281g(this, c5548k, null, 25)), Kg.o.f9844i0));
        while (eVar.hasNext()) {
            b().f((C5562l) eVar.next());
        }
    }

    public void e(C5562l c5562l, boolean z10) {
        AbstractC3557B.c0("popUpTo", c5562l);
        List list = (List) b().f45327e.f14881Y.getValue();
        if (list.contains(c5562l)) {
            ListIterator listIterator = list.listIterator(list.size());
            C5562l c5562l2 = null;
            while (f()) {
                c5562l2 = (C5562l) listIterator.previous();
                if (AbstractC3557B.K(c5562l2, c5562l)) {
                    break;
                }
            }
            if (c5562l2 != null) {
                b().c(c5562l2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + c5562l + " which does not exist in back stack " + list).toString());
    }

    public boolean f() {
        return true;
    }

    public AbstractC5540C c(AbstractC5540C abstractC5540C) {
        return abstractC5540C;
    }
}
