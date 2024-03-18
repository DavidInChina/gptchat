package zc;

import fa.C2969F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6827f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51898Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f51899Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51900h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6827f(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51900h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6827f c6827f = new C6827f(this.f51900h0, abstractC4825e);
        c6827f.f51899Z = obj;
        return c6827f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6827f) create((C2969F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51898Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2969F c2969f = (C2969F) this.f51899Z;
            if (c2969f != null) {
                Kd.I i11 = this.f51900h0.f51860l;
                this.f51898Y = 1;
                if (i11.g(c2969f, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
