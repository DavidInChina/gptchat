package Rd;

import Ng.F;
import Qd.A;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15421Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f15422Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15422Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new c(this.f15422Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15421Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A h10 = this.f15422Z.f15434a.h();
            this.f15421Y = 1;
            if (h10.c(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
