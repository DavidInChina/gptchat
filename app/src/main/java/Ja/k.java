package Ja;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8928Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f8929Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2311c f8930h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, C2311c c2311c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8929Z = pVar;
        this.f8930h0 = c2311c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f8929Z, this.f8930h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b4.g) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8928Y;
        C2311c c2311c = this.f8930h0;
        p pVar = this.f8929Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        N.B0(obj);
                        return y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                this.f8928Y = 3;
                if (p.b(pVar, c2311c, this) == enumC5000a) {
                    return enumC5000a;
                }
                return y.f36177a;
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            n9.n nVar = pVar.f8951d;
            String str = c2311c.f26374a;
            this.f8928Y = 1;
            if (nVar.d(str, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        C4726e c4726e = pVar.f8950c;
        n9.g gVar = new n9.g(c2311c.f26374a, c2311c);
        this.f8928Y = 2;
        if (c4726e.f(gVar, this) == enumC5000a) {
            return enumC5000a;
        }
        this.f8928Y = 3;
        if (p.b(pVar, c2311c, this) == enumC5000a) {
        }
        return y.f36177a;
    }
}
