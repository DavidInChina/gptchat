package fc;

import com.google.android.gms.internal.play_billing.N;
import mc.AbstractC4617d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: fc.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3002F extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f30115Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3004H f30116Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3022q f30117h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3002F(C3004H c3004h, AbstractC3022q abstractC3022q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f30116Z = c3004h;
        this.f30117h0 = abstractC3022q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C3002F(this.f30116Z, this.f30117h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C3002F) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f30115Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC4617d abstractC4617d = this.f30116Z.f30121j;
            C2999C c2999c = new C2999C(this.f30117h0, 2);
            this.f30115Y = 1;
            if (abstractC4617d.b(c2999c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
