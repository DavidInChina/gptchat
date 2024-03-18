package u7;

import android.gov.nist.core.Separators;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import n8.AbstractC4721a;
import t8.AbstractC5683a;

/* loaded from: classes2.dex */
public final class l extends C5849e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i10, int i11) {
        super(new Status(i10, String.format(r6, "Install Error(%d): %s", r5), null, null));
        HashMap hashMap;
        Integer valueOf;
        HashMap hashMap2;
        String str = "";
        if (i11 != 2) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i10);
            HashMap hashMap3 = AbstractC4721a.f39651a;
            Integer valueOf2 = Integer.valueOf(i10);
            if (hashMap3.containsKey(valueOf2)) {
                if (AbstractC4721a.f39652b.containsKey(valueOf2)) {
                    str = ((String) hashMap3.get(valueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) hashMap2.get(valueOf2)) + Separators.RPAREN;
                }
            }
            objArr[1] = str;
            if (i10 != 0) {
                return;
            }
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        Locale locale2 = Locale.getDefault();
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(i10);
        if (AbstractC5683a.f45795a.containsKey(Integer.valueOf(i10))) {
            str = ((String) hashMap.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) AbstractC5683a.f45796b.get(valueOf)) + Separators.RPAREN;
        }
        objArr2[1] = str;
        super(new Status(i10, String.format(locale2, "Review Error(%d): %s", objArr2), null, null));
    }
}
