package ve;

import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: ve.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6041j extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f47513Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f47514Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, ve.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f47514Z = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6041j) create((AbstractC6034c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47513Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C3418c b10 = ((AbstractC6034c) this.f47514Z).b();
            this.f47513Y = 1;
            obj = N.w0(b10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return ((C3418c) obj).d();
    }
}
