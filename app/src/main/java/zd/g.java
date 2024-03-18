package zd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.Set;
import kf.x;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class g {
    public static final f Companion = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f51964i;

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f51965a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f51966b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f51967c;

    /* renamed from: d  reason: collision with root package name */
    public final c f51968d;

    /* renamed from: e  reason: collision with root package name */
    public final q f51969e;

    /* renamed from: f  reason: collision with root package name */
    public final String f51970f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f51971g;

    /* renamed from: h  reason: collision with root package name */
    public final Set f51972h;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zd.f] */
    static {
        KSerializer serializer = q.Companion.serializer();
        u0 u0Var = u0.f28491a;
        f51964i = new KSerializer[]{null, null, null, null, serializer, null, new C2695d(u0Var, 2), new C2695d(u0Var, 2)};
    }

    public g(Boolean bool, Boolean bool2, Boolean bool3, c cVar, q qVar, String str, Set set, Set set2) {
        AbstractC3557B.c0("announcements", set);
        AbstractC3557B.c0("eligibleAnnouncements", set2);
        this.f51965a = bool;
        this.f51966b = bool2;
        this.f51967c = bool3;
        this.f51968d = cVar;
        this.f51969e = qVar;
        this.f51970f = str;
        this.f51971g = set;
        this.f51972h = set2;
    }

    public static g a(g gVar, Boolean bool, Boolean bool2, Boolean bool3, q qVar, String str, int i10) {
        if ((i10 & 1) != 0) {
            bool = gVar.f51965a;
        }
        Boolean bool4 = bool;
        if ((i10 & 2) != 0) {
            bool2 = gVar.f51966b;
        }
        Boolean bool5 = bool2;
        if ((i10 & 4) != 0) {
            bool3 = gVar.f51967c;
        }
        Boolean bool6 = bool3;
        c cVar = gVar.f51968d;
        if ((i10 & 16) != 0) {
            qVar = gVar.f51969e;
        }
        q qVar2 = qVar;
        if ((i10 & 32) != 0) {
            str = gVar.f51970f;
        }
        Set set = gVar.f51971g;
        Set set2 = gVar.f51972h;
        gVar.getClass();
        AbstractC3557B.c0("announcements", set);
        AbstractC3557B.c0("eligibleAnnouncements", set2);
        return new g(bool4, bool5, bool6, cVar, qVar2, str, set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f51965a, gVar.f51965a) && AbstractC3557B.K(this.f51966b, gVar.f51966b) && AbstractC3557B.K(this.f51967c, gVar.f51967c) && AbstractC3557B.K(this.f51968d, gVar.f51968d) && this.f51969e == gVar.f51969e && AbstractC3557B.K(this.f51970f, gVar.f51970f) && AbstractC3557B.K(this.f51971g, gVar.f51971g) && AbstractC3557B.K(this.f51972h, gVar.f51972h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        Boolean bool = this.f51965a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i16 = i10 * 31;
        Boolean bool2 = this.f51966b;
        if (bool2 == null) {
            i11 = 0;
        } else {
            i11 = bool2.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        Boolean bool3 = this.f51967c;
        if (bool3 == null) {
            i12 = 0;
        } else {
            i12 = bool3.hashCode();
        }
        int i18 = (i17 + i12) * 31;
        c cVar = this.f51968d;
        if (cVar == null) {
            i13 = 0;
        } else {
            i13 = cVar.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        q qVar = this.f51969e;
        if (qVar == null) {
            i14 = 0;
        } else {
            i14 = qVar.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        String str = this.f51970f;
        if (str != null) {
            i15 = str.hashCode();
        }
        return this.f51972h.hashCode() + ((this.f51971g.hashCode() + ((i20 + i15) * 31)) * 31);
    }

    public final String toString() {
        return "RemoteUserSettings(memory=" + this.f51965a + ", trainingAllowed=" + this.f51966b + ", voiceTrainingAllowed=" + this.f51967c + ", betaSettings=" + this.f51968d + ", voiceName=" + this.f51969e + ", voiceMainLanguage=" + this.f51970f + ", announcements=" + this.f51971g + ", eligibleAnnouncements=" + this.f51972h + Separators.RPAREN;
    }

    public g(int i10, Boolean bool, Boolean bool2, Boolean bool3, c cVar, q qVar, String str, Set set, Set set2) {
        if ((i10 & 1) == 0) {
            this.f51965a = null;
        } else {
            this.f51965a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f51966b = null;
        } else {
            this.f51966b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f51967c = null;
        } else {
            this.f51967c = bool3;
        }
        if ((i10 & 8) == 0) {
            this.f51968d = null;
        } else {
            this.f51968d = cVar;
        }
        if ((i10 & 16) == 0) {
            this.f51969e = null;
        } else {
            this.f51969e = qVar;
        }
        if ((i10 & 32) == 0) {
            this.f51970f = null;
        } else {
            this.f51970f = str;
        }
        int i11 = i10 & 64;
        x xVar = x.f37485Y;
        if (i11 == 0) {
            this.f51971g = xVar;
        } else {
            this.f51971g = set;
        }
        if ((i10 & 128) == 0) {
            this.f51972h = xVar;
        } else {
            this.f51972h = set2;
        }
    }
}
