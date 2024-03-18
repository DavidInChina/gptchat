package za;

import android.gov.nist.core.Separators;
import android.net.Uri;
import cb.C2334C;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import y.AbstractC6463a;

/* renamed from: za.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6783B implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final T0.z f51758a;

    /* renamed from: b  reason: collision with root package name */
    public final J9.d f51759b;

    /* renamed from: c  reason: collision with root package name */
    public final J9.b f51760c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f51761d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f51762e;

    /* renamed from: f  reason: collision with root package name */
    public final List f51763f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f51764g;

    /* renamed from: h  reason: collision with root package name */
    public final C2334C f51765h;

    /* renamed from: i  reason: collision with root package name */
    public final List f51766i;

    /* renamed from: j  reason: collision with root package name */
    public final List f51767j;

    /* renamed from: k  reason: collision with root package name */
    public final List f51768k;

    /* renamed from: l  reason: collision with root package name */
    public final EnumC6785b f51769l;

    /* renamed from: m  reason: collision with root package name */
    public final int f51770m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f51771n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f51772o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f51773p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f51774q;

    public C6783B(T0.z zVar, J9.d dVar, J9.b bVar, Uri uri, Map map, List list, boolean z10, C2334C c2334c, List list2, List list3, List list4, EnumC6785b enumC6785b, int i10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC3557B.c0("input", zVar);
        AbstractC3557B.c0("conversationModelState", dVar);
        AbstractC3557B.c0("conversationGizmoState", bVar);
        AbstractC3557B.c0("attachments", map);
        AbstractC3557B.c0("inputDecorations", list);
        AbstractC3557B.c0("allGizmos", list2);
        AbstractC3557B.c0("availableCommands", list3);
        AbstractC3557B.c0("mentionableGizmos", list4);
        this.f51758a = zVar;
        this.f51759b = dVar;
        this.f51760c = bVar;
        this.f51761d = uri;
        this.f51762e = map;
        this.f51763f = list;
        this.f51764g = z10;
        this.f51765h = c2334c;
        this.f51766i = list2;
        this.f51767j = list3;
        this.f51768k = list4;
        this.f51769l = enumC6785b;
        this.f51770m = i10;
        this.f51771n = z11;
        this.f51772o = z12;
        this.f51773p = z13;
        this.f51774q = z14;
    }

    public static C6783B e(C6783B c6783b, T0.z zVar, J9.d dVar, J9.b bVar, Uri uri, Map map, List list, C2334C c2334c, List list2, List list3, List list4, EnumC6785b enumC6785b, int i10) {
        T0.z zVar2;
        J9.d dVar2;
        J9.b bVar2;
        Uri uri2;
        Map map2;
        List list5;
        C2334C c2334c2;
        List list6;
        List list7;
        List list8;
        EnumC6785b enumC6785b2;
        if ((i10 & 1) != 0) {
            zVar2 = c6783b.f51758a;
        } else {
            zVar2 = zVar;
        }
        if ((i10 & 2) != 0) {
            dVar2 = c6783b.f51759b;
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 4) != 0) {
            bVar2 = c6783b.f51760c;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 8) != 0) {
            uri2 = c6783b.f51761d;
        } else {
            uri2 = uri;
        }
        if ((i10 & 16) != 0) {
            map2 = c6783b.f51762e;
        } else {
            map2 = map;
        }
        if ((i10 & 32) != 0) {
            list5 = c6783b.f51763f;
        } else {
            list5 = list;
        }
        boolean z10 = c6783b.f51764g;
        if ((i10 & 128) != 0) {
            c2334c2 = c6783b.f51765h;
        } else {
            c2334c2 = c2334c;
        }
        if ((i10 & 256) != 0) {
            list6 = c6783b.f51766i;
        } else {
            list6 = list2;
        }
        if ((i10 & 512) != 0) {
            list7 = c6783b.f51767j;
        } else {
            list7 = list3;
        }
        if ((i10 & 1024) != 0) {
            list8 = c6783b.f51768k;
        } else {
            list8 = list4;
        }
        if ((i10 & 2048) != 0) {
            enumC6785b2 = c6783b.f51769l;
        } else {
            enumC6785b2 = enumC6785b;
        }
        int i11 = c6783b.f51770m;
        boolean z11 = c6783b.f51771n;
        boolean z12 = c6783b.f51772o;
        boolean z13 = c6783b.f51773p;
        boolean z14 = c6783b.f51774q;
        c6783b.getClass();
        AbstractC3557B.c0("input", zVar2);
        AbstractC3557B.c0("conversationModelState", dVar2);
        AbstractC3557B.c0("conversationGizmoState", bVar2);
        AbstractC3557B.c0("attachments", map2);
        AbstractC3557B.c0("inputDecorations", list5);
        AbstractC3557B.c0("allGizmos", list6);
        AbstractC3557B.c0("availableCommands", list7);
        AbstractC3557B.c0("mentionableGizmos", list8);
        return new C6783B(zVar2, dVar2, bVar2, uri2, map2, list5, z10, c2334c2, list6, list7, list8, enumC6785b2, i11, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6783B)) {
            return false;
        }
        C6783B c6783b = (C6783B) obj;
        if (AbstractC3557B.K(this.f51758a, c6783b.f51758a) && AbstractC3557B.K(this.f51759b, c6783b.f51759b) && AbstractC3557B.K(this.f51760c, c6783b.f51760c) && AbstractC3557B.K(this.f51761d, c6783b.f51761d) && AbstractC3557B.K(this.f51762e, c6783b.f51762e) && AbstractC3557B.K(this.f51763f, c6783b.f51763f) && this.f51764g == c6783b.f51764g && AbstractC3557B.K(this.f51765h, c6783b.f51765h) && AbstractC3557B.K(this.f51766i, c6783b.f51766i) && AbstractC3557B.K(this.f51767j, c6783b.f51767j) && AbstractC3557B.K(this.f51768k, c6783b.f51768k) && this.f51769l == c6783b.f51769l && this.f51770m == c6783b.f51770m && this.f51771n == c6783b.f51771n && this.f51772o == c6783b.f51772o && this.f51773p == c6783b.f51773p && this.f51774q == c6783b.f51774q) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        Sc.u uVar;
        int i10;
        List<String> list;
        if (!this.f51774q) {
            return false;
        }
        C2334C c2334c = this.f51760c.f8894a;
        if (c2334c != null) {
            uVar = c2334c.f26462y;
        } else {
            Sc.n a5 = this.f51759b.a();
            if (a5 != null) {
                uVar = a5.f16540h;
            } else {
                uVar = null;
            }
        }
        if (uVar == null) {
            return false;
        }
        Sc.s sVar = uVar.f16554a;
        if (sVar == null || !sVar.f16553c) {
            if (sVar == null || (list = sVar.f16552b) == null || list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                if (!Lg.n.I2(str, "image/", false)) {
                    i10 = this.f51770m;
                    if (i10 == 0 && this.f51762e.size() >= i10) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        i10 = this.f51770m;
        if (i10 == 0) {
        }
        return true;
    }

    public final boolean g() {
        Sc.u uVar;
        Sc.s sVar;
        List<String> list;
        if (!this.f51771n) {
            return false;
        }
        C2334C c2334c = this.f51760c.f8894a;
        if (c2334c != null) {
            uVar = c2334c.f26462y;
        } else {
            Sc.n a5 = this.f51759b.a();
            if (a5 != null) {
                uVar = a5.f16540h;
            } else {
                uVar = null;
            }
        }
        if (uVar == null || (sVar = uVar.f16554a) == null || (list = sVar.f16552b) == null || list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            if (Lg.n.I2(str, "image/", false)) {
                int i10 = this.f51770m;
                if (i10 != 0 && this.f51762e.size() >= i10) {
                    return false;
                }
                return true;
            }
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
        int hashCode = (this.f51760c.hashCode() + ((this.f51759b.hashCode() + (this.f51758a.hashCode() * 31)) * 31)) * 31;
        int i16 = 0;
        Uri uri = this.f51761d;
        if (uri == null) {
            i10 = 0;
        } else {
            i10 = uri.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f51763f, AbstractC6463a.f(this.f51762e, (hashCode + i10) * 31, 31), 31);
        int i17 = 1237;
        if (this.f51764g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i18 = (s10 + i11) * 31;
        C2334C c2334c = this.f51765h;
        if (c2334c == null) {
            i12 = 0;
        } else {
            i12 = c2334c.hashCode();
        }
        int s11 = AbstractC4194d.s(this.f51768k, AbstractC4194d.s(this.f51767j, AbstractC4194d.s(this.f51766i, (i18 + i12) * 31, 31), 31), 31);
        EnumC6785b enumC6785b = this.f51769l;
        if (enumC6785b != null) {
            i16 = enumC6785b.hashCode();
        }
        int i19 = (((s11 + i16) * 31) + this.f51770m) * 31;
        if (this.f51771n) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i20 = (i19 + i13) * 31;
        if (this.f51772o) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i21 = (i20 + i14) * 31;
        if (this.f51773p) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i22 = (i21 + i15) * 31;
        if (this.f51774q) {
            i17 = 1231;
        }
        return i22 + i17;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputViewState(input=");
        sb2.append(this.f51758a);
        sb2.append(", conversationModelState=");
        sb2.append(this.f51759b);
        sb2.append(", conversationGizmoState=");
        sb2.append(this.f51760c);
        sb2.append(", cameraFile=");
        sb2.append(this.f51761d);
        sb2.append(", attachments=");
        sb2.append(this.f51762e);
        sb2.append(", inputDecorations=");
        sb2.append(this.f51763f);
        sb2.append(", enableEditImage=");
        sb2.append(this.f51764g);
        sb2.append(", mentionedGizmo=");
        sb2.append(this.f51765h);
        sb2.append(", allGizmos=");
        sb2.append(this.f51766i);
        sb2.append(", availableCommands=");
        sb2.append(this.f51767j);
        sb2.append(", mentionableGizmos=");
        sb2.append(this.f51768k);
        sb2.append(", visionDisclosureOption=");
        sb2.append(this.f51769l);
        sb2.append(", attachmentsLimit=");
        sb2.append(this.f51770m);
        sb2.append(", visionEnabled=");
        sb2.append(this.f51771n);
        sb2.append(", atMentionGizmosEnabled=");
        sb2.append(this.f51772o);
        sb2.append(", gizmoCommandsEnabled=");
        sb2.append(this.f51773p);
        sb2.append(", filesEnabled=");
        return AbstractC4194d.w(sb2, this.f51774q, Separators.RPAREN);
    }
}
