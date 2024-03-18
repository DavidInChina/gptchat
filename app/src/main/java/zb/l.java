package Zb;

import ah.AbstractC1998i;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class l extends Enum<l> {
    public static final k Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f23662Y = R4.b.C1(EnumC3958h.f36152Y, j.f23661Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ l[] f23663Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Zb.k] */
    static {
        l[] lVarArr = {new Enum("HardDeprecation", 0), new Enum("SoftDeprecation", 1), new Enum(SIPHeaderNames.SUPPORTED, 2)};
        f23663Z = lVarArr;
        AbstractC3557B.C0(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f23663Z.clone();
    }
}
