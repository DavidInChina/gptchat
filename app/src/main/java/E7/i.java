package e7;

import U3.u;
import android.gov.nist.core.Separators;
import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f29006a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f29007b;

    /* renamed from: c  reason: collision with root package name */
    public final b7.c f29008c;

    public i(String str, byte[] bArr, b7.c cVar) {
        this.f29006a = str;
        this.f29007b = bArr;
        this.f29008c = cVar;
    }

    public static u a() {
        u uVar = new u(23);
        uVar.P(b7.c.f25648Y);
        return uVar;
    }

    /* renamed from: b */
    public final String toString() {
        String str;
        byte[] bArr = this.f29007b;
        if (bArr == null) {
            str = "";
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f29006a + ", " + this.f29008c + ", " + str + Separators.RPAREN;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f29006a.equals(iVar.f29006a) && Arrays.equals(this.f29007b, iVar.f29007b) && this.f29008c.equals(iVar.f29008c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29006a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29007b)) * 1000003) ^ this.f29008c.hashCode();
    }
}
