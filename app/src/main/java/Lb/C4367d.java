package lb;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;

/* renamed from: lb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4367d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37991Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37992Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f37993h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4367d(wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37993h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4367d c4367d = new C4367d(this.f37993h0, abstractC4825e);
        c4367d.f37992Z = obj;
        return c4367d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4367d) create((q0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37991Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f37991Y = 1;
            if (this.f37993h0.invoke((q0) this.f37992Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
