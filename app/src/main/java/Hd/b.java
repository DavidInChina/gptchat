package Hd;

import Ad.s;
import Dd.N;
import Kd.m;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f7610a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7611b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7612c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7613d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7614e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7615f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7616g;

    /* renamed from: h  reason: collision with root package name */
    public final m f7617h;

    /* renamed from: i  reason: collision with root package name */
    public final N f7618i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7619j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7620k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7621l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7622m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7623n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7624o;

    /* renamed from: p  reason: collision with root package name */
    public final String f7625p;

    /* renamed from: q  reason: collision with root package name */
    public final String f7626q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7627r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7628s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f7629t;

    /* renamed from: u  reason: collision with root package name */
    public final List f7630u;

    /* renamed from: v  reason: collision with root package name */
    public final List f7631v;

    /* renamed from: w  reason: collision with root package name */
    public final Ed.c f7632w;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, m mVar, N n10, long j6, long j10, int i10, int i11, String str8, String str9, String str10, String str11, String str12, String str13, boolean z10, List list, List list2, Ed.c cVar) {
        AbstractC3557B.c0("roomID", str);
        AbstractC3557B.c0("conversationId", str2);
        AbstractC3557B.c0("sessionID", str3);
        AbstractC3557B.c0("parentMessageId", str4);
        AbstractC3557B.c0("modelSlug", str5);
        AbstractC3557B.c0("languageCode", str6);
        AbstractC3557B.c0("gizmoId", str7);
        AbstractC3557B.c0("connectionState", mVar);
        AbstractC3557B.c0("remoteState", n10);
        AbstractC3557B.c0("connectionQuality", str8);
        AbstractC3557B.c0("localParticipant", str9);
        AbstractC3557B.c0("remoteParticipant", str10);
        AbstractC3557B.c0("useApiStaging", str11);
        AbstractC3557B.c0("useAuth0Staging", str12);
        AbstractC3557B.c0("voiceApiHost", str13);
        AbstractC3557B.c0("receivedMessages", list);
        AbstractC3557B.c0("sentMessages", list2);
        this.f7610a = str;
        this.f7611b = str2;
        this.f7612c = str3;
        this.f7613d = str4;
        this.f7614e = str5;
        this.f7615f = str6;
        this.f7616g = str7;
        this.f7617h = mVar;
        this.f7618i = n10;
        this.f7619j = j6;
        this.f7620k = j10;
        this.f7621l = i10;
        this.f7622m = i11;
        this.f7623n = str8;
        this.f7624o = str9;
        this.f7625p = str10;
        this.f7626q = str11;
        this.f7627r = str12;
        this.f7628s = str13;
        this.f7629t = z10;
        this.f7630u = list;
        this.f7631v = list2;
        this.f7632w = cVar;
    }

    public static b e(b bVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, m mVar, N n10, long j6, long j10, String str8, String str9, String str10, String str11, String str12, String str13, ArrayList arrayList, ArrayList arrayList2, Ed.c cVar, int i10) {
        String str14;
        String str15;
        boolean z10;
        List list;
        List list2;
        List list3;
        String str16 = (i10 & 1) != 0 ? bVar.f7610a : str;
        String str17 = (i10 & 2) != 0 ? bVar.f7611b : str2;
        String str18 = (i10 & 4) != 0 ? bVar.f7612c : str3;
        String str19 = (i10 & 8) != 0 ? bVar.f7613d : str4;
        String str20 = (i10 & 16) != 0 ? bVar.f7614e : str5;
        String str21 = (i10 & 32) != 0 ? bVar.f7615f : str6;
        String str22 = (i10 & 64) != 0 ? bVar.f7616g : str7;
        m mVar2 = (i10 & 128) != 0 ? bVar.f7617h : mVar;
        N n11 = (i10 & 256) != 0 ? bVar.f7618i : n10;
        long j11 = (i10 & 512) != 0 ? bVar.f7619j : j6;
        long j12 = (i10 & 1024) != 0 ? bVar.f7620k : j10;
        int i11 = bVar.f7621l;
        int i12 = bVar.f7622m;
        String str23 = (i10 & 8192) != 0 ? bVar.f7623n : str8;
        String str24 = (i10 & 16384) != 0 ? bVar.f7624o : str9;
        long j13 = j12;
        String str25 = (i10 & 32768) != 0 ? bVar.f7625p : str10;
        long j14 = j11;
        String str26 = (i10 & 65536) != 0 ? bVar.f7626q : str11;
        String str27 = (131072 & i10) != 0 ? bVar.f7627r : str12;
        if ((i10 & 262144) != 0) {
            str15 = str27;
            str14 = bVar.f7628s;
        } else {
            str15 = str27;
            str14 = str13;
        }
        boolean z11 = bVar.f7629t;
        if ((i10 & 1048576) != 0) {
            z10 = z11;
            list = bVar.f7630u;
        } else {
            z10 = z11;
            list = arrayList;
        }
        if ((i10 & 2097152) != 0) {
            list2 = list;
            list3 = bVar.f7631v;
        } else {
            list2 = list;
            list3 = arrayList2;
        }
        Ed.c cVar2 = (i10 & 4194304) != 0 ? bVar.f7632w : cVar;
        bVar.getClass();
        AbstractC3557B.c0("roomID", str16);
        AbstractC3557B.c0("conversationId", str17);
        AbstractC3557B.c0("sessionID", str18);
        AbstractC3557B.c0("parentMessageId", str19);
        AbstractC3557B.c0("modelSlug", str20);
        AbstractC3557B.c0("languageCode", str21);
        AbstractC3557B.c0("gizmoId", str22);
        AbstractC3557B.c0("connectionState", mVar2);
        AbstractC3557B.c0("remoteState", n11);
        AbstractC3557B.c0("connectionQuality", str23);
        AbstractC3557B.c0("localParticipant", str24);
        AbstractC3557B.c0("remoteParticipant", str25);
        AbstractC3557B.c0("useApiStaging", str26);
        AbstractC3557B.c0("useAuth0Staging", str15);
        AbstractC3557B.c0("voiceApiHost", str14);
        List list4 = list2;
        AbstractC3557B.c0("receivedMessages", list4);
        AbstractC3557B.c0("sentMessages", list3);
        return new b(str16, str17, str18, str19, str20, str21, str22, mVar2, n11, j14, j13, i11, i12, str23, str24, str25, str26, str15, str14, z10, list4, list3, cVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f7610a, bVar.f7610a) && AbstractC3557B.K(this.f7611b, bVar.f7611b) && AbstractC3557B.K(this.f7612c, bVar.f7612c) && AbstractC3557B.K(this.f7613d, bVar.f7613d) && AbstractC3557B.K(this.f7614e, bVar.f7614e) && AbstractC3557B.K(this.f7615f, bVar.f7615f) && AbstractC3557B.K(this.f7616g, bVar.f7616g) && AbstractC3557B.K(this.f7617h, bVar.f7617h) && this.f7618i == bVar.f7618i && this.f7619j == bVar.f7619j && this.f7620k == bVar.f7620k && this.f7621l == bVar.f7621l && this.f7622m == bVar.f7622m && AbstractC3557B.K(this.f7623n, bVar.f7623n) && AbstractC3557B.K(this.f7624o, bVar.f7624o) && AbstractC3557B.K(this.f7625p, bVar.f7625p) && AbstractC3557B.K(this.f7626q, bVar.f7626q) && AbstractC3557B.K(this.f7627r, bVar.f7627r) && AbstractC3557B.K(this.f7628s, bVar.f7628s) && this.f7629t == bVar.f7629t && AbstractC3557B.K(this.f7630u, bVar.f7630u) && AbstractC3557B.K(this.f7631v, bVar.f7631v) && AbstractC3557B.K(this.f7632w, bVar.f7632w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f7616g, E9.f.v(this.f7615f, E9.f.v(this.f7614e, E9.f.v(this.f7613d, E9.f.v(this.f7612c, E9.f.v(this.f7611b, this.f7610a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        int hashCode = this.f7618i.hashCode();
        long j6 = this.f7619j;
        long j10 = this.f7620k;
        int v11 = E9.f.v(this.f7628s, E9.f.v(this.f7627r, E9.f.v(this.f7626q, E9.f.v(this.f7625p, E9.f.v(this.f7624o, E9.f.v(this.f7623n, (((((((((hashCode + ((this.f7617h.hashCode() + v10) * 31)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f7621l) * 31) + this.f7622m) * 31, 31), 31), 31), 31), 31), 31);
        if (this.f7629t) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int s10 = AbstractC4194d.s(this.f7631v, AbstractC4194d.s(this.f7630u, (v11 + i10) * 31, 31), 31);
        Ed.c cVar = this.f7632w;
        if (cVar == null) {
            i11 = 0;
        } else {
            i11 = cVar.hashCode();
        }
        return s10 + i11;
    }

    public final String toString() {
        return "DebugVoiceViewState(roomID=" + this.f7610a + ", conversationId=" + this.f7611b + ", sessionID=" + this.f7612c + ", parentMessageId=" + this.f7613d + ", modelSlug=" + this.f7614e + ", languageCode=" + this.f7615f + ", gizmoId=" + this.f7616g + ", connectionState=" + this.f7617h + ", remoteState=" + this.f7618i + ", connectionLatency=" + this.f7619j + ", firstListeningLatency=" + this.f7620k + ", messageReceived=" + this.f7621l + ", messageSent=" + this.f7622m + ", connectionQuality=" + this.f7623n + ", localParticipant=" + this.f7624o + ", remoteParticipant=" + this.f7625p + ", useApiStaging=" + this.f7626q + ", useAuth0Staging=" + this.f7627r + ", voiceApiHost=" + this.f7628s + ", openMessageBottomSheet=" + this.f7629t + ", receivedMessages=" + this.f7630u + ", sentMessages=" + this.f7631v + ", tokenRequest=" + this.f7632w + Separators.RPAREN;
    }
}
