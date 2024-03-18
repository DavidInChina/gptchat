package U;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import q0.C5254f;
import r0.I;
import r0.x;
import z.AbstractC6657D;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ n f17350Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f17351Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, boolean z10) {
        super(1);
        this.f17350Y = nVar;
        this.f17351Z = z10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        n nVar = this.f17350Y;
        I i10 = (I) ((x) obj);
        i10.o(nVar.f17369e.h() - C5254f.b(i10.f44198w0));
        if (this.f17351Z && !nVar.c()) {
            float o10 = N.o(AbstractC6657D.f51126b.a(nVar.f17369e.h() / nVar.f17371g.h()), 0.0f, 1.0f);
            i10.e(o10);
            i10.f(o10);
        }
        return y.f36177a;
    }
}
