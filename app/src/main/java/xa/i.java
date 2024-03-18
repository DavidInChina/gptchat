package xa;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49721Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f49722Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f49723h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ s f49724i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, s sVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49723h0 = z10;
        this.f49724i0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        i iVar = new i(this.f49723h0, this.f49724i0, abstractC4825e);
        iVar.f49722Z = ((Boolean) obj).booleanValue();
        return iVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((i) create(bool, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49721Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            if (this.f49723h0 != this.f49722Z) {
                this.f49721Y = 1;
                if (s.a(this.f49724i0, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
