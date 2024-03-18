package B;

import Qg.C1209l;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* renamed from: B.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1517Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1518Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f1519h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1520i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166u(AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1519h0 = abstractC6216a;
        this.f1520i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0166u c0166u = new C0166u(this.f1519h0, this.f1520i0, abstractC4825e);
        c0166u.f1518Z = obj;
        return c0166u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0166u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1517Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            ?? obj2 = new Object();
            C1209l o02 = AbstractC4828h.o0(this.f1519h0);
            C0163t c0163t = new C0163t(obj2, (Ng.F) this.f1518Z, this.f1520i0);
            this.f1517Y = 1;
            if (o02.b(c0163t, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
