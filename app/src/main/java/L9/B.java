package L9;

import O9.C1118n;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import wd.C6168C;
import wd.C6171F;
import wd.C6182c0;
import wd.C6190g0;
import wd.y0;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class B {
    public static final A Companion = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer[] f10861k = {null, E.Companion.serializer(), null, new C2695d(C1118n.f13562a, 0), null, null, null, null, null, new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f10862a;

    /* renamed from: b  reason: collision with root package name */
    public final E f10863b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10864c;

    /* renamed from: d  reason: collision with root package name */
    public final List f10865d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10866e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10867f;

    /* renamed from: g  reason: collision with root package name */
    public final String f10868g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10869h;

    /* renamed from: i  reason: collision with root package name */
    public final C6171F f10870i;

    /* renamed from: j  reason: collision with root package name */
    public final List f10871j;

    public B(int i10, String str, E e10, String str2, List list, String str3, boolean z10, String str4, boolean z11, C6171F c6171f, List list2) {
        if (31 != (i10 & 31)) {
            R4.b.e2(i10, 31, C0919z.f10960b);
            throw null;
        }
        this.f10862a = str;
        this.f10863b = e10;
        this.f10864c = str2;
        this.f10865d = list;
        this.f10866e = str3;
        if ((i10 & 32) == 0) {
            this.f10867f = false;
        } else {
            this.f10867f = z10;
        }
        if ((i10 & 64) == 0) {
            this.f10868g = null;
        } else {
            this.f10868g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f10869h = true;
        } else {
            this.f10869h = z11;
        }
        if ((i10 & 256) == 0) {
            this.f10870i = null;
        } else {
            this.f10870i = c6171f;
        }
        if ((i10 & 512) == 0) {
            this.f10871j = null;
        } else {
            this.f10871j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        String str = b10.f10862a;
        String str2 = this.f10862a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (this.f10863b != b10.f10863b || !AbstractC3557B.K(this.f10864c, b10.f10864c) || !AbstractC3557B.K(this.f10865d, b10.f10865d) || !AbstractC3557B.K(this.f10866e, b10.f10866e) || this.f10867f != b10.f10867f) {
            return false;
        }
        String str3 = this.f10868g;
        String str4 = b10.f10868g;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (this.f10869h == b10.f10869h && AbstractC3557B.K(this.f10870i, b10.f10870i) && AbstractC3557B.K(this.f10871j, b10.f10871j)) {
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
        String str = this.f10862a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f10864c, (this.f10863b.hashCode() + (i10 * 31)) * 31, 31);
        List list = this.f10865d;
        if (list == null) {
            i11 = 0;
        } else {
            i11 = list.hashCode();
        }
        int v11 = E9.f.v(this.f10866e, (v10 + i11) * 31, 31);
        int i16 = 1237;
        if (this.f10867f) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i17 = (v11 + i12) * 31;
        String str2 = this.f10868g;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        if (this.f10869h) {
            i16 = 1231;
        }
        int i19 = (i18 + i16) * 31;
        C6171F c6171f = this.f10870i;
        if (c6171f == null) {
            i14 = 0;
        } else {
            i14 = c6171f.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        List list2 = this.f10871j;
        if (list2 != null) {
            i15 = list2.hashCode();
        }
        return i20 + i15;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f10862a;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6168C.a(str3);
        }
        String a5 = C6182c0.a(this.f10864c);
        String b10 = C6190g0.b(this.f10866e);
        String str4 = this.f10868g;
        if (str4 != null) {
            str2 = y0.a(str4);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("ConversationStreamRequest(conversationId=", str, ", action=");
        s10.append(this.f10863b);
        s10.append(", parentMessageId=");
        s10.append(a5);
        s10.append(", messages=");
        s10.append(this.f10865d);
        s10.append(", model=");
        s10.append(b10);
        s10.append(", historyAndTrainingDisabled=");
        s10.append(this.f10867f);
        s10.append(", continueFromSharedConversationId=");
        s10.append(str2);
        s10.append(", supportsModapi=");
        s10.append(this.f10869h);
        s10.append(", conversationMode=");
        s10.append(this.f10870i);
        s10.append(", suggestions=");
        return android.gov.nist.core.a.o(s10, this.f10871j, Separators.RPAREN);
    }

    public B(String str, E e10, String str2, ArrayList arrayList, String str3, boolean z10, String str4, C6171F c6171f, List list) {
        this.f10862a = str;
        this.f10863b = e10;
        this.f10864c = str2;
        this.f10865d = arrayList;
        this.f10866e = str3;
        this.f10867f = z10;
        this.f10868g = str4;
        this.f10869h = true;
        this.f10870i = c6171f;
        this.f10871j = list;
    }
}
