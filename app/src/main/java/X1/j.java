package X1;

import android.gov.nist.core.Separators;
import cg.C2417h;
import java.util.ArrayList;
import kf.t;

/* loaded from: classes2.dex */
public abstract class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public int f21749a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21750b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f21751c;

    public j(int i10, int i11) {
        this.f21749a = (i11 & 1) != 0 ? Integer.MAX_VALUE : i10;
        this.f21750b = false;
        this.f21751c = new ArrayList();
    }

    public final String d() {
        return Kg.m.l1(Kg.m.n1(Lg.n.q2(t.m2(this.f21751c, ",\n", null, null, null, 62)), new C2417h("  ", 5)), Separators.RETURN);
    }
}
