package Sb;

import Rb.AbstractC1279z;
import Rb.C1274u;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f16494Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f16495Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1279z f16496h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC1279z abstractC1279z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f16495Z = gVar;
        this.f16496h0 = abstractC1279z;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new e(this.f16495Z, this.f16496h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((e) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16494Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f16494Y = 1;
            if (g.m(this.f16495Z, (C1274u) this.f16496h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
