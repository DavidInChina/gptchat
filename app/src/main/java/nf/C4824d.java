package nf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;
import wf.n;

/* renamed from: nf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4824d implements AbstractC4831k, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f40315Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4829i f40316Z;

    public C4824d(AbstractC4829i abstractC4829i, AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("left", abstractC4831k);
        AbstractC3557B.c0("element", abstractC4829i);
        this.f40315Y = abstractC4831k;
        this.f40316Z = abstractC4829i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4824d) {
                C4824d c4824d = (C4824d) obj;
                c4824d.getClass();
                int i10 = 2;
                C4824d c4824d2 = c4824d;
                int i11 = 2;
                while (true) {
                    AbstractC4831k abstractC4831k = c4824d2.f40315Y;
                    if (abstractC4831k instanceof C4824d) {
                        c4824d2 = (C4824d) abstractC4831k;
                    } else {
                        c4824d2 = null;
                    }
                    if (c4824d2 == null) {
                        break;
                    }
                    i11++;
                }
                C4824d c4824d3 = this;
                while (true) {
                    AbstractC4831k abstractC4831k2 = c4824d3.f40315Y;
                    if (abstractC4831k2 instanceof C4824d) {
                        c4824d3 = (C4824d) abstractC4831k2;
                    } else {
                        c4824d3 = null;
                    }
                    if (c4824d3 == null) {
                        break;
                    }
                    i10++;
                }
                if (i11 == i10) {
                    C4824d c4824d4 = this;
                    while (true) {
                        AbstractC4829i abstractC4829i = c4824d4.f40316Z;
                        if (!AbstractC3557B.K(c4824d.get(abstractC4829i.getKey()), abstractC4829i)) {
                            break;
                        }
                        AbstractC4831k abstractC4831k3 = c4824d4.f40315Y;
                        if (abstractC4831k3 instanceof C4824d) {
                            c4824d4 = (C4824d) abstractC4831k3;
                        } else {
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", abstractC4831k3);
                            AbstractC4829i abstractC4829i2 = (AbstractC4829i) abstractC4831k3;
                            if (AbstractC3557B.K(c4824d.get(abstractC4829i2.getKey()), abstractC4829i2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, n nVar) {
        return nVar.invoke(this.f40315Y.fold(obj, nVar), this.f40316Z);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        C4824d c4824d = this;
        while (true) {
            AbstractC4829i abstractC4829i = c4824d.f40316Z.get(abstractC4830j);
            if (abstractC4829i != null) {
                return abstractC4829i;
            }
            AbstractC4831k abstractC4831k = c4824d.f40315Y;
            if (abstractC4831k instanceof C4824d) {
                c4824d = (C4824d) abstractC4831k;
            } else {
                return abstractC4831k.get(abstractC4830j);
            }
        }
    }

    public final int hashCode() {
        return this.f40316Z.hashCode() + this.f40315Y.hashCode();
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        AbstractC4829i abstractC4829i = this.f40316Z;
        AbstractC4829i abstractC4829i2 = abstractC4829i.get(abstractC4830j);
        AbstractC4831k abstractC4831k = this.f40315Y;
        if (abstractC4829i2 != null) {
            return abstractC4831k;
        }
        AbstractC4831k minusKey = abstractC4831k.minusKey(abstractC4830j);
        if (minusKey == abstractC4831k) {
            return this;
        }
        if (minusKey != C4832l.f40334Y) {
            return new C4824d(abstractC4829i, minusKey);
        }
        return abstractC4829i;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("context", abstractC4831k);
        if (abstractC4831k == C4832l.f40334Y) {
            return this;
        }
        return (AbstractC4831k) abstractC4831k.fold(this, C4823c.f40313h0);
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("["), (String) fold("", C4823c.f40312Z), ']');
    }
}
