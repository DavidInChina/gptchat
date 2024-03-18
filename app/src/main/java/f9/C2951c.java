package f9;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: f9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2951c extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29774Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2954f f29775Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2951c(C2954f c2954f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29775Z = c2954f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2951c(this.f29775Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2951c) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29774Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2954f c2954f = this.f29775Z;
            AbstractC2949a abstractC2949a = (AbstractC2949a) c2954f.f29786d.f14881Y.getValue();
            if (abstractC2949a != null) {
                this.f29774Y = 1;
                if (C2954f.a(c2954f, abstractC2949a, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
