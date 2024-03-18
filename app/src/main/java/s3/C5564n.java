package s3;

import Kd.C0826b;
import Kd.C0827c;
import Kd.C0830f;
import Sg.C1394f;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import id.AbstractC3557B;
import java.util.Iterator;

/* renamed from: s3.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5564n implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45321Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f45322Z;

    public /* synthetic */ C5564n(int i10, Object obj) {
        this.f45321Y = i10;
        this.f45322Z = obj;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        int i10 = this.f45321Y;
        Object obj = this.f45322Z;
        switch (i10) {
            case 0:
                AbstractC5568s abstractC5568s = (AbstractC5568s) obj;
                AbstractC3557B.c0("this$0", abstractC5568s);
                abstractC5568s.f45357r = enumC2081p.a();
                if (abstractC5568s.f45342c != null) {
                    Iterator<E> it = abstractC5568s.f45346g.iterator();
                    while (it.hasNext()) {
                        C5562l c5562l = (C5562l) it.next();
                        c5562l.getClass();
                        c5562l.f45308i0 = enumC2081p.a();
                        c5562l.i();
                    }
                    return;
                }
                return;
            case 1:
                A3.d dVar = (A3.d) obj;
                AbstractC3557B.c0("this$0", dVar);
                if (enumC2081p == EnumC2081p.ON_START) {
                    dVar.f643f = true;
                    return;
                } else if (enumC2081p == EnumC2081p.ON_STOP) {
                    dVar.f643f = false;
                    return;
                } else {
                    return;
                }
            default:
                C0830f c0830f = (C0830f) obj;
                AbstractC3557B.c0("$audioPlayer", c0830f);
                int i11 = Id.b.f8545a[enumC2081p.ordinal()];
                C1394f c1394f = c0830f.f9733a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            c0830f.f9734b.v();
                            return;
                        }
                        return;
                    }
                    Ad.l.O0(c1394f, null, null, new C0827c(c0830f, null), 3);
                    return;
                }
                Ad.l.O0(c1394f, null, null, new C0826b(c0830f, null), 3);
                return;
        }
    }
}
