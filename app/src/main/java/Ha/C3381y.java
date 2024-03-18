package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: ha.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3381y implements K {
    public static final C3380x Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f32087d = {null, P4.a.E("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.AllowAction.ActionName", EnumC3379w.values()), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f32088a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC3379w f32089b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32090c;

    public C3381y(String str, EnumC3379w enumC3379w, String str2) {
        AbstractC3557B.c0("name", enumC3379w);
        this.f32088a = str;
        this.f32089b = enumC3379w;
        this.f32090c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3381y)) {
            return false;
        }
        C3381y c3381y = (C3381y) obj;
        if (!AbstractC3557B.K(this.f32088a, c3381y.f32088a) || this.f32089b != c3381y.f32089b) {
            return false;
        }
        String str = this.f32090c;
        String str2 = c3381y.f32090c;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f32088a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (this.f32089b.hashCode() + (i10 * 31)) * 31;
        String str2 = this.f32090c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f32090c;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        return "AllowAction(actionType=" + this.f32088a + ", name=" + this.f32089b + ", targetMessageId=" + str + Separators.RPAREN;
    }

    public C3381y(int i10, String str, EnumC3379w enumC3379w, String str2) {
        if ((i10 & 1) == 0) {
            this.f32088a = null;
        } else {
            this.f32088a = str;
        }
        if ((i10 & 2) == 0) {
            this.f32089b = EnumC3379w.f32084Z;
        } else {
            this.f32089b = enumC3379w;
        }
        if ((i10 & 4) == 0) {
            this.f32090c = null;
        } else {
            this.f32090c = str2;
        }
    }
}
