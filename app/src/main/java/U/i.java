package U;

import Qd.E;
import Z.C1718j0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.y;
import kotlin.jvm.internal.C4302a;
import nf.AbstractC4825e;
import pf.AbstractC5162i;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final /* synthetic */ class i extends C4302a implements wf.n, AbstractC5162i {

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f17352m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, Object obj) {
        super(2, obj, n.class, "onRelease", "onRelease$material_release(F)F");
        this.f17352m0 = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(2, obj, Sd.g.class, "runningUpdate", "runningUpdate(Lcom/segment/analytics/kotlin/core/System;)V");
                return;
            }
        }
        super(2, obj, Sd.e.class, "onEnableToggled", "onEnableToggled$core(Lcom/segment/analytics/kotlin/core/System;)V");
    }

    public final Object a(E e10) {
        y yVar = y.f36177a;
        int i10 = this.f17352m0;
        Object obj = this.f37627Y;
        switch (i10) {
            case 1:
                Sd.e eVar = (Sd.e) obj;
                eVar.getClass();
                AbstractC3557B.c0("state", e10);
                if (e10.f14579e) {
                    Rd.f fVar = eVar.f16569i0;
                    if (fVar != null && !fVar.f15441h) {
                        fVar.f15441h = true;
                        if (fVar.f15438e.u() || fVar.f15438e.B()) {
                            fVar.f15438e = Bi.c.d(Integer.MAX_VALUE, null, 6);
                            fVar.f15439f = Bi.c.d(Integer.MAX_VALUE, null, 6);
                        }
                        Iterator it = fVar.f15436c.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            Qd.i iVar = fVar.f15434a;
                            if (hasNext) {
                                ((Ud.b) it.next()).c(iVar);
                            } else {
                                Ad.l.O0(iVar.f14611Z.b(), iVar.f14611Z.c(), null, new Rd.e(fVar, null), 2);
                                Ad.l.O0(iVar.f14611Z.b(), iVar.f14611Z.a(), null, new Rd.d(fVar, null), 2);
                            }
                        }
                    }
                } else {
                    Rd.f fVar2 = eVar.f16569i0;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return yVar;
            default:
                Sd.g gVar = (Sd.g) obj;
                Qd.i iVar2 = gVar.f16575Y;
                if (iVar2 != null) {
                    r.f.M(iVar2, "Analytics starting = " + e10.f14577c);
                    AtomicBoolean atomicBoolean = gVar.f16576Z;
                    atomicBoolean.set(e10.f14577c);
                    if (atomicBoolean.get()) {
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue = gVar.f16577h0;
                            if (!concurrentLinkedQueue.isEmpty()) {
                                com.segment.analytics.kotlin.core.a aVar = (com.segment.analytics.kotlin.core.a) concurrentLinkedQueue.poll();
                                if (aVar != null) {
                                    Qd.i iVar3 = gVar.f16575Y;
                                    if (iVar3 != null) {
                                        iVar3.j(aVar);
                                    } else {
                                        AbstractC3557B.C2("analytics");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    return yVar;
                }
                AbstractC3557B.C2("analytics");
                throw null;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f17352m0;
        y yVar = y.f36177a;
        switch (i10) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                AbstractC4825e abstractC4825e = (AbstractC4825e) obj2;
                n nVar = (n) this.f37627Y;
                float f6 = 0.0f;
                if (!nVar.c()) {
                    if (nVar.a() > nVar.f17371g.h()) {
                        ((AbstractC6216a) nVar.f17366b.getValue()).mo122invoke();
                    }
                    Ad.l.O0(nVar.f17365a, null, null, new m(nVar, 0.0f, null), 3);
                    C1718j0 c1718j0 = nVar.f17370f;
                    if (c1718j0.h() == 0.0f || floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    c1718j0.i(0.0f);
                    f6 = floatValue;
                }
                return new Float(f6);
            case 1:
                AbstractC4825e abstractC4825e2 = (AbstractC4825e) obj2;
                a((E) obj);
                return yVar;
            default:
                AbstractC4825e abstractC4825e3 = (AbstractC4825e) obj2;
                a((E) obj);
                return yVar;
        }
    }
}
