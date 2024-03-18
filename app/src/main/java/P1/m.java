package p1;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f41732a;

    /* renamed from: b  reason: collision with root package name */
    public final LocusId f41733b;

    public m(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f41732a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f41733b = l.a(str);
                return;
            } else {
                this.f41733b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        String str = ((m) obj).f41732a;
        String str2 = this.f41732a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int i10;
        String str = this.f41732a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return 31 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        int length = this.f41732a.length();
        sb2.append(length + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
