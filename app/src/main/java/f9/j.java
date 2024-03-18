package F9;

import Uc.C1423h;
import androidx.lifecycle.P;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x9.C6383b;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f5090Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P f5091Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f5092h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(P p10, m mVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f5091Z = p10;
        this.f5092h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new j(this.f5091Z, this.f5092h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((j) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5090Y;
        m mVar = this.f5092h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            C1423h c1423h = C1423h.f17677i;
            P p10 = this.f5091Z;
            AbstractC3557B.c0("savedStateHandle", p10);
            String str = (String) p10.b("encodedFileId");
            if (str != null) {
                String a5 = Fe.c.a(str);
                this.f5090Y = 1;
                obj = m.m(mVar, a5, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                throw new IllegalStateException("No file id provided".toString());
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            mVar.l(new C6383b(2, v0Var));
        } else if (!AbstractC3557B.K(v0Var, p0.f48449a) && (v0Var instanceof q0)) {
            this.f5090Y = 2;
            if (m.n(mVar, (q0) v0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
