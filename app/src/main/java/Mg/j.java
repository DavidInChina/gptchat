package mg;

import Bg.d0;
import Bg.p0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39292Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f39293Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, int i10) {
        super(1);
        this.f39292Y = i10;
        this.f39293Z = mVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f39292Y;
        m mVar = this.f39293Z;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj;
                AbstractC3557B.c0("it", d0Var);
                if (d0Var.c()) {
                    return Separators.STAR;
                }
                Bg.A type = d0Var.getType();
                AbstractC3557B.b0("getType(...)", type);
                String Y7 = mVar.Y(type);
                if (d0Var.b() == p0.f2146h0) {
                    return Y7;
                }
                return d0Var.b() + ' ' + Y7;
            default:
                Bg.A a5 = (Bg.A) obj;
                AbstractC3557B.Z(a5);
                return mVar.Y(a5);
        }
    }
}
