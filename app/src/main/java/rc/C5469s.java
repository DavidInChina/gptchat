package rc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: rc.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5469s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44923Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5472v f44924Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5469s(C5472v c5472v, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44924Z = c5472v;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5469s(this.f44924Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5469s) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44923Y;
        C5472v c5472v = this.f44924Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.j jVar = c5472v.f44933c;
            this.f44923Y = 1;
            if (((h0) jVar).a(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        xd.a aVar = c5472v.f44934d;
        this.f44923Y = 2;
        if (((C5463l) aVar).d(this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
