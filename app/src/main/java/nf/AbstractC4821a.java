package nf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import wf.n;

/* renamed from: nf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4821a implements AbstractC4829i {
    private final AbstractC4830j key;

    public AbstractC4821a(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        this.key = abstractC4830j;
    }

    @Override // nf.AbstractC4831k
    public <R> R fold(R r10, n nVar) {
        return (R) AbstractC4344b.j0(this, r10, nVar);
    }

    @Override // nf.AbstractC4831k
    public <E extends AbstractC4829i> E get(AbstractC4830j abstractC4830j) {
        return (E) AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public AbstractC4830j getKey() {
        return this.key;
    }

    @Override // nf.AbstractC4831k
    public AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }
}
