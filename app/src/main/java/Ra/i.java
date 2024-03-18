package Ra;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import jf.y;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final i f15208Z = new i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final i f15209h0 = new i(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15210Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f15210Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f15210Y) {
            case 0:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("it", null);
                return y.f36177a;
            default:
                k kVar = (k) obj;
                AbstractC3557B.c0("it", kVar);
                return kVar.f15217d;
        }
    }
}
