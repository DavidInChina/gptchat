package gb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import p9.C5100b;
import pf.AbstractC5163j;

/* renamed from: gb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3224a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C5100b f31382Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w9.j f31383Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224a(C5100b c5100b, w9.j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31382Y = c5100b;
        this.f31383Z = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3224a(this.f31382Y, this.f31383Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C3224a) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Z0.i iVar = (Z0.i) this.f31382Y.f42762b.getValue();
        if (iVar != null) {
            this.f31383Z.b(iVar.f22799a);
        }
        return jf.y.f36177a;
    }
}
