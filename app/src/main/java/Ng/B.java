package Ng;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import nf.AbstractC4821a;
import nf.AbstractC4822b;
import nf.AbstractC4827g;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import nf.C4826f;
import nf.C4832l;

/* loaded from: classes.dex */
public abstract class B extends AbstractC4821a implements AbstractC4827g {

    /* renamed from: Y  reason: collision with root package name */
    public static final A f12862Y = new A(0);

    public B() {
        super(C4826f.f40317Y);
    }

    public void O(AbstractC4831k abstractC4831k, Runnable runnable) {
        r(abstractC4831k, runnable);
    }

    public boolean d0(AbstractC4831k abstractC4831k) {
        return !(this instanceof M0);
    }

    @Override // nf.AbstractC4821a, nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        if (abstractC4830j instanceof AbstractC4822b) {
            AbstractC4822b abstractC4822b = (AbstractC4822b) abstractC4830j;
            AbstractC4830j key = getKey();
            AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, key);
            if (key != abstractC4822b && abstractC4822b.f40311Z != key) {
                return null;
            }
            AbstractC4829i abstractC4829i = (AbstractC4829i) abstractC4822b.f40310Y.invoke(this);
            if (!(abstractC4829i instanceof AbstractC4829i)) {
                return null;
            }
            return abstractC4829i;
        } else if (C4826f.f40317Y != abstractC4830j) {
            return null;
        } else {
            return this;
        }
    }

    @Override // nf.AbstractC4821a, nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        boolean z10 = abstractC4830j instanceof AbstractC4822b;
        C4832l c4832l = C4832l.f40334Y;
        if (z10) {
            AbstractC4822b abstractC4822b = (AbstractC4822b) abstractC4830j;
            AbstractC4830j key = getKey();
            AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, key);
            if ((key == abstractC4822b || abstractC4822b.f40311Z == key) && ((AbstractC4829i) abstractC4822b.f40310Y.invoke(this)) != null) {
                return c4832l;
            }
        } else if (C4826f.f40317Y == abstractC4830j) {
            return c4832l;
        }
        return this;
    }

    public abstract void r(AbstractC4831k abstractC4831k, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + H.q(this);
    }

    public B u0(int i10) {
        R4.b.V(i10);
        return new Sg.n(this, i10);
    }
}
