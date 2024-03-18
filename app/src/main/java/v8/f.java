package V8;

import B0.N;
import B0.u;
import jf.y;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;
import wf.n;

/* loaded from: classes2.dex */
public final class f extends AbstractC5161h implements n {

    /* renamed from: Z  reason: collision with root package name */
    public int f18455Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18456h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ m f18457i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18458j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18459k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ B f18460l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, wf.k kVar, wf.k kVar2, B b10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18457i0 = mVar;
        this.f18458j0 = kVar;
        this.f18459k0 = kVar2;
        this.f18460l0 = b10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f18457i0, this.f18458j0, this.f18459k0, this.f18460l0, abstractC4825e);
        fVar.f18456h0 = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18455Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f18455Z = 1;
            obj = j.b((N) this.f18456h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        u uVar = (u) obj;
        y yVar = y.f36177a;
        m mVar = this.f18457i0;
        if (uVar != null) {
            uVar.a();
            mVar.f18494Z = true;
            mVar.f18496i0.g(null);
            this.f18458j0.invoke(new C5251c(uVar.f1672c));
            return yVar;
        }
        mVar.f18495h0 = true;
        mVar.f18496i0.g(null);
        wf.k kVar = this.f18459k0;
        if (kVar == null) {
            return null;
        }
        kVar.invoke(new C5251c(((u) this.f18460l0.f37622Y).f1672c));
        return yVar;
    }
}
