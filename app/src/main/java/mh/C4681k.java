package mh;

import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import oh.C5017d;
import pf.AbstractC5163j;

/* renamed from: mh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4681k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39460Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, mh.k, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f39460Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4681k) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC4194d.P((C5017d) this.f39460Y, 0.0f, 0L, 0L, 15);
        return jf.y.f36177a;
    }
}
