package Wc;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class o extends Enum<o> {
    public static final n Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f20916Y = R4.b.C1(EnumC3958h.f36152Y, m.f20915Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final o f20917Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ o[] f20918h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Wc.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Wc.o] */
    static {
        ?? r12 = new Enum("UnsupportedCountry", 0);
        f20917Z = r12;
        o[] oVarArr = {r12};
        f20918h0 = oVarArr;
        AbstractC3557B.C0(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f20918h0.clone();
    }
}
