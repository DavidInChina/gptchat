package Yg;

import Df.H;
import ah.AbstractC1998i;
import id.AbstractC3557B;
import j$.time.Instant;

@AbstractC1998i(with = Zg.g.class)
/* loaded from: classes.dex */
public final class p implements Comparable<p> {
    public static final o Companion = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final p f22415Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final p f22416h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final p f22417i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final p f22418j0;

    /* renamed from: Y  reason: collision with root package name */
    public final Instant f22419Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [Yg.o, java.lang.Object] */
    static {
        Instant ofEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        AbstractC3557B.b0("ofEpochSecond(...)", ofEpochSecond);
        f22415Z = new p(ofEpochSecond);
        Instant ofEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        AbstractC3557B.b0("ofEpochSecond(...)", ofEpochSecond2);
        f22416h0 = new p(ofEpochSecond2);
        Instant instant = Instant.MIN;
        AbstractC3557B.b0("MIN", instant);
        f22417i0 = new p(instant);
        Instant instant2 = Instant.MAX;
        AbstractC3557B.b0("MAX", instant2);
        f22418j0 = new p(instant2);
    }

    public p(Instant instant) {
        AbstractC3557B.c0("value", instant);
        this.f22419Y = instant;
    }

    /* renamed from: a */
    public final int compareTo(p pVar) {
        AbstractC3557B.c0("other", pVar);
        return this.f22419Y.compareTo(pVar.f22419Y);
    }

    public final long b(p pVar) {
        AbstractC3557B.c0("other", pVar);
        Mg.a aVar = Mg.b.f12127Z;
        Instant instant = this.f22419Y;
        long epochSecond = instant.getEpochSecond();
        Instant instant2 = pVar.f22419Y;
        return Mg.b.i(H.y0(epochSecond - instant2.getEpochSecond(), Mg.d.f12134i0), H.x0(instant.getNano() - instant2.getNano(), Mg.d.f12132Z));
    }

    public final long c() {
        Instant instant = this.f22419Y;
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            if (instant.isAfter(Instant.EPOCH)) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                if (AbstractC3557B.K(this.f22419Y, ((p) obj).f22419Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22419Y.hashCode();
    }

    public final String toString() {
        String instant = this.f22419Y.toString();
        AbstractC3557B.b0("toString(...)", instant);
        return instant;
    }
}
