package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1212o extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f14882Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14883Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14884h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212o(AbstractC4825e abstractC4825e, kotlin.jvm.internal.B b10, AbstractC1207j abstractC1207j) {
        super(1, abstractC4825e);
        this.f14883Z = abstractC1207j;
        this.f14884h0 = b10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1212o(abstractC4825e, this.f14884h0, this.f14883Z);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1212o) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14882Y;
        kotlin.jvm.internal.B b10 = this.f14884h0;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Q1.u uVar = AbstractC1282c.f15530b;
            Object obj2 = b10.f37622Y;
            if (obj2 == uVar) {
                obj2 = null;
            }
            this.f14882Y = 1;
            if (this.f14883Z.c(obj2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        b10.f37622Y = null;
        return jf.y.f36177a;
    }
}
