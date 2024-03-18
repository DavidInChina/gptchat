package ec;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ec.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2841K extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29158Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29159Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2841K(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29159Z = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2841K(this.f29159Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2841K) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29158Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f29158Y = 1;
            if (C2847Q.n(this.f29159Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
