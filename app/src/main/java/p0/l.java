package p0;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import b0.C2104h;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final l f41703b = new l();

    /* renamed from: c  reason: collision with root package name */
    public static final l f41704c = new l();

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f41705a = new C2104h(new m[16]);

    /* JADX WARN: Code restructure failed: missing block: B:76:0x003b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z10;
        if (this != f41703b) {
            if (this != f41704c) {
                C2104h c2104h = this.f41705a;
                if (c2104h.l()) {
                    int i10 = c2104h.f25569h0;
                    if (i10 <= 0) {
                        return false;
                    }
                    Object[] objArr = c2104h.f25567Y;
                    int i11 = 0;
                    boolean z11 = false;
                    do {
                        AbstractC4325q abstractC4325q = ((AbstractC4325q) ((m) objArr[i11])).f37720Y;
                        if (abstractC4325q.f37732r0) {
                            C2104h c2104h2 = new C2104h(new AbstractC4325q[16]);
                            AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
                            if (abstractC4325q2 == null) {
                                AbstractC0579h.b(c2104h2, abstractC4325q);
                            } else {
                                c2104h2.b(abstractC4325q2);
                            }
                            while (true) {
                                if (!c2104h2.l()) {
                                    break;
                                }
                                AbstractC4325q abstractC4325q3 = (AbstractC4325q) c2104h2.n(c2104h2.f25569h0 - 1);
                                if ((abstractC4325q3.f37723i0 & 1024) == 0) {
                                    AbstractC0579h.b(c2104h2, abstractC4325q3);
                                } else {
                                    while (true) {
                                        if (abstractC4325q3 == null) {
                                            break;
                                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0) {
                                            C2104h c2104h3 = null;
                                            while (abstractC4325q3 != null) {
                                                if (abstractC4325q3 instanceof q) {
                                                    q qVar = (q) abstractC4325q3;
                                                    if (qVar.A0().f41692a) {
                                                        z10 = androidx.compose.ui.focus.a.D(qVar);
                                                    } else {
                                                        z10 = androidx.compose.ui.focus.a.h(qVar, 7, h.f41689i0);
                                                    }
                                                    if (z10) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                                    int i12 = 0;
                                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                        if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                abstractC4325q3 = abstractC4325q4;
                                                            } else {
                                                                if (c2104h3 == null) {
                                                                    c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                                }
                                                                if (abstractC4325q3 != null) {
                                                                    c2104h3.b(abstractC4325q3);
                                                                    abstractC4325q3 = null;
                                                                }
                                                                c2104h3.b(abstractC4325q4);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                abstractC4325q3 = AbstractC0579h.f(c2104h3);
                                            }
                                            continue;
                                        } else {
                                            abstractC4325q3 = abstractC4325q3.f37725k0;
                                        }
                                    }
                                }
                            }
                            i11++;
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    } while (i11 < i10);
                    return z11;
                }
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    }
}
