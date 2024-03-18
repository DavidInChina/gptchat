package Q8;

import L0.t;
import L0.u;
import L0.v;
import Ng.H;
import R8.A;
import R8.C;
import R8.E;
import R8.r;
import R8.s;
import R8.z;
import android.content.Context;
import android.widget.TextView;
import id.AbstractC3557B;
import jf.y;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f14478Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f14479h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f14480i0 = new d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f14481j0 = new d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final d f14482k0 = new d(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final d f14483l0 = new d(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final d f14484m0 = new d(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final d f14485n0 = new d(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final d f14486o0 = new d(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final d f14487p0 = new d(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final d f14488q0 = new d(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final d f14489r0 = new d(11);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14490Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f14490Y = i10;
    }

    public final Boolean a(s sVar) {
        switch (this.f14490Y) {
            case 1:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof r);
            case 2:
            case 3:
            default:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof E);
            case 4:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof C);
            case 5:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof E);
            case 6:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof A);
            case 7:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof A);
            case 8:
                AbstractC3557B.c0("it", sVar);
                return Boolean.valueOf(sVar.f15164a instanceof z);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f14490Y;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                AbstractC3557B.c0("context", context);
                return new TextView(context);
            case 1:
                return a((s) obj);
            case 2:
                v vVar = (v) obj;
                AbstractC3557B.c0("$this$semantics", vVar);
                Df.v[] vVarArr = t.f10472a;
                u uVar = L0.r.f10453i;
                y yVar = y.f36177a;
                ((L0.j) vVar).y(uVar, yVar);
                return yVar;
            case 3:
                Z0.b bVar = (Z0.b) obj;
                AbstractC3557B.c0("$this$$receiver", bVar);
                float f6 = 128;
                return new Z0.k(H.c(bVar.a0(f6), bVar.a0(f6)));
            case 4:
                return a((s) obj);
            case 5:
                return a((s) obj);
            case 6:
                return a((s) obj);
            case 7:
                return a((s) obj);
            case 8:
                return a((s) obj);
            case 9:
                return a((s) obj);
            case 10:
                s sVar = (s) obj;
                switch (i10) {
                    case 10:
                        AbstractC3557B.c0("it", sVar);
                        return sVar.f15165b.f15170e;
                    default:
                        AbstractC3557B.c0("it", sVar);
                        return sVar.f15165b.f15169d;
                }
            default:
                s sVar2 = (s) obj;
                switch (i10) {
                    case 10:
                        AbstractC3557B.c0("it", sVar2);
                        return sVar2.f15165b.f15170e;
                    default:
                        AbstractC3557B.c0("it", sVar2);
                        return sVar2.f15165b.f15169d;
                }
        }
    }
}
