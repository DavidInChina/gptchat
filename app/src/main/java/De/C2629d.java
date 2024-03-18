package de;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: de.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2629d implements AbstractC2630e {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f28222a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f28223b;

    public C2629d(wf.k kVar, wf.k kVar2) {
        AbstractC3557B.c0("columnSize", kVar);
        this.f28222a = kVar;
        this.f28223b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2629d)) {
            return false;
        }
        C2629d c2629d = (C2629d) obj;
        if (AbstractC3557B.K(this.f28222a, c2629d.f28222a) && AbstractC3557B.K(this.f28223b, c2629d.f28223b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28223b.hashCode() + (this.f28222a.hashCode() * 31);
    }

    public final String toString() {
        return "Dynamic(columnSize=" + this.f28222a + ", rowSize=" + this.f28223b + Separators.RPAREN;
    }
}
