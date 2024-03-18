package io.ktor.utils.io;

import Ng.AbstractC1073l0;
import Ng.AbstractC1078o;
import Ng.D0;
import Ng.T;
import Ng.v0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class A implements AbstractC1073l0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1073l0 f33363Y;

    /* renamed from: Z  reason: collision with root package name */
    public final u f33364Z;

    public A(D0 d02, t tVar) {
        this.f33363Y = d02;
        this.f33364Z = tVar;
    }

    @Override // Ng.AbstractC1073l0
    public final AbstractC1078o A0(v0 v0Var) {
        return this.f33363Y.A0(v0Var);
    }

    @Override // Ng.AbstractC1073l0
    public final Object F(AbstractC4825e abstractC4825e) {
        return this.f33363Y.F(abstractC4825e);
    }

    @Override // Ng.AbstractC1073l0
    public final CancellationException P() {
        return this.f33363Y.P();
    }

    @Override // Ng.AbstractC1073l0
    public final T V(wf.k kVar) {
        return this.f33363Y.V(kVar);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean a() {
        return this.f33363Y.a();
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return this.f33363Y.fold(obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        return this.f33363Y.get(abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return this.f33363Y.getKey();
    }

    @Override // Ng.AbstractC1073l0
    public final AbstractC1073l0 getParent() {
        return this.f33363Y.getParent();
    }

    @Override // Ng.AbstractC1073l0
    public final boolean j() {
        return this.f33363Y.j();
    }

    @Override // Ng.AbstractC1073l0
    public final void k(CancellationException cancellationException) {
        this.f33363Y.k(cancellationException);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean m() {
        return this.f33363Y.m();
    }

    @Override // Ng.AbstractC1073l0
    public final T m0(boolean z10, boolean z11, wf.k kVar) {
        AbstractC3557B.c0("handler", kVar);
        return this.f33363Y.m0(z10, z11, kVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC4830j);
        return this.f33363Y.minusKey(abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("context", abstractC4831k);
        return this.f33363Y.plus(abstractC4831k);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean start() {
        return this.f33363Y.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.f33363Y + ']';
    }
}
