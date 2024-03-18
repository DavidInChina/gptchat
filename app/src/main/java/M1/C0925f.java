package M1;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: M1.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0925f extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f11437Y;

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new AbstractC5163j(1, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C0925f) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11437Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
                return jf.y.f36177a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        this.f11437Y = 1;
        throw null;
    }
}
