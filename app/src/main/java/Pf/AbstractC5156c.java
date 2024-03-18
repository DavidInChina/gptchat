package pf;

import Ng.B;
import Ng.C1072l;
import Sg.AbstractC1389a;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;
import nf.AbstractC4827g;
import nf.AbstractC4829i;
import nf.AbstractC4831k;
import nf.C4826f;

/* renamed from: pf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5156c extends AbstractC5154a {
    private final AbstractC4831k _context;
    private transient AbstractC4825e intercepted;

    public AbstractC5156c(AbstractC4825e abstractC4825e) {
        this(abstractC4825e, abstractC4825e != null ? abstractC4825e.getContext() : null);
    }

    @Override // nf.AbstractC4825e
    public AbstractC4831k getContext() {
        AbstractC4831k abstractC4831k = this._context;
        AbstractC3557B.Z(abstractC4831k);
        return abstractC4831k;
    }

    public final AbstractC4825e intercepted() {
        AbstractC4825e abstractC4825e = this.intercepted;
        if (abstractC4825e == null) {
            AbstractC4827g abstractC4827g = (AbstractC4827g) getContext().get(C4826f.f40317Y);
            if (abstractC4827g != null) {
                abstractC4825e = new Sg.i((B) abstractC4827g, this);
            } else {
                abstractC4825e = this;
            }
            this.intercepted = abstractC4825e;
        }
        return abstractC4825e;
    }

    @Override // pf.AbstractC5154a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1072l c1072l;
        AbstractC4825e abstractC4825e = this.intercepted;
        if (abstractC4825e != null && abstractC4825e != this) {
            AbstractC4829i abstractC4829i = getContext().get(C4826f.f40317Y);
            AbstractC3557B.Z(abstractC4829i);
            AbstractC4827g abstractC4827g = (AbstractC4827g) abstractC4829i;
            Sg.i iVar = (Sg.i) abstractC4825e;
            do {
                atomicReferenceFieldUpdater = Sg.i.f16655m0;
            } while (atomicReferenceFieldUpdater.get(iVar) == AbstractC1389a.f16644d);
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            if (obj instanceof C1072l) {
                c1072l = (C1072l) obj;
            } else {
                c1072l = null;
            }
            if (c1072l != null) {
                c1072l.n();
            }
        }
        this.intercepted = C5155b.f43136Y;
    }

    public AbstractC5156c(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k) {
        super(abstractC4825e);
        this._context = abstractC4831k;
    }
}
