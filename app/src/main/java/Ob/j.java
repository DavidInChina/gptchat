package ob;

import Jc.AbstractC0809c;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kb.C4220e;
import kb.C4222g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41227Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41228Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41228Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        j jVar = new j(this.f41228Z, abstractC4825e);
        jVar.f41227Y = obj;
        return jVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((j) create((r) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        r rVar = (r) this.f41227Y;
        l lVar = this.f41228Z;
        lVar.getClass();
        Throwable th2 = rVar.f18561a;
        if (th2 instanceof AbstractC0809c) {
            lVar.f(new C4220e((AbstractC0809c) th2));
        } else {
            lVar.f(new C4222g(x.a(rVar)));
        }
        return y.f36177a;
    }
}
