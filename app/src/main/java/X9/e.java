package x9;

import G0.J;
import Ng.H;
import g4.C3180h;
import id.AbstractC3557B;
import j0.C3878C;
import java.util.ListIterator;
import jf.y;
import kotlin.jvm.internal.o;
import q4.q;
import r0.C5344h;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5654m;

/* loaded from: classes2.dex */
public final class e extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49652Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f49653Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, int i10) {
        super(1);
        this.f49652Y = i10;
        this.f49653Z = lVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f49652Y;
        l lVar = this.f49653Z;
        switch (i10) {
            case 0:
                AbstractC5646e abstractC5646e = (AbstractC5646e) obj;
                AbstractC3557B.c0("$this$drawWithContent", abstractC5646e);
                ((J) abstractC5646e).a();
                ListIterator listIterator = lVar.f49676b.listIterator();
                while (true) {
                    C3878C c3878c = (C3878C) listIterator;
                    if (c3878c.hasNext()) {
                        f fVar = (f) c3878c.next();
                        AbstractC5648g.i(abstractC5646e, new C5344h(K8.d.S0(fVar, g.f49658Z)), fVar.f49656c, fVar.f49657d, new C5654m(fVar.f49655b, 0.0f, 1, 1, 18), 48);
                    } else {
                        return yVar;
                    }
                }
            default:
                C3180h c3180h = (C3180h) obj;
                AbstractC3557B.c0("it", c3180h);
                q qVar = c3180h.f31223b;
                lVar.f49682h = H.c(qVar.f43886a.getIntrinsicWidth(), qVar.f43886a.getIntrinsicHeight());
                return yVar;
        }
    }
}
