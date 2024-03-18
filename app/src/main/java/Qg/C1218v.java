package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1218v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14932Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14933Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f14934h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218v(AbstractC4825e abstractC4825e, kotlin.jvm.internal.B b10, AbstractC1207j abstractC1207j) {
        super(2, abstractC4825e);
        this.f14933Z = b10;
        this.f14934h0 = abstractC1207j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1218v(abstractC4825e, this.f14933Z, this.f14934h0);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1218v) create((jf.y) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14932Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            kotlin.jvm.internal.B b10 = this.f14933Z;
            Object obj2 = b10.f37622Y;
            if (obj2 == null) {
                return yVar;
            }
            b10.f37622Y = null;
            if (obj2 == AbstractC1282c.f15530b) {
                obj2 = null;
            }
            this.f14932Y = 1;
            if (this.f14934h0.c(obj2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
