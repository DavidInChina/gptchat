package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1215s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14914Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14915Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14916h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215s(AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14916h0 = abstractC1206i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1215s c1215s = new C1215s(this.f14916h0, abstractC4825e);
        c1215s.f14915Z = obj;
        return c1215s;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1215s) create((Pg.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14914Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r rVar = new r((Pg.A) this.f14915Z, 0);
            this.f14914Y = 1;
            if (this.f14916h0.b(rVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
