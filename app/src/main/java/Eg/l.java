package Eg;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class l extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final l f4734Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final l f4735h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final l f4736i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ l[] f4737j0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4738Y;

    static {
        l lVar = new l(SDPKeywords.IN, 0, "in");
        f4734Z = lVar;
        l lVar2 = new l("OUT", 1, "out");
        f4735h0 = lVar2;
        l lVar3 = new l("INV", 2, "");
        f4736i0 = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f4737j0 = lVarArr;
        AbstractC3557B.C0(lVarArr);
    }

    public l(String str, int i10, String str2) {
        this.f4738Y = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4737j0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4738Y;
    }
}
