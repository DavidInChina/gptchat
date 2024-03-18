package oc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nc.r;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class g extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f41259Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41260Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f41261h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, r rVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f41260Z = kVar;
        this.f41261h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new g(this.f41260Z, this.f41261h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((g) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41259Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            String str = ((nc.m) this.f41261h0).f40244a;
            this.f41259Y = 1;
            if (k.m(this.f41260Z, str, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
