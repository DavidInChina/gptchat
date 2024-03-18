package m0;

import id.AbstractC3557B;
import java.util.List;
import q0.C5252d;
import wf.k;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final io.sentry.hints.i f38806e = new io.sentry.hints.i(29, 0);

    /* renamed from: f  reason: collision with root package name */
    public static int f38807f;

    /* renamed from: a  reason: collision with root package name */
    public final List f38808a;

    /* renamed from: b  reason: collision with root package name */
    public C5252d f38809b = null;

    /* renamed from: c  reason: collision with root package name */
    public final k f38810c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38811d;

    public h(List list, k kVar) {
        int i10;
        this.f38808a = list;
        this.f38810c = kVar;
        synchronized (f38806e) {
            i10 = f38807f + 1;
            f38807f = i10;
        }
        this.f38811d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f38808a, hVar.f38808a) && AbstractC3557B.K(this.f38809b, hVar.f38809b) && AbstractC3557B.K(this.f38810c, hVar.f38810c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f38808a.hashCode() * 31;
        C5252d c5252d = this.f38809b;
        int i11 = 0;
        if (c5252d != null) {
            i10 = c5252d.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        k kVar = this.f38810c;
        if (kVar != null) {
            i11 = kVar.hashCode();
        }
        return i12 + i11;
    }
}
