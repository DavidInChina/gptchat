package L3;

import Ng.F;
import androidx.work.CoroutineWorker;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10711Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f10712Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10712Z = coroutineWorker;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new f(this.f10712Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10711Y;
        CoroutineWorker coroutineWorker = this.f10712Z;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                this.f10711Y = 1;
                obj = coroutineWorker.f(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            coroutineWorker.f25515k0.j((q) obj);
        } catch (Throwable th2) {
            coroutineWorker.f25515k0.k(th2);
        }
        return jf.y.f36177a;
    }
}
