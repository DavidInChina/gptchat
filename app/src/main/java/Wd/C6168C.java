package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6168C {
    public static final C6167B Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48321a;

    public /* synthetic */ C6168C(String str) {
        this.f48321a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("ConversationId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6168C)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48321a, ((C6168C) obj).f48321a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48321a.hashCode();
    }

    public final String toString() {
        return a(this.f48321a);
    }
}
