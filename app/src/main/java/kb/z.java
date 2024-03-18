package kb;

import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37282Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x9.l f37283Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4209C f37284h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f37285i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f37286j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x9.l lVar, C4209C c4209c, Context context, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37283Z = lVar;
        this.f37284h0 = c4209c;
        this.f37285i0 = context;
        this.f37286j0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new z(this.f37283Z, this.f37284h0, this.f37285i0, this.f37286j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37282Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f37282Y = 1;
            if (AbstractC4208B.f(this.f37283Z, this.f37284h0, this.f37285i0, this.f37286j0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
