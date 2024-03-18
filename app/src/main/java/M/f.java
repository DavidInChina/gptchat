package M;

import E0.AbstractC0459s;
import E0.M;
import E0.O;
import E0.P;
import G0.AbstractC0587p;
import G0.AbstractC0590t;
import G0.AbstractC0591u;
import G0.C;
import G0.g0;
import N.m0;
import N0.C1046e;
import N0.E;
import S0.r;
import java.util.List;
import t0.AbstractC5646e;

/* loaded from: classes.dex */
public final class f extends AbstractC0587p implements C, AbstractC0590t, AbstractC0591u {

    /* renamed from: u0  reason: collision with root package name */
    public h f11306u0;

    /* renamed from: v0  reason: collision with root package name */
    public final n f11307v0;

    public f(C1046e c1046e, E e10, r rVar, wf.k kVar, int i10, boolean z10, int i11, int i12, List list, wf.k kVar2, h hVar) {
        this.f11306u0 = hVar;
        n nVar = new n(c1046e, e10, rVar, kVar, i10, z10, i11, i12, list, kVar2, hVar);
        A0(nVar);
        this.f11307v0 = nVar;
        if (this.f11306u0 != null) {
            return;
        }
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
    }

    @Override // G0.AbstractC0591u
    public final void b0(g0 g0Var) {
        h hVar = this.f11306u0;
        if (hVar != null) {
            hVar.f11313i0 = k.a(hVar.f11313i0, g0Var, null, 2);
            m0 m0Var = (m0) hVar.f11311Z;
            m0Var.f12373a = false;
            wf.k kVar = m0Var.f12377e;
            if (kVar != null) {
                kVar.invoke(Long.valueOf(hVar.f11310Y));
            }
        }
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return this.f11307v0.c(abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return this.f11307v0.d(abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        return this.f11307v0.e(p10, m10, j6);
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        this.f11307v0.f(abstractC5646e);
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return this.f11307v0.h(abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return this.f11307v0.i(abstractC0459s, rVar, i10);
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
