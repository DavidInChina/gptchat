package H0;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: H0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0669b implements AbstractC0679g {

    /* renamed from: a  reason: collision with root package name */
    public String f6906a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6907b = new int[2];

    public final int[] c(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 != i11) {
            int[] iArr = this.f6907b;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }
        return null;
    }

    public final String d() {
        String str = this.f6906a;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2(ParameterNames.TEXT);
        throw null;
    }
}
