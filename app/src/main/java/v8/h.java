package V8;

import B0.A;
import Df.H;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import wf.o;

/* loaded from: classes2.dex */
public final class h extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18474Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18475Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A f18476h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18477i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ o f18478j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18479k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18480l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18481m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(A a5, AbstractC4825e abstractC4825e, wf.k kVar, wf.k kVar2, wf.k kVar3, wf.k kVar4, o oVar) {
        super(2, abstractC4825e);
        this.f18476h0 = a5;
        this.f18477i0 = kVar;
        this.f18478j0 = oVar;
        this.f18479k0 = kVar2;
        this.f18480l0 = kVar3;
        this.f18481m0 = kVar4;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        h hVar = new h(this.f18476h0, abstractC4825e, this.f18477i0, this.f18479k0, this.f18480l0, this.f18481m0, this.f18478j0);
        hVar.f18475Z = obj;
        return hVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18474Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f6 = (F) this.f18475Z;
            A a5 = this.f18476h0;
            g gVar = new g(this.f18477i0, new m(a5), this.f18478j0, f6, this.f18479k0, this.f18480l0, this.f18481m0, null);
            this.f18474Y = 1;
            if (H.q(a5, gVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
