package K4;

import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.C2464o;
import com.google.android.gms.internal.play_billing.EnumC2436a;

/* renamed from: K4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822j {

    /* renamed from: a  reason: collision with root package name */
    public int f9439a;

    /* renamed from: b  reason: collision with root package name */
    public String f9440b;

    /* JADX WARN: Type inference failed for: r0v0, types: [r2.d, java.lang.Object] */
    public static r2.d a() {
        ?? obj = new Object();
        obj.f44377b = "";
        return obj;
    }

    public final String toString() {
        EnumC2436a enumC2436a;
        int i10 = this.f9439a;
        int i11 = AbstractC2468q.f26955a;
        C2464o c2464o = EnumC2436a.f26893h0;
        Integer valueOf = Integer.valueOf(i10);
        if (!c2464o.containsKey(valueOf)) {
            enumC2436a = EnumC2436a.RESPONSE_CODE_UNSPECIFIED;
        } else {
            enumC2436a = (EnumC2436a) c2464o.get(valueOf);
        }
        return android.gov.nist.core.a.k("Response Code: ", enumC2436a.toString(), ", Debug Message: ", this.f9440b);
    }
}
