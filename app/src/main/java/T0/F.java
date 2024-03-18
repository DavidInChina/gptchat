package T0;

import android.view.inputmethod.InputMethodManager;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final A f16754a;

    /* renamed from: b  reason: collision with root package name */
    public final u f16755b;

    public F(A a5, u uVar) {
        this.f16754a = a5;
        this.f16755b = uVar;
    }

    public final void a(z zVar, z zVar2) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (AbstractC3557B.K((F) this.f16754a.f16731b.get(), this)) {
            D d10 = (D) this.f16755b;
            long j6 = d10.f16744g.f16831b;
            long j10 = zVar2.f16831b;
            boolean a5 = N0.D.a(j6, j10);
            N0.D d11 = zVar2.f16832c;
            if (a5 && AbstractC3557B.K(d10.f16744g.f16832c, d11)) {
                z10 = false;
            } else {
                z10 = true;
            }
            d10.f16744g = zVar2;
            ArrayList arrayList = d10.f16746i;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                v vVar = (v) ((WeakReference) arrayList.get(i13)).get();
                if (vVar != null) {
                    vVar.f16819d = zVar2;
                }
            }
            C1410e c1410e = d10.f16749l;
            c1410e.f16776i = null;
            c1410e.f16778k = null;
            c1410e.f16777j = null;
            c1410e.f16779l = C1409d.f16761Z;
            c1410e.f16780m = null;
            c1410e.f16781n = null;
            boolean K10 = AbstractC3557B.K(zVar, zVar2);
            p pVar = d10.f16739b;
            int i14 = -1;
            if (K10) {
                if (z10) {
                    int e10 = N0.D.e(j10);
                    int d12 = N0.D.d(j10);
                    N0.D d13 = d10.f16744g.f16832c;
                    if (d13 != null) {
                        i12 = N0.D.e(d13.f12485a);
                    } else {
                        i12 = -1;
                    }
                    N0.D d14 = d10.f16744g.f16832c;
                    if (d14 != null) {
                        i14 = N0.D.d(d14.f12485a);
                    }
                    q qVar = (q) pVar;
                    ((InputMethodManager) qVar.f16809b.getValue()).updateSelection(qVar.f16808a, e10, d12, i12, i14);
                }
            } else if (zVar != null && (!AbstractC3557B.K(zVar.f16830a.f12512Y, zVar2.f16830a.f12512Y) || (N0.D.a(zVar.f16831b, j10) && !AbstractC3557B.K(zVar.f16832c, d11)))) {
                q qVar2 = (q) pVar;
                ((InputMethodManager) qVar2.f16809b.getValue()).restartInput(qVar2.f16808a);
            } else {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    v vVar2 = (v) ((WeakReference) arrayList.get(i15)).get();
                    if (vVar2 != null) {
                        z zVar3 = d10.f16744g;
                        if (vVar2.f16823h) {
                            vVar2.f16819d = zVar3;
                            if (vVar2.f16821f) {
                                q qVar3 = (q) pVar;
                                ((InputMethodManager) qVar3.f16809b.getValue()).updateExtractedText(qVar3.f16808a, vVar2.f16820e, Ng.H.y(zVar3));
                            }
                            N0.D d15 = zVar3.f16832c;
                            if (d15 != null) {
                                i10 = N0.D.e(d15.f12485a);
                            } else {
                                i10 = -1;
                            }
                            N0.D d16 = zVar3.f16832c;
                            if (d16 != null) {
                                i11 = N0.D.d(d16.f12485a);
                            } else {
                                i11 = -1;
                            }
                            long j11 = zVar3.f16831b;
                            q qVar4 = (q) pVar;
                            ((InputMethodManager) qVar4.f16809b.getValue()).updateSelection(qVar4.f16808a, N0.D.e(j11), N0.D.d(j11), i10, i11);
                        }
                    }
                }
            }
        }
    }
}
