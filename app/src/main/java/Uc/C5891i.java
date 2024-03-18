package uc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: uc.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5891i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46637Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f46638Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5900r f46639h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5891i(C5900r c5900r, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46639h0 = c5900r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5891i c5891i = new C5891i(this.f46639h0, abstractC4825e);
        c5891i.f46638Z = obj;
        return c5891i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5891i) create((zd.c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46637Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5900r c5900r = this.f46639h0;
            C5889g c5889g = c5900r.f46668d;
            Ra.l lVar = new Ra.l(c5900r, 26, (zd.c) this.f46638Z);
            this.f46637Y = 1;
            if (c5889g.b(lVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
