package Rg;

import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.atomic.AtomicInteger;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i[] f15574Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f15575h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f15576i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f15577j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractC1206i[] abstractC1206iArr, int i10, AtomicInteger atomicInteger, Pg.o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15574Z = abstractC1206iArr;
        this.f15575h0 = i10;
        this.f15576i0 = atomicInteger;
        this.f15577j0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f15574Z, this.f15575h0, this.f15576i0, this.f15577j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15573Y;
        AtomicInteger atomicInteger = this.f15576i0;
        Pg.o oVar = this.f15577j0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                AbstractC1206i[] abstractC1206iArr = this.f15574Z;
                int i11 = this.f15575h0;
                AbstractC1206i abstractC1206i = abstractC1206iArr[i11];
                s sVar = new s(oVar, i11);
                this.f15573Y = 1;
                if (abstractC1206i.b(sVar, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                oVar.l(null);
            }
            return jf.y.f36177a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                oVar.l(null);
            }
        }
    }
}
