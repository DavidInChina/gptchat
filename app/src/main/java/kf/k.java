package Kf;

import id.AbstractC3557B;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final C4291c f9805a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9806b;

    public k(C4291c c4291c, String str) {
        AbstractC3557B.c0("packageFqName", c4291c);
        this.f9805a = c4291c;
        this.f9806b = str;
    }

    public final C4294f a(int i10) {
        return C4294f.e(this.f9806b + i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9805a);
        sb2.append('.');
        return android.gov.nist.core.a.n(sb2, this.f9806b, 'N');
    }
}
