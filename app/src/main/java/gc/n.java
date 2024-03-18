package gc;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import H0.C0705t0;
import H0.T0;
import Ng.F;
import T0.B;
import T0.D;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import l0.AbstractC4325q;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f31568Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p0.l f31569Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T0 f31570h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z10, p0.l lVar, T0 t02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31568Y = z10;
        this.f31569Z = lVar;
        this.f31570h0 = t02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new n(this.f31568Y, this.f31569Z, this.f31570h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        r3 = r3.f37720Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (r3.f37732r0 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
        r4 = new b0.C2104h(new l0.AbstractC4325q[16]);
        r6 = r3.f37725k0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r6 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        G0.AbstractC0579h.b(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r4.l() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r3 = (l0.AbstractC4325q) r4.n(r4.f25569h0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        if ((r3.f37723i0 & 1024) != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
        G0.AbstractC0579h.b(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (r3 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
        if ((r3.f37722h0 & 1024) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r3 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
        if ((r3 instanceof p0.q) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
        if (androidx.compose.ui.focus.a.l((p0.q) r3) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
        if ((r3.f37722h0 & 1024) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
        if ((r3 instanceof G0.AbstractC0587p) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
        r9 = ((G0.AbstractC0587p) r3).f5816t0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
        if (r9 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
        if ((r9.f37722h0 & 1024) == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
        if (r10 != 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
        if (r6 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        r6 = new b0.C2104h(new l0.AbstractC4325q[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        r6.b(r3);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e9, code lost:
        r6.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        r9 = r9.f37725k0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        if (r10 != 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r3 = G0.AbstractC0579h.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
        r3 = r3.f37725k0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010a, code lost:
        throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (this.f31568Y) {
            C2104h c2104h = this.f31569Z.f41705a;
            if (c2104h.l()) {
                int i10 = c2104h.f25569h0;
                if (i10 > 0) {
                    Object[] objArr = c2104h.f25567Y;
                    int i11 = 0;
                    loop0: do {
                        AbstractC4325q abstractC4325q = (AbstractC4325q) ((p0.m) objArr[i11]);
                        AbstractC4325q abstractC4325q2 = abstractC4325q.f37720Y;
                        C2104h c2104h2 = null;
                        while (true) {
                            if (abstractC4325q2 == null) {
                                break;
                            }
                            if (abstractC4325q2 instanceof p0.q) {
                                if (androidx.compose.ui.focus.a.l((p0.q) abstractC4325q2)) {
                                    break loop0;
                                }
                            } else if ((abstractC4325q2.f37722h0 & 1024) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i12 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC4325q2 = abstractC4325q3;
                                        } else {
                                            if (c2104h2 == null) {
                                                c2104h2 = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q2 != null) {
                                                c2104h2.b(abstractC4325q2);
                                                abstractC4325q2 = null;
                                            }
                                            c2104h2.b(abstractC4325q3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC4325q2 = AbstractC0579h.f(c2104h2);
                        }
                    } while (i11 < i10);
                }
                T0 t02 = this.f31570h0;
                if (t02 != null) {
                    ((D) ((C0705t0) t02).f7042a.f16730a).a(B.f16735i0);
                }
            } else {
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
            }
        }
        return y.f36177a;
    }
}
