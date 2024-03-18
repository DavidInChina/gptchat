package W;

import Qg.C1209l;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* renamed from: W.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1610s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20394Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20395Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f20396h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20397i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610s(AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20396h0 = abstractC6216a;
        this.f20397i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1610s c1610s = new C1610s(this.f20396h0, this.f20397i0, abstractC4825e);
        c1610s.f20395Z = obj;
        return c1610s;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1610s) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20394Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            ?? obj2 = new Object();
            C1209l o02 = AbstractC4828h.o0(this.f20396h0);
            r rVar = new r(obj2, (Ng.F) this.f20395Z, this.f20397i0);
            this.f20394Y = 1;
            if (o02.b(rVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
