package Od;

import Qd.A;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f13723Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ u f13724Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f13725h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f13726i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, String str, String str2, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f13724Z = uVar;
        this.f13725h0 = str;
        this.f13726i0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new t(this.f13724Z, this.f13725h0, this.f13726i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((t) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13723Y;
        u uVar = this.f13724Z;
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
            A a5 = uVar.f13739q0;
            if (a5 != null) {
                String str = this.f13725h0;
                AbstractC3557B.b0("currentVersion", str);
                this.f13723Y = 1;
                if (a5.e(6, str, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                AbstractC3557B.C2("storage");
                throw null;
            }
        }
        A a10 = uVar.f13739q0;
        if (a10 != null) {
            this.f13723Y = 2;
            if (a10.e(7, this.f13726i0, this) == enumC5000a) {
                return enumC5000a;
            }
            return y.f36177a;
        }
        AbstractC3557B.C2("storage");
        throw null;
    }
}
