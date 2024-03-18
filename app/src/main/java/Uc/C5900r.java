package uc;

import A.X;
import Df.H;
import Qg.F0;
import Qg.s0;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import jf.y;
import kf.w;
import kotlin.jvm.internal.C;
import ld.C4428a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.u0;
import wd.v0;
import x8.W;

/* renamed from: uc.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5900r implements com.openai.experiment.h {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f46665a;

    /* renamed from: b  reason: collision with root package name */
    public final t f46666b;

    /* renamed from: c  reason: collision with root package name */
    public final C5887e f46667c;

    /* renamed from: d  reason: collision with root package name */
    public final C5889g f46668d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f46669e = s0.c(w.f37484Y);

    /* renamed from: f  reason: collision with root package name */
    public final F0 f46670f = s0.c(Boolean.FALSE);

    public C5900r(xd.b bVar, xd.g gVar, C4428a c4428a, t tVar, C5887e c5887e, C5889g c5889g) {
        this.f46665a = c4428a;
        this.f46666b = tVar;
        this.f46667c = c5887e;
        this.f46668d = c5889g;
        Ad.l.O0(c4428a, null, null, new C5896n(bVar, gVar, this, null), 3);
        L4.a.E0(L4.a.I0(new C5897o(this, null), c5889g.f44961e), c4428a);
    }

    public final F0 a() {
        if (((G) this.f46666b).c(ExperimentKey.BadgeBetaFeaturesEnabled.INSTANCE)) {
            return this.f46670f;
        }
        return s0.c(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z10, AbstractC4825e abstractC4825e) {
        C5899q c5899q;
        int i10;
        v0 v0Var;
        C5900r c5900r;
        v0 b10;
        if (abstractC4825e instanceof C5899q) {
            c5899q = (C5899q) abstractC4825e;
            int i11 = c5899q.f46664j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5899q.f46664j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5899q.f46662h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5899q.f46664j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var = (v0) c5899q.f46660Y;
                            N.B0(obj);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = c5899q.f46661Z;
                    c5900r = (C5900r) c5899q.f46660Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c5899q.f46660Y = this;
                    c5899q.f46661Z = z10;
                    c5899q.f46664j0 = 1;
                    C5887e c5887e = this.f46667c;
                    c5887e.getClass();
                    C5886d c5886d = new C5886d(z10, null);
                    Df.w a5 = C.a(y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                    Yc.a aVar = c5887e.f46634a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, c5886d, c5899q);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5900r = this;
                }
                b10 = ((x) obj).b();
                if (!(b10 instanceof u0)) {
                    y yVar = (y) ((u0) b10).f48468a;
                    C5889g c5889g = c5900r.f46668d;
                    X x10 = new X((Object) null, z10, 2);
                    c5899q.f46660Y = b10;
                    c5899q.f46664j0 = 2;
                    if (c5889g.b(x10, c5899q) == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = b10;
                    return v0Var;
                }
                return b10;
            }
        }
        c5899q = new C5899q(this, abstractC4825e);
        Object obj2 = c5899q.f46662h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5899q.f46664j0;
        if (i10 == 0) {
        }
        b10 = ((x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
    }
}
