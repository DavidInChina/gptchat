package ca;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ca.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2319k {

    /* renamed from: a  reason: collision with root package name */
    public final List f26396a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26397b;

    public C2319k(int i10, ArrayList arrayList) {
        this.f26396a = arrayList;
        this.f26397b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2319k)) {
            return false;
        }
        C2319k c2319k = (C2319k) obj;
        if (AbstractC3557B.K(this.f26396a, c2319k.f26396a) && this.f26397b == c2319k.f26397b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26396a.hashCode() * 31) + this.f26397b;
    }

    public final String toString() {
        return "ConversationList(conversations=" + this.f26396a + ", totalItems=" + this.f26397b + Separators.RPAREN;
    }
}
