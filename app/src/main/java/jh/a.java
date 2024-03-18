package Jh;

import Eh.AbstractC0511j;
import Hh.l;
import Hh.n;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final n f9226Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ b f9227Z;

    public a(b bVar, n nVar) {
        this.f9227Z = bVar;
        this.f9226Y = nVar;
    }

    @Override // Hh.n
    public final boolean b() {
        return this.f9226Y.b();
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        b bVar = this.f9227Z;
        lVar.z(184, bVar.f9237Y.D0(), bVar.f9239h0, bVar.f9240i0, false);
        return bVar.f9238Z.a(this.f9226Y.e(lVar, abstractC0511j));
    }
}
