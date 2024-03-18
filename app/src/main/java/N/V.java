package N;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import z.C6694e;
import z.C6697f0;

/* loaded from: classes.dex */
public final class V extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12259Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f12260Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f12261h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C6694e c6694e, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12260Z = c6694e;
        this.f12261h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new V(this.f12260Z, this.f12261h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12259Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5251c c5251c = new C5251c(this.f12261h0);
            C6697f0 c6697f0 = Y.f12272d;
            this.f12259Y = 1;
            if (C6694e.c(this.f12260Z, c5251c, c6697f0, null, this, 12) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
