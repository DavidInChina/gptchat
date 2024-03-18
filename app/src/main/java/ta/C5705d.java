package ta;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import y.AbstractC6482u;
import y.C6460A;
import y.p0;
import z.AbstractC6696f;
import za.C6783B;
import za.C6807x;

/* renamed from: ta.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5705d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5705d f45908Z = new C5705d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5705d f45909h0 = new C5705d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5705d f45910i0 = new C5705d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5705d f45911j0 = new C5705d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5705d f45912k0 = new C5705d(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C5705d f45913l0 = new C5705d(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C5705d f45914m0 = new C5705d(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C5705d f45915n0 = new C5705d(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C5705d f45916o0 = new C5705d(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C5705d f45917p0 = new C5705d(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C5705d f45918q0 = new C5705d(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C5705d f45919r0 = new C5705d(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C5705d f45920s0 = new C5705d(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C5705d f45921t0 = new C5705d(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final C5705d f45922u0 = new C5705d(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final C5705d f45923v0 = new C5705d(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final C5705d f45924w0 = new C5705d(16);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45925Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5705d(int i10) {
        super(1);
        this.f45925Y = i10;
    }

    public final Integer a(int i10) {
        switch (this.f45925Y) {
            case 8:
                return Integer.valueOf(i10 / 3);
            case 9:
                return Integer.valueOf(i10 / 3);
            case 10:
            default:
                return Integer.valueOf(i10 / 3);
            case 11:
                return Integer.valueOf(i10 / 3);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        long j10;
        y.d0 d0Var;
        y.e0 e0Var;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f45925Y;
        switch (i10) {
            case 0:
                ((Boolean) obj).getClass();
                return yVar;
            case 1:
                AbstractC3557B.c0("it", (T0.z) obj);
                return yVar;
            case 2:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 3:
                long j11 = ((Z0.k) obj).f22804a;
                switch (i10) {
                    case 3:
                        j6 = kotlin.jvm.internal.m.c((-((int) (j11 >> 32))) / 3, 0);
                        break;
                    default:
                        j6 = kotlin.jvm.internal.m.c((-((int) (j11 >> 32))) / 3, 0);
                        break;
                }
                return new Z0.i(j6);
            case 4:
                long j12 = ((Z0.k) obj).f22804a;
                switch (i10) {
                    case 3:
                        j10 = kotlin.jvm.internal.m.c((-((int) (j12 >> 32))) / 3, 0);
                        break;
                    default:
                        j10 = kotlin.jvm.internal.m.c((-((int) (j12 >> 32))) / 3, 0);
                        break;
                }
                return new Z0.i(j10);
            case 5:
                AbstractC6482u abstractC6482u = (AbstractC6482u) obj;
                AbstractC3557B.c0("$this$null", abstractC6482u);
                y.e0 d10 = androidx.compose.animation.b.d(AbstractC6696f.u(0.0f, 0.0f, null, 7), 2);
                y.d0 c10 = androidx.compose.animation.b.c(AbstractC6696f.u(0.0f, 0.0f, null, 7), 2);
                y.e0 b10 = androidx.compose.animation.b.k(AbstractC6696f.u(0.0f, 0.0f, null, 7), f45912k0).b(androidx.compose.animation.b.f(AbstractC6696f.u(0.0f, 0.0f, null, 7), 6)).b(androidx.compose.animation.b.d(AbstractC6696f.u(0.0f, 0.0f, null, 7), 2));
                y.d0 b11 = androidx.compose.animation.b.i(AbstractC6696f.u(0.0f, 0.0f, null, 7), f45911j0).b(androidx.compose.animation.b.e(AbstractC6696f.u(0.0f, 0.0f, null, 7), 0.0f, 6)).b(androidx.compose.animation.b.c(AbstractC6696f.u(0.0f, 0.0f, null, 7), 2));
                boolean booleanValue = ((Boolean) ((C6460A) abstractC6482u).c()).booleanValue();
                if (booleanValue) {
                    d0Var = b11;
                } else {
                    d0Var = c10;
                }
                if (booleanValue) {
                    e0Var = d10;
                } else {
                    e0Var = b10;
                }
                return new y.O(d0Var, e0Var, 0.0f, new p0(false, C5703b.f45897q0), 4);
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("it", entry);
                return entry.getKey();
            case 7:
                return null;
            case 8:
                return a(((Number) obj).intValue());
            case 9:
                return a(((Number) obj).intValue());
            case 10:
                return null;
            case 11:
                return a(((Number) obj).intValue());
            case 12:
                return a(((Number) obj).intValue());
            case 13:
                return null;
            case 14:
                zd.n nVar = (zd.n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return zd.n.a(nVar, false, null, false, false, true, false, false, false, null, false, 4063);
            case 15:
                C6783B c6783b = (C6783B) obj;
                AbstractC3557B.c0("$this$setState", c6783b);
                return C6783B.e(c6783b, null, null, null, null, null, null, null, null, null, null, null, 129023);
            default:
                C6807x c6807x = (C6807x) obj;
                AbstractC3557B.c0("$this$update", c6807x);
                return C6807x.a(c6807x, null, kf.w.f37484Y, null, false, null, 5);
        }
    }
}
