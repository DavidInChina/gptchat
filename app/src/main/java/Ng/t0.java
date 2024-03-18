package Ng;

import Sg.AbstractC1389a;
import Sg.AbstractC1390b;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class t0 extends AbstractC1390b {

    /* renamed from: b  reason: collision with root package name */
    public final Sg.p f12973b;

    /* renamed from: c  reason: collision with root package name */
    public Sg.p f12974c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v0 f12975d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f12976e;

    public t0(Sg.p pVar, v0 v0Var, Object obj) {
        this.f12975d = v0Var;
        this.f12976e = obj;
        this.f12973b = pVar;
    }

    @Override // Sg.AbstractC1390b
    public final void b(Object obj, Object obj2) {
        boolean z10;
        Sg.p pVar;
        Sg.p pVar2 = (Sg.p) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sg.p pVar3 = this.f12973b;
        if (z10) {
            pVar = pVar3;
        } else {
            pVar = this.f12974c;
        }
        if (pVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.p.f16672Y;
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar2, this, pVar)) {
                if (atomicReferenceFieldUpdater.get(pVar2) != this) {
                    return;
                }
            }
            if (z10) {
                Sg.p pVar4 = this.f12974c;
                AbstractC3557B.Z(pVar4);
                pVar3.g(pVar4);
            }
        }
    }

    @Override // Sg.AbstractC1390b
    public final Q1.u c(Object obj) {
        Sg.p pVar = (Sg.p) obj;
        if (this.f12975d.U() == this.f12976e) {
            return null;
        }
        return AbstractC1389a.f16645e;
    }
}
