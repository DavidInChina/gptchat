package uc;

import Df.H;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import xe.AbstractC6407L;
import xe.C6396A;
import xe.C6405J;
import xe.C6433v;

/* renamed from: uc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5886d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f46632Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f46633Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5886d(boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46633Z = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5886d c5886d = new C5886d(this.f46633Z, abstractC4825e);
        c5886d.f46632Y = obj;
        return c5886d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5886d) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ge.d dVar = (ge.d) this.f46632Y;
        C6405J c6405j = new C6405J();
        C6396A c6396a = C6396A.f49811b;
        new C6433v();
        Bi.c.z();
        H.d();
        AbstractC6407L.b(c6405j, "settings/beta_features");
        throw null;
    }
}
