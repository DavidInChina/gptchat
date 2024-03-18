package M1;

import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: M1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0923d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11429Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11430Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f11431h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923d(List list, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11431h0 = list;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0923d c0923d = new C0923d(this.f11431h0, abstractC4825e);
        c0923d.f11430Z = obj;
        return c0923d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0923d) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11429Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            R4.a aVar = AbstractC0927h.f11444a;
            this.f11429Y = 1;
            if (R4.a.T(aVar, this.f11431h0, (B) this.f11430Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
