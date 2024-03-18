package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2362c0 {
    public static final C2360b0 Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f26509c;

    /* renamed from: a  reason: collision with root package name */
    public final List f26510a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26511b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, cb.b0] */
    static {
        C2357a c2357a = C2357a.f26503a;
        f26509c = new KSerializer[]{new C2695d(c2357a, 0), new C2695d(c2357a, 0)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kf.v, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2362c0(ArrayList arrayList, int i10) {
        this(r3 != 0 ? r0 : arrayList, (List) r0);
        int i11 = i10 & 1;
        ?? r02 = kf.v.f37483Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static C2362c0 a(C2362c0 c2362c0, List list, ArrayList arrayList, int i10) {
        if ((i10 & 1) != 0) {
            list = c2362c0.f26510a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 2) != 0) {
            arrayList2 = c2362c0.f26511b;
        }
        c2362c0.getClass();
        AbstractC3557B.c0("bootstrap", list);
        AbstractC3557B.c0("fetched", arrayList2);
        return new C2362c0(list, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2362c0)) {
            return false;
        }
        C2362c0 c2362c0 = (C2362c0) obj;
        if (AbstractC3557B.K(this.f26510a, c2362c0.f26510a) && AbstractC3557B.K(this.f26511b, c2362c0.f26511b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26511b.hashCode() + (this.f26510a.hashCode() * 31);
    }

    public final String toString() {
        return "Gizmos(bootstrap=" + this.f26510a + ", fetched=" + this.f26511b + Separators.RPAREN;
    }

    public C2362c0(List list, List list2) {
        AbstractC3557B.c0("bootstrap", list);
        AbstractC3557B.c0("fetched", list2);
        this.f26510a = list;
        this.f26511b = list2;
    }

    public C2362c0(int i10, List list, List list2) {
        int i11 = i10 & 1;
        kf.v vVar = kf.v.f37483Y;
        if (i11 == 0) {
            this.f26510a = vVar;
        } else {
            this.f26510a = list;
        }
        if ((i10 & 2) == 0) {
            this.f26511b = vVar;
        } else {
            this.f26511b = list2;
        }
    }
}
