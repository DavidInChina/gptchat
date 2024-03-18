package X1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import e2.C2777i;
import jf.y;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f21727Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f21728h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f21729i0 = new d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f21730j0 = new d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final d f21731k0 = new d(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final d f21732l0 = new d(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21733Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(2);
        this.f21733Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f21733Y) {
            case 0:
                String str = (String) obj;
                l lVar = (l) obj2;
                if (str.length() == 0) {
                    return lVar.toString();
                }
                return str + ", " + lVar;
            case 1:
                ((i) obj).f21747b = (p) obj2;
                return yVar;
            case 2:
                ((i) obj).f21746a = (m) obj2;
                return yVar;
            case 3:
                ((i) obj).f21748c = ((C2777i) obj2).f28771a;
                return yVar;
            case 4:
                AbstractC2469q0.p(obj2);
                ((i) obj).getClass();
                return yVar;
            default:
                l lVar2 = (l) obj2;
                if (lVar2 instanceof f2.b) {
                    return lVar2;
                }
                return obj;
        }
    }
}
