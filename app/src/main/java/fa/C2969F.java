package fa;

import aa.EnumC1942e;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import dh.C2695d;
import ha.AbstractC3376t;
import ha.C3360c;
import ha.C3374q;
import ha.X;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6168C;
import wd.C6172G;
import wd.C6175J;
import wd.C6182c0;
import wd.C6190g0;
import wd.O;
import wd.Y;
import wd.y0;
import yf.AbstractC6583a;

@AbstractC1998i
/* renamed from: fa.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2969F {

    /* renamed from: A  reason: collision with root package name */
    public final String f30006A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f30007B;

    /* renamed from: a  reason: collision with root package name */
    public final String f30008a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30009b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30010c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC2971H f30011d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30012e;

    /* renamed from: f  reason: collision with root package name */
    public final EnumC1942e f30013f;

    /* renamed from: g  reason: collision with root package name */
    public final C3931c f30014g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC2965B f30015h;

    /* renamed from: i  reason: collision with root package name */
    public final Yg.p f30016i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f30017j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f30018k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f30019l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f30020m;

    /* renamed from: n  reason: collision with root package name */
    public final X f30021n;

    /* renamed from: o  reason: collision with root package name */
    public final EnumC2970G f30022o;

    /* renamed from: p  reason: collision with root package name */
    public final String f30023p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f30024q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f30025r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f30026s;

    /* renamed from: t  reason: collision with root package name */
    public final Ba.c f30027t;

    /* renamed from: u  reason: collision with root package name */
    public final String f30028u;

    /* renamed from: v  reason: collision with root package name */
    public final AbstractC3376t f30029v;

    /* renamed from: w  reason: collision with root package name */
    public final List f30030w;

    /* renamed from: x  reason: collision with root package name */
    public final List f30031x;

    /* renamed from: y  reason: collision with root package name */
    public final C3360c f30032y;

    /* renamed from: z  reason: collision with root package name */
    public final String f30033z;
    public static final C2968E Companion = new Object();

    /* renamed from: C  reason: collision with root package name */
    public static final KSerializer[] f30005C = {null, null, null, P4.a.E("com.openai.feature.conversations.domain.message.Role", EnumC2971H.values()), null, P4.a.E("com.openai.feature.conversations.domain.actions.VoiceAction", EnumC1942e.values()), null, AbstractC2965B.Companion.serializer(), null, null, null, null, null, null, P4.a.E("com.openai.feature.conversations.domain.message.Recipient", EnumC2970G.values()), null, null, null, null, null, null, AbstractC3376t.Companion.serializer(), new C2695d(C6175J.f48349a, 0), new C2695d(C6172G.f48335a, 0), null, null, null, null};

    public C2969F(int i10, String str, String str2, String str3, EnumC2971H enumC2971H, String str4, EnumC1942e enumC1942e, C3931c c3931c, AbstractC2965B abstractC2965B, Yg.p pVar, boolean z10, boolean z11, boolean z12, boolean z13, X x10, EnumC2970G enumC2970G, String str5, boolean z14, boolean z15, boolean z16, Ba.c cVar, String str6, AbstractC3376t abstractC3376t, List list, List list2, C3360c c3360c, String str7, String str8, boolean z17) {
        if (1105807 == (i10 & 1105807)) {
            this.f30008a = str;
            this.f30009b = str2;
            this.f30010c = str3;
            this.f30011d = enumC2971H;
            if ((i10 & 16) == 0) {
                this.f30012e = null;
            } else {
                this.f30012e = str4;
            }
            this.f30013f = (i10 & 32) == 0 ? EnumC1942e.f24045h0 : enumC1942e;
            if ((i10 & 64) == 0) {
                this.f30014g = null;
            } else {
                this.f30014g = c3931c;
            }
            this.f30015h = abstractC2965B;
            this.f30016i = pVar;
            this.f30017j = z10;
            this.f30018k = z11;
            this.f30019l = z12;
            this.f30020m = z13;
            if ((i10 & 8192) == 0) {
                this.f30021n = null;
            } else {
                this.f30021n = x10;
            }
            this.f30022o = enumC2970G;
            this.f30023p = str5;
            if ((65536 & i10) == 0) {
                this.f30024q = false;
            } else {
                this.f30024q = z14;
            }
            if ((131072 & i10) == 0) {
                this.f30025r = false;
            } else {
                this.f30025r = z15;
            }
            if ((262144 & i10) == 0) {
                this.f30026s = false;
            } else {
                this.f30026s = z16;
            }
            if ((524288 & i10) == 0) {
                this.f30027t = null;
            } else {
                this.f30027t = cVar;
            }
            this.f30028u = str6;
            if ((2097152 & i10) == 0) {
                this.f30029v = null;
            } else {
                this.f30029v = abstractC3376t;
            }
            int i11 = 4194304 & i10;
            kf.v vVar = kf.v.f37483Y;
            if (i11 == 0) {
                this.f30030w = vVar;
            } else {
                this.f30030w = list;
            }
            if ((8388608 & i10) == 0) {
                this.f30031x = vVar;
            } else {
                this.f30031x = list2;
            }
            if ((16777216 & i10) == 0) {
                this.f30032y = null;
            } else {
                this.f30032y = c3360c;
            }
            if ((33554432 & i10) == 0) {
                this.f30033z = null;
            } else {
                this.f30033z = str7;
            }
            if ((67108864 & i10) == 0) {
                this.f30006A = null;
            } else {
                this.f30006A = str8;
            }
            if ((i10 & 134217728) == 0) {
                this.f30007B = false;
                return;
            } else {
                this.f30007B = z17;
                return;
            }
        }
        R4.b.e2(i10, 1105807, C2967D.f30004b);
        throw null;
    }

    public static C2969F a(C2969F c2969f, String str, Yg.p pVar, boolean z10, boolean z11, boolean z12, String str2, boolean z13, int i10) {
        String str3;
        Yg.p pVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str4;
        boolean z18;
        String str5 = c2969f.f30008a;
        if ((i10 & 2) != 0) {
            str3 = c2969f.f30009b;
        } else {
            str3 = str;
        }
        String str6 = c2969f.f30010c;
        EnumC2971H enumC2971H = c2969f.f30011d;
        String str7 = c2969f.f30012e;
        EnumC1942e enumC1942e = c2969f.f30013f;
        C3931c c3931c = c2969f.f30014g;
        AbstractC2965B abstractC2965B = c2969f.f30015h;
        if ((i10 & 256) != 0) {
            pVar2 = c2969f.f30016i;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 512) != 0) {
            z14 = c2969f.f30017j;
        } else {
            z14 = z10;
        }
        if ((i10 & 1024) != 0) {
            z15 = c2969f.f30018k;
        } else {
            z15 = z11;
        }
        if ((i10 & 2048) != 0) {
            z16 = c2969f.f30019l;
        } else {
            z16 = z12;
        }
        boolean z19 = c2969f.f30020m;
        X x10 = c2969f.f30021n;
        EnumC2970G enumC2970G = c2969f.f30022o;
        if ((i10 & 32768) != 0) {
            z17 = z19;
            str4 = c2969f.f30023p;
        } else {
            z17 = z19;
            str4 = str2;
        }
        boolean z20 = z16;
        boolean z21 = c2969f.f30024q;
        boolean z22 = c2969f.f30025r;
        boolean z23 = c2969f.f30026s;
        Ba.c cVar = c2969f.f30027t;
        String str8 = c2969f.f30028u;
        AbstractC3376t abstractC3376t = c2969f.f30029v;
        List list = c2969f.f30030w;
        boolean z24 = z15;
        List list2 = c2969f.f30031x;
        boolean z25 = z14;
        C3360c c3360c = c2969f.f30032y;
        String str9 = c2969f.f30033z;
        String str10 = c2969f.f30006A;
        if ((i10 & 134217728) != 0) {
            z18 = c2969f.f30007B;
        } else {
            z18 = z13;
        }
        c2969f.getClass();
        AbstractC3557B.c0(ParameterNames.ID, str5);
        AbstractC3557B.c0("groupId", str6);
        AbstractC3557B.c0("role", enumC2971H);
        AbstractC3557B.c0("voiceAction", enumC1942e);
        AbstractC3557B.c0("content", abstractC2965B);
        AbstractC3557B.c0("recipient", enumC2970G);
        AbstractC3557B.c0("model", str4);
        AbstractC3557B.c0("attachments", list);
        AbstractC3557B.c0("dalleOperationAttachment", list2);
        return new C2969F(str5, str3, str6, enumC2971H, str7, enumC1942e, c3931c, abstractC2965B, pVar2, z25, z24, z20, z17, x10, enumC2970G, str4, z21, z22, z23, cVar, str8, abstractC3376t, list, list2, c3360c, str9, str10, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2969F)) {
            return false;
        }
        C2969F c2969f = (C2969F) obj;
        if (!AbstractC3557B.K(this.f30008a, c2969f.f30008a)) {
            return false;
        }
        String str = this.f30009b;
        String str2 = c2969f.f30009b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f30010c, c2969f.f30010c) || this.f30011d != c2969f.f30011d || !AbstractC3557B.K(this.f30012e, c2969f.f30012e) || this.f30013f != c2969f.f30013f || !AbstractC3557B.K(this.f30014g, c2969f.f30014g) || !AbstractC3557B.K(this.f30015h, c2969f.f30015h) || !AbstractC3557B.K(this.f30016i, c2969f.f30016i) || this.f30017j != c2969f.f30017j || this.f30018k != c2969f.f30018k || this.f30019l != c2969f.f30019l || this.f30020m != c2969f.f30020m || !AbstractC3557B.K(this.f30021n, c2969f.f30021n) || this.f30022o != c2969f.f30022o || !AbstractC3557B.K(this.f30023p, c2969f.f30023p) || this.f30024q != c2969f.f30024q || this.f30025r != c2969f.f30025r || this.f30026s != c2969f.f30026s || !AbstractC3557B.K(this.f30027t, c2969f.f30027t)) {
            return false;
        }
        String str3 = this.f30028u;
        String str4 = c2969f.f30028u;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f30029v, c2969f.f30029v) || !AbstractC3557B.K(this.f30030w, c2969f.f30030w) || !AbstractC3557B.K(this.f30031x, c2969f.f30031x) || !AbstractC3557B.K(this.f30032y, c2969f.f30032y)) {
            return false;
        }
        String str5 = this.f30033z;
        String str6 = c2969f.f30033z;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        String str7 = this.f30006A;
        String str8 = c2969f.f30006A;
        if (str7 != null ? !(str8 != null && AbstractC3557B.K(str7, str8)) : str8 != null) {
            return false;
        }
        if (this.f30007B == c2969f.f30007B) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int hashCode = this.f30008a.hashCode() * 31;
        int i27 = 0;
        String str = this.f30009b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = (this.f30011d.hashCode() + E9.f.v(this.f30010c, (hashCode + i10) * 31, 31)) * 31;
        String str2 = this.f30012e;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int hashCode3 = (this.f30013f.hashCode() + ((hashCode2 + i11) * 31)) * 31;
        C3931c c3931c = this.f30014g;
        if (c3931c == null) {
            i12 = 0;
        } else {
            i12 = c3931c.hashCode();
        }
        int hashCode4 = (this.f30015h.hashCode() + ((hashCode3 + i12) * 31)) * 31;
        Yg.p pVar = this.f30016i;
        if (pVar == null) {
            i13 = 0;
        } else {
            i13 = pVar.f22419Y.hashCode();
        }
        int i28 = (hashCode4 + i13) * 31;
        int i29 = 1237;
        if (this.f30017j) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i30 = (i28 + i14) * 31;
        if (this.f30018k) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i31 = (i30 + i15) * 31;
        if (this.f30019l) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i32 = (i31 + i16) * 31;
        if (this.f30020m) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i33 = (i32 + i17) * 31;
        X x10 = this.f30021n;
        if (x10 == null) {
            i18 = 0;
        } else {
            i18 = x10.hashCode();
        }
        int v10 = E9.f.v(this.f30023p, (this.f30022o.hashCode() + ((i33 + i18) * 31)) * 31, 31);
        if (this.f30024q) {
            i19 = 1231;
        } else {
            i19 = 1237;
        }
        int i34 = (v10 + i19) * 31;
        if (this.f30025r) {
            i20 = 1231;
        } else {
            i20 = 1237;
        }
        int i35 = (i34 + i20) * 31;
        if (this.f30026s) {
            i21 = 1231;
        } else {
            i21 = 1237;
        }
        int i36 = (i35 + i21) * 31;
        Ba.c cVar = this.f30027t;
        if (cVar == null) {
            i22 = 0;
        } else {
            i22 = cVar.hashCode();
        }
        int i37 = (i36 + i22) * 31;
        String str3 = this.f30028u;
        if (str3 == null) {
            i23 = 0;
        } else {
            i23 = str3.hashCode();
        }
        int i38 = (i37 + i23) * 31;
        AbstractC3376t abstractC3376t = this.f30029v;
        if (abstractC3376t == null) {
            i24 = 0;
        } else {
            i24 = ((C3374q) abstractC3376t).f32076b.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f30031x, AbstractC4194d.s(this.f30030w, (i38 + i24) * 31, 31), 31);
        C3360c c3360c = this.f30032y;
        if (c3360c == null) {
            i25 = 0;
        } else {
            i25 = c3360c.hashCode();
        }
        int i39 = (s10 + i25) * 31;
        String str4 = this.f30033z;
        if (str4 == null) {
            i26 = 0;
        } else {
            i26 = str4.hashCode();
        }
        int i40 = (i39 + i26) * 31;
        String str5 = this.f30006A;
        if (str5 != null) {
            i27 = str5.hashCode();
        }
        int i41 = (i40 + i27) * 31;
        if (this.f30007B) {
            i29 = 1231;
        }
        return i41 + i29;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String a5 = C6182c0.a(this.f30008a);
        String str4 = "null";
        String str5 = this.f30009b;
        if (str5 == null) {
            str = str4;
        } else {
            str = C6168C.a(str5);
        }
        String a10 = C6182c0.a(this.f30010c);
        String b10 = C6190g0.b(this.f30023p);
        String str6 = this.f30028u;
        if (str6 == null) {
            str2 = str4;
        } else {
            str2 = y0.a(str6);
        }
        String str7 = this.f30033z;
        if (str7 == null) {
            str3 = str4;
        } else {
            str3 = C6182c0.a(str7);
        }
        String str8 = this.f30006A;
        if (str8 != null) {
            str4 = O.a(str8);
        }
        StringBuilder t10 = android.gov.nist.core.a.t("Message(id=", a5, ", conversationId=", str, ", groupId=");
        t10.append(a10);
        t10.append(", role=");
        t10.append(this.f30011d);
        t10.append(", roleName=");
        t10.append(this.f30012e);
        t10.append(", voiceAction=");
        t10.append(this.f30013f);
        t10.append(", contributor=");
        t10.append(this.f30014g);
        t10.append(", content=");
        t10.append(this.f30015h);
        t10.append(", date=");
        t10.append(this.f30016i);
        t10.append(", isComplete=");
        t10.append(this.f30017j);
        t10.append(", isBlocked=");
        t10.append(this.f30018k);
        t10.append(", isFlagged=");
        t10.append(this.f30019l);
        t10.append(", isInterrupted=");
        t10.append(this.f30020m);
        t10.append(", toolMetadata=");
        t10.append(this.f30021n);
        t10.append(", recipient=");
        t10.append(this.f30022o);
        t10.append(", model=");
        t10.append(b10);
        t10.append(", isUserSystemMessage=");
        t10.append(this.f30024q);
        t10.append(", isVisuallyHiddenInConversation=");
        t10.append(this.f30025r);
        t10.append(", excludeAfterNextUserMessage=");
        t10.append(this.f30026s);
        t10.append(", customInstructions=");
        t10.append(this.f30027t);
        t10.append(", originalSharedLinkId=");
        t10.append(str2);
        t10.append(", citations=");
        t10.append(this.f30029v);
        t10.append(", attachments=");
        t10.append(this.f30030w);
        t10.append(", dalleOperationAttachment=");
        t10.append(this.f30031x);
        t10.append(", aggregateResult=");
        t10.append(this.f30032y);
        t10.append(", remoteMessageId=");
        t10.append(str3);
        t10.append(", gizmoId=");
        t10.append(str4);
        t10.append(", isStream=");
        return AbstractC4194d.w(t10, this.f30007B, Separators.RPAREN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2969F(String str, String str2, AbstractC2965B abstractC2965B, String str3, EnumC2971H enumC2971H, EnumC2970G enumC2970G, boolean z10, List list, List list2, String str4, X x10, boolean z11, String str5, int i10) {
        this(str, str2, str, r6, r7, null, null, abstractC2965B, null, r12, false, false, r16, r1, str3, false, false, r20, null, null, null, r15, r10, null, null, r28, 187367520);
        EnumC2971H enumC2971H2 = (i10 & 16) != 0 ? EnumC2971H.f30046Y : enumC2971H;
        EnumC2970G enumC2970G2 = (i10 & 32) != 0 ? EnumC2970G.f30034Y : enumC2970G;
        boolean z12 = (i10 & 64) != 0 ? true : z10;
        int i11 = i10 & 128;
        kf.v vVar = kf.v.f37483Y;
        kf.v vVar2 = i11 != 0 ? vVar : list;
        kf.v vVar3 = (i10 & 256) != 0 ? vVar : list2;
        String str6 = (i10 & 512) != 0 ? null : str4;
        X x11 = (i10 & 1024) != 0 ? null : x10;
        boolean z13 = (i10 & 2048) != 0 ? false : z11;
        String str7 = (i10 & 4096) != 0 ? null : str5;
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("model", str3);
        AbstractC3557B.c0("role", enumC2971H2);
        AbstractC3557B.c0("recipient", enumC2970G2);
        AbstractC3557B.c0("attachments", vVar2);
        AbstractC3557B.c0("dalleOperationAttachment", vVar3);
    }

    public /* synthetic */ C2969F(String str, String str2, String str3, EnumC2971H enumC2971H, String str4, EnumC1942e enumC1942e, C3931c c3931c, AbstractC2965B abstractC2965B, Yg.p pVar, boolean z10, boolean z11, boolean z12, X x10, EnumC2970G enumC2970G, String str5, boolean z13, boolean z14, boolean z15, Ba.c cVar, String str6, C3374q c3374q, List list, List list2, C3360c c3360c, String str7, String str8, int i10) {
        this(str, str2, str3, enumC2971H, str4, (i10 & 32) != 0 ? EnumC1942e.f24045h0 : enumC1942e, (i10 & 64) != 0 ? null : c3931c, abstractC2965B, pVar, z10, false, z11, z12, x10, enumC2970G, str5, (i10 & 65536) != 0 ? false : z13, (i10 & 131072) != 0 ? false : z14, z15, (i10 & 524288) != 0 ? null : cVar, str6, (i10 & 2097152) != 0 ? null : c3374q, list, (i10 & 8388608) != 0 ? kf.v.f37483Y : list2, (i10 & 16777216) != 0 ? null : c3360c, (i10 & 33554432) != 0 ? null : str7, str8, false);
    }

    public C2969F(String str, String str2, String str3, EnumC2971H enumC2971H, String str4, EnumC1942e enumC1942e, C3931c c3931c, AbstractC2965B abstractC2965B, Yg.p pVar, boolean z10, boolean z11, boolean z12, boolean z13, X x10, EnumC2970G enumC2970G, String str5, boolean z14, boolean z15, boolean z16, Ba.c cVar, String str6, AbstractC3376t abstractC3376t, List list, List list2, C3360c c3360c, String str7, String str8, boolean z17) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("groupId", str3);
        AbstractC3557B.c0("voiceAction", enumC1942e);
        AbstractC3557B.c0("content", abstractC2965B);
        AbstractC3557B.c0("model", str5);
        AbstractC3557B.c0("attachments", list);
        AbstractC3557B.c0("dalleOperationAttachment", list2);
        this.f30008a = str;
        this.f30009b = str2;
        this.f30010c = str3;
        this.f30011d = enumC2971H;
        this.f30012e = str4;
        this.f30013f = enumC1942e;
        this.f30014g = c3931c;
        this.f30015h = abstractC2965B;
        this.f30016i = pVar;
        this.f30017j = z10;
        this.f30018k = z11;
        this.f30019l = z12;
        this.f30020m = z13;
        this.f30021n = x10;
        this.f30022o = enumC2970G;
        this.f30023p = str5;
        this.f30024q = z14;
        this.f30025r = z15;
        this.f30026s = z16;
        this.f30027t = cVar;
        this.f30028u = str6;
        this.f30029v = abstractC3376t;
        this.f30030w = list;
        this.f30031x = list2;
        this.f30032y = c3360c;
        this.f30033z = str7;
        this.f30006A = str8;
        this.f30007B = z17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2969F(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, EnumC2971H enumC2971H, String str5, boolean z10, int i10) {
        this(str, str2, r1, str4, r10, null, r12, r13, r14, null, r3 != null ? new X(null, null, r3, 63) : null, r17, r3, 544);
        AbstractC2965B qVar;
        int i11 = i10 & 16;
        List list = kf.v.f37483Y;
        List<Y> list2 = i11 != 0 ? list : arrayList;
        List list3 = (i10 & 32) != 0 ? list : arrayList2;
        List list4 = (i10 & 64) != 0 ? list : arrayList3;
        EnumC2971H enumC2971H2 = (i10 & 128) != 0 ? EnumC2971H.f30046Y : enumC2971H;
        boolean z11 = (i10 & 256) != 0;
        String str6 = (i10 & 512) != 0 ? null : str5;
        boolean z12 = (i10 & 1024) != 0 ? false : z10;
        AbstractC3557B.c0(ParameterNames.TEXT, str3);
        AbstractC3557B.c0("model", str4);
        AbstractC3557B.c0("images", list2);
        AbstractC3557B.c0("dalleOperationAttachment", list3);
        AbstractC3557B.c0("attachments", list4);
        AbstractC3557B.c0("role", enumC2971H2);
        if (list2.isEmpty()) {
            qVar = new t(str3);
        } else {
            ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Y y10 : list2) {
                arrayList4.add(new C2976e(y10));
            }
            qVar = new q(kf.t.x2(new t(str3), arrayList4));
        }
    }
}
