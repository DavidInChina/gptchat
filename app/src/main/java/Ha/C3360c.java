package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: ha.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3360c {
    public static final C3359b Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f32056c = {null, new C2695d(wd.P.f48363a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f32057a;

    /* renamed from: b  reason: collision with root package name */
    public final List f32058b;

    public C3360c(int i10, String str, List list) {
        if ((i10 & 1) == 0) {
            this.f32057a = null;
        } else {
            this.f32057a = str;
        }
        if ((i10 & 2) == 0) {
            this.f32058b = null;
        } else {
            this.f32058b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3360c)) {
            return false;
        }
        C3360c c3360c = (C3360c) obj;
        if (AbstractC3557B.K(this.f32057a, c3360c.f32057a) && AbstractC3557B.K(this.f32058b, c3360c.f32058b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f32057a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        List list = this.f32058b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "AggregateResult(code=" + this.f32057a + ", messages=" + this.f32058b + Separators.RPAREN;
    }

    public C3360c(String str, ArrayList arrayList) {
        this.f32057a = str;
        this.f32058b = arrayList;
    }
}
