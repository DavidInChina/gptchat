package oc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.u0;

/* renamed from: oc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4986a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41243Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41244Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4986a(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41244Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4986a c4986a = new C4986a(this.f41244Z, abstractC4825e);
        c4986a.f41243Y = obj;
        return c4986a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C4986a) create((u0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f41244Z.l(new nb.d(17, (u0) this.f41243Y));
        return y.f36177a;
    }
}
