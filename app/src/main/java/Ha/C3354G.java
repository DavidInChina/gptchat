package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: ha.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3354G implements K {
    public static final C3353F Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f32005d = {null, P4.a.E("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.DenyAction.ActionName", EnumC3352E.values()), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f32006a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC3352E f32007b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32008c;

    public C3354G(String str, EnumC3352E enumC3352E, String str2) {
        AbstractC3557B.c0("name", enumC3352E);
        this.f32006a = str;
        this.f32007b = enumC3352E;
        this.f32008c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3354G)) {
            return false;
        }
        C3354G c3354g = (C3354G) obj;
        if (!AbstractC3557B.K(this.f32006a, c3354g.f32006a) || this.f32007b != c3354g.f32007b) {
            return false;
        }
        String str = this.f32008c;
        String str2 = c3354g.f32008c;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f32006a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (this.f32007b.hashCode() + (i10 * 31)) * 31;
        String str2 = this.f32008c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f32008c;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        return "DenyAction(actionType=" + this.f32006a + ", name=" + this.f32007b + ", targetMessageId=" + str + Separators.RPAREN;
    }

    public C3354G(int i10, String str, EnumC3352E enumC3352E, String str2) {
        if ((i10 & 1) == 0) {
            this.f32006a = null;
        } else {
            this.f32006a = str;
        }
        if ((i10 & 2) == 0) {
            this.f32007b = EnumC3352E.f32002Z;
        } else {
            this.f32007b = enumC3352E;
        }
        if ((i10 & 4) == 0) {
            this.f32008c = null;
        } else {
            this.f32008c = str2;
        }
    }
}
