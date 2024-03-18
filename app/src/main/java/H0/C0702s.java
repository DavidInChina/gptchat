package H0;

import android.content.res.Configuration;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import n0.C4703b;

/* renamed from: H0.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0702s extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0702s f7023Z = new C0702s(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0702s f7024h0 = new C0702s(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0702s f7025i0 = new C0702s(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0702s f7026j0 = new C0702s(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0702s f7027k0 = new C0702s(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0702s f7028l0 = new C0702s(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0702s f7029m0 = new C0702s(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C0702s f7030n0 = new C0702s(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C0702s f7031o0 = new C0702s(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7032Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0702s(int i10) {
        super(1);
        this.f7032Y = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        boolean z10 = false;
        switch (this.f7032Y) {
            case 0:
                return Boolean.valueOf(aVar.f24831B0.d(8));
            case 1:
            case 2:
            default:
                L0.j p10 = aVar.p();
                if (p10 != null && p10.f10410Z) {
                    if (p10.f10409Y.containsKey(L0.i.f10391h)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 3:
                L0.j p11 = aVar.p();
                if (p11 != null && p11.f10410Z) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                return Boolean.valueOf(aVar.f24831B0.d(8));
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f7032Y) {
            case 0:
                return a((androidx.compose.ui.node.a) obj);
            case 1:
                Configuration configuration = (Configuration) obj;
                return yVar;
            case 2:
                D0.c cVar = (D0.c) obj;
                return Boolean.FALSE;
            case 3:
                return a((androidx.compose.ui.node.a) obj);
            case 4:
                return a((androidx.compose.ui.node.a) obj);
            case 5:
                return a((androidx.compose.ui.node.a) obj);
            case 6:
                return (T0.u) obj;
            case 7:
                return Boolean.valueOf(Q.o(obj));
            case 8:
                C4703b c4703b = (C4703b) obj;
                return null;
            default:
                AbstractC2469q0.p(obj);
                return yVar;
        }
    }
}
