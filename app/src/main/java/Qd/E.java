package Qd;

import com.segment.analytics.kotlin.core.Settings;
import id.AbstractC3557B;
import java.util.Set;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class E implements Li.b {
    public static final com.segment.analytics.kotlin.core.d Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final k f14575a;

    /* renamed from: b  reason: collision with root package name */
    public final Settings f14576b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14577c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f14578d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14579e;

    public E(k kVar, Settings settings, boolean z10, Set set, boolean z11) {
        AbstractC3557B.c0("configuration", kVar);
        AbstractC3557B.c0("initializedPlugins", set);
        this.f14575a = kVar;
        this.f14576b = settings;
        this.f14577c = z10;
        this.f14578d = set;
        this.f14579e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (AbstractC3557B.K(this.f14575a, e10.f14575a) && AbstractC3557B.K(this.f14576b, e10.f14576b) && this.f14577c == e10.f14577c && AbstractC3557B.K(this.f14578d, e10.f14578d) && this.f14579e == e10.f14579e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14575a.hashCode() * 31;
        Settings settings = this.f14576b;
        if (settings == null) {
            i10 = 0;
        } else {
            i10 = settings.hashCode();
        }
        int i11 = (hashCode + i10) * 31;
        int i12 = 1;
        boolean z10 = this.f14577c;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int hashCode2 = (this.f14578d.hashCode() + ((i11 + i13) * 31)) * 31;
        boolean z11 = this.f14579e;
        if (!z11) {
            i12 = z11 ? 1 : 0;
        }
        return hashCode2 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("System(configuration=");
        sb2.append(this.f14575a);
        sb2.append(", settings=");
        sb2.append(this.f14576b);
        sb2.append(", running=");
        sb2.append(this.f14577c);
        sb2.append(", initializedPlugins=");
        sb2.append(this.f14578d);
        sb2.append(", enabled=");
        return AbstractC6463a.l(sb2, this.f14579e, ')');
    }
}
