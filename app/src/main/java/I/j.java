package I;

import B.J;
import B.K;
import B.O;
import B.S;
import E0.AbstractC0461u;
import Ng.C1072l;
import Ng.F;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5252d;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7927Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f7928Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0461u f7929h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7930i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, AbstractC0461u abstractC0461u, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7928Z = mVar;
        this.f7929h0 = abstractC0461u;
        this.f7930i0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new j(this.f7928Z, this.f7929h0, this.f7930i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r13 == r1) goto L40;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7927Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            m mVar = this.f7928Z;
            h hVar = mVar.f7939u0;
            i iVar = new i(mVar, this.f7929h0, this.f7930i0);
            this.f7927Y = 1;
            S s10 = (S) hVar;
            s10.getClass();
            C5252d c5252d = (C5252d) iVar.mo122invoke();
            if (c5252d != null && !s10.C0(s10.f1163B0, c5252d)) {
                C1072l c1072l = new C1072l(1, AbstractC5260f.z(this));
                c1072l.u();
                O o10 = new O(iVar, c1072l);
                K k10 = s10.f1170w0;
                k10.getClass();
                C5252d c5252d2 = (C5252d) iVar.mo122invoke();
                if (c5252d2 == null) {
                    c1072l.resumeWith(yVar);
                } else {
                    c1072l.w(new J(k10, 0, o10));
                    C2104h c2104h = k10.f1120a;
                    int i11 = new Cf.e(0, c2104h.f25569h0 - 1, 1).f3107Z;
                    if (i11 >= 0) {
                        while (true) {
                            C5252d c5252d3 = (C5252d) ((O) c2104h.f25567Y[i11]).f1142a.mo122invoke();
                            if (c5252d3 != null) {
                                C5252d g10 = c5252d2.g(c5252d3);
                                if (AbstractC3557B.K(g10, c5252d2)) {
                                    c2104h.a(i11 + 1, o10);
                                    break;
                                } else if (!AbstractC3557B.K(g10, c5252d3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i12 = c2104h.f25569h0 - 1;
                                    if (i12 <= i11) {
                                        while (true) {
                                            ((O) c2104h.f25567Y[i11]).f1143b.s(cancellationException);
                                            if (i12 == i11) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            }
                            if (i11 == 0) {
                                break;
                            }
                            i11--;
                        }
                    }
                    c2104h.a(0, o10);
                    if (!s10.f1164C0) {
                        s10.D0();
                    }
                }
                obj2 = c1072l.t();
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                if (obj2 == enumC5000a2) {
                    N.k0(this);
                }
            }
            obj2 = yVar;
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
