package Ii;

import Cd.L;
import Cd.M;
import Cd.N;
import Cd.U;
import K4.C0813a;
import he.C3418c;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.Set;
import me.T;
import nf.AbstractC4825e;
import nh.AbstractC4854d;
import of.EnumC5000a;
import r0.C5341e;
import t5.AbstractC5675a;
import t5.AbstractC5676b;
import te.C5763g;
import ve.C6033b;
import z.AbstractC6656C0;
import z.AbstractC6726u;

/* loaded from: classes2.dex */
public final class q implements I, AbstractC5675a, AbstractC4854d, AbstractC6656C0 {

    /* renamed from: Y  reason: collision with root package name */
    public final int f8680Y;

    public /* synthetic */ q(int i10) {
        this.f8680Y = i10;
    }

    public static boolean l(U3.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        if (!AbstractC3557B.K(fVar, U.f3023g) && !AbstractC3557B.K(fVar, N.f3018g) && !AbstractC3557B.K(fVar, M.f3017g) && !AbstractC3557B.K(fVar, L.f3016g)) {
            return true;
        }
        return false;
    }

    @Override // z.AbstractC6654B0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // nh.AbstractC4854d
    public Object b(C5341e c5341e) {
        return new kh.f(this.f8680Y, c5341e);
    }

    @Override // z.AbstractC6654B0
    public AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        if (j6 < this.f8680Y * 1000000) {
            return abstractC6726u;
        }
        return abstractC6726u2;
    }

    @Override // t5.AbstractC5675a
    public boolean e(AbstractC5676b abstractC5676b, Object obj) {
        switch (this.f8680Y) {
            case 0:
                AbstractC3557B.c0("writer", abstractC5676b);
                AbstractC3557B.c0("element", (c6.j) obj);
                return false;
            default:
                AbstractC3557B.c0("writer", abstractC5676b);
                return false;
        }
    }

    @Override // z.AbstractC6654B0
    public long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return g() * 1000000;
    }

    @Override // z.AbstractC6656C0
    public int g() {
        return this.f8680Y;
    }

    @Override // z.AbstractC6656C0
    public int i() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: a | IllegalArgumentException -> 0x006b, TryCatch #0 {a | IllegalArgumentException -> 0x006b, blocks: (B:12:0x0027, B:16:0x0036, B:20:0x005b, B:22:0x0063, B:23:0x006a), top: B:25:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: a | IllegalArgumentException -> 0x006b, TryCatch #0 {a | IllegalArgumentException -> 0x006b, blocks: (B:12:0x0027, B:16:0x0036, B:20:0x005b, B:22:0x0063, B:23:0x006a), top: B:25:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable j(T t10, AbstractC4825e abstractC4825e) {
        Wc.i iVar;
        Object obj;
        int i10;
        try {
            if (abstractC4825e instanceof Wc.i) {
                iVar = (Wc.i) abstractC4825e;
                int i11 = iVar.f20909i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    iVar.f20909i0 = i11 - Integer.MIN_VALUE;
                    obj = iVar.f20907Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = iVar.f20909i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            t10 = iVar.f20906Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        C3418c b10 = t10.f39189Y.b();
                        Df.w a5 = kotlin.jvm.internal.C.a(Wc.l.class);
                        Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(Wc.l.class), a5);
                        iVar.f20906Y = t10;
                        iVar.f20909i0 = 1;
                        obj = b10.a(n22, iVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    if (obj == null) {
                        return new Wc.p(t10, (Wc.l) obj);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.openai.network.cloudflare.CloudflareGeoIpError.Detail");
                }
            }
            if (i10 == 0) {
            }
            if (obj == null) {
            }
        } catch (Ce.a | IllegalArgumentException unused) {
            return null;
        }
        iVar = new Wc.i(this, abstractC4825e);
        obj = iVar.f20907Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f20909i0;
    }

    public C0813a k() {
        switch (this.f8680Y) {
            case 27:
                return C5763g.f46141h;
            default:
                return C6033b.f47488h;
        }
    }

    public ge.d m(ge.d dVar, Set set, Set set2) {
        switch (this.f8680Y) {
            case 4:
                return dVar.a(new Zc.a(set, set2, 0));
            default:
                return dVar.a(new Zc.a(set2, set, 1));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        this(0);
        this.f8680Y = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
            case 5:
            case 23:
            default:
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
        }
    }

    @Override // z.AbstractC6654B0
    public AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return abstractC6726u3;
    }

    @Override // z.AbstractC6654B0
    public AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return abstractC6726u3;
    }
}
