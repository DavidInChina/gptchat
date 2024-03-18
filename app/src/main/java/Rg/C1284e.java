package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Rg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1284e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15533Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15534Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15535h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1286g f15536i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284e(AbstractC4825e abstractC4825e, AbstractC1207j abstractC1207j, AbstractC1286g abstractC1286g) {
        super(2, abstractC4825e);
        this.f15535h0 = abstractC1207j;
        this.f15536i0 = abstractC1286g;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1284e c1284e = new C1284e(abstractC4825e, this.f15535h0, this.f15536i0);
        c1284e.f15534Z = obj;
        return c1284e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1284e) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15533Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Pg.C l10 = this.f15536i0.l((Ng.F) this.f15534Z);
            this.f15533Y = 1;
            Object L02 = Bi.c.L0(this.f15535h0, l10, true, this);
            if (L02 != enumC5000a) {
                L02 = yVar;
            }
            if (L02 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
