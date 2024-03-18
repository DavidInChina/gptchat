package ta;

import A.C0039q0;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import android.gov.nist.core.Separators;
import cb.C2364e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6799p;
import za.C6808y;

/* loaded from: classes2.dex */
public final class S extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45846Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6799p f45847Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X f45848h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C6799p c6799p, X x10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45847Z = c6799p;
        this.f45848h0 = x10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new S(this.f45847Z, this.f45848h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((S) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45846Y;
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
            Z8.A a10 = Z8.A.f23236c;
            C6799p c6799p = this.f45847Z;
            C2364e c2364e = c6799p.f51797a;
            String str2 = null;
            if (c2364e != null) {
                str = c2364e.f26513a;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            a5.c(a10, str);
            C2364e c2364e2 = c6799p.f51797a;
            if (c2364e2 != null) {
                str2 = c2364e2.f26513a;
            }
            if (str2 != null) {
                str3 = str2;
            }
            String concat = str3.concat(Separators.SP);
            C6808y c6808y = this.f45848h0.f45864k;
            C0039q0 c0039q0 = new C0039q0(concat, 12);
            this.f45846Y = 1;
            c6808y.a(c0039q0);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
