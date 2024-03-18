package Sg;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import nf.AbstractC4829i;

/* loaded from: classes2.dex */
public final class C extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C f16632Z = new C(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C f16633h0 = new C(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C f16634i0 = new C(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16635Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10) {
        super(2);
        this.f16635Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16635Y) {
            case 0:
                AbstractC4829i abstractC4829i = (AbstractC4829i) obj2;
                return obj;
            case 1:
                AbstractC2469q0.p(obj);
                AbstractC4829i abstractC4829i2 = (AbstractC4829i) obj2;
                return null;
            default:
                AbstractC4829i abstractC4829i3 = (AbstractC4829i) obj2;
                return (E) obj;
        }
    }
}
