package mb;

import Z8.T;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4613z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39120Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4586K f39121Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4613z(C4586K c4586k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39121Z = c4586k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4613z c4613z = new C4613z(this.f39121Z, abstractC4825e);
        c4613z.f39120Y = obj;
        return c4613z;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4613z) create((C2969F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C2969F c2969f = (C2969F) this.f39120Y;
        C4586K c4586k = this.f39121Z;
        if (((hb.t) c4586k.e()).f32130b && ((hb.t) c4586k.e()).f32129a) {
            c4586k.o(T.f23273c, c2969f.f30008a);
            c4586k.n().a();
            c4586k.h(new C4582G(c4586k, c2969f, null));
        }
        return jf.y.f36177a;
    }
}
