package ta;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import cb.C2334C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6800q;

/* renamed from: ta.Q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5701Q extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45843Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6800q f45844Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X f45845h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5701Q(C6800q c6800q, X x10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45844Z = c6800q;
        this.f45845h0 = x10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5701Q(this.f45844Z, this.f45845h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C5701Q) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45843Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1805k0 a5 = AbstractC1809m0.a();
            Z8.B b10 = Z8.B.f23238c;
            C6800q c6800q = this.f45844Z;
            C2334C c2334c = c6800q.f51798a;
            if (c2334c != null) {
                str = c2334c.f26438a;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            a5.c(b10, str);
            C5700P c5700p = new C5700P(c6800q, 0);
            X x10 = this.f45845h0;
            x10.l(c5700p);
            C5700P c5700p2 = new C5700P(c6800q, 1);
            this.f45843Y = 1;
            x10.f45864k.a(c5700p2);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
