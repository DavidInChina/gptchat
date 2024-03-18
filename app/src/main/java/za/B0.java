package Za;

import A.AbstractC0044t0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23437Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23438Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T0 f23439h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f23440i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f23441j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(T0 t02, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23439h0 = t02;
        this.f23440i0 = str;
        this.f23441j0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        B0 b02 = new B0(this.f23439h0, this.f23440i0, this.f23441j0, abstractC4825e);
        b02.f23438Z = obj;
        return b02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23437Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.Q0(c5760d, this.f23439h0.f23520b.f18568c);
            c5760d.e(new N.D(this.f23440i0, this.f23441j0, c5760d, 15));
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f23438Z);
            this.f23437Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
