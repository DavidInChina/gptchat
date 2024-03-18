package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6320o {

    /* renamed from: a  reason: collision with root package name */
    public final r f49404a;

    /* renamed from: b  reason: collision with root package name */
    public final C6302i f49405b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49406c;

    /* renamed from: d  reason: collision with root package name */
    public final C6323p f49407d;

    public C6320o(r rVar, C6302i c6302i, String str, C6323p c6323p) {
        this.f49404a = rVar;
        this.f49405b = c6302i;
        this.f49406c = str;
        this.f49407d = c6323p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6320o)) {
            return false;
        }
        C6320o c6320o = (C6320o) obj;
        if (AbstractC3557B.K(this.f49404a, c6320o.f49404a) && AbstractC3557B.K(this.f49405b, c6320o.f49405b) && AbstractC3557B.K(this.f49406c, c6320o.f49406c) && AbstractC3557B.K(this.f49407d, c6320o.f49407d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        r rVar = this.f49404a;
        if (rVar == null) {
            i10 = 0;
        } else {
            i10 = rVar.hashCode();
        }
        int i14 = i10 * 31;
        C6302i c6302i = this.f49405b;
        if (c6302i == null) {
            i11 = 0;
        } else {
            i11 = c6302i.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str = this.f49406c;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        C6323p c6323p = this.f49407d;
        if (c6323p != null) {
            i13 = c6323p.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "Dd(session=" + this.f49404a + ", configuration=" + this.f49405b + ", browserSdkVersion=" + this.f49406c + ", action=" + this.f49407d + Separators.RPAREN;
    }
}
