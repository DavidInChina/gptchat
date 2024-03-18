package Hg;

import Mf.AbstractC1013w;
import id.AbstractC3557B;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public abstract class H implements AbstractC0732e {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f7761a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7762b;

    public H(String str, wf.k kVar) {
        this.f7761a = kVar;
        this.f7762b = "must return ".concat(str);
    }

    @Override // Hg.AbstractC0732e
    public final boolean a(AbstractC1013w abstractC1013w) {
        AbstractC3557B.c0("functionDescriptor", abstractC1013w);
        return AbstractC3557B.K(abstractC1013w.getReturnType(), this.f7761a.invoke(AbstractC5493d.e(abstractC1013w)));
    }

    @Override // Hg.AbstractC0732e
    public final String b(AbstractC1013w abstractC1013w) {
        return Bi.c.c1(this, abstractC1013w);
    }

    @Override // Hg.AbstractC0732e
    public final String getDescription() {
        return this.f7762b;
    }
}
