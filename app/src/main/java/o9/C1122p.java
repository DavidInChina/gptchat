package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: O9.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122p {
    public static final C1120o Companion = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer[] f13570j = {null, null, null, null, null, B.Companion.serializer(), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final String f13571a;

    /* renamed from: b  reason: collision with root package name */
    public final C1127s f13572b;

    /* renamed from: c  reason: collision with root package name */
    public final E f13573c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC1102f f13574d;

    /* renamed from: e  reason: collision with root package name */
    public final Yg.p f13575e;

    /* renamed from: f  reason: collision with root package name */
    public final B f13576f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f13577g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13578h;

    /* renamed from: i  reason: collision with root package name */
    public final C1139y f13579i;

    public C1122p(int i10, String str, C1127s c1127s, E e10, AbstractC1102f abstractC1102f, Yg.p pVar, B b10, Boolean bool, String str2, C1139y c1139y) {
        if (11 != (i10 & 11)) {
            R4.b.e2(i10, 11, C1118n.f13563b);
            throw null;
        }
        this.f13571a = str;
        this.f13572b = c1127s;
        if ((i10 & 4) == 0) {
            this.f13573c = null;
        } else {
            this.f13573c = e10;
        }
        this.f13574d = abstractC1102f;
        if ((i10 & 16) == 0) {
            this.f13575e = null;
        } else {
            this.f13575e = pVar;
        }
        if ((i10 & 32) == 0) {
            this.f13576f = B.f13443h0;
        } else {
            this.f13576f = b10;
        }
        if ((i10 & 64) == 0) {
            this.f13577g = null;
        } else {
            this.f13577g = bool;
        }
        if ((i10 & 128) == 0) {
            this.f13578h = null;
        } else {
            this.f13578h = str2;
        }
        if ((i10 & 256) == 0) {
            this.f13579i = new C1139y(null, null, null, null, 262143);
        } else {
            this.f13579i = c1139y;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122p)) {
            return false;
        }
        C1122p c1122p = (C1122p) obj;
        if (AbstractC3557B.K(this.f13571a, c1122p.f13571a) && AbstractC3557B.K(this.f13572b, c1122p.f13572b) && AbstractC3557B.K(this.f13573c, c1122p.f13573c) && AbstractC3557B.K(this.f13574d, c1122p.f13574d) && AbstractC3557B.K(this.f13575e, c1122p.f13575e) && this.f13576f == c1122p.f13576f && AbstractC3557B.K(this.f13577g, c1122p.f13577g) && AbstractC3557B.K(this.f13578h, c1122p.f13578h) && AbstractC3557B.K(this.f13579i, c1122p.f13579i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = (this.f13572b.hashCode() + (this.f13571a.hashCode() * 31)) * 31;
        int i14 = 0;
        E e10 = this.f13573c;
        if (e10 == null) {
            i10 = 0;
        } else {
            i10 = e10.f13452a.hashCode();
        }
        int hashCode2 = (this.f13574d.hashCode() + ((hashCode + i10) * 31)) * 31;
        Yg.p pVar = this.f13575e;
        if (pVar == null) {
            i11 = 0;
        } else {
            i11 = pVar.f22419Y.hashCode();
        }
        int hashCode3 = (this.f13576f.hashCode() + ((hashCode2 + i11) * 31)) * 31;
        Boolean bool = this.f13577g;
        if (bool == null) {
            i12 = 0;
        } else {
            i12 = bool.hashCode();
        }
        int i15 = (hashCode3 + i12) * 31;
        String str = this.f13578h;
        if (str == null) {
            i13 = 0;
        } else {
            i13 = str.hashCode();
        }
        int i16 = (i15 + i13) * 31;
        C1139y c1139y = this.f13579i;
        if (c1139y != null) {
            i14 = c1139y.hashCode();
        }
        return i16 + i14;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ApiConversationMessage(id=", C6182c0.a(this.f13571a), ", author=");
        s10.append(this.f13572b);
        s10.append(", user=");
        s10.append(this.f13573c);
        s10.append(", content=");
        s10.append(this.f13574d);
        s10.append(", createTime=");
        s10.append(this.f13575e);
        s10.append(", status=");
        s10.append(this.f13576f);
        s10.append(", endTurn=");
        s10.append(this.f13577g);
        s10.append(", recipient=");
        s10.append(this.f13578h);
        s10.append(", metadata=");
        s10.append(this.f13579i);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public C1122p(String str, C1127s c1127s, AbstractC1102f abstractC1102f, Yg.p pVar, C1139y c1139y) {
        B b10 = B.f13443h0;
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("content", abstractC1102f);
        this.f13571a = str;
        this.f13572b = c1127s;
        this.f13573c = null;
        this.f13574d = abstractC1102f;
        this.f13575e = pVar;
        this.f13576f = b10;
        this.f13577g = null;
        this.f13578h = null;
        this.f13579i = c1139y;
    }
}
