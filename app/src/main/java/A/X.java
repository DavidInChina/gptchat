package A;

import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import m.AbstractActivityC4532l;
import uc.C5885c;
import xe.AbstractC6412a;

/* loaded from: classes2.dex */
public final class X extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f132Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f133Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f134h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Object obj, boolean z10, int i10) {
        super(1);
        this.f132Y = i10;
        this.f134h0 = obj;
        this.f133Z = z10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f132Y;
        boolean z10 = false;
        Object obj2 = this.f134h0;
        boolean z11 = this.f133Z;
        switch (i10) {
            case 0:
                AbstractC2469q0.p(obj);
                throw null;
            case 1:
                X1.l lVar = (X1.l) obj;
                if (lVar instanceof X1.c) {
                    ((X1.c) lVar).getClass();
                }
                if ((z11 && Build.VERSION.SDK_INT <= 30) || (lVar instanceof Y1.b)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                C5885c c5885c = (C5885c) obj;
                AbstractC3557B.c0("features", c5885c);
                AbstractC2469q0.p(obj2);
                return C5885c.a(c5885c, AbstractC4268D.g1(c5885c.f46630a, new C3959i(null, Boolean.valueOf(z11))), null, 2);
            case 3:
                AbstractC3557B.c0("$this$DisposableEffect", (Z.N) obj);
                AbstractActivityC4532l abstractActivityC4532l = (AbstractActivityC4532l) obj2;
                D1.P0 p02 = new D1.P0(abstractActivityC4532l.getWindow(), abstractActivityC4532l.getWindow().getDecorView());
                P5.c cVar = p02.f3241a;
                cVar.M(false);
                cVar.L(false);
                return new Cd.I(p02, z11, 0);
            default:
                byte byteValue = ((Number) obj).byteValue();
                if (!AbstractC6412a.f49873a.contains(Byte.valueOf(byteValue)) && !AbstractC6412a.f49878f.contains(Byte.valueOf(byteValue))) {
                    if (z11 && byteValue == 32) {
                        ((StringBuilder) obj2).append('+');
                    } else {
                        ((StringBuilder) obj2).append(AbstractC6412a.a(byteValue));
                    }
                } else {
                    ((StringBuilder) obj2).append((char) byteValue);
                }
                return jf.y.f36177a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(boolean z10, Object obj, int i10) {
        super(1);
        this.f132Y = i10;
        this.f133Z = z10;
        this.f134h0 = obj;
    }
}
