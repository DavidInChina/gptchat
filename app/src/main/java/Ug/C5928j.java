package ug;

import id.AbstractC3557B;
import sb.C5605e;
import wf.AbstractC6216a;

/* renamed from: ug.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5928j extends AbstractC5919a {

    /* renamed from: b  reason: collision with root package name */
    public final Ag.l f46794b;

    public C5928j(Ag.u uVar, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("storageManager", uVar);
        this.f46794b = new Ag.l((Ag.q) uVar, new C5605e(abstractC6216a, 19));
    }

    @Override // ug.AbstractC5919a
    public final n i() {
        return (n) this.f46794b.mo122invoke();
    }
}
