package mh;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mh.L  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4667L extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39415Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4670O f39416Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4667L(C4670O c4670o, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39416Z = c4670o;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4667L(this.f39416Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4667L) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39415Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C4670O c4670o = this.f39416Z;
            c4670o.f39424v0.c();
            C4686p c4686p = c4670o.f39423u0;
            this.f39415Y = 1;
            if (c4686p.n(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
