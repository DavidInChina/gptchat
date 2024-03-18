package R3;

import A.C0007a0;
import L3.s;
import Pg.A;
import S3.g;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15031Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15032Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f15033h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15033h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f15033h0, abstractC4825e);
        cVar.f15032Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15031Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A a5 = (A) this.f15032Z;
            d dVar = this.f15033h0;
            b bVar = new b(dVar, a5);
            S3.f fVar = dVar.f15034a;
            fVar.getClass();
            synchronized (fVar.f16118c) {
                try {
                    if (fVar.f16119d.add(bVar)) {
                        if (fVar.f16119d.size() == 1) {
                            fVar.f16120e = fVar.a();
                            s d10 = s.d();
                            String str = g.f16121a;
                            d10.a(str, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f16120e);
                            fVar.c();
                        }
                        bVar.a(fVar.f16120e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0007a0 c0007a0 = new C0007a0(this.f15033h0, 19, bVar);
            this.f15031Y = 1;
            if (A7.b.d0(a5, c0007a0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
