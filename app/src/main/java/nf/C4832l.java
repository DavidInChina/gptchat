package nf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;
import wf.n;

/* renamed from: nf.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4832l implements AbstractC4831k, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4832l f40334Y = new Object();

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        return this;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("context", abstractC4831k);
        return abstractC4831k;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, n nVar) {
        return obj;
    }
}
