package a7;

import K4.J;
import Z.I;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import nf.AbstractC4828h;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class d implements AbstractC1932a {

    /* renamed from: a  reason: collision with root package name */
    public final List f23905a;

    /* renamed from: b  reason: collision with root package name */
    public final List f23906b;

    /* renamed from: c  reason: collision with root package name */
    public final I f23907c = AbstractC4828h.E(new C1934c(this, 1));

    /* renamed from: d  reason: collision with root package name */
    public final I f23908d = AbstractC4828h.E(new C1934c(this, 0));

    /* renamed from: e  reason: collision with root package name */
    public final I f23909e = AbstractC4828h.E(new C1934c(this, 2));

    /* renamed from: f  reason: collision with root package name */
    public J f23910f;

    public d(List list) {
        this.f23905a = list;
        this.f23906b = list;
    }

    public final void a() {
        y yVar;
        J j6 = this.f23910f;
        if (j6 != null) {
            List<h> list = this.f23906b;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (h hVar : list) {
                arrayList.add(((g) hVar).f23916a);
            }
            j6.K(arrayList.toArray(new String[0]));
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return;
        }
        throw new IllegalStateException("ActivityResultLauncher cannot be null");
    }
}
