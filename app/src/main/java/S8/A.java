package S8;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class A extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ A[] f16204Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        A[] aArr = {new Enum("Primary", 0), new Enum("Secondary", 1), new Enum("Success", 2), new Enum("Danger", 3), new Enum(SIPHeaderNames.WARNING, 4)};
        f16204Y = aArr;
        AbstractC3557B.C0(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f16204Y.clone();
    }
}
