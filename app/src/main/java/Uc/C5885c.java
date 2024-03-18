package uc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import com.openai.experiment.AbstractC2559g;
import com.openai.experiment.C2558f;
import dh.C2682H;
import dh.C2695d;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kf.v;
import kf.w;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: uc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5885c {
    public static final C5884b Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f46629c;

    /* renamed from: a  reason: collision with root package name */
    public final Map f46630a;

    /* renamed from: b  reason: collision with root package name */
    public final List f46631b;

    /* JADX WARN: Type inference failed for: r2v0, types: [uc.b, java.lang.Object] */
    static {
        C2558f c2558f = AbstractC2559g.Companion;
        f46629c = new KSerializer[]{new C2682H(c2558f.serializer(), C2701g.f28450a, 1), new C2695d(c2558f.serializer(), 0)};
    }

    public C5885c(List list, Map map) {
        AbstractC3557B.c0("features", map);
        AbstractC3557B.c0("exposedFeatures", list);
        this.f46630a = map;
        this.f46631b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static C5885c a(C5885c c5885c, Map map, ArrayList arrayList, int i10) {
        if ((i10 & 1) != 0) {
            map = c5885c.f46630a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 2) != 0) {
            arrayList2 = c5885c.f46631b;
        }
        c5885c.getClass();
        AbstractC3557B.c0("features", map);
        AbstractC3557B.c0("exposedFeatures", arrayList2);
        return new C5885c(arrayList2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5885c)) {
            return false;
        }
        C5885c c5885c = (C5885c) obj;
        if (AbstractC3557B.K(this.f46630a, c5885c.f46630a) && AbstractC3557B.K(this.f46631b, c5885c.f46631b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46631b.hashCode() + (this.f46630a.hashCode() * 31);
    }

    public final String toString() {
        return "BetaFeatures(features=" + this.f46630a + ", exposedFeatures=" + this.f46631b + Separators.RPAREN;
    }

    public C5885c(int i10, Map map, List list) {
        this.f46630a = (i10 & 1) == 0 ? w.f37484Y : map;
        if ((i10 & 2) == 0) {
            this.f46631b = v.f37483Y;
        } else {
            this.f46631b = list;
        }
    }
}
