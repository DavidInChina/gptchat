package o8;

import android.gov.nist.core.Separators;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p8.AbstractC5098a;
import u7.C5849e;

/* renamed from: o8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4948a extends C5849e {

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f40933Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4948a(int i10, Throwable th2) {
        super(new Status(i10, "Standard Integrity API error (" + i10 + "): " + r1 + Separators.DOT, null, null));
        String str;
        HashMap hashMap;
        Locale locale = Locale.ROOT;
        HashMap hashMap2 = AbstractC5098a.f42755a;
        Integer valueOf = Integer.valueOf(i10);
        if (hashMap2.containsKey(valueOf)) {
            if (AbstractC5098a.f42756b.containsKey(valueOf)) {
                str = ((String) hashMap2.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#" + ((String) hashMap.get(valueOf)) + Separators.RPAREN;
                if (i10 == 0) {
                    this.f40933Z = th2;
                    return;
                }
                throw new IllegalArgumentException("ErrorCode should not be 0.");
            }
        }
        str = "";
        if (i10 == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f40933Z;
    }
}
