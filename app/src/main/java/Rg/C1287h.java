package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Rg.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1287h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15543Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15544Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1288i f15545h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287h(AbstractC1288i abstractC1288i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15545h0 = abstractC1288i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1287h c1287h = new C1287h(this.f15545h0, abstractC4825e);
        c1287h.f15544Z = obj;
        return c1287h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1287h) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15543Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f15543Y = 1;
            if (this.f15545h0.m((AbstractC1207j) this.f15544Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
