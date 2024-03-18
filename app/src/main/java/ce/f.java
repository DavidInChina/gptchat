package Ce;

import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3095Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f3096Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3096Z = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f3096Z, abstractC4825e);
        fVar.f3095Y = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (this.f3095Y == null && !((t) this.f3096Z).r()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
