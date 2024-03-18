package di;

import id.AbstractC3557B;
import ji.C4138m;

/* renamed from: di.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2729c {

    /* renamed from: d  reason: collision with root package name */
    public static final C4138m f28551d = ei.l.g(":");

    /* renamed from: e  reason: collision with root package name */
    public static final C4138m f28552e = ei.l.g(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final C4138m f28553f = ei.l.g(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final C4138m f28554g = ei.l.g(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final C4138m f28555h = ei.l.g(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final C4138m f28556i = ei.l.g(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final C4138m f28557a;

    /* renamed from: b  reason: collision with root package name */
    public final C4138m f28558b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28559c;

    static {
        C4138m c4138m = C4138m.f36722i0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2729c(String str, String str2) {
        this(ei.l.g(str), ei.l.g(str2));
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        C4138m c4138m = C4138m.f36722i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2729c)) {
            return false;
        }
        C2729c c2729c = (C2729c) obj;
        if (AbstractC3557B.K(this.f28557a, c2729c.f28557a) && AbstractC3557B.K(this.f28558b, c2729c.f28558b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28558b.hashCode() + (this.f28557a.hashCode() * 31);
    }

    public final String toString() {
        return this.f28557a.r() + ": " + this.f28558b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2729c(C4138m c4138m, String str) {
        this(c4138m, ei.l.g(str));
        AbstractC3557B.c0("name", c4138m);
        AbstractC3557B.c0("value", str);
        C4138m c4138m2 = C4138m.f36722i0;
    }

    public C2729c(C4138m c4138m, C4138m c4138m2) {
        AbstractC3557B.c0("name", c4138m);
        AbstractC3557B.c0("value", c4138m2);
        this.f28557a = c4138m;
        this.f28558b = c4138m2;
        this.f28559c = c4138m2.d() + c4138m.d() + 32;
    }
}
