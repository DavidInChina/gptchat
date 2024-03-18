package za;

import Jc.E;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: za.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6786c {

    /* renamed from: a  reason: collision with root package name */
    public final E f51783a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6790g f51784b;

    public C6786c(E e10, AbstractC6790g abstractC6790g) {
        AbstractC3557B.c0("useCase", e10);
        this.f51783a = e10;
        this.f51784b = abstractC6790g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6786c)) {
            return false;
        }
        C6786c c6786c = (C6786c) obj;
        if (this.f51783a == c6786c.f51783a && AbstractC3557B.K(this.f51784b, c6786c.f51784b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51784b.hashCode() + (this.f51783a.hashCode() * 31);
    }

    public final String toString() {
        return "InputAttachmentState(useCase=" + this.f51783a + ", uploadState=" + this.f51784b + Separators.RPAREN;
    }
}
