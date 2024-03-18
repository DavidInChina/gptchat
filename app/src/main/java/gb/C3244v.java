package gb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: gb.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3244v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f31522Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f31523Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3244v(wf.k kVar, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31522Y = kVar;
        this.f31523Z = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3244v(this.f31522Y, this.f31523Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C3244v) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f31522Y.invoke(new a0(this.f31523Z));
        return jf.y.f36177a;
    }
}
