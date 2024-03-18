package z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6690c extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6694e f51222Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51223Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6690c(C6694e c6694e, Object obj, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51222Y = c6694e;
        this.f51223Z = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6690c(this.f51222Y, this.f51223Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C6690c) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C6694e c6694e = this.f51222Y;
        C6694e.a(c6694e);
        Object d10 = c6694e.d(this.f51223Z);
        c6694e.f51230c.f51346Z.setValue(d10);
        c6694e.f51232e.setValue(d10);
        return jf.y.f36177a;
    }
}
