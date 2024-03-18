package rb;

import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: rb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5431u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44743Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44744Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44745h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2325q f44746i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44747j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5431u(C2325q c2325q, C5436z c5436z, AbstractC4825e abstractC4825e, wf.n nVar) {
        super(2, abstractC4825e);
        this.f44745h0 = c5436z;
        this.f44746i0 = c2325q;
        this.f44747j0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5431u c5431u = new C5431u(this.f44746i0, this.f44745h0, abstractC4825e, this.f44747j0);
        c5431u.f44744Z = obj;
        return c5431u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5431u) create((String) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44743Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f44743Y = 1;
            obj = C5436z.a(this.f44745h0, this.f44746i0, (String) this.f44744Z, this.f44747j0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
