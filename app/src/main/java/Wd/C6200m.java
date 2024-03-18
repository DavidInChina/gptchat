package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: wd.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6200m {

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f48439c;

    /* renamed from: a  reason: collision with root package name */
    public final Map f48441a;

    /* renamed from: b  reason: collision with root package name */
    public final List f48442b;
    public static final C6199l Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final String f48440d = "default";

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, wd.l] */
    static {
        C6191h c6191h = C6191h.f48420a;
        f48439c = new KSerializer[]{new C2682H(c6191h, C6177a.f48380a, 1), new C2695d(c6191h, 0)};
    }

    public C6200m(int i10, Map map, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C6197k.f48428b);
            throw null;
        }
        this.f48441a = map;
        this.f48442b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6200m)) {
            return false;
        }
        C6200m c6200m = (C6200m) obj;
        if (AbstractC3557B.K(this.f48441a, c6200m.f48441a) && AbstractC3557B.K(this.f48442b, c6200m.f48442b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48442b.hashCode() + (this.f48441a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountStatus(accounts=" + this.f48441a + ", accountOrdering=" + this.f48442b + Separators.RPAREN;
    }

    public C6200m(List list, Map map) {
        AbstractC3557B.c0("accountOrdering", list);
        this.f48441a = map;
        this.f48442b = list;
    }
}
