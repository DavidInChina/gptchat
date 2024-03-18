package oc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4987b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41245Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41246Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4987b(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41246Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4987b c4987b = new C4987b(this.f41246Z, abstractC4825e);
        c4987b.f41245Y = obj;
        return c4987b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C4987b) create((T9.c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        T9.c cVar = (T9.c) this.f41245Y;
        k kVar = this.f41246Z;
        kVar.l(new Ra.l(cVar, 22, kVar));
        T9.k kVar2 = cVar.f16968c;
        if (kVar2 instanceof T9.f) {
            kVar.f(new nc.k(((T9.f) kVar2).f16974a));
        }
        return y.f36177a;
    }
}
