package ld;

import Ng.AbstractC1085t;
import Ng.C1079o0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.atomic.AtomicInteger;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38291Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f38292Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f38293h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wf.k kVar, o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38292Z = kVar;
        this.f38293h0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new n(this.f38292Z, this.f38293h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38291Y;
        o oVar = this.f38293h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                wf.k kVar = this.f38292Z;
                this.f38291Y = 1;
                if (kVar.invoke(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                ((C1079o0) ((AbstractC1085t) oVar.f38296c)).q0();
            }
            return y.f36177a;
        } finally {
            if (((AtomicInteger) oVar.f38297d).decrementAndGet() == 0) {
                ((C1079o0) ((AbstractC1085t) oVar.f38296c)).q0();
            }
        }
    }
}
