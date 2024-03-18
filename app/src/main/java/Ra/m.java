package Ra;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import id.C3556A;
import jf.C3959i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class m extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f15221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f15222Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f15222Z = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new m(this.f15222Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((m) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r1 != null) goto L22;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3556A c3556a;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15221Y;
        o oVar = this.f15222Z;
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
            g gVar = oVar.f15228k;
            this.f15221Y = 1;
            obj = gVar.b(oVar.f15229l, oVar.f15231n, oVar.f15230m, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        g gVar2 = oVar.f15228k;
        gVar2.getClass();
        String str = oVar.f15229l;
        AbstractC3557B.c0("conversationId", str);
        String str2 = oVar.f15231n;
        AbstractC3557B.c0("messageId", str2);
        String str3 = oVar.f15230m;
        AbstractC3557B.c0("sandboxUrl", str3);
        t tVar = new t(str, str2, str3);
        C3959i c3959i = gVar2.f15203f;
        if (c3959i != null) {
            if (!AbstractC3557B.K(c3959i.f36155Y, tVar)) {
                c3959i = null;
            }
            if (c3959i != null) {
                c3556a = (C3556A) c3959i.f36156Z;
            }
        }
        c3556a = new C3556A();
        if (v0Var instanceof u0) {
            oVar.l(new l(v0Var, 0, c3556a));
        } else if (!AbstractC3557B.K(v0Var, p0.f48449a) && (v0Var instanceof q0)) {
            this.f15221Y = 2;
            if (o.m(oVar, (q0) v0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
