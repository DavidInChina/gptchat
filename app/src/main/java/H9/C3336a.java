package h9;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6189g;
import wd.C6205s;
import wf.n;

/* renamed from: h9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3336a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31955Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [h9.a, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f31955Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C3336a) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6205s c6205s = (C6205s) this.f31955Y;
        AbstractC1805k0 a5 = AbstractC1809m0.a();
        String str = c6205s.f48458b.f48352a;
        String a10 = c6205s.a();
        String str2 = c6205s.f48458b.f48353b;
        boolean K10 = AbstractC3557B.K(c6205s.c(), "plus");
        boolean z10 = false;
        C6189g c6189g = c6205s.f48457a;
        if (c6189g != null && c6189g.a()) {
            z10 = true;
        }
        a5.a(str, a10, str2, K10, z10, c6205s.c());
        return y.f36177a;
    }
}
