package Z;

import nf.AbstractC4831k;

/* renamed from: Z.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733r0 implements AbstractC1710f0, Ng.F {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f22722Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f22723Z;

    public C1733r0(AbstractC1710f0 abstractC1710f0, AbstractC4831k abstractC4831k) {
        this.f22722Y = abstractC4831k;
        this.f22723Z = abstractC1710f0;
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f22723Z.getValue();
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f22722Y;
    }

    @Override // Z.AbstractC1710f0
    public final void setValue(Object obj) {
        this.f22723Z.setValue(obj);
    }
}
