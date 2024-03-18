package G9;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import jf.y;
import wd.O;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f6105Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f6106h0 = new b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final b f6107i0 = new b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final b f6108j0 = new b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final b f6109k0 = new b(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6110Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f6110Y = i10;
    }

    public final void a(String str) {
        switch (this.f6110Y) {
            case 0:
                AbstractC3557B.c0("it", str);
                return;
            case 1:
                AbstractC3557B.c0("it", str);
                return;
            case 2:
                AbstractC3557B.c0("it", str);
                return;
            default:
                AbstractC3557B.c0("it", str);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f6110Y) {
            case 0:
                a(((O) obj).f48362a);
                return yVar;
            case 1:
                a(((O) obj).f48362a);
                return yVar;
            case 2:
                a(((O) obj).f48362a);
                return yVar;
            case 3:
                a(((O) obj).f48362a);
                return yVar;
            default:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("it", null);
                return yVar;
        }
    }
}
