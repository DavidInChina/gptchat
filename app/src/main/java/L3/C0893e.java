package L3;

import Ng.F;
import androidx.work.CoroutineWorker;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: L3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public m f10707Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f10708Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f10709h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f10710i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893e(m mVar, CoroutineWorker coroutineWorker, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10709h0 = mVar;
        this.f10710i0 = coroutineWorker;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0893e(this.f10709h0, this.f10710i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0893e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10708Z;
        if (i10 != 0) {
            if (i10 == 1) {
                m mVar = this.f10707Y;
                N.B0(obj);
                mVar.f10722Y.j(obj);
                return jf.y.f36177a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        this.f10707Y = this.f10709h0;
        this.f10708Z = 1;
        this.f10710i0.getClass();
        throw new IllegalStateException("Not implemented");
    }
}
