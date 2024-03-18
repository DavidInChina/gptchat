package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1640y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f20611Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f20612Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20613h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.p f20614i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640y(C c10, Object obj, wf.p pVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f20612Z = c10;
        this.f20613h0 = obj;
        this.f20614i0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1640y(this.f20612Z, this.f20613h0, this.f20614i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1640y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20611Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Object obj2 = this.f20613h0;
            C c10 = this.f20612Z;
            c10.i(obj2);
            A a5 = new A(c10, 2);
            C1635x c1635x = new C1635x(this.f20614i0, c10, null);
            this.f20611Y = 1;
            if (kotlin.jvm.internal.m.m(a5, c1635x, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
