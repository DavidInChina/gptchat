package g2;

import Qg.l0;
import Z.E0;
import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: g2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3137B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31024Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31025Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0 f31026h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3155m f31027i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l0 f31028j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31029k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ X1.j f31030l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ L f31031m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137B(E0 e02, AbstractC3155m abstractC3155m, l0 l0Var, SessionWorker sessionWorker, X1.j jVar, L l10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31026h0 = e02;
        this.f31027i0 = abstractC3155m;
        this.f31028j0 = l0Var;
        this.f31029k0 = sessionWorker;
        this.f31030l0 = jVar;
        this.f31031m0 = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3137B c3137b = new C3137B(this.f31026h0, this.f31027i0, this.f31028j0, this.f31029k0, this.f31030l0, this.f31031m0, abstractC4825e);
        c3137b.f31025Z = obj;
        return c3137b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C3137B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31024Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            throw new RuntimeException();
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Ng.F f6 = (Ng.F) this.f31025Z;
        ?? obj2 = new Object();
        E0 e02 = this.f31026h0;
        obj2.f37621Y = e02.f22464a;
        C3136A c3136a = new C3136A(this.f31027i0, e02, obj2, this.f31028j0, this.f31029k0, this.f31030l0, this.f31031m0, f6);
        this.f31024Y = 1;
        e02.f22483t.b(c3136a, this);
        return enumC5000a;
    }
}
